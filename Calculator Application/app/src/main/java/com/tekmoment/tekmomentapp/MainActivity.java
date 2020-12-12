package com.tekmoment.tekmomentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView            answer_textview;

    Button              btnNine, btnEight, btnSeven, btnSix, btnFive, btnFour,
                        btnThree, btnTwo, btnOne, btnZero, btnDiv, btnMul, btnSub, btnEqual, btnClear;

    String              current_value = "0";

    char                lastOperation = ' ';

    int                 result        = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        creating an instance of the BtnListener class
        BtnListener listener = new BtnListener();

        answer_textview = findViewById(R.id.answers_textview);
        answer_textview.setText("0");

        btnNine         = findViewById(R.id.btnNine);
        btnEight        = findViewById(R.id.btnEight);
        btnSeven        = findViewById(R.id.btnSeven);
        btnSix          = findViewById(R.id.btnSix);
        btnFive         = findViewById(R.id.btnFive);
        btnFour         = findViewById(R.id.btnFour);
        btnThree        = findViewById(R.id.btnThree);
        btnTwo          = findViewById(R.id.btnTwo);
        btnOne          = findViewById(R.id.btnOne);
        btnZero         = findViewById(R.id.btnZero);

        btnDiv          = findViewById(R.id.btnDiv);
        btnMul          = findViewById(R.id.btnMul);
        btnSub          = findViewById(R.id.btnSub);
        btnEqual        = findViewById(R.id.btnEqual);
        btnClear        = findViewById(R.id.btnClear);

        //this is the point where we tell the buttons what to do when they are clicked

        btnNine.setOnClickListener(listener);
        btnEight.setOnClickListener(listener);
        btnSeven.setOnClickListener(listener);
        btnSix.setOnClickListener(listener);
        btnFive.setOnClickListener(listener);
        btnFour.setOnClickListener(listener);
        btnThree.setOnClickListener(listener);
        btnTwo.setOnClickListener(listener);
        btnOne.setOnClickListener(listener);

        btnDiv.setOnClickListener(listener);
        btnMul.setOnClickListener(listener);
        btnSub.setOnClickListener(listener);
        btnEqual.setOnClickListener(listener);
        btnClear.setOnClickListener(listener);
    }

    public class BtnListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btnNine:
                case R.id.btnEight:
                case R.id.btnSeven:
                case R.id.btnSix:
                case R.id.btnFive:
                case R.id.btnFour:
                case R.id.btnThree:
                case R.id.btnTwo:
                case R.id.btnOne:
                case R.id.btnZero:
                    String pressed_button_value = ((Button) view).getText().toString();

                    if(current_value.equals("0")){
                        current_value = pressed_button_value;
                    }
                    else{
                        current_value += pressed_button_value;
                    }
                    answer_textview.setText(pressed_button_value);

                    if(lastOperation == '='){
                        result = 0;
                        lastOperation = ' ';
                    }

                    break;

                //operator button logic
                case R.id.btnAdd:
                    calculate();
                    lastOperation = '+';
                    break;

                case R.id.btnSub:
                    calculate();
                    lastOperation = '-';
                    break;

                case R.id.btnMul:
                    calculate();
                    lastOperation = '*';
                    break;

                case R.id.btnDiv:
                    calculate();
                    lastOperation = '/';
                    break;

                case R.id.btnEqual:
                    calculate();
                    lastOperation = '=';
                    break;

                case R.id.btnClear:
                    result = 0;
                    current_value = "0";
                    lastOperation = ' ';
                    answer_textview.setText("0");
                    break;

            }
        }

        private void calculate(){
            int current_value_int = Integer.parseInt(current_value);
            current_value = "0";

            if(lastOperation == ' '){
                result = current_value_int;
            }
            else if(lastOperation == '+'){
                result += current_value_int;
            }
            else if(lastOperation == '-'){
                result -= current_value_int;
            }
            else if(lastOperation == '*'){
                result *= current_value_int;
            }
            else if(lastOperation == '/'){
                result /= current_value_int;
            }
            else if(lastOperation == '='){
//                keep result for later computation
            }

            answer_textview.setText(String.valueOf(result));

        }
    }
}

