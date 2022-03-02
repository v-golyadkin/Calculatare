package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView result;
    private TextView input;
    private TextView operate;
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button mul;
    private Button div;
    private Button percent;
    private Button minus;
    private Button plus;
    private Button equal;
    private Button clear;
    private Button backs;
    private Button dot;


    private boolean all = false;
    private boolean minusb,plusb,divb,mulb, percentb = false;
    private float res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textView1);
        input   = findViewById(R.id.textView2);
        operate = findViewById(R.id.textView);

        num0 = findViewById(R.id.button17);
        num1 = findViewById(R.id.button13);
        num2 = findViewById(R.id.button14);
        num3 = findViewById(R.id.button15);
        num4 = findViewById(R.id.button9);
        num5 = findViewById(R.id.button10);
        num6 = findViewById(R.id.button11);
        num7 = findViewById(R.id.button5);
        num8 = findViewById(R.id.button6);
        num9 = findViewById(R.id.button7);

        clear     = findViewById(R.id.button1);
        backs = findViewById(R.id.button2);
        percent   = findViewById(R.id.button3);
        div       = findViewById(R.id.button4);
        mul    = findViewById(R.id.button8);
        minus       = findViewById(R.id.button12);
        plus       = findViewById(R.id.button16);
        equal    = findViewById(R.id.button19);
        dot       = findViewById(R.id.button18);

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                    input.setText(input.getText() + "0");
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all ==true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(all == true) {
//                    input.setText("");
//                    all = false;
//                }
                input.setText(input.getText() + ".");
            }
        });
        backs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().toString().substring(0,input.getText().toString().length()-1));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                result.setText("");
                operate.setText("");
                all = false;
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input.getText().toString().equals("") && !result.getText().toString().equals(""))
                    equalTouch();
                if(result.getText().toString().equals("") && !input.getText().toString().equals(""))
                    res = Float.parseFloat(input.getText().toString());
                if(!input.getText().toString().equals(""))
                    result.setText(String.valueOf(res));
                all = true;
                minusb = true; plusb = false; divb = false; mulb = false;percentb=false;
                input.setText("");
                operate.setText("—");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!input.getText().toString().equals("") && !result.getText().toString().equals(""))
                    equalTouch();
                if(result.getText().toString().equals("") && !input.getText().toString().equals(""))
                    res = Float.parseFloat(input.getText().toString());
                if(!input.getText().toString().equals(""))
                    result.setText(String.valueOf(res));
                all = true;
                minusb = false; plusb = true; divb = false; mulb = false; percentb=false;
                input.setText("");
                operate.setText("+");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!input.getText().toString().equals("") && !result.getText().toString().equals(""))
                    equalTouch();
                if(result.getText().toString().equals("") && !input.getText().toString().equals(""))
                    res = Float.parseFloat(input.getText().toString());
                if(!input.getText().toString().equals(""))
                    result.setText(String.valueOf(res));
                all = true;
                minusb = false; plusb = false; divb = false; mulb = true;percentb=false;
                input.setText("");
                operate.setText("×");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!input.getText().toString().equals("") && !result.getText().toString().equals(""))
                    equalTouch();
                if(result.getText().toString().equals("") && !input.getText().toString().equals(""))
                    res = Float.parseFloat(input.getText().toString());
                if(!input.getText().toString().equals(""))
                    result.setText(String.valueOf(res));
                all = true;
                minusb = false; plusb = false; divb = true; mulb = false; percentb=false;
                input.setText("");
                operate.setText("÷");
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.getText().toString().equals(""))
                    res = Float.parseFloat(input.getText().toString());
                res = (res / 100);
                result.setText(String.valueOf(res));
                all = true;
                minusb = false; plusb = false; divb = false; mulb = false; percentb=true;
                input.setText("");
                operate.setText("%");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equalTouch();
            }
        });
    }
    public void equalTouch(){
        if(minusb == true)
        {
            res = Float.parseFloat(result.getText().toString())- Float.parseFloat(input.getText().toString());
            result.setText(String.valueOf(res));
        }
        else if(plusb == true){
            res = Float.parseFloat(result.getText().toString()) + Float.parseFloat(input.getText().toString());
            result.setText(String.valueOf(res));
        }
        else if(mulb == true){
            res = Float.parseFloat(result.getText().toString()) * Float.parseFloat(input.getText().toString());
            result.setText(String.valueOf(res));
        }
        else if(divb == true){
            res = Float.parseFloat(result.getText().toString()) / Float.parseFloat(input.getText().toString());
            result.setText(String.valueOf(res));
        }
        else if(percentb == true) {
            res = Float.parseFloat(result.getText().toString()) / 100;
            result.setText(String.valueOf(res));
        }
//        all = true;
        operate.setText("");
        input.setText("");
    }
}
