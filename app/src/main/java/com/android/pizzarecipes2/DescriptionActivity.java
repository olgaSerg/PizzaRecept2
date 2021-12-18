package com.android.pizzarecipes2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        Intent intent = getIntent();
        if (intent != null) {
            String recipe = intent.getStringExtra("pizza_item");

            TextView description = findViewById(R.id.textView);
            description.setText(recipe);
        }
    }
}
