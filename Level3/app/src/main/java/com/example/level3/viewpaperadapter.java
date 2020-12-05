package com.example.level3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class viewpaperadapter extends FragmentPagerAdapter {
    //定义并初始化变量
    List<String> strings=new ArrayList<>();
    List<Fragment> fragments=new ArrayList<>();
    
    
    public viewpaperadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        
        //初始化strings数组变量
        strings.add("涛涛姐新闻");
        strings.add("潼姐姐新闻");
        strings.add("御姐新闻");
        //初始化fragments数组变量
        fragments.add(new fragment1());
        fragments.add(new fragment2());
        fragments.add(new fragment3());
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return strings.get(position);
    }
}
