package com.example.level3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recycleradapter extends RecyclerView.Adapter<recycleradapter.adapter> {
    List<recyclerdata> list;
   // private Context context;
    //构造方法初始化变量list
    public recycleradapter(Context context, List<recyclerdata> list){
        //this.context =context;
        this.list=list;
    }



    //对recyclerView的视图组件 进行初始化
    class adapter extends RecyclerView.ViewHolder {
        TextView textView1;
        TextView textView3;
        public adapter(@NonNull View itemView) {
            super(itemView);
            textView1=itemView.findViewById(R.id.T1);
            textView3=itemView.findViewById(R.id.T3);


            //
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
            //
        }
    }


    //引用父类方法对adapter进行自定义
    @NonNull
    @Override
    public adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).
                inflate(R.layout.recyclerlayout,parent,false);
        adapter adapter=new adapter(view);
        return adapter;
    }

    @Override
    public void onBindViewHolder(@NonNull recycleradapter.adapter holder, int position) {
       recyclerdata recyclerdata=list.get(position);
       holder.textView1.setText(recyclerdata.getInside());
       holder.textView3.setText(recyclerdata.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
