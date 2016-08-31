package com.example.admin.loginscreen;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @TargetApi(Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e1 =(EditText) findViewById(R.id.edittext1);
        final EditText e2 =(EditText) findViewById(R.id.edittext2);
        final Button b1=(Button)findViewById(R.id.button1);
        if(e1.getText().toString().isEmpty())
        {
            e1.setError("Email Should not be blank");
            Toast.makeText(MainActivity.this,"Enter Email id",Toast.LENGTH_SHORT).show();
        }
        if (e2.getText().toString().isEmpty())
        {
            e2.setError("Enter valid password");
            Toast.makeText(MainActivity.this,"Enter Password",Toast.LENGTH_SHORT).show();
        }

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(v.getId()==R.id.button1){
                        EditText a =(EditText)findViewById(R.id.edittext1);
                        String str= a.getText().toString();
                        Intent i= new Intent(MainActivity.this, Display.class);
                        i.putExtra("Username",str);
                        startActivity(i);
                    }
                }

        });
    }


}
