package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alphabet(View view){
        Intent newActivity = new Intent(getApplicationContext(), KanaActivity.class);
        startActivity(newActivity);
    }

    public void themes(View view){
        Intent newActivity = new Intent(getApplicationContext(), ThermesActivity.class);
        startActivity(newActivity);
    }

    public void particule(View view) {
        Intent newActivity = new Intent(getApplicationContext(), ParticuleActivity.class);
        startActivity(newActivity);
    }

    public void vocabulaire(View view){
        Intent newActivity = new Intent(getApplicationContext(), VocabulaireActivity.class);
        startActivity(newActivity);
    }

    public void exercice(View view){
        Intent newActivity = new Intent(getApplicationContext(), ExerciceActivity.class);
        startActivity(newActivity);
    }


}
