package com.example.cemo.reko_v_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Addition extends Activity implements View.OnClickListener{
    int x,y,z,a=1,b = 10, Punkte=0;
    String zahl1, zahl2;
    TextView tvZahl1, tvZahl2;
    Button btnStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        /*Textviews vorstellungen*/
              tvZahl1 = (TextView)findViewById(R. id. tvZahl1);
              tvZahl2 = (TextView)findViewById(R. id. tvZahl2);
              //eTPunkte = (EditText)findViewById(R. id. eTPunkte);
              btnStart = (Button)findViewById(R. id. btnStart);
             zufis(); //Zufall zahlen aufrufen über funktion zufis
      //  oberGrenze = (EditText)findViewById(R. id. ptOberGrenz);
       btnStart.setOnClickListener(this);
        /*zahlen zur textfelder schicken*/
        tvZahl1.setText(String.valueOf(x));
        tvZahl2.setText(String.valueOf(y));
        //eTPunkte.setText(String.valueOf(Punkte));


    }
    /*public void starten(){

    }*/

    public void ergebnisLesen(){ //Ergebnis auslesen
        EditText ergebnis = (EditText)findViewById(R. id. ptErgebnis);
       EditText oberGrenze = (EditText)findViewById(R. id. ptOberGrenz);
        z = Integer.parseInt(ergebnis.getText().toString());
        b = Integer.parseInt(oberGrenze.getText().toString());



    }

    public void zufis() { //Zufallzahlgenerator
        Random zufi = new Random();
       x = zufi.nextInt(b - a)+1;
       y = zufi.nextInt(b - a)+1;

    }

    @Override
    public void onClick(View v) {
        Intent intent5 = new Intent(this, Addition.class);
        startActivity(intent5);
    }
}
