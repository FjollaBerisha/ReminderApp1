package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText txtusername;
    EditText txtpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin = findViewById(R.id.buttonlogin);
        txtusername = findViewById(R.id.editUsername);
        txtpassword = findViewById(R.id.editPassword);
        final Intent secondactivity = new Intent(this,Main2Activity.class);
        btnlogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View  v) {
                        if(txtusername.getText().equals("fjolla") && txtpassword.getText().equals("berisha")){
                            startActivity(secondactivity);
                        }
                    }
                }
        );
    }
}
