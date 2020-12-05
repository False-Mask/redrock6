package com.example.level3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //定义list（数据）
    List<recyclerdata> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        RecyclerView recyclerView1=findViewById(R.id.re1);
//        recyclerinit();
//        recycleradapter recycleradapter=new recycleradapter(list);
//        LinearLayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
//        recyclerView1.setLayoutManager(layoutManager);
//        recyclerView1.setAdapter(recycleradapter);



        //使用viewpaper和tablayout
        ViewPager viewPager=findViewById(R.id.VP1);
        TabLayout tabLayout=findViewById(R.id.Tab1);

        viewPager.setAdapter(new viewpaperadapter(getSupportFragmentManager(),viewpaperadapter.
                BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));
        tabLayout.setupWithViewPager(viewPager);
    }


//    private void recyclerinit() {
//        list.add(new recyclerdata("潼姐姐","重大新闻涛姐姐..."));
//        list.add(new recyclerdata("涛姐姐","重大新闻潼姐姐..."));
//        list.add(new recyclerdata("御姐","重大新闻涛姐姐..."));
//        list.add(new recyclerdata("涛姐姐","重大新闻御姐..."));
//    }


}