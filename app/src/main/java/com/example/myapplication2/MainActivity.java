package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email=findViewById(R.id.Введитепочту);
        EditText password=findViewById(R.id.Введитепароль);
        TextView welcom=findViewById(R.id.Добропожаловать);
        TextView sign=findViewById(R.id.Выполнитевход);
        TextView signIn=findViewById(R.id.Вход);
        TextView passwordForgot=findViewById(R.id.Забылипароль);
        Button button=findViewById(R.id.Войти);

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() > 0) {
                    button.setBackgroundColor(getResources().getColor(R.color.orange));
                }
                else {
                    button.setBackgroundColor(Color.GRAY);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if (charSequence.length() > 0){
                button.setBackgroundColor(getResources().getColor(R.color.orange));
            }
            else {
                button.setBackgroundColor(Color.GRAY);
            }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        button.setOnClickListener(view -> {
            if (email.getText().equals("admin")&&password.getText().equals("admin")){
                sign.setVisibility(View.GONE);
                signIn.setVisibility(View.GONE);
                passwordForgot.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(MainActivity.this,"Вы не правильно ввели пароль или почту",Toast.LENGTH_SHORT).show();

            }

        });

    }
}