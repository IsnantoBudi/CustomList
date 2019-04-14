package com.gmail.isnantobudi0.customlist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class form extends AppCompatActivity {
    Button btnOk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        btnOk = (Button) findViewById(R.id.button);

//TODO 1. pindah ke layout list
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(form.this, list.class);
                form.this.startActivity(intent);
                finish();
            }

        });
    }

    }

