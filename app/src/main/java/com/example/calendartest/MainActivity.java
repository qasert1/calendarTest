package com.example.calendartest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] dayOfWeek = {"", "월", "화", "수", "목", "금", "토", "일"};
    Calendar cal = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);


        ArrayList<item> list = new ArrayList<>();
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);

        for(int i = 0; i < cal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            list.add(new item("" + firstDayOfWeek(i), "" + (i+1)));
        }
    }
    public String firstDayOfWeek(int num) {
        String fdw = "월";
        Calendar cal = Calendar.getInstance();
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH+1), 1);
        int firstWeek = cal.get(Calendar.DAY_OF_WEEK);//1, 2, 3, 4, 5, 6, 7
        switch (firstWeek) {
            case 1:
                fdw = dayOfWeek[1];
                break;
            case 2:
                if (num = 1, 8, 15, 22, 29)
                fdw = dayOfWeek[2];
                break;
            case 3:
                fdw = dayOfWeek[3];
                break;
            case 4:
                fdw = dayOfWeek[4];
                break;
            case 5:
                fdw = dayOfWeek[5];
                break;
            case 6:
                fdw = dayOfWeek[6];
                break;
            case 7:
                fdw = dayOfWeek[7];
                break;
        }
        return fdw;

    }
}
