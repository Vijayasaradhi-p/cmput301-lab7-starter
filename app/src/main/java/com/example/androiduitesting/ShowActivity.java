package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        TextView cityText = findViewById(R.id.textView_city);
        Button backButton = findViewById(R.id.button_back);

        // Get data from MainActivity
        String cityName = getIntent().getStringExtra("SELECTED_CITY");

        // Display both
        cityText.setText(cityName);

        // Go back
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
