package com.example.sistligajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnBatman;
    Button btnMulMara;
    Button btnSuperMan;
    Button btnFlash;
    Button btnSaibaMais;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBatman = (Button) findViewById(R.id.btnBatman);
        btnMulMara = (Button) findViewById(R.id.btnMulMara);
        btnSuperMan = (Button) findViewById(R.id.btnSuperMan);
        btnFlash = (Button) findViewById(R.id.btnFlash);
        btnSaibaMais = (Button) findViewById(R.id.btnSaberMais);

        btnBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inBat = new Intent(MainActivity.this, ActivityBatman.class);
                startActivity(inBat);
            }
        });
        btnSuperMan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inSuperman = new Intent(MainActivity.this, ActivitySuperman.class);
                startActivity(inSuperman);
            }
        });
        btnMulMara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inMulMara = new Intent(MainActivity.this, ActivityMulMara.class);
                startActivity(inMulMara);
            }
        });
        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inFlash = new Intent(MainActivity.this, ActivityFlash.class);
                startActivity(inFlash);
            }
        });
        btnSaibaMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.dccomics.com/");
                Intent inSite = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(inSite);
            }
        });
    }
}
