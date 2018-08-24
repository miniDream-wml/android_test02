package com.example.wangmenglei.test02;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    int count = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textview);
        button = (Button)findViewById(R.id.button);

        ButtonListener buttonListener;
        buttonListener = new ButtonListener();
        button.setOnClickListener(buttonListener);
    }

    class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v){
            count++;
            textView.setText(count + "");
        }
    }
}
