package com.android.pizzarecipes2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<RecyclerViewPizza> pizzaItems = new ArrayList<>();
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_1, Utils.PIZZA_1_TITLE, Utils.PIZZA_1_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_2, Utils.PIZZA_2_TITLE, Utils.PIZZA_2_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_3, Utils.PIZZA_3_TITLE, Utils.PIZZA_3_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_4, Utils.PIZZA_4_TITLE, Utils.PIZZA_4_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_5, Utils.PIZZA_5_TITLE, Utils.PIZZA_5_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_6, Utils.PIZZA_6_TITLE, Utils.PIZZA_6_RECIPE ));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_7, Utils.PIZZA_7_TITLE, Utils.PIZZA_7_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_8, Utils.PIZZA_8_TITLE, Utils.PIZZA_8_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_9, Utils.PIZZA_9_TITLE, Utils.PIZZA_9_RECIPE));
        pizzaItems.add(new RecyclerViewPizza(R.drawable.pizza_10, Utils.PIZZA_10_TITLE, Utils.PIZZA_10_RECIPE));

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true); // улучшает производительность
        adapter = new RecyclerViewAdapter(pizzaItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
