package com.example.task51;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;



public class BlankFragment0 extends Fragment {
    private View root;
    MyAdapter MyAdapter;
    RecyclerView RecyclerView;

    public class News {
        public int imageid;

        public News(int imageid) {
            this.imageid = imageid;
        }
    }

    public List<News> list1 = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView RecyclerView;
        root = inflater.inflate(R.layout.fragment_blank0, container, false);
        initnews();
        RecyclerView = root.findViewById(R.id.recyclerview);
        MyAdapter = new MyAdapter(list1);
        RecyclerView.setAdapter(MyAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.setLayoutManager(layoutManager);
        ImageButton button1 = root.findViewById(R.id.imageButton1);
        ImageButton button2 = root.findViewById(R.id.imageButton2);
        ImageButton button3 = root.findViewById(R.id.imageButton3);
        ImageButton button4 = root.findViewById(R.id.imageButton4);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                Fragment fl2 = new BlankFragment1();
                ft1.replace(R.id.fragment_layout, fl2);
                ft1.commit();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                Fragment fl2 = new BlankFragment2();
                ft1.replace(R.id.fragment_layout, fl2);
                ft1.commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                Fragment fl2 = new BlankFragment3();
                ft1.replace(R.id.fragment_layout, fl2);
                ft1.commit();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft1 = fm.beginTransaction();
                Fragment fl2 = new BlankFragment4();
                ft1.replace(R.id.fragment_layout, fl2);
                ft1.commit();
            }
        });
        return root;
    }

    void initnews() {
        News new1= new News(R.drawable.a1);
        list1.add(new1);
        News new2= new News(R.drawable.a2);
        list1.add(new2);
        News new3= new News(R.drawable.a3);
        list1.add(new3);
        News new4= new News(R.drawable.a4);
        list1.add(new4);
        News new5= new News(R.drawable.a5);
        list1.add(new5);
    }

    class MyAdapter extends RecyclerView.Adapter<BlankFragment0.MyAdapter.MyViewHoder> {
        public List<News> Newslist;

        public MyAdapter(List<News> List2) {
            this.Newslist = List2;
        }

        @NonNull
        @Override
        public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext(), R.layout.item_list2, null);
            MyViewHoder myViewHoder = new MyViewHoder(view);
            return myViewHoder;
        }


        public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
            News news = Newslist.get(position);
            holder.mnew1imageView.setImageResource(news.imageid);
        }

        @Override
        public int getItemCount() {
            return Newslist.size();
        }


        class MyViewHoder extends RecyclerView.ViewHolder {
            ImageView mnew1imageView;

            public MyViewHoder(@NonNull View itemView) {
                super(itemView);
                mnew1imageView = itemView.findViewById(R.id.new1);
            }
        }
    }
}
