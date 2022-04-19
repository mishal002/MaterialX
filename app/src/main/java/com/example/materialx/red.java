package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class red extends AppCompatActivity {

    private ImageView back_arro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
        buiding();

        back_arro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(red.this, profile.class);
                startActivity(i);
            }
        });


    }

   void buiding()
    {

        back_arro=findViewById(R.id.back_arro);
    }
}