package com.example.sruthijayanti.memorymania2018;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ThemeScreen extends AppCompatActivity {
    private ImageButton DCImagebutton;
    private ImageButton DCLogobutton;
    private ImageButton MarvelImageButton;
    private ImageButton MarvelLogoButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_screen);

        DCImagebutton = (ImageButton) findViewById(R.id.imageButton5);
        DCImagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameScreenDC();
            }
        });

        DCLogobutton = (ImageButton) findViewById(R.id.imageButton6);
        DCLogobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameScreenDC();
            }
        });

        MarvelImageButton = (ImageButton) findViewById(R.id.imageButton7);
        MarvelImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameScreenMarvel();
            }
        });

        MarvelLogoButton = (ImageButton) findViewById(R.id.imageButton8);
        MarvelLogoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGameScreenMarvel();
            }
        });
    }

    public void openGameScreenDC() {
        Intent intent = new Intent(this, GameScreenDC.class);
        startActivity(intent);
    }

    public void openGameScreenMarvel() {
        Intent intent = new Intent(this, GameScreenMarvel.class);
        startActivity(intent);
    }

}
