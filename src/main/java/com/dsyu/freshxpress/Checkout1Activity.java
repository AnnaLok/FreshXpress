package com.dsyu.freshxpress;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Checkout1Activity extends AppCompatActivity {

    private Button blueberryButton;
    private Button peachButton;
    FloatingActionButton next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout1);

        blueberryButton = findViewById( R.id.blueberryButton);
        peachButton = findViewById( R.id.peachButton);
        next = findViewById( R.id.fab );

        blueberryButton.setText(String.format("Blueberry\nQuantity: 4\nPrice: $1.40"));
        peachButton.setText(String.format("Peach\nQuantity: 5\nPrice: $2.50"));

        next.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Checkout1Activity.this, Checkout2Activity.class);
                startActivity( intent );
            }
        } );
    }
}

