package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class form_1 extends AppCompatActivity {

    public CardView form_2;
    ImageView back_arro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);
        buiding();


        form_2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i= new Intent(form_1.this, com.example.materialx.form_final.class);
            startActivity(i);
        }
    });

        back_arro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(form_1.this, com.example.materialx.MainActivity.class);
                startActivity(i);
            }
        });

}


    void buiding()
    {

        form_2=findViewById(R.id.form_2);
        back_arro=findViewById(R.id.back_arro);
    }
}