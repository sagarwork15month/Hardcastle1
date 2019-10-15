package com.hardcastle.hardcastle;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;




public class HomeActivity extends AppCompatActivity {

   Button mButton,mButton1;
    SQLiteHelper sqLiteHelper;
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor,cursor1;
    ListAdapter1 listAdapter1;
    ListView LISTVIEW;
    int nombr = 0;
    int nombr1 = 0;

    ArrayList<String> ID_Array;
    ArrayList<String> Todaydate_Array;

    CardView newdata,editdata;




    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ui_home);


        FloatingActionButton fab = findViewById(R.id.add);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AddProperty.class);
                startActivity(i);
            }
        });

        newdata = (CardView)findViewById(R.id.New);

        newdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), AddProperty.class);
                startActivity(i);
            }
        });

        editdata = (CardView)findViewById(R.id.Edit);

        editdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);

                // Set a title for alert dialog
                builder.setTitle("Comming Soon.");

                // Ask the final question
                builder.setMessage("Hidc survey Application");

                // Set click listener for alert dialog buttons
                DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch(which){
                            case DialogInterface.BUTTON_POSITIVE:
                                // User clicked the Yes button

                                break;

                            case DialogInterface.BUTTON_NEGATIVE:
                                // User clicked the No button
                                break;
                        }
                    }
                };

                // Set the alert dialog yes button click listener
                builder.setPositiveButton("Yes", dialogClickListener);


                AlertDialog dialog = builder.create();
                // Display the alert dialog on interface
                dialog.show();




            }
        });



        LISTVIEW = (ListView) findViewById(R.id.listView5);

        LISTVIEW.setVisibility(View.GONE);

        ID_Array = new ArrayList<String>();
        Todaydate_Array = new ArrayList<String>();



        sqLiteHelper = new SQLiteHelper(this);


    }

    @Override
    protected void onResume() {

        ShowSQLiteDBdata();
        ShowdateToday();

        super.onResume();
    }

    private void ShowSQLiteDBdata() {

        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SQLiteHelper.TABLE_NAME + "", null);

        nombr = cursor.getCount();



        DecimalFormat decimalFormat = new DecimalFormat("#");
        String numberAsString = decimalFormat.format(nombr);


        TextView myAwesomeTextView = (TextView)findViewById(R.id.completed);
        myAwesomeTextView.setText(numberAsString);


        ID_Array.clear();
        Todaydate_Array.clear();


        if (cursor.moveToFirst()) {
            do {

                ID_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_ID)));



            } while (cursor.moveToNext());
        }

        listAdapter1 = new ListAdapter1(HomeActivity.this,

                ID_Array,
                Todaydate_Array


        );

        LISTVIEW.setAdapter(listAdapter1);

        cursor.close();

        LISTVIEW.setVisibility(View.GONE);


    }


    private void ShowdateToday() {

        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        cursor1 = sqLiteDatabase.rawQuery("SELECT * from  " + SQLiteHelper.TABLE_NAME + " where  " + SQLiteHelper.Table_Column_41_Todaydate + " = (select max( " + SQLiteHelper.Table_Column_41_Todaydate + ") from  " + SQLiteHelper.TABLE_NAME + " WHERE " + SQLiteHelper.Table_Column_41_Todaydate + " < DATE('now') )", null);

        nombr1 = cursor1.getCount();


        DecimalFormat decimalFormat = new DecimalFormat("#");
        String numberAsString1 = decimalFormat.format(nombr1);


        TextView myAwesomeTextView1 = (TextView)findViewById(R.id.today);
        myAwesomeTextView1.setText(numberAsString1);


        ID_Array.clear();

        if (cursor1.moveToFirst()) {
            do {

                ID_Array.add(cursor1.getString(cursor1.getColumnIndex(SQLiteHelper.Table_Column_ID)));
                Todaydate_Array.add(cursor1.getString(cursor1.getColumnIndex(SQLiteHelper.Table_Column_41_Todaydate)));




            } while (cursor1.moveToNext());
        }

        listAdapter1 = new ListAdapter1(HomeActivity.this,

                ID_Array,
                Todaydate_Array


        );

        LISTVIEW.setAdapter(listAdapter1);

        cursor1.close();

        LISTVIEW.setVisibility(View.GONE);


    }


}