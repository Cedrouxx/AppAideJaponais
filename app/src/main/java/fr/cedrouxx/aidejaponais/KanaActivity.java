package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.AndroidViewModel;
import fr.cedrouxx.aidejaponais.alphabet.Hiragana;
import fr.cedrouxx.aidejaponais.alphabet.Katakana;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KanaActivity extends AppCompatActivity {

    LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    private Context thiss = this;

    private Button hiraganaButton;
    private Button katakanaButton;
    private Button mangaButton;

    private LinearLayout primaryLayout;

    private TextView newText;
    private LinearLayout newLayout;
    private Intent drawActivity;

    private final String[] alphaLatin = {
            "A","I","U","E","O",
            "KA","KI","KU","KE","KO",
            "SA","SHI","SU","SE","SO",
            "TA","CHI","TSU","TE","TO",
            "NA","NI","NU","NE","NO",
            "HA","HI","FU","HE","HO",
            "MA","MI","MU","ME","MO",
            "YA","null","YU","null","YO",
            "RA","RI","RU","RE","RO",
            "WA","null","null","null","WO",
            "null","null","null","null","N"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kana);
        drawActivity = new Intent(this, DrawLetterActivity.class);

        primaryLayout = findViewById(R.id.kanaPrimaryLayout);

        param.weight = 1;

        hiraganaButton = findViewById(R.id.kanaSwitchButtonHiragana);
        katakanaButton = findViewById(R.id.kanaSwitchButtonKatakana);
        mangaButton = findViewById(R.id.kanaSwitchButtonManga);

        hiraganaButton.setClickable(false);
        katakanaButton.setClickable(true);

        for (int i=0;i<alphaLatin.length;i++){
            if(i==0||i==5||i==10||i==15||i==20||i==25||i==30||i==35||i==40||i==45||i==50||i==55){
                if(i!=0)
                    primaryLayout.addView(newLayout);

                newLayout = new LinearLayout(this);
                newLayout.setLayoutParams(param);
            }

            newText = new TextView(this);
            if(alphaLatin[i] != "null")
                newText.setText(Hiragana.FtoJ(alphaLatin[i])+ " " + alphaLatin[i].toLowerCase());
            else
                newText.setText(" ");

            newText.setLayoutParams(param);
            setDrawOnClick(newText, "h_"+alphaLatin[i].toLowerCase());
            newLayout.addView(newText);
        }
        primaryLayout.addView(newLayout);

        hiraganaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primaryLayout.removeAllViews();

                hiraganaButton.setClickable(false);
                katakanaButton.setClickable(true);

                for (int i=0;i<alphaLatin.length;i++){
                    if(i==0||i==5||i==10||i==15||i==20||i==25||i==30||i==35||i==40||i==45||i==50||i==55){
                        if(i!=0)
                            primaryLayout.addView(newLayout);

                        newLayout = new LinearLayout(thiss);
                        newLayout.setLayoutParams(param);
                    }

                    newText = new TextView(thiss);
                    if(alphaLatin[i] != "null")
                        newText.setText(Hiragana.FtoJ(alphaLatin[i])+ " " + alphaLatin[i].toLowerCase());
                    else
                        newText.setText(" ");

                    newText.setLayoutParams(param);
                    setDrawOnClick(newText, "h_"+alphaLatin[i].toLowerCase());
                    newLayout.addView(newText);
                }
                primaryLayout.addView(newLayout);

            }
        });

        katakanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primaryLayout.removeAllViews();

                hiraganaButton.setClickable(true);
                katakanaButton.setClickable(false);

                for (int i=0;i<alphaLatin.length;i++){
                    if(i==0||i==5||i==10||i==15||i==20||i==25||i==30||i==35||i==40||i==45||i==50||i==55){
                        if(i!=0)
                            primaryLayout.addView(newLayout);

                        newLayout = new LinearLayout(thiss);
                        newLayout.setLayoutParams(param);
                    }

                    newText = new TextView(thiss);
                    if(alphaLatin[i] != "null")
                        newText.setText(Katakana.FtoJ(alphaLatin[i])+ " " + alphaLatin[i].toUpperCase());
                    else
                        newText.setText(" ");

                    newText.setLayoutParams(param);
                    setDrawOnClick(newText,"k_"+alphaLatin[i].toUpperCase());
                    newLayout.addView(newText);
                }
                primaryLayout.addView(newLayout);

            }
        });

        mangaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                primaryLayout.removeAllViews();
                ImageView image = new ImageView(thiss);

                if(katakanaButton.isClickable())
                    image.setImageResource(R.drawable.alphabet_manga_h);
                else if(hiraganaButton.isClickable())
                    image.setImageResource(R.drawable.alphabet_manga_k);

                primaryLayout.addView(image);

            }
        });
    }

    private void setDrawOnClick(final TextView btn, final String str){
        if (str.equals("h_null")||str.equals("k_NULL")) return;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawActivity.putExtra("signe", str);
                startActivities(new Intent[]{drawActivity});
            }
        });
    }


}
