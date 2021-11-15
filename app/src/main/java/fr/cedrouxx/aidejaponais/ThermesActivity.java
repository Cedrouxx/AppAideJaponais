package fr.cedrouxx.aidejaponais;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import static android.graphics.Color.rgb;

public class ThermesActivity extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermes);

        linearLayout = findViewById(R.id.themesLayout);

        try {
            InputStream inputStream = getAssets().open("thermes.txt");
            Scanner scanner = new Scanner(inputStream);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(10,10,10,10);
            String line;
            while (scanner.hasNext()){
                line = scanner.nextLine();

                textView = new TextView(this);
                if (line.contains("/n")){
                    String strs[] = line.split("/n");
                    for (String s:strs){
                        if (s.equals(strs[strs.length-1]))
                            textView.setText(textView.getText()+s);
                        else
                            textView.setText(textView.getText()+s+System.getProperty("line.separator"));
                    }
                } else
                    textView.setText(line);
                textView.setLayoutParams(params);
                textView.setPadding(0,5,0,5);
                linearLayout.addView(textView);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
