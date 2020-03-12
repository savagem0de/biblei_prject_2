package com.example.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityMath extends AppCompatActivity {

    private Button btnRead1;
    private Button btnRead2;
    private Button btnRead3;
    private Button btnRead4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        btnRead1 = findViewById(R.id.button10);
        btnRead2 = findViewById(R.id.button11);
        btnRead3 = findViewById(R.id.button_math_3);
        btnRead4 = findViewById(R.id.button_math_4);
        btnRead1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc158389358_532432341"));
                startActivity(browserIntent);

            }
        });
        btnRead2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc44301783_529901668"));
                startActivity(browserIntent);

            }
        });
        btnRead3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc151487158_526842351"));
                startActivity(browserIntent);

            }
        });
        btnRead4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://vk.com/doc388775481_509291454"));
                startActivity(browserIntent);

            }
        });
    }
}