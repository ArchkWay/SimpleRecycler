package com.rostselmash.myapplication;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecAdapter extends  RecyclerView.Adapter<VH> {
    List<People> list = new ArrayList<>();


    public void setItems(List <People> list) {
        this.list = list;

    }
    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        //здесь по номеру ячеки берём соответствующих челиков, имя и картинку
        Picasso.get().load(list.get(position).url).into(holder.iv);
        holder.tv.setText((list.get(position).name));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}

class VH extends RecyclerView.ViewHolder {
    TextView tv;
    ImageView iv;
    public VH(View view) {
        super(view);
        //здесь привязываем xml с джава объектами
        tv = view.findViewById(R.id.tv);
        iv = view.findViewById(R.id.iv);
    }
}
class People{
    String name;
    String url;

    public People(String name, String url) {
        this.name = name;
        this.url = url;
    }
}


