package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;
import fr.cedrouxx.aidejaponais.alphabet.Hiragana;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExerciceAlphabetHiraganaActivity extends AppCompatActivity {

    private TextView text;

    private Button[] buttons = {null, null, null};

    private final String[] alphaLatin = {
            "A","I","U","E","O",
            "KA","KI","KU","KE","KO",
            "SA","SHI","SU","SE","SO",
            "TA","CHI","TSU","TE","TO",
            "NA","NI","NU","NE","NO",
            "HA","HI","FU","HE","HO",
            "MA","MI","MU","ME","MO",
            "YA","YU","YO",
            "RA","RI","RU","RE","RO",
            "WA","WO",
            "N"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice_alphabet_hiragana);

        text = findViewById(R.id.ex_alpha_hira_text);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ExerciceAlphabetHiraganaActivity.class));
                finish();
            }
        });
        text.setClickable(false);

        buttons[0] = findViewById(R.id.ex_alpha_hira_button1);
        buttons[1] = findViewById(R.id.ex_alpha_hira_button2);
        buttons[2] = findViewById(R.id.ex_alpha_hira_button3);

        final int randomButton = (int) (Math.random() * 3);
        int randomAlphaLatin = (int) (Math.random() * (alphaLatin.length - 1));

        Boolean kana = (int) (Math.random() * 2) > 0; // true = kana , false = latin. for text

        String lettreLatin = alphaLatin[randomAlphaLatin];

        if(kana){
            text.setText(Hiragana.FtoJ(lettreLatin));
        }else{
            text.setText(lettreLatin.toLowerCase());
        }

        for (int i = 0; i<buttons.length; i++){
            if(i == randomButton){
                if(kana){
                    buttons[i].setText(lettreLatin.toLowerCase());
                }else{
                    buttons[i].setText(Hiragana.FtoJ(lettreLatin));
                }

                buttons[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(Color.GREEN);
                        text.setClickable(true);
                    }
                });
            }else{
                if(kana){
                    String result = alphaLatin[(int) (Math.random() * (alphaLatin.length - 1))];
                    if(i!=0)
                        while(buttons[0].getText().equals(result) || buttons[1].getText().equals(result) || buttons[1].getText().equals(result)){
                            result = alphaLatin[(int) (Math.random() * (alphaLatin.length - 1))];
                        }
                    buttons[i].setText(result.toLowerCase());
                }else{
                    String result = Hiragana.FtoJ(alphaLatin[(int) (Math.random() * (alphaLatin.length - 1))]);
                    while(buttons[0].getText().equals(result) || buttons[1].getText().equals(result) || buttons[1].getText().equals(result)){
                        result = Hiragana.FtoJ(alphaLatin[(int) (Math.random() * (alphaLatin.length - 1))]);
                    }
                    buttons[i].setText(result);
                }
                buttons[i].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        v.setBackgroundColor(Color.RED);
                        buttons[randomButton].setBackgroundColor(Color.GREEN);
                        text.setClickable(true);
                    }
                });
            }
        }
    }
}
