package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExerciceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice);
    }


    public void alphabet(View view) {
        Intent newActivity = new Intent(getApplicationContext(), ExerciceAlphabetActivity.class);
        startActivity(newActivity);
    }
}
