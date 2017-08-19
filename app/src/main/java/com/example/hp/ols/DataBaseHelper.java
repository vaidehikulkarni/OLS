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

public class DataBaseHelper extends SQLiteOpenHelper {


    public static final String  DATABASE_NAME="UserInfo.db";
    public static final String  TABLE_NAME="UserDetails";
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


    public static final String  TABLE_NAME_Address="Address";
    public static final String  COL_21="state";
    public static final String  COL_22="district";
    public static final String  COL_23="subdistrict";
    public static final String  COL_24="townORvillage";
    public static final String  COL_25="townORvillageName";
    public static final String  COL_26="doorno";
    public static final String  COL_27="localityno";
    public static final String  COL_28="locationname";
    public static final String  COL_29="pincode_no";



    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    /*public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
*///*/

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"("+COL_1+" INTEGER PRIMARY KEY AUTOINCREMENT,"+COL_2+" TEXT,"+COL_3+" TEXT,"+COL_4+" TEXT,"+COL_5+" TEXT,"+COL_6+" TEXT,"+COL_7+" TEXT,"
        +COL_8+" TEXT,"+COL_9+" TEXT,"+COL_10+" TEXT,"+COL_11+" TEXT,"+COL_12+" TEXT,"+COL_13+" TEXT,"+COL_14+" TEXT,"+COL_15+" TEXT )");

        db.execSQL("create table "+TABLE_NAME_Address+"("+COL_21+" TEXT,"+COL_22+" TEXT,"+COL_23+" TEXT,"+COL_24+" TEXT,"+COL_25+" TEXT,"+COL_26+" TEXT,"
                +COL_27+" TEXT,"+COL_28+" TEXT,"+COL_29+" TEXT )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME+"",null);
        db.execSQL("DROP TABLE IF EXIST "+TABLE_NAME_Address+"",null);

        onCreate(db);

    }
    public boolean insertDataUd(String state,String rto_office, String pincode, String name, String relation, String relation_name, String Adhar_no,
                               String gender, String date_of_birth,
                              String  qualification, String blood_group, String phone_no, String email_id, String mobile_id){
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
        long result=db.insert(TABLE_NAME,null,contentValues);//returns -1 if nothing inserted
        if(result==-1){
            return false;
        }
        else return true;

    }

    public boolean insertData2(String a,String b, String c, String d, String e, String f, String g,
                                String h, String i  ){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();

        contentValues.put(COL_21,a);
        contentValues.put(COL_22,b);
        contentValues.put(COL_23,c);
        contentValues.put(COL_24,d);
        contentValues.put(COL_25,e);
        contentValues.put(COL_26,f);
        contentValues.put(COL_27,g);
        contentValues.put(COL_28,h);
        contentValues.put(COL_29,i);

        long result=db.insert(TABLE_NAME_Address,null,contentValues);//returns -1 if nothing inserted
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
    public boolean insertData3(String a[],CheckBox[] b){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        for(int i=1;i<(a.length+1);i++)
        {
            contentValues.put(b[i].getText().toString(),a[i]);
        }

        long result=db.insert(TABLE_NAME_Address,null,contentValues);//returns -1 if nothing inserted
        if(result==-1){
            return false;
        }
        else return true;

    }
}
