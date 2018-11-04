package com.example.cemo.reko_v_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {
    Button btnAddition, btnMultiplikation, btnSubtraktion, btnDivision, btnGemischt, btnKarteikarten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                /*Zuweisungen für Buttons*/
        btnAddition = (Button)findViewById(R. id. btnAddition);
        btnMultiplikation = (Button)findViewById(R. id. btnMultiplikation);
        btnSubtraktion = (Button)findViewById(R. id. btnSubtraktion);
        btnDivision = (Button)findViewById(R. id. btnDivision);
        btnGemischt = (Button)findViewById(R. id. btnGemischt);
        btnKarteikarten = (Button)findViewById(R. id. btnKarteikarten);
    /*funktionen Von Button aufrufen*/
        btnAddition.setOnClickListener(this);
        btnMultiplikation.setOnClickListener(this);
        btnSubtraktion.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnGemischt.setOnClickListener(this);
        btnKarteikarten.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) { /*Buttons Funktionen bestimmen*/
        switch (v.getId()){
            case R. id. btnAddition: //Wenn Addition Butttton Geklickt ist dann gehe mal classe Adition
                Intent intent = new Intent(this, Addition.class);
                startActivity(intent);
                //this.finish();
                break;
            case R. id. btnMultiplikation:   //Wenn Multiplikation Butttton Geklickt ist dann gehe mal classe Multiplikation
                Intent intent1 = new Intent(this, Multiplikation.class);
                startActivity(intent1);
                //this.finish();
                break;
            case R.id. btnSubtraktion: //Wenn Subtraktion Butttton Geklickt ist dann gehe mal classe Subtraktion
                Intent intent2 = new Intent(this, Subtraktion.class);
                startActivity(intent2);
                //this.finish();
                break;
            case R. id. btnDivision: //Wenn Division Butttton Geklickt ist dann gehe mal classe Division
                Intent intent3 = new Intent(this, Division.class);
                startActivity(intent3);
                //this.finish();
                break;
            case R. id. btnGemischt: //Wenn Gemischt Butttton Geklickt ist dann gehe mal classe Gemischt
                Intent intent4 = new Intent(this, Gemischt.class);
                startActivity(intent4);
               // this.finish();
                break;
            case R. id. btnKarteikarten: //wenn Kartei Karten button geklickt wird gehe mal klassen Karteikarten.
                Intent intent5 = new Intent(this, Karteikarten.class);
                startActivity(intent5);
               // this.finish();
                break;
        }

    }
}
