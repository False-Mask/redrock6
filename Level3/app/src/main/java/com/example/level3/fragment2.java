package com.example.level3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class fragment2 extends Fragment {
    List<recyclerdata> list=new ArrayList<>();
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment2,container,false);
        recyclerviewinit();
        return view;
    }

    public void recyclerviewinit() {

        list.add(new recyclerdata("潼姐姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻潼姐姐..."));
        list.add(new recyclerdata("御姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻御姐..."));
        list.add(new recyclerdata("潼姐姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻潼姐姐..."));
        list.add(new recyclerdata("御姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻御姐..."));
        RecyclerView recyclerView=view.findViewById(R.id.re2);
        recycleradapter recycleradapter=new recycleradapter(getActivity(),list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,
                false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(),
                DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(recycleradapter);

    }
}
