package com.example.hp.ols;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.CheckBox;

/**
 * Created by hp on 4/7/2017.
 */

public class DataBaseHelper2 extends SQLiteOpenHelper {


    public static final String  DATABASE_NAME="ABC.db";
    public static final String  TABLE_NAME="Applicant";
    public static final String  COL_1="application_no";
    public static final String  COL_2="state";
    public static final String  COL_3="RTO_Office";
    public static final String  COL_4="Pincode";
    public static final String  COL_5="Name_of_user";
    public static final String  COL_6="Relation";
    public static final String  COL_7="Relation_name";
    public static final String  COL_8="Adhar_no";
    public static final String  COL_9="gender";
    public static final String  COL_10="date_of_birth";
    public static final String  COL_11="qualification";
    public static final String  COL_12="blood_group";
    public static final String  COL_13="phone_no";
    public static final String  COL_14="email_id";
    public static final String  COL_15="mobile_no";

    public static final String  COL_16="VillageOrTown";
    public static final String  COL_17="VillageOrTownName";
    public static final String  COL_18="doorNo";
    public static final String  COL_19="localityNo";
    public static final String  COL_20="LoactionName";
    public static final String  COL_21="pincode_address";

    public static final String  COL_22="MCCC";
    public static final String  COL_23="MCWOG";
    public static final String  COL_24="MCWG";
    public static final String  COL_25="LMV";
    public static final String  COL_26="TRCTOR";
    public static final String  COL_27="LMV_GV";
    public static final String  COL_28="CAB_3W_CAB";
    public static final String  COL_29="PSV_3W_GV";
    public static final String  COL_30="INVCRG";
    public static final String  COL_31="RDRLR";

    public static final String  COL_32="OTHER";
    public static final String  COL_33="LDRXCV";
    public static final String  COL_34="CRANE";
    public static final String  COL_35="FLIFT";
    public static final String  COL_36="BRIGS";
    public static final String  COL_37="CNEQP";
    public static final String  COL_38="INVCG2";
    public static final String  COL_39="INVCG3";
    public static final String  COL_40="E_CART";
    public static final String  COL_41="E_RIKSHAW";

    public static final String  COL_42="PLEASE_TICK_IF_YES";
    public static final String  COL_43="YES_I_AM";
    public static final String  COL_44="PLEASE_TICK_IF_WILLING";
    public static final String  COL_45="YES";

    public DataBaseHelper2(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    /*public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
*///*/

    @Override
    public void onCreate(SQLiteDatabase db) {

         db.execSQL("create table "+TABLE_NAME+"("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT,"+COL_2+" TEXT,"+COL_3+" TEXT,"+COL_4+" TEXT,"+COL_5+" TEXT,"+COL_6+" TEXT,"+COL_7+" TEXT,"
                +COL_8+" TEXT,"+COL_9+" TEXT,"+COL_10+" TEXT,"+COL_11+" TEXT,"+COL_12+" TEXT,"+COL_13+" TEXT,"+COL_14+" TEXT,"+COL_15+" TEXT,"
              //  +COL_16+ " TEXT,"

                 +COL_17+" TEXT,"+COL_18+" TEXT,"+COL_19+" TEXT,"+COL_20+" TEXT,"+COL_21+" TEXT,"
                +COL_22+" TEXT,"+COL_23+" TEXT,"+COL_24+" TEXT,"+COL_25+" TEXT,"+COL_26+" TEXT,"+COL_27+" TEXT,"+COL_28+" TEXT,"+COL_29+" TEXT,"
                +COL_30+" TEXT,"+COL_31+" TEXT,"+COL_32+" TEXT,"+COL_33+" TEXT,"+COL_34+" TEXT,"+COL_35+" TEXT,"
                        +COL_36+" TEXT,"+COL_37+" TEXT,"+COL_38+" TEXT,"+COL_39+" TEXT,"+COL_40+" TEXT,"+COL_41+" TEXT,"+COL_42+" TEXT,"+COL_43+" TEXT,"+COL_44+" TEXT,"+COL_45+" TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME+"",null);

        onCreate(db);

    }
    public boolean insertDataUd(String state,String rto_office, String pincode, String name, String relation, String relation_name, String Adhar_no,
                                String gender, String date_of_birth,
                                String  qualification, String blood_group, String phone_no, String email_id, String mobile_id,
                             //   String state1,
                                String rto_office1, String pincode1, String name1, String relation1, String relation_name1, String Adhar_no1,
                                String gender1, String date_of_birth1,
                                String  qualification1, String blood_group1, String phone_no1, String email_id1, String mobile_id1,
                                String state2,String rto_office2, String pincode2, String name2, String relation2, String relation_name2, String Adhar_no2,
                                String gender2, String date_of_birth2,
                                String  qualification2, String blood_group2, String phone_no2, String email_id2, String mobile_id2,String as,String ab
    ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        //
        //  contentValues.put(COL_2,state);
        contentValues.put(COL_2,state);
        contentValues.put(COL_3,rto_office);
        contentValues.put(COL_4,pincode);
        contentValues.put(COL_5,name);
        contentValues.put(COL_6,relation);
        contentValues.put(COL_7,relation_name);
        contentValues.put(COL_8,Adhar_no);
        contentValues.put(COL_9,gender);
        contentValues.put(COL_10,date_of_birth);
        contentValues.put(COL_11,qualification);
        contentValues.put(COL_12,blood_group);
        contentValues.put(COL_13,phone_no);
        contentValues.put(COL_14,email_id);
        contentValues.put(COL_15,mobile_id);
       // contentValues.put(COL_16,state1);
        contentValues.put(COL_17,rto_office1);
        contentValues.put(COL_18,pincode1);
        contentValues.put(COL_19,name1);
        contentValues.put(COL_20,relation1);
        contentValues.put(COL_21,relation_name1);
        contentValues.put(COL_22,Adhar_no1);
        contentValues.put(COL_23,gender1);
        contentValues.put(COL_24,date_of_birth1);
        contentValues.put(COL_25,qualification1);
        contentValues.put(COL_26,blood_group1);
        contentValues.put(COL_27,phone_no1);
        contentValues.put(COL_28,email_id1);
        contentValues.put(COL_29,mobile_id1);
        contentValues.put(COL_30,state2);
        contentValues.put(COL_31,rto_office2);
        contentValues.put(COL_32,pincode2);
        contentValues.put(COL_33,name2);
        contentValues.put(COL_34,relation2);
        contentValues.put(COL_35,relation_name2);
        contentValues.put(COL_36,Adhar_no2);
        contentValues.put(COL_37,gender2);
        contentValues.put(COL_38,date_of_birth2);
        contentValues.put(COL_39,qualification2);
        contentValues.put(COL_40,blood_group2);
        contentValues.put(COL_41,phone_no2);
        contentValues.put(COL_42,email_id2);
        contentValues.put(COL_43,mobile_id2);
        contentValues.put(COL_44,as);
        contentValues.put(COL_45,ab);
        long result=db.insert(TABLE_NAME,null,contentValues);//returns -1 if nothing inserted
        if(result==-1){
            return false;
        }
        else return true;

    }

    public Cursor getAllData()//provide random read an write
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor res= db.rawQuery("select * from "+TABLE_NAME+"",null);
        return  res;

    }

}
