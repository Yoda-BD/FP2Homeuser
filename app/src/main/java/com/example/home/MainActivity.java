package com.example.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    private EditText txtSearch;

    LinearLayout personLinearLayout;
    LinearLayout homeLinearLayout;

    CardView books;
    CardView cloth;
    CardView electronics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtSearch = findViewById(R.id.txtsearch);
        personLinearLayout = findViewById(R.id.person_linear_layout);
        homeLinearLayout = findViewById(R.id.home_linear_layout);
        books = findViewById(R.id.books);
        cloth = findViewById(R.id.cloth);
        electronics = findViewById(R.id.electronics);



        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), ProfileUser.class);
            startActivity(intent);
        });

        books.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), KategoriBuku.class);
            startActivity(intent);
        });

        cloth.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), KategoriBaju.class);
            startActivity(intent);
        });

        electronics.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), CategoryElectrons.class);
            startActivity(intent);
        });
    }
}
