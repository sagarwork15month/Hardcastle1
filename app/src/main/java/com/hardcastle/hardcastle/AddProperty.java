package com.hardcastle.hardcastle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class AddProperty extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    SQLiteDatabase sqLiteDatabaseObj;
    EditText editTextName, editTextPhoneNumber, editTextnameofowner, editTextContact,editTextOwneremail,
            editTextAuth,editTextAuthContact,editTextAuthEmail,editTextYear,editTextAddress,
           editTextDistrict,editTextDeveblock,editTextULBKhasraNo,editTextIndustrycategory,
           editTextNICData,editTextTypeofproduct,editTextPowerConnectiondate,editTextConnectedElectricalLoad,
           editTextElectricMeterNo,editTextStartDateofCommercialProduction,

           editTextTotalContractualEmployees,editTextContractualemployeeswithHaryanaDomicile,editTextContractualemployeeswithoutHaryanaDomicile
           ,editTextTotalRegularEmployees,editTextRegularemployeeswithharyanadomicile,editTextRegularemployeeswithoutharyanadomicile
           ,editTextLatitudeLongitude,editTextTotalPlotarea,editTextSkillSetsRequired;

    String NameHolder, NumberHolder, RegistrationHolder,
            SQLiteDataBaseQueryHolder, OwnerHolder, ContactHolder,UnitHolder,AreaHolder,
    EmailOwnerHolder,AuthHolder,AuthContactHolder,AuthEmailHolder,AuthofyearHolder,AddressHolder,DidtrictHolder,
    ZoneHolder,DevelopmentBlockHolder,IndustrialblockHolder,UlbHolder,IndustrialcatHolder,NicHolder,typeofproHolder,
    unitcatHolder,PowerconHolder,connectedelectricalHolder,eletricalmaterHolder,startdateHolder,InvestBuildHolder,
    InvestMachineHolder,AnualTurnOverHolder,AnualProductionHolder,UnitCategoerySecHolder,

    TotalContractualEmployeesHolder,ContractualemployeeswithHaryanaDomicileHolder, ContractualemployeeswithoutHaryanaDomicileHolder
    , TotalRegularEmployeesHolder, RegularemployeeswithharyanadomicileHolder,  RegularemployeeswithoutharyanadomicileHolder,
            LatitudeLongitudeHolder,TotalPlotareaHolder,SkillSetsRequiredHolder,Dateholder;
    Button EnterData, ButtonDisplayData;
    Boolean EditTextEmptyHold;
    private RadioGroup radioGroup,radioGroup1,radioGroup2,radioGroup3,radioGroup4,radioGroup5;

    ArrayAdapter<CharSequence> adapterRegno;
    ArrayAdapter<CharSequence> adapterInvestbulid;
    ArrayAdapter<CharSequence> adapterINVESTMACHINE;
    ArrayAdapter<CharSequence> adapterAnnualturnover;
    ArrayAdapter<CharSequence> adapterAnnualproduction;

    String[] regno = {"UAM ", "EM-II", "IEM"};
    String[] investbuild = {">= 25 Lakh-Micro ", "25 lakh - 5 crores-Small", ">5 crore-Medium"};
    String[] InvestmentinMachinery = {">= 25 Lakh-Micro ", "25 lakh - 5 crores-Small", ">5 crore-Medium"};
    String[] Annualturnover = {"<1 Lakh ", "1-5 Lakh", "5-10 Lakh","10-20 Lakh", "20-75 Lakh", "75 lakh – 1.5 Crore", "1.5 - 5 Crore ", "5 – 20 Crore", "20 – 50 Crore", "50-75 Crore", "75- 250 Crore", ">= 250 Crore", "others"};
    String[] Annualproduction = {"<1 Lakh ", "1-5 Lakh", "5-10 Lakh","10-20 Lakh", "20-75 Lakh", "75 lakh – 1.5 Crore", "1.5 - 5 Crore ", "5 – 20 Crore", "20 – 50 Crore", "50-75 Crore", "75- 250 Crore", ">= 250 Crore", "others"};


    public static final String Firebase_Server_URL = "https://insertdata-android-examples.firebaseio.com/";
    Firebase firebase;

    DatabaseReference databaseReference;

    // Root Database Name for Firebase Database.
    public static final String Database_Path = "Student_Details_Database";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Firebase.setAndroidContext(AddProperty.this);

        firebase = new Firebase(Firebase_Server_URL);

        databaseReference = FirebaseDatabase.getInstance().getReference(Database_Path);




        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        radioGroup1 = (RadioGroup) findViewById(R.id.Area);
        radioGroup1.clearCheck();

        radioGroup2 = (RadioGroup) findViewById(R.id.Zone);
        radioGroup2.clearCheck();

        radioGroup3 = (RadioGroup) findViewById(R.id.IndustrialBlock);
        radioGroup3.clearCheck();

        radioGroup4 = (RadioGroup) findViewById(R.id.UnitCategory);
        radioGroup4.clearCheck();

        radioGroup5 = (RadioGroup) findViewById(R.id.UnitCategorySecond);
        radioGroup5.clearCheck();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb = (RadioButton) group.findViewById(checkedId);
                if (null != rb && checkedId > -1) {
                    Toast.makeText(AddProperty.this, rb.getText(), Toast.LENGTH_SHORT).show();
                     UnitHolder = rb.getText().toString();
                }

            }
        });

        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton area = (RadioButton) group.findViewById(checkedId);
                if (null != area && checkedId > -1) {
                    Toast.makeText(AddProperty.this, area.getText(), Toast.LENGTH_SHORT).show();
                    AreaHolder = area.getText().toString();
                }

            }
        });


        radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton zone = (RadioButton) group.findViewById(checkedId);
                if (null != zone && checkedId > -1) {
                    Toast.makeText(AddProperty.this, zone.getText(), Toast.LENGTH_SHORT).show();
                    ZoneHolder = zone.getText().toString();
                }

            }
        });



        radioGroup3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton indblock = (RadioButton) group.findViewById(checkedId);
                if (null != indblock && checkedId > -1) {
                    Toast.makeText(AddProperty.this, indblock.getText(), Toast.LENGTH_SHORT).show();
                    IndustrialblockHolder = indblock.getText().toString();
                }

            }
        });


        radioGroup4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton unicat = (RadioButton) group.findViewById(checkedId);
                if (null != unicat && checkedId > -1) {
                    Toast.makeText(AddProperty.this, unicat.getText(), Toast.LENGTH_SHORT).show();
                    unitcatHolder = unicat.getText().toString();
                }

            }
        });

        radioGroup5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton unicat2 = (RadioButton) group.findViewById(checkedId);
                if (null != unicat2 && checkedId > -1) {
                    Toast.makeText(AddProperty.this, unicat2.getText(), Toast.LENGTH_SHORT).show();
                    UnitCategoerySecHolder = unicat2.getText().toString();
                }

            }
        });


        EnterData = (Button) findViewById(R.id.button);
        editTextName = (EditText) findViewById(R.id.editText);
        editTextPhoneNumber = (EditText) findViewById(R.id.editText2);
        editTextnameofowner = (EditText) findViewById(R.id.nameofowner);
        editTextContact = (EditText) findViewById(R.id.contactno);
        editTextOwneremail = (EditText) findViewById(R.id.authemail);
        editTextAuth = (EditText) findViewById(R.id.namofauthcontact);
        editTextAuthContact =(EditText) findViewById(R.id.authcontact);
        editTextAuthEmail = (EditText) findViewById(R.id.authemail);
        editTextYear = (EditText) findViewById(R.id.yearofestablish);
        editTextAddress = (EditText) findViewById(R.id.address);
        editTextDistrict = (EditText) findViewById(R.id.district);
        editTextDeveblock = (EditText) findViewById(R.id.DevolopmentBlock);
        editTextULBKhasraNo = (EditText) findViewById(R.id.ULBKhasraNo) ;
        editTextIndustrycategory = (EditText) findViewById(R.id.Industrycategory);
        editTextNICData = (EditText) findViewById(R.id.NICData);
        editTextTypeofproduct = (EditText) findViewById(R.id.Typeofproduct);
        editTextPowerConnectiondate = (EditText) findViewById(R.id.PowerConnectiondate);
        editTextConnectedElectricalLoad = (EditText) findViewById(R.id.ConnectedElectricalLoad);
        editTextElectricMeterNo = (EditText) findViewById(R.id.ElectricMeterNo);
        editTextStartDateofCommercialProduction = (EditText) findViewById(R.id.StartDateofCommercialProduction) ;

        editTextTotalContractualEmployees = (EditText) findViewById(R.id.toconemploye);
        editTextContractualemployeeswithHaryanaDomicile = (EditText) findViewById(R.id.Contractualempwith) ;
        editTextContractualemployeeswithoutHaryanaDomicile = (EditText) findViewById(R.id.Contractualempwithout);
        editTextTotalRegularEmployees = (EditText) findViewById(R.id.TotalRegemp);
        editTextRegularemployeeswithharyanadomicile = (EditText) findViewById(R.id.Regemphardomwith);
        editTextRegularemployeeswithoutharyanadomicile = (EditText) findViewById(R.id.Regemphardomwithout);
        editTextLatitudeLongitude = (EditText) findViewById(R.id.LatLongitude);
        editTextTotalPlotarea = (EditText) findViewById(R.id.TotalpAREA);
        editTextSkillSetsRequired = (EditText) findViewById(R.id.Skillsetreq) ;






        EnterData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SQLiteDataBaseBuild();

                SQLiteTableBuild();

                CheckEditTextStatus();

                InsertDataIntoSQLiteDatabase();




            }
        });







        Spinner reagisterno =(Spinner)findViewById(R.id.spinner);
        Spinner investbulid    =(Spinner)findViewById(R.id.investbuldspiner);
        Spinner investmachine    =(Spinner)findViewById(R.id.InvestmentinPlantandMachinery);
        Spinner anualturnover    =(Spinner)findViewById(R.id.Annualturnover);
        Spinner anualproduction    =(Spinner)findViewById(R.id.Annualproduction);

        adapterRegno =    new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,regno);
        adapterRegno.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reagisterno.setAdapter(adapterRegno);

        adapterInvestbulid=     new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,investbuild);
        adapterInvestbulid.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        investbulid.setAdapter(adapterInvestbulid);

        adapterINVESTMACHINE=     new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,InvestmentinMachinery);
        adapterINVESTMACHINE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        investmachine.setAdapter(adapterINVESTMACHINE);

        adapterAnnualturnover=     new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,Annualturnover);
        adapterAnnualturnover.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        anualturnover.setAdapter(adapterAnnualturnover);

        adapterAnnualproduction =     new ArrayAdapter<CharSequence>(this,android.R.layout.simple_spinner_item,Annualproduction);
        adapterAnnualproduction.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        anualproduction.setAdapter(adapterAnnualproduction);

        RegistrationHolder  = reagisterno.getSelectedItem().toString();
        InvestBuildHolder  = investbulid.getSelectedItem().toString();
        InvestMachineHolder = investmachine.getSelectedItem().toString();
        AnualTurnOverHolder = anualturnover.getSelectedItem().toString();
        AnualProductionHolder = anualproduction.getSelectedItem().toString();










    }

    public void SQLiteDataBaseBuild() {

        sqLiteDatabaseObj = openOrCreateDatabase(SQLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);

    }

    public void SQLiteTableBuild() {

        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS " + SQLiteHelper.TABLE_NAME + "(" + SQLiteHelper.Table_Column_ID + " PRIMARY KEY AUTOINCREMENT NOT NULL, " + SQLiteHelper.Table_Column_1_Name + " VARCHAR, " + SQLiteHelper.Table_Column_2_PhoneNumber + " VARCHAR, " + SQLiteHelper.Table_Column_3_Registration + " VARCHAR, " + SQLiteHelper.Table_Column_4_Owner + " VARCHAR, " + SQLiteHelper.Table_Column_5_Contact + " VARCHAR, " + SQLiteHelper.Table_Column_6_Unit + " VARCHAR, " + SQLiteHelper.Table_Column_9_Emailowner + " VARCHAR, " + SQLiteHelper.Table_Column_7_Nameauth + " VARCHAR, " + SQLiteHelper.Table_Column_8_ContactAuth + " VARCHAR, " + SQLiteHelper.Table_Column_10_EmailAuth + " VARCHAR, " + SQLiteHelper.Table_Column_11_YearOFEstablish + " VARCHAR, " + SQLiteHelper.Table_Column_12_Address + " VARCHAR, " + SQLiteHelper.Table_Column_13_District + " VARCHAR, " + SQLiteHelper.Table_Column_14_Area + " VARCHAR, " + SQLiteHelper.Table_Column_15_Zone + " VARCHAR, " + SQLiteHelper.Table_Column_16_Devoblock + " VARCHAR, " + SQLiteHelper.Table_Column_17_Industrialblock + " VARCHAR, " + SQLiteHelper.Table_Column_18_UlBKHNO + " VARCHAR, " + SQLiteHelper.Table_Column_19_Industrialcat + " VARCHAR, " + SQLiteHelper.Table_Column_20_Nicdata + " VARCHAR, " + SQLiteHelper.Table_Column_21_UnitCat + " VARCHAR, " + SQLiteHelper.Table_Column_22_typeofproduct + " VARCHAR, " + SQLiteHelper.Table_Column_23_powerconnectiondate + " VARCHAR, " + SQLiteHelper.Table_Column_24_connectedelectrical + " VARCHAR, " + SQLiteHelper.Table_Column_25_electricalmater + " VARCHAR, " + SQLiteHelper.Table_Column_26_startdatecomproduct + " VARCHAR, " + SQLiteHelper.Table_Column_27_InvestBuild + " VARCHAR, " + SQLiteHelper.Table_Column_28_InvestmentinPlantm + " VARCHAR, " + SQLiteHelper.Table_Column_29_Annualturnover + " VARCHAR, " + SQLiteHelper.Table_Column_30_Annualproduction + " VARCHAR, " + SQLiteHelper.Table_Column_31_ContractualEmployee + " VARCHAR, " + SQLiteHelper.Table_Column_32_employeeswithHaryana + " VARCHAR, " + SQLiteHelper.Table_Column_33_employeeswithoutHaryana + " VARCHAR, " + SQLiteHelper.Table_Column_34_RegularEmployees + " VARCHAR, " + SQLiteHelper.Table_Column_35_Regularemployeeswith + " VARCHAR, " + SQLiteHelper.Table_Column_36_Regularemployeeswithouth + " VARCHAR, " + SQLiteHelper.Table_Column_37_LatitudeLongitude + " VARCHAR, " + SQLiteHelper.Table_Column_38_TotalPlotarea + " VARCHAR, " + SQLiteHelper.Table_Column_39_SkillSetsRequired + " VARCHAR, " + SQLiteHelper.Table_Column_40_UnitCatSecond + " VARCHAR, " + SQLiteHelper.Table_Column_41_Todaydate + " PROCESS_DATE);");

    }

    public void CheckEditTextStatus() {

        NameHolder = editTextName.getText().toString();
        NumberHolder = editTextPhoneNumber.getText().toString();
        OwnerHolder = editTextnameofowner.getText().toString();
        ContactHolder = editTextContact.getText().toString();
        EmailOwnerHolder = editTextOwneremail.getText().toString();
        AuthHolder = editTextAuth.getText().toString();
        AuthContactHolder = editTextAuthContact.getText().toString();
        AuthEmailHolder = editTextAuthEmail.getText().toString();
        AuthofyearHolder = editTextYear.getText().toString();
        AddressHolder = editTextAddress.getText().toString();
        DidtrictHolder = editTextDistrict.getText().toString();
        DevelopmentBlockHolder = editTextDeveblock.getText().toString();
        UlbHolder = editTextULBKhasraNo.getText().toString();
        IndustrialcatHolder = editTextIndustrycategory.getText().toString();
        NicHolder  = editTextNICData.getText().toString();
        typeofproHolder = editTextTypeofproduct.getText().toString();
        PowerconHolder = editTextPowerConnectiondate.getText().toString();
        connectedelectricalHolder = editTextConnectedElectricalLoad.getText().toString();
        eletricalmaterHolder = editTextElectricMeterNo.getText().toString();
        startdateHolder = editTextStartDateofCommercialProduction.getText().toString();


        TotalContractualEmployeesHolder = editTextTotalContractualEmployees.getText().toString();
        ContractualemployeeswithHaryanaDomicileHolder = editTextContractualemployeeswithHaryanaDomicile.getText().toString();
        ContractualemployeeswithoutHaryanaDomicileHolder = editTextContractualemployeeswithoutHaryanaDomicile.getText().toString();
        TotalRegularEmployeesHolder = editTextTotalRegularEmployees.getText().toString();
        RegularemployeeswithharyanadomicileHolder = editTextRegularemployeeswithharyanadomicile.getText().toString();
        RegularemployeeswithoutharyanadomicileHolder = editTextRegularemployeeswithoutharyanadomicile.getText().toString();
        LatitudeLongitudeHolder = editTextLatitudeLongitude.getText().toString();
        TotalPlotareaHolder = editTextTotalPlotarea.getText().toString();
        SkillSetsRequiredHolder = editTextSkillSetsRequired.getText().toString();


        if (TextUtils.isEmpty(NameHolder) || TextUtils.isEmpty(NumberHolder )|| TextUtils.isEmpty(OwnerHolder )|| TextUtils.isEmpty(ContactHolder )
                || TextUtils.isEmpty(EmailOwnerHolder )|| TextUtils.isEmpty(AddressHolder )|| TextUtils.isEmpty(AuthContactHolder )|| TextUtils.isEmpty(AuthEmailHolder )
                || TextUtils.isEmpty(AuthofyearHolder )|| TextUtils.isEmpty(DidtrictHolder )|| TextUtils.isEmpty(AddressHolder )|| TextUtils.isEmpty(DevelopmentBlockHolder )
                || TextUtils.isEmpty(UlbHolder )|| TextUtils.isEmpty(IndustrialcatHolder )|| TextUtils.isEmpty(NicHolder )|| TextUtils.isEmpty(typeofproHolder )
                || TextUtils.isEmpty(PowerconHolder )|| TextUtils.isEmpty(connectedelectricalHolder )|| TextUtils.isEmpty(eletricalmaterHolder )|| TextUtils.isEmpty(startdateHolder )
                || TextUtils.isEmpty(TotalContractualEmployeesHolder )|| TextUtils.isEmpty(ContractualemployeeswithHaryanaDomicileHolder )|| TextUtils.isEmpty(ContractualemployeeswithoutHaryanaDomicileHolder )|| TextUtils.isEmpty(TotalRegularEmployeesHolder )
                || TextUtils.isEmpty(RegularemployeeswithharyanadomicileHolder )|| TextUtils.isEmpty(LatitudeLongitudeHolder )|| TextUtils.isEmpty(RegularemployeeswithoutharyanadomicileHolder )|| TextUtils.isEmpty(TotalPlotareaHolder )
                || TextUtils.isEmpty(SkillSetsRequiredHolder )) {

            EditTextEmptyHold = false;

        } else {

            EditTextEmptyHold = true;
        }


    }

    public void InsertDataIntoSQLiteDatabase() {






        Dateholder = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());


        if (EditTextEmptyHold == true) {




            SQLiteDataBaseQueryHolder = "INSERT INTO " + SQLiteHelper.TABLE_NAME + " (name,phone_number,registartion,nameofowner,contact,unit,owneremail,auth,contactofauth,emailofauth,yearofestablish,address,district,area,zone,deveblock,industrialblock,ulbkhasra,industrialcat,nicdata,unitcat,typeofproduct,powerconnectdate,conelload,eletricalmater,startdatecomercialproduct,investbuild,investplatmachine,annualturnover,annualproduction,contractualemployee,employeeswith,employeeswithout,regularemployees,regularemployeeswith,regularemployeeswithouth,latitudelongitude,totaltlotarea,skillsetsrequired,unitcatsecond,todaydate) VALUES('" + NameHolder + "', '" + NumberHolder + "', '" + RegistrationHolder + "', '" + OwnerHolder + "', '" + ContactHolder + "', '" + UnitHolder + "', '" + EmailOwnerHolder + "', '" + AuthHolder + "', '" + AuthContactHolder + "', '" + AuthEmailHolder + "', '" + AuthofyearHolder + "', '" + AddressHolder + "', '" + DidtrictHolder + "', '" + AreaHolder + "', '" + ZoneHolder + "', '" + DevelopmentBlockHolder + "', '" + IndustrialblockHolder + "', '" + UlbHolder + "', '" + IndustrialcatHolder + "', '" + NicHolder + "', '" + unitcatHolder + "', '" + typeofproHolder + "', '" + PowerconHolder + "', '" + connectedelectricalHolder + "', '" + eletricalmaterHolder + "', '" + startdateHolder + "', '" + InvestBuildHolder + "', '" + InvestMachineHolder + "', '" + AnualTurnOverHolder + "', '" + AnualProductionHolder + "', '" + TotalContractualEmployeesHolder + "', '" + ContractualemployeeswithHaryanaDomicileHolder + "', '" + ContractualemployeeswithoutHaryanaDomicileHolder + "', '" + TotalRegularEmployeesHolder + "', '" + RegularemployeeswithharyanadomicileHolder + "', '" + RegularemployeeswithoutharyanadomicileHolder + "', '" + LatitudeLongitudeHolder + "', '" + TotalPlotareaHolder + "', '" + SkillSetsRequiredHolder + "', '" + UnitCategoerySecHolder + "', '" + Dateholder + "');";

            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);

            Toast.makeText(AddProperty.this, "Record Submited Successfully", Toast.LENGTH_LONG).show();
            EmptyEditTextAfterDataInsert();





            StudentDetails studentDetails = new StudentDetails();




            studentDetails.setStudentName(NameHolder);
            studentDetails.setStudentPhoneNumber(NumberHolder);
            studentDetails.setRegister(RegistrationHolder);
            studentDetails.setOwner(OwnerHolder );
            studentDetails.setContact(ContactHolder );
            studentDetails.setUnit(UnitHolder );
            studentDetails.setEmail(EmailOwnerHolder );
            studentDetails.setAuth(AuthHolder );
            studentDetails.setAuthContact(AuthContactHolder );
            studentDetails.setAuthEmail(AuthEmailHolder );
            studentDetails.setAuthyear(AuthofyearHolder );
            studentDetails.setAuthAddress(AddressHolder );
            studentDetails.setAuthDistrict(DidtrictHolder );
            studentDetails.setArea(AreaHolder );
            studentDetails.setZone(ZoneHolder );
            studentDetails.setDevelopmentblock(DevelopmentBlockHolder );
            studentDetails.setIndustrialblock(IndustrialblockHolder );
            studentDetails.setULBKhasra(UlbHolder );
            studentDetails.setIndustrialCat(IndustrialcatHolder );
            studentDetails.setNICData(NicHolder );
            studentDetails.setUnitCat(unitcatHolder );
            studentDetails.setTypeofproduct(typeofproHolder );
            studentDetails.setPowercondate(PowerconHolder  );
            studentDetails.setConeleload(connectedelectricalHolder );
            studentDetails.setElectrical(eletricalmaterHolder );
            studentDetails.setStartdatecom(startdateHolder );
            studentDetails.setInvestinbuild(InvestBuildHolder );
            studentDetails.setInvestplatmachin(InvestMachineHolder );
            studentDetails.setAnualturover(AnualTurnOverHolder );
            studentDetails.setAnualproduction(AnualProductionHolder );
            studentDetails.setToconemploye(TotalContractualEmployeesHolder );
            studentDetails.setContraCtualempWith(ContractualemployeeswithHaryanaDomicileHolder );
            studentDetails.setContraCtualempWithout(ContractualemployeeswithoutHaryanaDomicileHolder );
            studentDetails.setTotalRegEmp(TotalRegularEmployeesHolder );
            studentDetails.setRegEmpHardomWith(RegularemployeeswithharyanadomicileHolder );
            studentDetails.setRegEmpHardomWithout(RegularemployeeswithoutharyanadomicileHolder );
            studentDetails.setLatitudeLongitude(LatitudeLongitudeHolder );
            studentDetails.setTotalPAREA(TotalPlotareaHolder );
            studentDetails.setSkillSetReq(SkillSetsRequiredHolder );
            studentDetails.setUnitCatSecond(UnitCategoerySecHolder );
            studentDetails.setTodayDate(Dateholder);


            String StudentRecordIDFromServer = databaseReference.push().getKey();

            // Adding the both name and number values using student details class object using ID.
            databaseReference.child(StudentRecordIDFromServer).setValue(studentDetails);

            // Showing Toast message after successfully data submit.
            Toast.makeText(AddProperty.this,"Data Inserted Successfully into Firebase Database", Toast.LENGTH_LONG).show();





        } else {

            Toast.makeText(AddProperty.this, "Please Fill All The Required Fields.", Toast.LENGTH_LONG).show();

        }

    }

    public void EmptyEditTextAfterDataInsert() {

        editTextName.getText().clear();

        editTextPhoneNumber.getText().clear();

        editTextnameofowner.getText().clear();

        editTextContact.getText().clear();
        editTextOwneremail.getText().clear();
        editTextAuth.getText().clear();
        editTextAuthContact.getText().clear();
        editTextAuthEmail.getText().clear();
        editTextYear.getText().clear();
        editTextAddress.getText().clear();
        editTextDistrict.getText().clear();
        editTextDeveblock.getText().clear();
        editTextULBKhasraNo.getText().clear();
        editTextIndustrycategory.getText().clear();
        editTextNICData.getText().clear();
        editTextTypeofproduct.getText().clear();
        editTextPowerConnectiondate.getText().clear();
        editTextConnectedElectricalLoad.getText().clear();
        editTextElectricMeterNo.getText().clear();
        editTextStartDateofCommercialProduction.getText().clear();
        editTextTotalContractualEmployees.getText().clear();
        editTextContractualemployeeswithHaryanaDomicile.getText().clear();

        editTextContractualemployeeswithHaryanaDomicile.getText().clear();
        editTextContractualemployeeswithoutHaryanaDomicile.getText().clear();
        editTextTotalRegularEmployees.getText().clear();
        editTextRegularemployeeswithharyanadomicile.getText().clear();
        editTextRegularemployeeswithoutharyanadomicile.getText().clear();
        editTextLatitudeLongitude.getText().clear();
        editTextTotalPlotarea.getText().clear();
        editTextSkillSetsRequired.getText().clear();


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        RegistrationHolder = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + RegistrationHolder, Toast.LENGTH_LONG).show();


    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

}