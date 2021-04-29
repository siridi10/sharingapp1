package com.example.team;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView= findViewById(R.id.recyclerView);

        MyListData[] myListData=new MyListData[]{
                new MyListData("Introduction",R.drawable.intro),
                new MyListData("History and Version of Android",R.drawable.histroy),
                new MyListData("Android Architecture:",R.drawable.arc),
                new MyListData("INSTALLATION",R.drawable.intro),
        };
    }
}
