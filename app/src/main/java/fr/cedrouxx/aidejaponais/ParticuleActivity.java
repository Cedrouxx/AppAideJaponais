package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;
import fr.cedrouxx.aidejaponais.tools.ParticuleButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ParticuleActivity extends AppCompatActivity {

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_particule);

        linearLayout = findViewById(R.id.particuleLayout);

        List<ParticuleButton> buttons = new ArrayList<ParticuleButton>();

        //particules de liaisons
        buttons.add(new ParticuleButton("の", "particule de possession (possesseurのpossédé)."));
        buttons.add(new ParticuleButton("と", "particule d'énumération, entre des noms (pas de verbe)."));
        buttons.add(new ParticuleButton("や", "particule d'énumération non-exhaustive (non complet)(pas de verbe)."));
        buttons.add(new ParticuleButton("か", "???"));
        buttons.add(new ParticuleButton("なり", "???"));
        linearLayout.addView(particuleBuilder("Particules de liaison", buttons));
        buttons.clear();

        //particules syntaxiques
        buttons.add(new ParticuleButton("と", "Avec"));
        buttons.add(new ParticuleButton("に", "Particule du lieu dans lequel il ne se passe rien. \nParticule du point d'arrivée. \nParticule du coi. \nParticule du complément de temps (si le point dans le temps est précis)"));
        buttons.add(new ParticuleButton("で", "Particule du lieu dans lequel il se passe quelque chose. \nParticule du moyen (transport, outils, ...)"));
        buttons.add(new ParticuleButton("へ", "Se prononce [é]. \nParticule de la direction."));
        buttons.add(new ParticuleButton("を", "Se prononce [o]. \nParticule du cod. \nParticule du parcours."));
        buttons.add(new ParticuleButton("から", "Particule de départ (temps ou espace)."));
        buttons.add(new ParticuleButton("まで", "Particule d'arrivée (temps ou espace)."));
        buttons.add(new ParticuleButton("が", "Particule du sujet du verbe. \nUtiliser quand: \n- Thème != Sujet \n- Insister sur le sujet \n- Donner une nouvelle information \n- Exprimer avoir (<thème> <sujet> être de présence)."));
        buttons.add(new ParticuleButton("より", "Particule du point de départ (soutenu). \nParticule de la base d'une comparaison."));
        linearLayout.addView(particuleBuilder("Particules syntaxiques", buttons));
        buttons.clear();

        //particules adverbiales
        buttons.add(new ParticuleButton("だけ", "Uniquement."));
        buttons.add(new ParticuleButton("のみ", "Uniquement (comme だけ mais plus polis."));
        buttons.add(new ParticuleButton("しか", "Uniquement (phrase au négatif."));
        buttons.add(new ParticuleButton("ばかり", "Uniquement (nuance péjorative."));
        buttons.add(new ParticuleButton("くらい", "Se prononce souvent [gu][ra][i]. \nApproximation."));
        buttons.add(new ParticuleButton("ころ", "Se prononce souvent [go][ro]. \nQui fais la meme chose quand il s'agit d'un point fixe dans le temps."));
        buttons.add(new ParticuleButton("ほど", "Etablir une comparaison."));
        buttons.add(new ParticuleButton("など", "Renforcer l'idée de non-exhaustivité."));
        buttons.add(new ParticuleButton("なんか", "???"));
        linearLayout.addView(particuleBuilder("Particules adverbiales", buttons));
        buttons.clear();

        //particules d'emphase
        buttons.add(new ParticuleButton("は", "Se prononce [wa]. \nParticule du thème de la phrase, il est différent du sujet du verbe."));
        buttons.add(new ParticuleButton("も", "Particule de choses identiques (aussi)."));
        buttons.add(new ParticuleButton("こそ", "Insiste sur le complément."));
        buttons.add(new ParticuleButton("さえ", "Même (quelque chose qui ne devrais pas avoir lieu)."));
        buttons.add(new ParticuleButton("でも", "Même (quelque chose de ridicule)."));
        linearLayout.addView(particuleBuilder("Particules d'emphase", buttons));
        buttons.clear();

        //particules de fin de phrase
        buttons.add(new ParticuleButton("よ", "???"));
        buttons.add(new ParticuleButton("ね", "???"));
        buttons.add(new ParticuleButton("な", "???"));
        buttons.add(new ParticuleButton("わ", "???"));
        buttons.add(new ParticuleButton("ぜ", "???"));
        buttons.add(new ParticuleButton("とも", "???"));
        buttons.add(new ParticuleButton("ぞ", "???"));
        buttons.add(new ParticuleButton("さ", "???"));
        buttons.add(new ParticuleButton("か", "???"));
        buttons.add(new ParticuleButton("かしら", "???"));
        buttons.add(new ParticuleButton("(の)", "???"));
        linearLayout.addView(particuleBuilder("Particules de fin de phrase", buttons));
        buttons.clear();

        //paricules conjonctives
        buttons.add(new ParticuleButton("が", "???"));
        buttons.add(new ParticuleButton("けれども", "???"));
        buttons.add(new ParticuleButton("のに", "???"));
        buttons.add(new ParticuleButton("から", "???"));
        buttons.add(new ParticuleButton("ので", "???"));
        linearLayout.addView(particuleBuilder("Particules conjonctives", buttons));
        buttons.clear();

    }

    private LinearLayout particuleBuilder(String name, List<ParticuleButton> buttons){
        LinearLayout linearLayout = new LinearLayout(this);
        LinearLayout.LayoutParams paramLayout = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        paramLayout.setMargins(0,0,0,10);
        linearLayout.setLayoutParams(paramLayout);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        TextView textName = new TextView(this);
        textName.setTextSize(18);
        textName.setText(name + " :");
        linearLayout.addView(textName);

        final TextView text = new TextView(this);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText("");
            }
        });

        LinearLayout layoutButton = null;
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        param.weight = 1;
        int i = 0;
        for(final ParticuleButton particuleButton : buttons){
            if(i == 5){
                i = 0;
                linearLayout.addView(layoutButton);
            }
            if(i == 0){
                layoutButton = new LinearLayout(this);
                layoutButton.setOrientation(LinearLayout.HORIZONTAL);
            }
            Button button = new Button(this);
            button.setLayoutParams(param);
            button.setText(particuleButton.getName());
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (text.getText().equals(particuleButton.getName().replaceAll("\\(", "").replaceAll("\\)", "") + " : " + particuleButton.getText())){
                        text.setText("");
                    }else{
                        text.setText(particuleButton.getName().replaceAll("\\(", "").replaceAll("\\)", "") + " : " +particuleButton.getText());
                    }
                }
            });
            layoutButton.addView(button);
            i++;
        }
        linearLayout.addView(layoutButton);
        linearLayout.addView(text);

        return linearLayout;
    }
}
