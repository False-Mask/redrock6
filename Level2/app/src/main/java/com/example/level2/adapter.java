package com.example.level2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class adapter extends FragmentPagerAdapter {
    List<Fragment> fragments=new ArrayList<>();
    List<String> strings=new ArrayList<>();
    public adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        strings.add("First");
        strings.add("Second");
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
