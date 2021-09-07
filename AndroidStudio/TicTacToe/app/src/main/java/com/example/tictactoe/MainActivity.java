package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv_turn;
    int activePlayer = 0;
    String Xturn = "It is X's turn";
    String Oturn = "It is O's turn";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.btn_start);
        start.setOnClickListener(this);

        Button one = (Button) findViewById(R.id.btn_1);
        one.setOnClickListener(this);

        Button two = (Button) findViewById(R.id.btn_2);
        two.setOnClickListener(this);

        Button three = (Button) findViewById(R.id.btn_3);
        three.setOnClickListener(this);

        Button four = (Button) findViewById(R.id.btn_4);
        four.setOnClickListener(this);

        Button five = (Button) findViewById(R.id.btn_5);
        five.setOnClickListener(this);

        Button six = (Button) findViewById(R.id.btn_6);
        six.setOnClickListener(this);

        Button seven = (Button) findViewById(R.id.btn_7);
        seven.setOnClickListener(this);

        Button eight = (Button) findViewById(R.id.btn_8);
        eight.setOnClickListener(this);

        Button nine = (Button) findViewById(R.id.btn_9);
        nine.setOnClickListener(this);

        tv_turn = findViewById(R.id.tv_turn);
        tv_turn.setText(Xturn);
    }



    @Override
    public void onClick(View v) {
        Button one = (Button) findViewById(R.id.btn_1);
        Button two = (Button) findViewById(R.id.btn_2);
        Button three = (Button) findViewById(R.id.btn_3);
        Button four = (Button) findViewById(R.id.btn_4);
        Button five = (Button) findViewById(R.id.btn_5);
        Button six = (Button) findViewById(R.id.btn_6);
        Button seven = (Button) findViewById(R.id.btn_7);
        Button eight = (Button) findViewById(R.id.btn_8);
        Button nine = (Button) findViewById(R.id.btn_9);



        switch (v.getId()) {
            case R.id.btn_start:
                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
                seven.setVisibility(View.VISIBLE);
                eight.setVisibility(View.VISIBLE);
                nine.setVisibility(View.VISIBLE);
                break;
            case R.id.btn_1:
                // do your code

                if(activePlayer == 0){
                    one.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    one.setText("X");
                    activePlayer = 0;
                }
                //Button test = (Button) findViewById(R.id.btn_1);
                //test.setText("test");
                break;
            case R.id.btn_2:
                // do your code
                if(activePlayer == 0){
                    two.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    two.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_3:
                // do your code
                if(activePlayer == 0){
                    three.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    three.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_4:
                if(activePlayer == 0){
                    four.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    four.setText("X");
                    activePlayer = 0;
                }
                // do your code
                break;
            case R.id.btn_5:
                // do your code
                if(activePlayer == 0){
                    five.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    five.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_6:
                // do your code
                if(activePlayer == 0){
                    six.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    six.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_7:
                // do your code
                if(activePlayer == 0){
                    seven.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    seven.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_8:
                // do your code
                if(activePlayer == 0){
                    eight.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    eight.setText("X");
                    activePlayer = 0;
                }
                break;
            case R.id.btn_9:
                // do your code
                if(activePlayer == 0){
                    nine.setText("O");
                    activePlayer = 1;
                } else if (activePlayer == 1){
                    nine.setText("X");
                    activePlayer = 0;
                }
                break;
            default:
                break;
        }

        if(activePlayer == 0){
            tv_turn.setText(Oturn);
        } else {
            tv_turn.setText(Xturn);
        }

        if(one.getText().equals("X") && two.getText().equals("X") && three.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(one.getText().equals("O") && two.getText().equals("O") && three.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }
        if(one.getText().equals("X") && five.getText().equals("X") && nine.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(one.getText().equals("O") && five.getText().equals("O") && nine.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }
        if(three.getText().equals("X") && five.getText().equals("X") && seven.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(three.getText().equals("O") && five.getText().equals("O") && seven.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }
        if(one.getText().equals("X") && four.getText().equals("X") && seven.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(one.getText().equals("O") && four.getText().equals("O") && seven.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }
        if(three.getText().equals("X") && six.getText().equals("X") && nine.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(three.getText().equals("O") && six.getText().equals("O") && nine.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }
        if(seven.getText().equals("X") && eight.getText().equals("X") && nine.getText().equals("X")){
            tv_turn.setText("X is winner");
            turnButtonsOff();
        }
        if(seven.getText().equals("O") && eight.getText().equals("O") && nine.getText().equals("O")){
            tv_turn.setText("O is winner");
            turnButtonsOff();
        }

    }

    public void turnButtonsOff(){
        findViewById(R.id.btn_1).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_2).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_3).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_4).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_5).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_6).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_7).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_8).setVisibility(View.INVISIBLE);
        findViewById(R.id.btn_9).setVisibility(View.INVISIBLE);
    }
}