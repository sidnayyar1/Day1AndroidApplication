package com.example.day1androidapplication;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

EditText userEmail;
EditText userPassword;
Button LoginBtn;
TextView txtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //        String email = userEmail.getText().toString();
          //      String password = userPassword.getText().toString();
                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
            }
        });

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    private void init(){ userEmail = (EditText)findViewById(R.id.Email);
        userPassword = (EditText)findViewById(R.id.password);
        LoginBtn = (Button)findViewById(R.id.btnSubmit);
        txtMessage = findViewById(R.id.DisplayMessage);

    }


    private void login(){

        String Email = userEmail.getText().toString();
        String password = userPassword.getText().toString();
        if (Email.isEmpty() || Email.trim().length() == 0){
    
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
