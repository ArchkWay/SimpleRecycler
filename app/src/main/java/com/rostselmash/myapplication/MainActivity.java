package com.rostselmash.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //создаём ресайлер и адаптер - привязываем их друг к другу
        RecAdapter adapter = new RecAdapter();
        RecyclerView rv = findViewById(R.id.rv);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
        //генерим список которым будем наполнять
        List<People> people = new ArrayList<>();
        people.add(new People("Dany", "https://source.unsplash.com/random/200x200?sig=1"));
        people.add(new People("Vitya", "https://picsum.photos/seed/picsum/200/300"));
        people.add(new People("Kirusha", "https://random.imagecdn.app/500/150"));
        people.add(new People("Vasya", "https://images.unsplash.com/photo-1678429435395-a575a50b1714?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxODY2Nzh8MHwxfHJhbmRvbXx8fHx8fHx8fDE2Nzk3NzMwOTg&ixlib=rb-4.0.3&q=80&w=1080"));
        people.add(new People("Jora", "https://images.unsplash.com/photo-1678429435395-a575a50b1714?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxODY2Nzh8MHwxfHJhbmRvbXx8fHx8fHx8fDE2Nzk3NzMwOTg&ixlib=rb-4.0.3&q=80&w=1080"));
        people.add(new People("Pidor", "https://images.unsplash.com/photo-1678725630941-f89f298e619d?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=MnwxODY2Nzh8MHwxfHJhbmRvbXx8fHx8fHx8fDE2Nzk3NzMxMzU&ixlib=rb-4.0.3&q=80&w=1080"));
        //суём в адаптер
        adapter.setItems(people);
    }
}