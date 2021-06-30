import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class Databasehelper {

    public class DataHelper extends SQLiteOpenHelper {


        private static final String DATABASE_NAME = "Dataapp.db";
        private static final int DATABASE_VERSION = 1;

        public DataHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
            // TODO Auto-generated constructor stub
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            // TODO Auto-generated method stub
            String sql = "create table biodata(nama text null, no_hp integer primary key, password text null);";
            Log.d("Data", "onCreate: " + sql);
            db.execSQL(sql);
            sql = "INSERT INTO biodata (nama, no_hp, password) VALUES ('Taufiq', '085238237530', 'qwerty');";
            db.execSQL(sql);
        }

        @Override
        public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
            // TODO Auto-generated method stub
        }
    }
}