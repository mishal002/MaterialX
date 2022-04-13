package com.example.materialx;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class form_final extends AppCompatActivity {

    ImageView back_arro;
    Button done_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_final);
        buiding();

        back_arro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(form_final.this, com.example.materialx.form_1.class);
                startActivity(i);
            }
        });

        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(form_final.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });


    }


    void buiding()
    {
        back_arro=findViewById(R.id.back_arro);
        done_btn=findViewById(R.id.done_btn);
    }


}