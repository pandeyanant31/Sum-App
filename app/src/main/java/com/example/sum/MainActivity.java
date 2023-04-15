package com.example.sum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText1;
    private EditText editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);
        editText1=findViewById(R.id.n1);
        editText2=findViewById(R.id.n2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Calculating", Toast.LENGTH_SHORT).show();
                String s1 = editText1.getText().toString();
                int num1 = Integer.parseInt(s1);
                String s2 = editText2.getText().toString();
                int num2 = Integer.parseInt(s2);
                int ans = num1+num2;
                textView.setText("Answer : "+ans);
            }
        });
    }
}