package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Generate variables for buttons in activity_main.xml
    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven, buttonEight, buttonNine, buttonZero;
    Button buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEquals, buttonClear, buttonDecimal,buttonSign,buttonPercentage;
    TextView textViewResult;

    Operator operator=null;

    Double firstNumber = 0.0;
    Double secondNumber = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        castViews();
        clickListeners();
        operatorListeners();
    }

    //Generate method for casting
    private void castViews() {
        //Cast buttons
        buttonOne = findViewById(R.id.button_one);
        buttonTwo = findViewById(R.id.button_two);
        buttonThree = findViewById(R.id.button_three);
        buttonFour = findViewById(R.id.button_four);
        buttonFive = findViewById(R.id.button_five);
        buttonSix = findViewById(R.id.button_six);
        buttonSeven = findViewById(R.id.button_seven);
        buttonEight = findViewById(R.id.button_eight);
        buttonNine = findViewById(R.id.button_nine);
        buttonZero = findViewById(R.id.button_zero);

        buttonAdd = findViewById(R.id.button_add);
        buttonSubtract = findViewById(R.id.button_subtract);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonDivide = findViewById(R.id.button_divide);
        buttonEquals = findViewById(R.id.button_equal);
        buttonClear = findViewById(R.id.button_ac);
        buttonDecimal = findViewById(R.id.button_dot);
        buttonSign = findViewById(R.id.button_sign);
        buttonPercentage = findViewById(R.id.button_percentage);

        //Cast textView
        textViewResult = findViewById(R.id.text_view_display);
    }

    //Generate method for onClickListener
    private void clickListeners() {
        buttonZero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("0");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "0");
                        }
                    }
                }
        );


        buttonOne.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("1");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "1");
                        }
                    }
                }
        );

        buttonTwo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("2");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "2");
                        }
                    }
                }
        );

        buttonThree.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("3");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "3");
                        }
                    }
                }
        );

        buttonFour.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("4");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "4");
                        }
                    }
                }
        );

        buttonFive.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("5");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "5");
                        }
                    }
                }
        );

        buttonSix.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("6");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "6");
                        }
                    }
                }
        );


        buttonSeven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("7");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "7");
                        }
                    }
                }
        );

        buttonEight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("8");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "8");
                        }
                    }
                }
        );

        buttonNine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double result = Double.parseDouble(textViewResult.getText().toString());

                        if (result == 0) {
                            textViewResult.setText("9");
                        } else {
                            textViewResult.setText(textViewResult.getText() + "9");
                        }
                    }
                }
        );

        buttonClear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textViewResult.setText("0");
                    }
                }
        );
    }

    private void operatorListeners()
    {
        buttonAdd.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operator = Operator.ADD;
                        firstNumber = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText("0");
                    }
                }
        );

        buttonSubtract.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operator = Operator.SUBTRACT;
                        firstNumber = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText("0");
                    }
                }
        );

        buttonMultiply.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operator = Operator.MULTIPLY;
                        firstNumber = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText("0");
                    }
                }
        );

        buttonDivide.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        operator = Operator.DIVIDE;
                        firstNumber = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText("0");
                    }
                }
        );

        buttonSign.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double number = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText(number.intValue() * -1 + "");
                    }
                }
        );

        buttonPercentage.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        Double number = Double.parseDouble(textViewResult.getText().toString());
                        textViewResult.setText(number / 100 + "");
                    }
                }
        );

        buttonEquals.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {


                        //switch statement
                        switch (operator)
                        {
                            case ADD:
                                secondNumber = Double.parseDouble(textViewResult.getText().toString());
                                textViewResult.setText(String.valueOf(firstNumber.intValue() + secondNumber.intValue()));
                                break;
                            case SUBTRACT:
                                secondNumber = Double.parseDouble(textViewResult.getText().toString());
                                textViewResult.setText(String.valueOf(firstNumber.intValue() - secondNumber.intValue()));
                                break;
                            case MULTIPLY:
                                secondNumber = Double.parseDouble(textViewResult.getText().toString());
                                textViewResult.setText(String.valueOf(firstNumber.intValue() * secondNumber.intValue()));
                                break;
                            case DIVIDE:
                                secondNumber = Double.parseDouble(textViewResult.getText().toString());
                                textViewResult.setText(String.valueOf(firstNumber.intValue() / secondNumber.intValue()));
                                break;
                        }
                    }
                }
        );
    }

    enum Operator {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, EQUAL
    }

}






