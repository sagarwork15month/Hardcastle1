package com.hardcastle.hardcastle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> ID;
    ArrayList<String> Name;
    ArrayList<String> PhoneNumber;
    ArrayList<String> Register;
    ArrayList<String> Owner;
    ArrayList<String> Contact;
    ArrayList<String> Unit;

    ArrayList<String> Email;
    ArrayList<String> Auth;
    ArrayList<String> AuthContact;
    ArrayList<String> AuthEmail;
    ArrayList<String> Authyear;
    ArrayList<String> AuthAddress;
    ArrayList<String> AuthDistrict;
    ArrayList<String> Area;

    ArrayList<String> Zone;
    ArrayList<String> Developmentblock;
    ArrayList<String> Industrialblock;
    ArrayList<String> ULBKhasra;
    ArrayList<String> IndustrialCat;
    ArrayList<String> NICData;
    ArrayList<String> UnitCat;
    ArrayList<String> Typeofproduct;
    ArrayList<String> Powercondate;
    ArrayList<String> Coneleload;
    ArrayList<String> Electrical;
    ArrayList<String> Startdatecom;
    ArrayList<String> Investinbuild;

    ArrayList<String> Investplatmachin;
    ArrayList<String> Anualturover;
    ArrayList<String> Anualproduction;

    ArrayList<String> Toconemploye;
    ArrayList<String> ContraCtualempWith;
    ArrayList<String> ContraCtualempWithout;
    ArrayList<String> TotalRegEmp;
    ArrayList<String> RegEmpHardomWith;
    ArrayList<String> RegEmpHardomWithout;
    ArrayList<String> LatitudeLongitude;
    ArrayList<String> TotalPAREA;
    ArrayList<String> SkillSetReq;
    ArrayList<String> UnitCatSecond;

    ArrayList<String> TodayDate;


    public ListAdapter(
            Context context2,
            ArrayList<String> id,
            ArrayList<String> name,
            ArrayList<String> phone,
            ArrayList<String> register,
            ArrayList<String> owner,
            ArrayList<String> contact,
            ArrayList<String> unit,

            ArrayList<String> email,
            ArrayList<String> auth,
            ArrayList<String> authcontact,
            ArrayList<String> authemail,
            ArrayList<String> authyear,
            ArrayList<String> authaddress,
            ArrayList<String> authdistrict,
            ArrayList<String> area,

            ArrayList<String> zone,
            ArrayList<String> developblock,
            ArrayList<String> industrialblock,
            ArrayList<String> uLBKhasra,
            ArrayList<String> industrialCat,
            ArrayList<String> nICData,
            ArrayList<String> unitCat,
            ArrayList<String> typeofproduct,
            ArrayList<String> powercondate,
            ArrayList<String> coneleload,
            ArrayList<String> electrical,
            ArrayList<String> startdatecom,
            ArrayList<String> investinbuild,

            ArrayList<String> investplatmachin,
            ArrayList<String> anualturover,
            ArrayList<String> anualproduction,

           ArrayList<String> toconemploye,
             ArrayList<String> contractualempwith,
                    ArrayList<String> contractualempwithout,
                    ArrayList<String> totalregemp,
                    ArrayList<String> regemphardomwith,
                    ArrayList<String> regemphardomwithout,
                    ArrayList<String> latitudelongitude,
                    ArrayList<String> totalpAREA,
                    ArrayList<String> skillsetreq,
                    ArrayList<String> unitcatsecond,
            ArrayList<String> todaydate





    ) {

        this.context = context2;
        this.ID = id;
        this.Name = name;
        this.PhoneNumber = phone;
        this.Register = register;
        this.Owner = owner;
        this.Contact = contact;
        this.Unit = unit;

        this.Email = email;
        this.Auth = auth;
        this.AuthContact = authcontact;
        this.AuthEmail = authemail;
        this.Authyear = authyear;
        this.AuthAddress = authaddress;
        this.AuthDistrict = authdistrict;
        this.Area = area;

        this.Zone= zone;
        this.Developmentblock = developblock;
        this.Industrialblock = industrialblock;
        this.ULBKhasra = uLBKhasra;
        this.IndustrialCat = industrialCat;
        this.NICData = nICData;
        this.UnitCat = unitCat;
        this.Typeofproduct = typeofproduct;
        this.Powercondate = powercondate;
        this.Coneleload = coneleload;
        this.Electrical = electrical;
        this.Startdatecom = startdatecom;
        this.Investinbuild = investinbuild;

        this.Investplatmachin = investplatmachin;
        this.Anualturover = anualturover;
        this.Anualproduction = anualproduction;

        this.Toconemploye = toconemploye;
        this.ContraCtualempWith = contractualempwith;
        this.ContraCtualempWithout = contractualempwithout;
        this.TotalRegEmp = totalregemp;
        this.RegEmpHardomWith = regemphardomwith;
        this.RegEmpHardomWithout = regemphardomwithout;
        this.LatitudeLongitude = latitudelongitude;
        this.TotalPAREA = totalpAREA;
        this.SkillSetReq = skillsetreq;
        this.UnitCatSecond = unitcatsecond;

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

            child = layoutInflater.inflate(R.layout.items, null);

            holder = new Holder();

            holder.ID_TextView = (TextView) child.findViewById(R.id.textViewID);
            holder.Name_TextView = (TextView) child.findViewById(R.id.textViewNAME);
            holder.PhoneNumberTextView = (TextView) child.findViewById(R.id.textViewPHONE_NUMBER);
            holder.Register_Text = (TextView) child.findViewById(R.id.textViewreg);
            holder.Owner_Text = (TextView) child.findViewById(R.id.textViewOwner);
            holder.Contact_Text = (TextView) child.findViewById(R.id.textViewContact);
            holder.Unit_Text = (TextView) child.findViewById(R.id.textViewUnit);


            holder.Email_Text = (TextView) child.findViewById(R.id.textViewOwnerEmail);
            holder.Auth_Text = (TextView) child.findViewById(R.id.textViewAuth);
            holder.AuthContact_Text = (TextView) child.findViewById(R.id.textViewAuthContact);
            holder.AuthEmail_Text = (TextView) child.findViewById(R.id.textViewAuthEmail);
            holder.AuthYear_Text = (TextView) child.findViewById(R.id.textViewAuthYear);
            holder.AuthAddress_Text = (TextView) child.findViewById(R.id.textViewAuthAdddress);
            holder.AuthDistrict_Text = (TextView) child.findViewById(R.id.textViewAuthDistrict);
            holder.Area_Text = (TextView) child.findViewById(R.id.textViewArea);



            holder.Zone_Text = (TextView) child.findViewById(R.id.textViewZone);
            holder.Developmentblock_Text = (TextView) child.findViewById(R.id.textViewDevelopmentBlock);
            holder.Industrialblock_Text = (TextView) child.findViewById(R.id.textViewIndustrialBlock);
            holder.ULBKhasra_Text = (TextView) child.findViewById(R.id.textViewULBKhasraNo_);
            holder.IndustrialCat_Text = (TextView) child.findViewById(R.id.textViewIndustrycategory_);
            holder.NICData_Text = (TextView) child.findViewById(R.id.textViewNICData);
            holder.UnitCat_Text = (TextView) child.findViewById(R.id.textViewUnitCategory);
            holder.Typeofproduct_Text = (TextView) child.findViewById(R.id.textViewTypeofproduct);
            holder.Powercondate_Text = (TextView) child.findViewById(R.id.textViewPowerConnectiondate);
            holder.Coneleload_Text = (TextView) child.findViewById(R.id.textViewConnectedElectricalLoad);
            holder.Electrical_Text = (TextView) child.findViewById(R.id.textViewElectricMeterNo);
            holder.Startdatecom_Text = (TextView) child.findViewById(R.id.textViewStartDateofCommercialProduction);
            holder.Investment_Text = (TextView) child.findViewById(R.id.Investmentinbuilding);
            holder.Inveatplatmchine_Text = (TextView) child.findViewById(R.id.Investmentplatm);
            holder.AnualturnoverText = (TextView) child.findViewById(R.id.Annualturnover);
            holder.Anualproducation_Text = (TextView) child.findViewById(R.id.Annualproduction);

            holder.Toconemploye_Text = (TextView) child.findViewById(R.id.TextViewtoconemploye);
            holder.ContraCtualempWith_Text = (TextView) child.findViewById(R.id.TextViewContractualempwith);
            holder.ContraCtualempWithout_Text = (TextView) child.findViewById(R.id.TextViewContractualempwithout);
            holder.TotalRegEmp_Text = (TextView) child.findViewById(R.id.TextViewTotalRegemp);
            holder.RegEmpHardomWith_Text = (TextView) child.findViewById(R.id.TextViewRegemphardomwith);
            holder.RegEmpHardomWithout_Text = (TextView) child.findViewById(R.id.TextViewRegemphardomwithout);
            holder.LatitudeLongitude_Text = (TextView) child.findViewById(R.id.TextViewLatLongitude);
            holder.TotalPAREA_Text = (TextView) child.findViewById(R.id.TextViewTotalpAREA);
            holder.SkillSetReq_Text = (TextView) child.findViewById(R.id.TextViewSkillsetreq);
            holder.UnitCatSecond_Text = (TextView) child.findViewById(R.id.TextViewUnitCategorySecond);
            holder.TodayDate_Text = (TextView) child.findViewById(R.id.TextViewTodayDate);

            child.setTag(holder);

        } else {

            holder = (Holder) child.getTag();
        }
        holder.ID_TextView.setText(ID.get(position));
        holder.Name_TextView.setText(Name.get(position));
        holder.PhoneNumberTextView.setText(PhoneNumber.get(position));
        holder.Register_Text.setText(Register.get(position));
        holder.Owner_Text.setText(Owner.get(position));
        holder.Contact_Text.setText(Contact.get(position));
        holder.Unit_Text.setText(Unit.get(position));

        holder.Email_Text.setText(Email.get(position));
        holder.Auth_Text.setText(Auth.get(position));
        holder.AuthContact_Text.setText(AuthContact.get(position));
        holder.AuthEmail_Text.setText(AuthEmail.get(position));
        holder.AuthYear_Text.setText(Authyear.get(position));
        holder.AuthAddress_Text.setText(AuthAddress.get(position));
        holder.AuthDistrict_Text.setText(AuthDistrict.get(position));
        holder.Area_Text.setText(Area.get(position));


        holder.Zone_Text.setText(Zone.get(position));
        holder.Developmentblock_Text.setText(Developmentblock.get(position));
        holder.Industrialblock_Text.setText(Industrialblock.get(position));
        holder.ULBKhasra_Text.setText(ULBKhasra.get(position));
        holder.IndustrialCat_Text.setText(IndustrialCat.get(position));
        holder.NICData_Text.setText(NICData.get(position));
        holder.UnitCat_Text.setText(UnitCat.get(position));
        holder.Typeofproduct_Text.setText(Typeofproduct.get(position));
        holder.Powercondate_Text.setText(Powercondate.get(position));
        holder.Coneleload_Text.setText(Coneleload.get(position));
        holder.Electrical_Text.setText(Electrical.get(position));
        holder.Startdatecom_Text.setText(Startdatecom.get(position));
        holder.Investment_Text.setText(Investinbuild.get(position));
        holder.Inveatplatmchine_Text.setText(Investplatmachin.get(position));
        holder.AnualturnoverText.setText(Anualturover.get(position));
        holder.Anualproducation_Text.setText(Anualproduction.get(position));


        holder.Toconemploye_Text.setText(Toconemploye.get(position));
        holder.ContraCtualempWith_Text.setText(ContraCtualempWith.get(position));
        holder.ContraCtualempWithout_Text.setText(ContraCtualempWithout.get(position));
        holder.TotalRegEmp_Text.setText(TotalRegEmp.get(position));
        holder.RegEmpHardomWith_Text.setText(RegEmpHardomWith.get(position));
        holder.RegEmpHardomWithout_Text.setText(RegEmpHardomWithout.get(position));
        holder.LatitudeLongitude_Text.setText(LatitudeLongitude.get(position));
        holder.TotalPAREA_Text.setText(TotalPAREA.get(position));
        holder.SkillSetReq_Text.setText(SkillSetReq.get(position));
        holder.UnitCatSecond_Text.setText(UnitCatSecond.get(position));
        holder.TodayDate_Text.setText(TodayDate.get(position));

        return child;
    }

    public class Holder {

        TextView ID_TextView;
        TextView Name_TextView;
        TextView PhoneNumberTextView;
        TextView Register_Text;
        TextView Owner_Text;
        TextView Contact_Text;
        TextView Unit_Text;

        TextView Email_Text;
        TextView Auth_Text;
        TextView AuthContact_Text;
        TextView AuthEmail_Text;
        TextView AuthYear_Text;
        TextView AuthAddress_Text;
        TextView AuthDistrict_Text;
        TextView Area_Text;



        TextView Zone_Text;
        TextView Developmentblock_Text;
        TextView Industrialblock_Text;
        TextView ULBKhasra_Text;
        TextView IndustrialCat_Text;
        TextView NICData_Text;
        TextView UnitCat_Text;
        TextView Typeofproduct_Text;
        TextView Powercondate_Text;
        TextView Coneleload_Text;
        TextView Electrical_Text;
        TextView Startdatecom_Text;
        TextView Investment_Text;
        TextView Inveatplatmchine_Text;
        TextView AnualturnoverText;
        TextView Anualproducation_Text;


        TextView Toconemploye_Text;
        TextView ContraCtualempWith_Text;
        TextView ContraCtualempWithout_Text;
        TextView TotalRegEmp_Text;
        TextView RegEmpHardomWith_Text;
        TextView RegEmpHardomWithout_Text;
        TextView LatitudeLongitude_Text;
        TextView TotalPAREA_Text;
        TextView SkillSetReq_Text;
        TextView UnitCatSecond_Text;

        TextView TodayDate_Text;

    }

}
