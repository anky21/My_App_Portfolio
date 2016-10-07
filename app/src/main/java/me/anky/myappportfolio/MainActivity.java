package me.anky.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     *
     */
    private Button popularMoviesButton;
    private Button stockHawkButton;
    private Button buildItBiggerButton;
    private Button makeYourAppMaterialButton;
    private Button goUbiquitousButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popularMoviesButton = (Button) findViewById(R.id.popular_movies_bn);
        stockHawkButton = (Button) findViewById(R.id.stock_hawk_bn);
        buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_bn);
        makeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_bn);
        goUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_bn);
        capstoneButton = (Button) findViewById(R.id.capstone_bn);

        /**
         * this on click listener is triggered when Popular Movies button is clicked.
         */
        popularMoviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Popular Movies app", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * this on click listener is triggered when Stock Hawk button is clicked.
         */
        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Stock Hawk app", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * this on click listener is triggered when Build it bigger button is clicked.
         */
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Build It Bigger app", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * this on click listener is triggered when Make your app material button is clicked.
         */
        makeYourAppMaterialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Make Your App Material app", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * this on click listener is triggered when Go ubiquitous button is clicked.
         */
        goUbiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Go Ubiquitous app", Toast.LENGTH_SHORT).show();
            }
        });

        /**
         * this on click listener is triggered when Capstone button is clicked.
         */
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will launch my Capstone app", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
