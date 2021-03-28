package com.example.mojaapka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editlogin, editpassword;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editlogin = findViewById(R.id.editlogin);
        editpassword = findViewById(R.id.editpassword);
        imageView = findViewById(R.id.imageView);
    }

    public void zalogowanie(View view)
    {
        String login = editlogin.getText().toString();
        String password = editpassword.getText().toString();

        if(login.isEmpty() || password.isEmpty())
        {
            Toast.makeText(this, "nie podales/as hasla lub loginu", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "uzytkownik: " + login, Toast.LENGTH_LONG).show();
            Toast.makeText(this, "haslo: " + password, Toast.LENGTH_LONG).show();
        }
        imageView.setVisibility(View.VISIBLE);
    }
}