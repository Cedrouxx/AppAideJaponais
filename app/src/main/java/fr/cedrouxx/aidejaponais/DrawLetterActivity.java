package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawLetterActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_letter);

        imageView = findViewById(R.id.drawLetterImage);
        textView = findViewById(R.id.drawLetterText);

        Intent intent = getIntent();
        String signe = "";

        if(intent.hasExtra("signe")){
            signe = intent.getStringExtra("signe");
            Context context = imageView.getContext();
            int id = context.getResources().getIdentifier("alphabet_" + signe.toLowerCase(),"drawable", context.getPackageName());
            imageView.setImageResource(id);
            textView.setText(signe.replaceAll("h_", "").replaceAll("k_", ""));
        }

    }
}
