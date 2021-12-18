package com.android.pizzarecipes2;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    ArrayList<RecyclerViewPizza> arrayList;
    Context context;

    public RecyclerViewAdapter(ArrayList<RecyclerViewPizza> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pizza_item, parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder holder, int position) {
        final RecyclerViewPizza recyclerViewPizza = arrayList.get(position);
        holder.imageView.setImageResource(recyclerViewPizza.getImageResource());
        holder.textView.setText(recyclerViewPizza.getText());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView textView;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            Log.d("ImageView", "imageView1");
            textView = itemView.findViewById(R.id.text_view);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int position = getAbsoluteAdapterPosition();
            RecyclerViewPizza recyclerViewPizza = arrayList.get(position);
            Intent intent = new Intent(context, DescriptionActivity.class);
            intent.putExtra("pizza_item", recyclerViewPizza.getRecipe());
            context.startActivity(intent);
        }
    }
}
