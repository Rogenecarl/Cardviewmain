package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {
    public CardView games, facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);


        games = (CardView) findViewById(R.id.games);
        games.setOnClickListener(this::onClick);

        facebook = (CardView) findViewById(R.id.facebook);
        facebook.setOnClickListener(this::onClick);

    }

    public void onClick(View view) {
        Intent i;

        int id = view.getId();
        if (id == R.id.games) {
            i = new Intent(this, games.class);
            startActivity(i);
        } else if (id == R.id.facebook) {
            i = new Intent(this, facebook.class);
            startActivity(i);
        }
    }
}
