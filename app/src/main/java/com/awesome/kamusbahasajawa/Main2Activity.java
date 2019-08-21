package com.awesome.kamusbahasajawa;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private SQLiteDatabase db = null;
    private Cursor kamuscursor = null;
    private EditText textIndo;
    private EditText textNgoko;
    private EditText textMadya;
    private EditText textInggil;
    private DataBase datakamus = null;
    public static final String INDO = "indo";
    public static final String NGOKO = "ngoko";
    public static final String MADYA = "madya";
    public static final String INGGIL = "inggil";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        datakamus = new DataBase(this);
        db = datakamus.getWritableDatabase();
        datakamus.createTable(db);
        datakamus.generateData(db);

        setContentView(R.layout.activity_main2);
        textIndo = (EditText) findViewById(R.id.edit1);
        textNgoko = (EditText) findViewById(R.id.edit2);
        textMadya = (EditText) findViewById(R.id.edit3);
        textInggil = (EditText) findViewById(R.id.edit4);
    }
    public void getTranslate (View view){
        String result = "";
        String result1 = "";
        String result2 = "";

        String kataIndo = textIndo.getText().toString();
        kamuscursor = db.rawQuery("SELECT id, jawa_ngoko, jawa_madya, jawa_inggil"
                + " FROM kamus where UPPER(bahasa_indo) LIKE UPPER('" + kataIndo
                + "') ORDER BY bahasa_indo", null);

        if (kamuscursor.moveToFirst()){
            result = kamuscursor.getString(1);
            result1 = kamuscursor.getString(2);
            result2 = kamuscursor.getString(3);

            /*for (kamuscursor.isAfterLast(); kamuscursor.moveToFirst();){
                result = kamuscursor.getString(3);
            }*/
        }
        if (result.equals("")){
            result = "Terjemahan Tidak Tersedia";
            result1 = "Terjemahan Tidak Tersedia";
            result2 = "Terjemahan Tidak Tersedia";
        }
        textNgoko.setText(result);
        textMadya.setText(result1);
        textInggil.setText(result2);
    }

   @Override
    public void onDestroy(){
        super.onDestroy();
        //kamuscursor.close();
        db.close();
    }
}
