package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;
import fr.cedrouxx.aidejaponais.alphabet.Hiragana;
import fr.cedrouxx.aidejaponais.alphabet.Katakana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ExerciceAlphabetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_alphabet);

    }

    public void hiragana(View view) {
        startActivity(new Intent(getApplicationContext(), ExerciceAlphabetHiraganaActivity.class));
    }

    public void katakana(View view) {
        startActivity(new Intent(getApplicationContext(), ExerciceAlphabetKatakanaActivity.class));
    }
}
