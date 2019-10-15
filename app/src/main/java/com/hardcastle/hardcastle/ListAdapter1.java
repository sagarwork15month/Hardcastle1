package com.hardcastle.hardcastle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter1 extends BaseAdapter {

    Context context;
    ArrayList<String> ID;
    ArrayList<String> TodayDate;


    public ListAdapter1(
            Context context2,
            ArrayList<String> id,
   ArrayList<String> todaydate



    ) {

        this.context = context2;
        this.ID = id;
        this.TodayDate = todaydate;





    }

    public int getCount() {
        // TODO Auto-generated method stub
        return ID.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View child, ViewGroup parent) {

        Holder holder;

        LayoutInflater layoutInflater;

        if (child == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            child = layoutInflater.inflate(R.layout.items1, null);

            holder = new Holder();

            holder.ID_TextView = (TextView) child.findViewById(R.id.textViewID);
            holder.TodayDate_Text = (TextView) child.findViewById(R.id.TextViewTodayDate);



            child.setTag(holder);

        } else {

            holder = (Holder) child.getTag();
        }
        holder.ID_TextView.setText(ID.get(position));
        holder.TodayDate_Text.setText(TodayDate.get(position));


        return child;
    }

    public class Holder {

        TextView ID_TextView;
        TextView TodayDate_Text;


    }

}
