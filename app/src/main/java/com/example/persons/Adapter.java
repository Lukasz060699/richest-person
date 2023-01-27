package com.example.persons;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private Context context;
    private List<PersonModel> personList;

    public Adapter(Context context, List<PersonModel> personList) {
        this.context = context;
        this.personList = personList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.persons, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.id.setText(personList.get(position).getId() + "");
        holder.imie.setText("Imię: " + personList.get(position).getImie());
        holder.nazwisko.setText("Nazwisko: " + personList.get(position).getNazwisko());
        holder.wiek.setText("Wiek: " + personList.get(position).getWiek() + "");
        holder.majatek.setText("Majątek (w mld): " + personList.get(position).getMajatek() + "");
        Glide.with(context)
                .load(personList.get(position).getZdjecie())
                .into(holder.zdjecie);
        holder.narodowosc.setText("Narodowość: " + personList.get(position).getNarodowosc());
        holder.miejsce.setText("Miejsce urodzenia: " + personList.get(position).getMiejsce_i_data_urodzenia().getMiejsce());
        holder.data.setText("Data urodzenia: " + personList.get(position).getMiejsce_i_data_urodzenia().getData());
        holder.adres_zamieszkania.setText("Miejsce zamieszkania: " + personList.get(position).getAdres_zamieszkania());
        holder.najpopularniejsze_przedsiebiorstwo.setText("Firma: " + personList.get(position)
                .getNajpopularniejsze_przedsiebiorstwo());
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView id;
        TextView imie;
        TextView nazwisko;
        TextView wiek;
        TextView majatek;
        ImageView zdjecie;
        TextView narodowosc;
        TextView miejsce;
        TextView data;
        TextView adres_zamieszkania;
        TextView najpopularniejsze_przedsiebiorstwo;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            id = itemView.findViewById(R.id.textView6);
            imie = itemView.findViewById(R.id.textView2);
            nazwisko = itemView.findViewById(R.id.textView3);
            wiek = itemView.findViewById(R.id.textView4);
            majatek = itemView.findViewById(R.id.textView5);
            zdjecie = itemView.findViewById(R.id.imageView);
            narodowosc = itemView.findViewById(R.id.textView);
            miejsce = itemView.findViewById(R.id.textView8);
            data = itemView.findViewById(R.id.textView9);
            adres_zamieszkania = itemView.findViewById(R.id.textView10);
            najpopularniejsze_przedsiebiorstwo = itemView.findViewById(R.id.textView11);
        }
    }
}
