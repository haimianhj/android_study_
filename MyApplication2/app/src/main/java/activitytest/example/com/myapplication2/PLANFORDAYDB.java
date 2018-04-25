package activitytest.example.com.myapplication2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PLANFORDAYDB extends SQLiteOpenHelper {

    // database's name
    private static String DB_NAME = "plan.db";
    // database's version
    private static int DB_VERSION = 1;
    // create table person SQL
    private String CreatTable_sql = "create table plan (id integer primary key autoincrement,"
            + "week varchar(20)," + "daytime varchar(20)" +"activity varchar(20)"+ ")";

    public PLANFORDAYDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CreatTable_sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
