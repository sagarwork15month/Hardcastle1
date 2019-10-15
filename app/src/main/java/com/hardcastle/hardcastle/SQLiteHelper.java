package com.hardcastle.hardcastle;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    public static final String TABLE_NAME = "dfdsfh";
    static String DATABASE_NAME = "sggfs";
    public static final String Table_Column_ID = "id";
    public static final String Table_Column_1_Name = "name";
    public static final String Table_Column_2_PhoneNumber = "phone_number";
    public static final String Table_Column_3_Registration = "registartion";
    public static final String Table_Column_6_Unit = "unit";
    public static final String Table_Column_4_Owner = "nameofowner";
    public static final String Table_Column_5_Contact = "contact";
    public static final String Table_Column_9_Emailowner = "owneremail";
    public static final String Table_Column_7_Nameauth = "auth";
    public static final String Table_Column_8_ContactAuth = "contactofauth";
    public static final String Table_Column_10_EmailAuth = "emailofauth";
    public static final String Table_Column_11_YearOFEstablish = "yearofestablish";
    public static final String Table_Column_12_Address = "address";
    public static final String Table_Column_13_District = "district";
    public static final String Table_Column_14_Area = "area";

    public static final String Table_Column_15_Zone = "zone";
    public static final String Table_Column_16_Devoblock = "deveblock";
    public static final String Table_Column_17_Industrialblock = "industrialblock";
    public static final String Table_Column_18_UlBKHNO = "ulbkhasra";
    public static final String Table_Column_19_Industrialcat = "industrialcat";
    public static final String Table_Column_20_Nicdata = "nicdata";
    public static final String Table_Column_21_UnitCat = "unitcat";
    public static final String Table_Column_22_typeofproduct = "typeofproduct";
    public static final String Table_Column_23_powerconnectiondate = "powerconnectdate";
    public static final String Table_Column_24_connectedelectrical = "conelload";
    public static final String Table_Column_25_electricalmater = "eletricalmater";
    public static final String Table_Column_26_startdatecomproduct = "startdatecomercialproduct";
    public static final String Table_Column_27_InvestBuild = "investbuild";
    public static final String Table_Column_28_InvestmentinPlantm = "investplatmachine";
    public static final String Table_Column_29_Annualturnover = "annualturnover";
    public static final String Table_Column_30_Annualproduction = "annualproduction";

    public static final String Table_Column_31_ContractualEmployee = "contractualemployee";
    public static final String Table_Column_32_employeeswithHaryana= "employeeswith";
    public static final String Table_Column_33_employeeswithoutHaryana = "employeeswithout";
    public static final String Table_Column_34_RegularEmployees = "regularemployees";
    public static final String Table_Column_35_Regularemployeeswith = "regularemployeeswith";
    public static final String Table_Column_36_Regularemployeeswithouth = "regularemployeeswithouth";
    public static final String Table_Column_37_LatitudeLongitude = "latitudelongitude";
    public static final String Table_Column_38_TotalPlotarea = "totaltlotarea";
    public static final String Table_Column_39_SkillSetsRequired = "skillsetsrequired";
    public static final String Table_Column_40_UnitCatSecond = "unitcatsecond";
    public static final String Table_Column_41_Todaydate = "todaydate";


    public SQLiteHelper(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" + Table_Column_ID + " INTEGER PRIMARY KEY, " + Table_Column_1_Name + " VARCHAR, " + Table_Column_2_PhoneNumber + " VARCHAR, " + Table_Column_3_Registration + " VARCHAR, " + Table_Column_4_Owner + " VARCHAR, " + Table_Column_5_Contact + " VARCHAR, " + Table_Column_6_Unit + " VARCHAR, " + Table_Column_9_Emailowner + " VARCHAR, " + Table_Column_7_Nameauth + " VARCHAR, " + Table_Column_8_ContactAuth + " VARCHAR, " + Table_Column_10_EmailAuth + " VARCHAR, " + Table_Column_11_YearOFEstablish + " VARCHAR, " + Table_Column_12_Address + " VARCHAR, " + Table_Column_13_District + " VARCHAR, " + Table_Column_14_Area + " VARCHAR, " + Table_Column_15_Zone + " VARCHAR, " + Table_Column_16_Devoblock + " VARCHAR, " + Table_Column_17_Industrialblock + " VARCHAR, " + Table_Column_18_UlBKHNO + " VARCHAR, " + Table_Column_19_Industrialcat + " VARCHAR, " + Table_Column_20_Nicdata + " VARCHAR, " + Table_Column_21_UnitCat + " VARCHAR, " + Table_Column_22_typeofproduct + " VARCHAR, " + Table_Column_23_powerconnectiondate + " VARCHAR, " + Table_Column_24_connectedelectrical + " VARCHAR, " + Table_Column_25_electricalmater + " VARCHAR, " + Table_Column_26_startdatecomproduct + " VARCHAR, " + Table_Column_27_InvestBuild + " VARCHAR, " + Table_Column_28_InvestmentinPlantm + " VARCHAR, " + Table_Column_29_Annualturnover + " VARCHAR, " + Table_Column_30_Annualproduction + " VARCHAR, " + Table_Column_31_ContractualEmployee + " VARCHAR, " + Table_Column_32_employeeswithHaryana + " VARCHAR, " + Table_Column_33_employeeswithoutHaryana + " VARCHAR, " + Table_Column_34_RegularEmployees + " VARCHAR, " + Table_Column_35_Regularemployeeswith + " VARCHAR, " + Table_Column_36_Regularemployeeswithouth + " VARCHAR, " + Table_Column_37_LatitudeLongitude+ " VARCHAR, " + Table_Column_38_TotalPlotarea+ " VARCHAR, " + Table_Column_39_SkillSetsRequired+ " VARCHAR, " + Table_Column_40_UnitCatSecond+ " VARCHAR, " + Table_Column_41_Todaydate+ " PROCESS_DATE)";
        database.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

}