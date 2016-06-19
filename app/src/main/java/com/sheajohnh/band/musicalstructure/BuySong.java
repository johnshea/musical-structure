package com.sheajohnh.band.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BuySong extends AppCompatActivity {

    Button btnPurchaseSong;
    Button btnLaunchHomeScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_song);

        btnPurchaseSong = (Button) findViewById(R.id.purchaseSong);
        btnLaunchHomeScreen = (Button) findViewById(R.id.launchHomeScreen);

        btnPurchaseSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BuySong.this, "Song purchased. Enjoy!", Toast.LENGTH_SHORT).show();
            }
        });

        btnLaunchHomeScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuySong.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
