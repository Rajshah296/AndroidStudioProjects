package com.example.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    boolean gameActive = true;
    //Player Representation
    //0-X
    //1-O

    int activePlayer=0;
    int[] gamestate = {2,2,2,2,2,2,2,2,2};
    //State meanings

//        0 - X
//        1 - O
//        2 - Blank
    // Winning Positions
    boolean bull = true;

        int[][] win_positions = {{0,1,2}, {3,4,5}, {6,7,8},
                                {0,3,6}, {1,4,7}, {2,5,8},
                                {0,4,8}, {2,4,6}};
    public void TapTap(View view){
        for(int item : gamestate){
            if(item == 2){
                bull = false;
                break;
            }
            bull = true;
        }
        if(!bull){
            ImageView img = (ImageView) view;
            int Tappedimg = Integer.parseInt(img.getTag().toString());
            if(!gameActive){
                gameReset(view);
            }
            if (gamestate[Tappedimg] == 2){
                gamestate[Tappedimg] = activePlayer;
                img.setTranslationY(-1000f);
                if (activePlayer == 0)
                {
                    img.setImageResource(R.drawable.x_img);
                    activePlayer = 1;
                    TextView status = findViewById(R.id.status);
                    status.setText(getResources().getString(R.string.O_turn));
                }
                else {
                    img.setImageResource(R.drawable.o_img);
                    activePlayer = 0;
                    TextView status = findViewById(R.id.status);
                    status.setText(getResources().getString(R.string.X_turn));

                }
                img.animate().translationYBy(1000f).setDuration(300);
            }
            // Check if any player has won.
            for (int[]  winPosition : win_positions){
                if (gamestate[winPosition[0]] == gamestate[winPosition[1]] && gamestate[winPosition[1]] == gamestate[winPosition[2]] && gamestate[winPosition[0]] != 2 ){
                    // Somebody has won - Find out who
                    String winnerstr;
                    gameActive = false;
                    if (gamestate[winPosition[0]] == 0){
                        winnerstr = getResources().getString(R.string.X_win);
                    }
                    else{
                        winnerstr = getResources().getString(R.string.O_win);
                    }
                    // Update the status bar with winner announcement.
                    TextView status = findViewById(R.id.status);
                    status.setText(winnerstr);
                }
            }
        }
        else{
            gameReset(view);
        }



    }

    public void gameReset(View view){
        gameActive = true;
        activePlayer = 0;
        Arrays.fill(gamestate, 2);

        ((ImageView)findViewById(R.id.imageView10)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
        ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);

        TextView status = findViewById(R.id.status);
        status.setText(getResources().getString(R.string.X_turn));
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}