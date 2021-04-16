package com.example.inheritancerpg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class SelectionScreen extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    TextView statTxt;
    Spinner heroSpinner;
    Button selectionBtn;
    int heroClass;

    ImageView assassin;
    ImageView berserker;
    ImageView knight;
    ImageView oracle;
    ImageView thief;
    ImageView wizard;

    // Declaration for classes
    Berserker Palooza = new Berserker("Palooza the Oompalooza", 1000, 45, 80); // 1
    Knight Davon = new Knight("Davon the Undertun", 1350, 200, 60, 95); // 2
    Oracle Dodona = new Oracle("Dodona Priestess of the Light", 950, 100, 50, 75); // 3
    Wizard Everand = new Wizard("Everand, Master of the Winds", 900, 150, 60, 90); // 4
    Assassin Stygwyre = new Assassin("Stygwre of Kazakhyu", 900, 0.25, 40, 70); // 5
    Thief Baby = new Thief("Baby the Cunning", 900, 0.3, 30, 60); // 6

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

        // Declaration for UI elements
        statTxt = findViewById(R.id.statTxt);

        heroSpinner = findViewById(R.id.heroSpinner);


        // Drop down menu
        ArrayAdapter<String> heroChoice = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.heroes));
        heroChoice.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        heroSpinner.setAdapter(heroChoice);
        heroSpinner.setOnItemSelectedListener(this);

        // Button
        selectionBtn = findViewById(R.id.selectionBtn);
        selectionBtn.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        Intent battle = new Intent(this, BattleScreen.class);

        switch (v.getId()) {
            case R.id.selectionBtn:
                battle.putExtra("HERO_CLASS", this.heroClass);
                startActivity(battle);
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String text = heroSpinner.getSelectedItem().toString();

        switch (text) {
            case "Berserker":
                this.heroClass = 1;
                statTxt.setText(Palooza.heavyName+ "\n"+
                        "STATS:\n"+
                        "HP: "+ Palooza.heavyTotalHP+ "\n"+
                        "DAMAGE: "+ Palooza.heavyMinDMG+ " - "+ Palooza.heavyMaxDMG+"\n\n"+
                        "A HERO THAT DEALS MORE DAMAGE WHEN WEAKENED" +
                        "\n\nSPECIAL ATTRIBUTE: DAMAGE INCREASES BY 25% PER POINT OF HEALTH LOST");
                statTxt.setTextColor(Color.parseColor("#c7c150"));
                berserker.setVisibility(View.VISIBLE);
                assassin.setVisibility(View.INVISIBLE);
                knight.setVisibility(View.INVISIBLE);
                oracle.setVisibility(View.INVISIBLE);
                thief.setVisibility(View.INVISIBLE);
                wizard.setVisibility(View.INVISIBLE);
                break;
            case "Knight":
                this.heroClass = 2;
                statTxt.setText(Davon.heavyName+ "\n"+
                        "STATS:\n"+
                        "HP: "+ Davon.heavyTotalHP+ "\n"+
                        "DAMAGE: "+ Davon.heavyMinDMG+ " - "+ Davon.heavyMaxDMG+ "\n\n"+
                        "A HERO THAT BOASTS SUPERIOR DURABILITY");
                statTxt.setTextColor(Color.parseColor("#c7c150"));
                berserker.setVisibility(View.INVISIBLE);
                assassin.setVisibility(View.INVISIBLE);
                knight.setVisibility(View.VISIBLE);
                oracle.setVisibility(View.INVISIBLE);
                thief.setVisibility(View.INVISIBLE);
                wizard.setVisibility(View.INVISIBLE);
                break;
            case "Oracle":
                this.heroClass = 3;
                statTxt.setText(Dodona.mageName+ "\n"+
                        "STATS:\n"+
                        "HP:"+ Dodona.mageTotalHP+ "\n"+
                        "DAMAGE: "+ Dodona.mageMinDMG+ " - "+ Dodona.mageMaxDmg+ "\n\n"+
                        "A HERO THAT DEALS MAGICAL DAMAGE AND BOASTS HIGHER DURABILITY" +
                        "\n\nSPECIAL ATTRIBUTE: DEALS 15% MORE DAMAGE TO UNDEAD");
                statTxt.setTextColor(Color.parseColor("#39d4cc"));
                berserker.setVisibility(View.INVISIBLE);
                assassin.setVisibility(View.INVISIBLE);
                knight.setVisibility(View.INVISIBLE);
                oracle.setVisibility(View.VISIBLE);
                thief.setVisibility(View.INVISIBLE);
                wizard.setVisibility(View.INVISIBLE);
                break;
            case "Wizard":
                this.heroClass = 4;
                statTxt.setText(Everand.mageName+ "\n"+
                        "STATS:\n"+
                        "HP:"+ Everand.mageTotalHP+ "\n"+
                        "DAMAGE: "+ Everand.mageMinDMG+ " - "+ Everand.mageMaxDmg+ "\n\n"+
                        "A HERO THAT BOASTS SUPERIOR MAGICAL DAMAGE" +
                        "\n\nSPECIAL ATTRIBUTE: DEALS 15% MORE DAMAGE TO UNDEAD");
                statTxt.setTextColor(Color.parseColor("#39d4cc"));
                berserker.setVisibility(View.INVISIBLE);
                assassin.setVisibility(View.INVISIBLE);
                knight.setVisibility(View.INVISIBLE);
                oracle.setVisibility(View.INVISIBLE);
                thief.setVisibility(View.INVISIBLE);
                wizard.setVisibility(View.VISIBLE);
                break;
            case "Assassin":
                this.heroClass = 5;
                statTxt.setText(Stygwyre.lightName+ "\n"+
                        "STATS:\n"+
                        "HP:"+ Stygwyre.lightTotalHP+ "\n"+
                        "DAMAGE: "+ Stygwyre.lightMinDMG+ " - "+ Stygwyre.lightMaxDMG+ "\n\n"+
                        "A HERO THAT HAS A CHANCE TO DO DOUBLE DAMAGE" +
                        "\n\nSPECIAL ATTRIBUTE: HAS 25% CHANCE TO DEAL DOUBLE DAMAGE");
                statTxt.setTextColor(Color.parseColor("#eb582f"));
                berserker.setVisibility(View.INVISIBLE);
                assassin.setVisibility(View.VISIBLE);
                knight.setVisibility(View.INVISIBLE);
                oracle.setVisibility(View.INVISIBLE);
                thief.setVisibility(View.INVISIBLE);
                wizard.setVisibility(View.INVISIBLE);
                break;
            case "Thief":
                this.heroClass = 6;
                statTxt.setText(Baby.lightName+ "\n"+
                        "STATS:\n"+
                        "HP:"+ Baby.lightTotalHP+ "\n"+
                        "DAMAGE: "+ Baby.lightMinDMG+ " - "+ Baby.lightMaxDMG+ "\n\n"+
                        "A HERO THAT HAS A CHANCE TO EVADE ATTACKS" +
                        "\n\nSPECIAL ATTRIBUTE: HAS 30% CHANCE TO EVADE INCOMING DAMAGE");
                statTxt.setTextColor(Color.parseColor("#FFFFFF"));
                berserker.setVisibility(View.INVISIBLE);
                assassin.setVisibility(View.INVISIBLE);
                knight.setVisibility(View.INVISIBLE);
                oracle.setVisibility(View.INVISIBLE);
                thief.setVisibility(View.VISIBLE);
                wizard.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}