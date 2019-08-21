package com.awesome.kamusbahasajawa;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "kamus";
    private static final String BAHASA_INDO = "bahasa_indo";
    private static final String JAWA_NGOKO = "jawa_ngoko";
    private static final String JAWA_MADYA = "jawa_madya";
    private static final String JAWA_INGGIL = "jawa_inggil";

    public DataBase(Context context){super(context, DATABASE_NAME, null, 1);
    }

    public void createTable(SQLiteDatabase db){
        db.execSQL("DROP TABLE IF EXISTS kamus");
        db.execSQL("CREATE TABLE if not exists kamus(id INTEGER PRIMARY KEY AUTOINCREMENT, bahasa_indo TEXT, jawa_ngoko TEXT,jawa_madya TEXT, jawa_inggil TEXT)");
    }

    public void generateData(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
        //A
        cv.put(BAHASA_INDO,"Alis");
        cv.put(JAWA_NGOKO,"Alis");
        cv.put(JAWA_MADYA,"Alis");
        cv.put(JAWA_INGGIL,"Imba");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Aku");
        cv.put(JAWA_NGOKO,"Aku");
        cv.put(JAWA_MADYA,"Kula");
        cv.put(JAWA_INGGIL,"Kawula");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Adik");
        cv.put(JAWA_NGOKO,"Adhi");
        cv.put(JAWA_MADYA,"Adhi");
        cv.put(JAWA_INGGIL,"Rayi");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Anak");
        cv.put(JAWA_NGOKO,"Anak");
        cv.put(JAWA_MADYA,"Yoga");
        cv.put(JAWA_INGGIL,"Putra");
        db.insert("kamus",BAHASA_INDO,cv);
        //5
        cv.put(BAHASA_INDO,"Ayo");
        cv.put(JAWA_NGOKO,"Ayo");
        cv.put(JAWA_MADYA,"Mangga");
        cv.put(JAWA_INGGIL,"Sumangga");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Air");
        cv.put(JAWA_NGOKO,"Banyu");
        cv.put(JAWA_MADYA,"Toya");
        cv.put(JAWA_INGGIL,"Toya");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Ambil");
        cv.put(JAWA_NGOKO,"Jupuk");
        cv.put(JAWA_MADYA,"Mendhet");
        cv.put(JAWA_INGGIL,"Mundut");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Badan");
        cv.put(JAWA_NGOKO,"Awak");
        cv.put(JAWA_MADYA,"Badan");
        cv.put(JAWA_INGGIL,"Salira");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Bapak");
        cv.put(JAWA_NGOKO,"Bapak");
        cv.put(JAWA_MADYA,"Bapak");
        cv.put(JAWA_INGGIL,"Rama");
        db.insert("kamus",BAHASA_INDO,cv);
        //10
        cv.put(BAHASA_INDO,"Benar");
        cv.put(JAWA_NGOKO,"Bener");
        cv.put(JAWA_MADYA,"Keleresan");
        cv.put(JAWA_INGGIL,"Kasinggihan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Buang");
        cv.put(JAWA_NGOKO,"Buwang");
        cv.put(JAWA_MADYA,"Bucal");
        cv.put(JAWA_INGGIL,"Kendhang");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Bicara");
        cv.put(JAWA_NGOKO,"Catur/Nyatur");
        cv.put(JAWA_MADYA,"Nyatur");
        cv.put(JAWA_INGGIL,"Ngendika");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Bukan");
        cv.put(JAWA_NGOKO,"Dudu");
        cv.put(JAWA_MADYA,"Sanes");
        cv.put(JAWA_INGGIL,"Sanes");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Bawa");
        cv.put(JAWA_NGOKO,"Gawa");
        cv.put(JAWA_MADYA,"Bekta");
        cv.put(JAWA_INGGIL,"Ngasta");
        db.insert("kamus",BAHASA_INDO,cv);
        //15
        cv.put(BAHASA_INDO,"Buat");
        cv.put(JAWA_NGOKO,"Gawe");
        cv.put(JAWA_MADYA,"Damel");
        cv.put(JAWA_INGGIL,"Damel");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Besar");
        cv.put(JAWA_NGOKO,"Gedhe");
        cv.put(JAWA_MADYA,"Ageng");
        cv.put(JAWA_INGGIL,"Ageng");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Bisa");
        cv.put(JAWA_NGOKO,"Isa");
        cv.put(JAWA_MADYA,"Saged");
        cv.put(JAWA_INGGIL,"Saged");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Baju");
        cv.put(JAWA_NGOKO,"Klambi");
        cv.put(JAWA_MADYA,"Rasukan");
        cv.put(JAWA_INGGIL,"Ageman");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Baca");
        cv.put(JAWA_NGOKO,"Maca");
        cv.put(JAWA_MADYA,"Maos");
        cv.put(JAWA_INGGIL,"Maos");
        db.insert("kamus",BAHASA_INDO,cv);
        //20
        cv.put(BAHASA_INDO,"Tidak");
        cv.put(JAWA_NGOKO,"Ora");
        cv.put(JAWA_MADYA,"Boten");
        cv.put(JAWA_INGGIL,"Boten");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Boleh");
        cv.put(JAWA_NGOKO,"Oleh");
        cv.put(JAWA_MADYA,"Angsal");
        cv.put(JAWA_INGGIL,"Pikantuk");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Berani");
        cv.put(JAWA_NGOKO,"Wani");
        cv.put(JAWA_MADYA,"Wanton");
        cv.put(JAWA_INGGIL,"Wanton");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Beli");
        cv.put(JAWA_NGOKO,"Tuku");
        cv.put(JAWA_MADYA,"Tumbas");
        cv.put(JAWA_INGGIL,"Mundhut");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Cerita");
        cv.put(JAWA_NGOKO,"Carita");
        cv.put(JAWA_MADYA,"Cariyos");
        cv.put(JAWA_INGGIL,"Cariyos");
        db.insert("kamus",BAHASA_INDO,cv);
        //25
        cv.put(BAHASA_INDO,"Dahi");
        cv.put(JAWA_NGOKO,"Bathuk");
        cv.put(JAWA_MADYA,"Bathuk");
        cv.put(JAWA_INGGIL,"Palarapan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Dahulu");
        cv.put(JAWA_NGOKO,"Biyen");
        cv.put(JAWA_MADYA,"Riyin");
        cv.put(JAWA_INGGIL,"Rumiyin");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Dada");
        cv.put(JAWA_NGOKO,"Dhadha");
        cv.put(JAWA_MADYA,"Dhadha");
        cv.put(JAWA_INGGIL,"Jaja");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Daun");
        cv.put(JAWA_NGOKO,"Godhong");
        cv.put(JAWA_MADYA,"Ron");
        cv.put(JAWA_INGGIL,"Ron");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Duduk");
        cv.put(JAWA_NGOKO,"Lungguh");
        cv.put(JAWA_MADYA,"Lenggah");
        cv.put(JAWA_INGGIL,"Pinarak");
        db.insert("kamus",BAHASA_INDO,cv);
        //30
        cv.put(BAHASA_INDO,"Gula");
        cv.put(JAWA_NGOKO,"Gula");
        cv.put(JAWA_MADYA,"Gendhis");
        cv.put(JAWA_INGGIL,"Gendhis");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Gemuk");
        cv.put(JAWA_NGOKO,"Lemu");
        cv.put(JAWA_MADYA,"Lema");
        cv.put(JAWA_INGGIL,"Lema");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Hati");
        cv.put(JAWA_NGOKO,"Ati");
        cv.put(JAWA_MADYA,"Manah");
        cv.put(JAWA_INGGIL,"Penggalih");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Hidung");
        cv.put(JAWA_NGOKO,"Irung");
        cv.put(JAWA_MADYA,"Irung");
        cv.put(JAWA_INGGIL,"Grana");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Hujan");
        cv.put(JAWA_NGOKO,"Udan");
        cv.put(JAWA_MADYA,"Jawah");
        cv.put(JAWA_INGGIL,"Jawah");
        db.insert("kamus",BAHASA_INDO,cv);
    //35
        cv.put(BAHASA_INDO,"Hutang");
        cv.put(JAWA_NGOKO,"Utang");
        cv.put(JAWA_MADYA,"Nyambut");
        cv.put(JAWA_INGGIL,"Ngampil");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Hidup");
        cv.put(JAWA_NGOKO,"Urip");
        cv.put(JAWA_MADYA,"Gesang");
        cv.put(JAWA_INGGIL,"Sugeng");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Ingat");
        cv.put(JAWA_NGOKO,"Eling");
        cv.put(JAWA_MADYA,"Eling");
        cv.put(JAWA_INGGIL,"Emut");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Ini");
        cv.put(JAWA_NGOKO,"Iki");
        cv.put(JAWA_MADYA,"Niki");
        cv.put(JAWA_INGGIL,"Punika");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Iya");
        cv.put(JAWA_NGOKO,"Iya");
        cv.put(JAWA_MADYA,"Inggih");
        cv.put(JAWA_INGGIL,"Sendika");
        db.insert("kamus",BAHASA_INDO,cv);
    //40
        cv.put(BAHASA_INDO,"Itu");
        cv.put(JAWA_NGOKO,"Kuwi");
        cv.put(JAWA_MADYA,"Niku");
        cv.put(JAWA_INGGIL,"Punika");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Ikut");
        cv.put(JAWA_NGOKO,"Melu");
        cv.put(JAWA_MADYA,"Tumut");
        cv.put(JAWA_INGGIL,"Dherek");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Jauh");
        cv.put(JAWA_NGOKO,"Adoh");
        cv.put(JAWA_MADYA,"Tebih");
        cv.put(JAWA_INGGIL,"Tebih");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Jalan");
        cv.put(JAWA_NGOKO,"Dalan");
        cv.put(JAWA_MADYA,"Radosam");
        cv.put(JAWA_INGGIL,"Margi");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Jadi");
        cv.put(JAWA_NGOKO,"Dadi");
        cv.put(JAWA_MADYA,"Dados");
        cv.put(JAWA_INGGIL,"Dados");
        db.insert("kamus",BAHASA_INDO,cv);
    //45
        cv.put(BAHASA_INDO,"Berjalan");
        cv.put(JAWA_NGOKO,"Mlaku");
        cv.put(JAWA_MADYA,"Mlampah");
        cv.put(JAWA_INGGIL,"Tindak");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Kepala");
        cv.put(JAWA_NGOKO,"Endhas");
        cv.put(JAWA_MADYA,"Sirah");
        cv.put(JAWA_INGGIL,"Mustaka");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Kakak");
        cv.put(JAWA_NGOKO,"Kakang");
        cv.put(JAWA_MADYA,"Kakang");
        cv.put(JAWA_INGGIL,"Raka");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Kamu");
        cv.put(JAWA_NGOKO,"Kowe");
        cv.put(JAWA_MADYA,"Sampeyan");
        cv.put(JAWA_INGGIL,"Panjenengan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Kuku");
        cv.put(JAWA_NGOKO,"Kuku");
        cv.put(JAWA_MADYA,"Kuku");
        cv.put(JAWA_INGGIL,"Kenaka");
        db.insert("kamus",BAHASA_INDO,cv);
    //50
        cv.put(BAHASA_INDO,"Keluar");
        cv.put(JAWA_NGOKO,"Metu");
        cv.put(JAWA_MADYA,"Medal");
        cv.put(JAWA_INGGIL,"Miyos");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Lutut");
        cv.put(JAWA_NGOKO,"Dhengkul");
        cv.put(JAWA_MADYA,"Dhengkul");
        cv.put(JAWA_INGGIL,"Jengku");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Leher");
        cv.put(JAWA_NGOKO,"Gulu");
        cv.put(JAWA_MADYA,"Gulu");
        cv.put(JAWA_INGGIL,"Jangga");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Lupa");
        cv.put(JAWA_NGOKO,"Lali");
        cv.put(JAWA_MADYA,"Supe");
        cv.put(JAWA_INGGIL,"Kalimengan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Lahir");
        cv.put(JAWA_NGOKO,"Lair");
        cv.put(JAWA_MADYA,"Lair");
        cv.put(JAWA_INGGIL,"Miyos");
        db.insert("kamus",BAHASA_INDO,cv);
    //55
        cv.put(BAHASA_INDO,"Laki-laki");
        cv.put(JAWA_NGOKO,"Lanang");
        cv.put(JAWA_MADYA,"Jaler");
        cv.put(JAWA_INGGIL,"Kakung");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Lewat");
        cv.put(JAWA_NGOKO,"Liwat");
        cv.put(JAWA_MADYA,"Langkung");
        cv.put(JAWA_INGGIL,"Langkung");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Mandi");
        cv.put(JAWA_NGOKO,"Adus");
        cv.put(JAWA_MADYA,"Adus");
        cv.put(JAWA_INGGIL,"Siram");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Merah");
        cv.put(JAWA_NGOKO,"Abang");
        cv.put(JAWA_MADYA,"Abrit");
        cv.put(JAWA_INGGIL,"Abrit");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Mau");
        cv.put(JAWA_NGOKO,"Arep");
        cv.put(JAWA_MADYA,"Ajeng");
        cv.put(JAWA_INGGIL,"Kersa");
        db.insert("kamus",BAHASA_INDO,cv);
    //60
        cv.put(BAHASA_INDO,"Main");
        cv.put(JAWA_NGOKO,"Dolan");
        cv.put(JAWA_MADYA,"Dolan");
        cv.put(JAWA_INGGIL,"Ameng-ameng");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Malu");
        cv.put(JAWA_NGOKO,"Isin");
        cv.put(JAWA_MADYA,"Isin");
        cv.put(JAWA_INGGIL,"Lingsem");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Minta");
        cv.put(JAWA_NGOKO,"Jaluk");
        cv.put(JAWA_MADYA,"Nedhi");
        cv.put(JAWA_INGGIL,"Nyuwun");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Menyuruh");
        cv.put(JAWA_NGOKO,"Kongkon");
        cv.put(JAWA_MADYA,"Kengken");
        cv.put(JAWA_INGGIL,"Dhawuh");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Mahal");
        cv.put(JAWA_NGOKO,"Larang");
        cv.put(JAWA_MADYA,"Awis");
        cv.put(JAWA_INGGIL,"Awis");
        db.insert("kamus",BAHASA_INDO,cv);
    //65
        cv.put(BAHASA_INDO,"Mata");
        cv.put(JAWA_NGOKO,"Mripat");
        cv.put(JAWA_MADYA,"Mripat");
        cv.put(JAWA_INGGIL,"Paningal");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Makan");
        cv.put(JAWA_NGOKO,"Mangan");
        cv.put(JAWA_MADYA,"Nedha");
        cv.put(JAWA_INGGIL,"Dhahar");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Menuju");
        cv.put(JAWA_NGOKO,"Menyang");
        cv.put(JAWA_MADYA,"Dhateng");
        cv.put(JAWA_INGGIL,"Tindak");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Malam");
        cv.put(JAWA_NGOKO,"Wengi");
        cv.put(JAWA_MADYA,"Dalu");
        cv.put(JAWA_INGGIL,"Dalu");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Minum");
        cv.put(JAWA_NGOKO,"Ngombe");
        cv.put(JAWA_MADYA,"Nginum");
        cv.put(JAWA_INGGIL,"Ngunjuk");
        db.insert("kamus",BAHASA_INDO,cv);
    //70
        cv.put(BAHASA_INDO,"Nama");
        cv.put(JAWA_NGOKO,"Jeneng");
        cv.put(JAWA_MADYA,"Nami");
        cv.put(JAWA_INGGIL,"Asma");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Ngomong");
        cv.put(JAWA_NGOKO,"Kandha");
        cv.put(JAWA_MADYA,"Sanjang");
        cv.put(JAWA_INGGIL,"Ngendika");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Nasi");
        cv.put(JAWA_NGOKO,"Sega");
        cv.put(JAWA_MADYA,"Sekul");
        cv.put(JAWA_INGGIL,"Sekul");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Oleh");
        cv.put(JAWA_NGOKO,"Marang");
        cv.put(JAWA_MADYA,"Dhateng");
        cv.put(JAWA_INGGIL,"Katur");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Pegang");
        cv.put(JAWA_NGOKO,"Cekel");
        cv.put(JAWA_MADYA,"Nyepeng");
        cv.put(JAWA_INGGIL,"Ngasta");
        db.insert("kamus",BAHASA_INDO,cv);
    //75
        cv.put(BAHASA_INDO,"Punya");
        cv.put(JAWA_NGOKO,"Duwe");
        cv.put(JAWA_MADYA,"Gadhah");
        cv.put(JAWA_INGGIL,"Kagungan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Pagi");
        cv.put(JAWA_NGOKO,"Esuk");
        cv.put(JAWA_MADYA,"Enjing");
        cv.put(JAWA_INGGIL,"Enjing");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Punggung");
        cv.put(JAWA_NGOKO,"Geger");
        cv.put(JAWA_MADYA,"Geger");
        cv.put(JAWA_INGGIL,"Pengkeran");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Pakai");
        cv.put(JAWA_NGOKO,"Nganggo");
        cv.put(JAWA_MADYA,"Ndamel");
        cv.put(JAWA_INGGIL,"Ngagem");
        db.insert("kamus",BAHASA_INDO,cv);
    //80
        cv.put(BAHASA_INDO,"Pinjam");
        cv.put(JAWA_NGOKO,"Nyilih");
        cv.put(JAWA_MADYA,"Nyambut");
        cv.put(JAWA_INGGIL,"Ngampil");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Panas");
        cv.put(JAWA_NGOKO,"Panas");
        cv.put(JAWA_MADYA,"Benter");
        cv.put(JAWA_INGGIL,"Benter");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Perempuan");
        cv.put(JAWA_NGOKO,"Wadon");
        cv.put(JAWA_MADYA,"Estri");
        cv.put(JAWA_INGGIL,"Estri");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Rasa");
        cv.put(JAWA_NGOKO,"Rasa");
        cv.put(JAWA_MADYA,"Raos");
        cv.put(JAWA_INGGIL,"Raos");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Rambut");
        cv.put(JAWA_NGOKO,"Rambut");
        cv.put(JAWA_MADYA,"Rambut");
        cv.put(JAWA_INGGIL,"Rikma");
        db.insert("kamus",BAHASA_INDO,cv);
    //85
        cv.put(BAHASA_INDO,"Rusak");
        cv.put(JAWA_NGOKO,"Rusak");
        cv.put(JAWA_MADYA,"Risak");
        cv.put(JAWA_INGGIL,"Risak");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Sendiri");
        cv.put(JAWA_NGOKO,"Dhewe");
        cv.put(JAWA_MADYA,"Piyambak");
        cv.put(JAWA_INGGIL,"Piyambak");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Semua");
        cv.put(JAWA_NGOKO,"Kabeh");
        cv.put(JAWA_MADYA,"Sedaya");
        cv.put(JAWA_INGGIL,"Sedanten");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Sedang");
        cv.put(JAWA_NGOKO,"Lagi");
        cv.put(JAWA_MADYA,"Saweg");
        cv.put(JAWA_INGGIL,"Nembe");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Sakit");
        cv.put(JAWA_NGOKO,"Lara");
        cv.put(JAWA_MADYA,"Sakit");
        cv.put(JAWA_INGGIL,"Gerah");
        db.insert("kamus",BAHASA_INDO,cv);
    //90
        cv.put(BAHASA_INDO,"Sehat");
        cv.put(JAWA_NGOKO,"Waras");
        cv.put(JAWA_MADYA,"Saras");
        cv.put(JAWA_INGGIL,"Waluya");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Telinga");
        cv.put(JAWA_NGOKO,"Kuping");
        cv.put(JAWA_MADYA,"Kuping");
        cv.put(JAWA_INGGIL,"Lathi");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Tanya");
        cv.put(JAWA_NGOKO,"Takon");
        cv.put(JAWA_MADYA,"Taken");
        cv.put(JAWA_INGGIL,"Nyuwun Pirsa");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Tidur");
        cv.put(JAWA_NGOKO,"Turu");
        cv.put(JAWA_MADYA,"Tilem");
        cv.put(JAWA_INGGIL,"Sare");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Turun");
        cv.put(JAWA_NGOKO,"Medhun");
        cv.put(JAWA_MADYA,"Mandhap");
        cv.put(JAWA_INGGIL,"Mandhap");
        db.insert("kamus",BAHASA_INDO,cv);
    //95
        cv.put(BAHASA_INDO,"Uang");
        cv.put(JAWA_NGOKO,"Dhuwit");
        cv.put(JAWA_MADYA,"Yatra");
        cv.put(JAWA_INGGIL,"Artha");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Untuk");
        cv.put(JAWA_NGOKO,"Kanggo");
        cv.put(JAWA_MADYA,"Kangge");
        cv.put(JAWA_INGGIL,"Kagem");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Utuh");
        cv.put(JAWA_NGOKO,"Wutuh");
        cv.put(JAWA_MADYA,"Wetah");
        cv.put(JAWA_INGGIL,"Wetah");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Umur");
        cv.put(JAWA_NGOKO,"Umur");
        cv.put(JAWA_MADYA,"Umur");
        cv.put(JAWA_INGGIL,"Yuswa");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Wajah");
        cv.put(JAWA_NGOKO,"Rai");
        cv.put(JAWA_MADYA,"Rai");
        cv.put(JAWA_INGGIL,"Pasuryan");
        db.insert("kamus",BAHASA_INDO,cv);

        cv.put(BAHASA_INDO,"Waktu");
        cv.put(JAWA_NGOKO,"Wayah");
        cv.put(JAWA_MADYA,"Wanci");
        cv.put(JAWA_INGGIL,"Wanci");
        db.insert("kamus",BAHASA_INDO,cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }
}
