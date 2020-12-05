package com.example.level3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class fragment1 extends Fragment {
    List<recyclerdata> list=new ArrayList<>();
    RecyclerView recyclerView1;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment1,container,false);
        recyclerinit();
        return view;
    }

//
    private void recyclerinit() {
        recyclerView1=view.findViewById(R.id.re1);

        recycleradapter recycleradapter1=new recycleradapter(getActivity(),list);
        recyclerView1.setAdapter(recycleradapter1);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.
                VERTICAL,false));
        recyclerView1.addItemDecoration(new DividerItemDecoration(getActivity(),DividerItemDecoration.
                VERTICAL));
        //recyclerView1.setOnClickListener(new recycleradapter.)

        list.add(new recyclerdata("潼姐姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻潼姐姐..."));
        list.add(new recyclerdata("御姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻御姐..."));
        list.add(new recyclerdata("潼姐姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻潼姐姐..."));
        list.add(new recyclerdata("御姐","重大新闻涛姐姐..."));
        list.add(new recyclerdata("涛姐姐","重大新闻御姐..."));
    }

   //
}
