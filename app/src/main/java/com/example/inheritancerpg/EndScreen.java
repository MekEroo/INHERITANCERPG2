package com.example.inheritancerpg;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class EndScreen extends AppCompatActivity implements View.OnClickListener {

    TextView endTxt;
    Button retryBtn;
    boolean victory;
    ConstraintLayout endScrnBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_screen);

        // Declaration for UI elements
        retryBtn = findViewById(R.id.retryBtn);
        retryBtn.setOnClickListener(this);
        endTxt = findViewById(R.id.endTxt);
        endScrnBg = findViewById(R.id.endScrnBg);

        // Gets victory value from previous activities
        victory = getIntent().getBooleanExtra("VICTORY", true);

        if (victory) {
            endTxt.setText("Salutations, hero! You have vanquished your foes.");
            endTxt.setTextColor(Color.parseColor("#000000"));
            endScrnBg.setBackgroundColor(Color.parseColor("#F4E9DD"));
        }
        else {
            endTxt.setText("You have been vanquished");
            endTxt.setTextColor(Color.parseColor("#ffffff"));
            endScrnBg.setBackgroundColor(Color.parseColor("#252525"));
        }
    }

    @Override
    public void onClick (View v) {

        Intent start = new Intent(this, SelectionScreen.class);

        switch (v.getId()) {
            case R.id.retryBtn:
                startActivity(start);
            break;
        }
    }
}