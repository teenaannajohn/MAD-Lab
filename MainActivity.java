package com.example.sjcet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,pwd;
    Button signin;
    String e,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=findViewById(R.id.email);
        pwd=findViewById(R.id.pwd);
        signin=findViewById(R.id.signin);
    }

    public void signin(View view) {
        e=email.getText().toString();
        p=pwd.getText().toString();
        if (e.length()==0 || p.length()==0 || p.length()<= 8)
        {
            Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            intent.putExtra("email",e);
            startActivity(intent);
        }
    }

}
