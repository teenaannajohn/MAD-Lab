package com.example.sjcet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tv1);

        Intent intent= getIntent();
        String email=intent.getStringExtra("email");
        tv1.setText("Welcome"+ " "+email);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_mneu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Signing Out", Toast.LENGTH_SHORT).show();
        return true;



    }
}
