package com.hardcastle.hardcastle;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class DisplaySQLiteDataActivity extends AppCompatActivity {

    SQLiteHelper sqLiteHelper;
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor;
    ListAdapter listAdapter;
    ListView LISTVIEW;
    int nombr = 0;

    int nombr1 = 0;

    ArrayList<String> ID_Array;
    ArrayList<String> NAME_Array;
    ArrayList<String> PHONE_NUMBER_Array;
    ArrayList<String> Registration_Array;
    ArrayList<String> Owner_Array;
    ArrayList<String> Contact_Array;
    ArrayList<String> Unit_Array;

    ArrayList<String> OnerEmail_Array;
    ArrayList<String> Auth_Array;
    ArrayList<String> AuthContact_Array;
    ArrayList<String> AuthEmail_Array;
    ArrayList<String> AuthYear_Array;
    ArrayList<String> AuthAddress_Array;
    ArrayList<String> AuthDistrict_Array;
    ArrayList<String> Area_Array;



    ArrayList<String> Zone_Array;
    ArrayList<String> Developmentblock_Array;
    ArrayList<String> Industrialblock_Array;
    ArrayList<String> ULBKhasra_Array;
    ArrayList<String> IndustrialCat_Array;
    ArrayList<String> NICData_Array;
    ArrayList<String> UnitCat_Array;
    ArrayList<String> Typeofproduct_Array;
    ArrayList<String> Powercondate_Array;
    ArrayList<String> Coneleload_Array;
    ArrayList<String> Electrical_Array;
    ArrayList<String> Startdatecom_Array;
    ArrayList<String> InvestMent_Array;
    ArrayList<String> Investplatandmachine_Array;
    ArrayList<String> Anualover_Array;
    ArrayList<String> AnuualProduction_Array;

    ArrayList<String> Toconemploye_Array;
    ArrayList<String> ContraCtualempWith_Array;
    ArrayList<String> ContraCtualempWithout_Array;
    ArrayList<String> TotalRegEmp_Array;
    ArrayList<String> RegEmpHardomWith_Array;
    ArrayList<String> RegEmpHardomWithout_Array;
    ArrayList<String> LatitudeLongitude_Array;
    ArrayList<String> TotalPAREA_Array;
    ArrayList<String> SkillSetReq_Array;
    ArrayList<String> UnitCatSecond_Array;
    ArrayList<String> Todaydate_Array;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_sqlite_data);

        LISTVIEW = (ListView) findViewById(R.id.listView1);

        ID_Array = new ArrayList<String>();

        NAME_Array = new ArrayList<String>();

        PHONE_NUMBER_Array = new ArrayList<String>();

        Registration_Array = new ArrayList<String>();

        Owner_Array = new ArrayList<String>();

        Contact_Array = new ArrayList<String>();

        Unit_Array = new ArrayList<String>();


        OnerEmail_Array = new ArrayList<String>();
        Auth_Array = new ArrayList<String>();
        AuthContact_Array = new ArrayList<String>();
        AuthEmail_Array = new ArrayList<String>();
        AuthYear_Array = new ArrayList<String>();
        AuthAddress_Array = new ArrayList<String>();
        AuthDistrict_Array = new ArrayList<String>();
        Area_Array = new ArrayList<String>();


        Zone_Array = new ArrayList<String>();
        Developmentblock_Array = new ArrayList<String>();
        Industrialblock_Array = new ArrayList<String>();
        ULBKhasra_Array = new ArrayList<String>();
        IndustrialCat_Array = new ArrayList<String>();
        NICData_Array = new ArrayList<String>();
        UnitCat_Array = new ArrayList<String>();
        Typeofproduct_Array = new ArrayList<String>();
        Powercondate_Array = new ArrayList<String>();
        Coneleload_Array = new ArrayList<String>();
        Electrical_Array = new ArrayList<String>();
        Startdatecom_Array = new ArrayList<String>();
        InvestMent_Array = new ArrayList<String>();
        Investplatandmachine_Array = new ArrayList<String>();
        Anualover_Array = new ArrayList<String>();
        AnuualProduction_Array = new ArrayList<String>();


       Toconemploye_Array = new ArrayList<String>();
      ContraCtualempWith_Array = new ArrayList<String>();
        ContraCtualempWithout_Array = new ArrayList<String>();
       TotalRegEmp_Array = new ArrayList<String>();
     RegEmpHardomWith_Array = new ArrayList<String>();
      RegEmpHardomWithout_Array = new ArrayList<String>();
      LatitudeLongitude_Array = new ArrayList<String>();
      TotalPAREA_Array = new ArrayList<String>();
     SkillSetReq_Array = new ArrayList<String>();
       UnitCatSecond_Array = new ArrayList<String>();

        Todaydate_Array = new ArrayList<String>();

        sqLiteHelper = new SQLiteHelper(this);

    }

    @Override
    protected void onResume() {

        ShowSQLiteDBdata();


        super.onResume();
    }

    private void ShowSQLiteDBdata() {

        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + SQLiteHelper.TABLE_NAME + "", null);

        nombr = cursor.getCount();

   /*     Toast.makeText(this, "Count"+nombr, Toast.LENGTH_SHORT).show();

        DecimalFormat decimalFormat = new DecimalFormat("#");
        String numberAsString = decimalFormat.format(nombr);
        Toast.makeText(this, "String Count"+numberAsString, Toast.LENGTH_SHORT).show();
*/




        ID_Array.clear();
        NAME_Array.clear();
        PHONE_NUMBER_Array.clear();
        Registration_Array.clear();
        Owner_Array.clear();
        Contact_Array.clear();
        Unit_Array.clear();

        OnerEmail_Array.clear();
        Auth_Array.clear();
        AuthContact_Array.clear();
        AuthEmail_Array.clear();
        AuthYear_Array.clear();
        AuthAddress_Array.clear();
        AuthDistrict_Array.clear();
        Area_Array.clear();

        Zone_Array.clear();
        Developmentblock_Array.clear();
        Industrialblock_Array.clear();
        ULBKhasra_Array.clear();
        IndustrialCat_Array.clear();
        NICData_Array.clear();
        UnitCat_Array.clear();
        Typeofproduct_Array.clear();
        Powercondate_Array.clear();
        Coneleload_Array.clear();
        Electrical_Array.clear();
        Startdatecom_Array.clear();
        InvestMent_Array.clear();

        Investplatandmachine_Array.clear();
        Anualover_Array.clear();
        AnuualProduction_Array.clear();


        Toconemploye_Array.clear();
        ContraCtualempWith_Array.clear();
        ContraCtualempWithout_Array.clear();
        TotalRegEmp_Array.clear();
        RegEmpHardomWith_Array.clear();
        RegEmpHardomWithout_Array .clear();
        LatitudeLongitude_Array .clear();
        TotalPAREA_Array.clear();
        SkillSetReq_Array .clear();
        UnitCatSecond_Array.clear();

        Todaydate_Array.clear();


        if (cursor.moveToFirst()) {
            do {

                ID_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_ID)));

                NAME_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_1_Name)));

                PHONE_NUMBER_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_2_PhoneNumber)));

                Registration_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_3_Registration)));

                Owner_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_4_Owner)));

                Contact_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_5_Contact)));

                Unit_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_6_Unit)));

                OnerEmail_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_9_Emailowner)));
                Auth_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_7_Nameauth)));
                AuthContact_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_8_ContactAuth)));
                AuthEmail_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_10_EmailAuth)));
                AuthYear_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_11_YearOFEstablish)));
                AuthAddress_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_12_Address)));
                AuthDistrict_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_13_District)));
                Area_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_14_Area)));


                Zone_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_15_Zone)));
                Developmentblock_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_16_Devoblock)));
                Industrialblock_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_17_Industrialblock)));
                ULBKhasra_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_18_UlBKHNO)));
                IndustrialCat_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_19_Industrialcat)));
                NICData_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_20_Nicdata)));
                UnitCat_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_21_UnitCat)));
                Typeofproduct_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_22_typeofproduct)));
                Powercondate_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_23_powerconnectiondate)));
                Coneleload_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_24_connectedelectrical)));
                Electrical_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_25_electricalmater)));
                Startdatecom_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_26_startdatecomproduct)));
                InvestMent_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_27_InvestBuild)));
                Investplatandmachine_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_28_InvestmentinPlantm)));
                Anualover_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_29_Annualturnover)));
                AnuualProduction_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_30_Annualproduction)));



                Toconemploye_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_31_ContractualEmployee)));
                ContraCtualempWith_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_32_employeeswithHaryana)));
                ContraCtualempWithout_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_33_employeeswithoutHaryana)));
                TotalRegEmp_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_34_RegularEmployees)));
                RegEmpHardomWith_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_35_Regularemployeeswith)));
                RegEmpHardomWithout_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_36_Regularemployeeswithouth)));
                LatitudeLongitude_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_37_LatitudeLongitude)));
                TotalPAREA_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_38_TotalPlotarea)));
                SkillSetReq_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_39_SkillSetsRequired)));
                UnitCatSecond_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_40_UnitCatSecond)));

                Todaydate_Array.add(cursor.getString(cursor.getColumnIndex(SQLiteHelper.Table_Column_41_Todaydate)));



            } while (cursor.moveToNext());
        }

        listAdapter = new ListAdapter(DisplaySQLiteDataActivity.this,

                ID_Array,
                NAME_Array,
                PHONE_NUMBER_Array,
                Registration_Array,
                Owner_Array,
                Contact_Array,
                Unit_Array,

                OnerEmail_Array,
                Auth_Array,
                AuthContact_Array,
                AuthEmail_Array,
                AuthYear_Array,
                AuthAddress_Array,
                AuthDistrict_Array,
                Area_Array,

                Zone_Array,
                Developmentblock_Array,
                Industrialblock_Array,
                ULBKhasra_Array,
                IndustrialCat_Array,
                NICData_Array,
                UnitCat_Array,
                Typeofproduct_Array,
                Powercondate_Array,
                Coneleload_Array,
                Electrical_Array,
                Startdatecom_Array,
                InvestMent_Array,
                Investplatandmachine_Array,
                Anualover_Array,
                AnuualProduction_Array,


                Toconemploye_Array,
                ContraCtualempWith_Array,
                ContraCtualempWithout_Array,
                TotalRegEmp_Array,
                RegEmpHardomWith_Array,
                RegEmpHardomWithout_Array,
                LatitudeLongitude_Array,
                TotalPAREA_Array,
                SkillSetReq_Array,
                UnitCatSecond_Array,
                Todaydate_Array




        );

        LISTVIEW.setAdapter(listAdapter);

        cursor.close();


    }



}