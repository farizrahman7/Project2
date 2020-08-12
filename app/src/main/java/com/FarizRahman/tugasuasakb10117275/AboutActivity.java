package com.FarizRahman.tugasuasakb10117275;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import de.hdodenhof.circleimageview.CircleImageView;



/**
 * TANGGAL PENGERJAAN: 08 AGUSTUS 2020
 * NIM      : 10117275
 * NAMA     : MUHAMMAD FARIZ RAHMAN
 * KELAS    : IF-8
 */

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        setActionBarTitle("About Me");
        Drawable profile = ContextCompat.getDrawable(this, R.drawable.fotoaku);
        CircleImageView me = findViewById(R.id.foto);
        me.setImageDrawable(profile);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
