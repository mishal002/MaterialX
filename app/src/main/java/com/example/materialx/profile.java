package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class profile extends AppCompatActivity {

    ImageView back_arro;
    public CardView polygon1,red2,blue_appbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        buiding();

        back_arro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(profile.this, com.example.materialx.MainActivity.class);
                startActivity(i);
            }
        });


        polygon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(profile.this, com.example.materialx.polygon.class);
                startActivity(i);
            }
        });

        red2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(profile.this, com.example.materialx.red.class);
                startActivity(i);
            }
        });

        blue_appbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(profile.this, com.example.materialx.blue_appbar.class);
                startActivity(i);
            }
        });

    }

    void buiding()
    {
        back_arro=findViewById(R.id.back_arro);
        polygon1 =findViewById(R.id.polygon1);
        red2 =findViewById(R.id.red2);
        blue_appbar =findViewById(R.id.blue_appbar);
    }

}