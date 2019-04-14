package com.gmail.isnantobudi0.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class daftar extends AppCompatActivity {
    EditText username, password;
    Button btnLogin, btnDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        username = (EditText) findViewById(R.id.userDaf);
        password = (EditText) findViewById(R.id.passDaf);
        btnDaftar =(Button) findViewById(R.id.daftar);
//TODO 1. menyimpan data user yang baru dibuat
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameDaf = username.getText().toString();
                String passwordDaf = password.getText().toString();
                if(usernameDaf.isEmpty() && passwordDaf.isEmpty()){
                    username.setError("username harus diisi");
                    password.setError("password harus diisi");
                }else{
                   String userBaru = username.getText().toString();
                   String passBaru = password.getText().toString();
                    Toast.makeText(getApplicationContext(), "Daftar berhasil ",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(daftar.this, MainActivity.class);
                    daftar.this.startActivity(intent);

                }

            }

        });
    }
}
