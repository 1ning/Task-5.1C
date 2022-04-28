package com.example.task51;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class BlankFragment2 extends Fragment {
    private  View root;
    MyAdapter2 MyAdapter2 ;
    List<News2>List2=new ArrayList<>();
    public class News2 {
        public int imageid;
        String title;
        String context;

        public News2(String title,String context,int imageid) {
            this.imageid = imageid;
            this.title=title;
            this.context=context;
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView RecyclerView;
        root= inflater.inflate(R.layout.fragment_blank2, container, false);
        RecyclerView = root.findViewById(R.id.Recycler);
        initnews();
        MyAdapter2 = new MyAdapter2(List2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerView.setLayoutManager(layoutManager);
        RecyclerView.setAdapter(MyAdapter2);
        return root;
    }
    void initnews()
    {

         News2 new1= new News2("US admiral lashes 'concerning' with China","Last week Solomon Islands Prime Minister Manasseh Sogavare lashed out at critics of the draft Chinese security saying their comments were &quot;insulting&quot;.",R.drawable.a3);
        List2.add(new1);

        News2 new3= new News2("Child injured on Movie World ride","Village Roadshow Theme Parks confirmed the boy suffered a cut to his head. Queensland Ambulance William Houghton said the boy had suffered a quot",R.drawable.a4);
        List2.add(new3);
       News2 new4= new News2("Biden says Putin should face war crimes trial","Liberal MP Catherine Cusack doubled down on her criticism of Prime Minister Scott Morriso said his leadership had stripped party members of their voice.",R.drawable.a5);
        List2.add(new4);
    }
    class MyAdapter2 extends RecyclerView.Adapter<MyViewHoder> {
        public List<News2> Newslist2;

        public MyAdapter2( List<News2>List2)
        {
            this.Newslist2=List2;
        }

        @NonNull
        @Override
        public MyViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = View.inflate(parent.getContext (), R.layout.item_list, null);
            MyViewHoder myViewHoder = new MyViewHoder(view);
            return myViewHoder;
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHoder holder, int position) {
            News2 news2=Newslist2.get(position);
            holder.mnewtitle.setText(news2.title);
            holder.mnewcontext.setText(news2.context);
            holder.mnew1imageView.setImageResource(news2.imageid);
        }

        @Override
        public int getItemCount() {
            return Newslist2.size();
        }
    }

    class MyViewHoder extends RecyclerView.ViewHolder {
        ImageView mnew1imageView;
        TextView mnewtitle;
        TextView mnewcontext;

        public MyViewHoder(@NonNull View itemView) {
            super(itemView);
            mnew1imageView=itemView.findViewById(R.id.new1imageView);
            mnewtitle=itemView.findViewById(R.id.new1title);
            mnewcontext=itemView.findViewById(R.id.new1context);
        }
    }
}
