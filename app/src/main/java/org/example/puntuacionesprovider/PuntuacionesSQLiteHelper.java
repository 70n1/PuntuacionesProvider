package org.example.puntuacionesprovider;

/**
 * Created by motoni on 26/11/2016.
 */
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by motoni on 26/11/2016.
 */

public class PuntuacionesSQLiteHelper extends SQLiteOpenHelper {
    public PuntuacionesSQLiteHelper(Context context) {
        super(context, "puntuaciones", null, 1);
    }
    @Override public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE puntuaciones ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "puntos INTEGER, "
                + "nombre TEXT, "
                + "fecha LONG)");
    }
    @Override public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// En caso de una nueva versión habría que actualizar las tablas
    }
}