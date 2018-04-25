package activitytest.example.com.myapplication2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by haimian on 2018/4/21.
 */

public class PLANDAO {
    private PLANFORDAYDB helper;
    private SQLiteDatabase database;

    public PLANDAO(Context context) {
        helper = new PLANFORDAYDB(context);
    }
    /**
     * insert a record into table
     * @param name : record's name
     * @param phoneNumber : record's phoneNumber
     */
    public void add(String name,String phoneNumber){
        database = helper.getWritableDatabase();
        database.execSQL("insert into plan('week','daytime','activity') values (?,?,?)",  new String[]{name,phoneNumber});
        database.close();
    }
    /**
     * query all record
     * @return : cursor
     */
    public Cursor query(){
        database = helper.getWritableDatabase();
        Cursor cursor = database.rawQuery("select * from plan", null);
        return cursor;
    }
    /**
     *close database
     */
    public void closeDB(){
        database.close();
    }
}
