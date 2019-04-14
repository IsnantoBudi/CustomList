package com.gmail.isnantobudi0.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin, btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//TODO 1. membuat variabel untuk menyimpan data
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.login);
        btnDaftar =(Button) findViewById(R.id.daftar);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();
//TODO 2. mencocokkan data username dan password
                if (usernameKey.equals("isnanto") && passwordKey.equals("isnanto")) {
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, form.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    //jika login gagal
                   username.setError("username salah");
                   password.setError("password salah");
                }
            }

        });
        // TODO 3. pindah layout saat button daftar di tekan
        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent intent = new Intent(MainActivity.this, daftar.class);
                    MainActivity.this.startActivity(intent);
                    finish();
            }

        });
    }
}
