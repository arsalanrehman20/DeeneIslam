package com.ar.dev.deeneislam.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.ImageView;

import com.ar.dev.deeneislam.R;

public class ShowSurahActivity extends AppCompatActivity {

    private ImageView imageSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_surah);

        imageSurah=findViewById(R.id.imageSurah);
        Bundle receiveSurahName = getIntent().getExtras();

        if(receiveSurahName != null){
            if(receiveSurahName.getString("SURAH NAME").equals("Surah Fatiha"))
                imageSurah.setImageResource(R.drawable.surahalfatihah);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Naas"))
                imageSurah.setImageResource(R.drawable.surahenaas);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Falak"))
                imageSurah.setImageResource(R.drawable.surahefalak);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Ikhlas"))
                imageSurah.setImageResource(R.drawable.surahikhlas);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Lahab"))
                imageSurah.setImageResource(R.drawable.surahlahab);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Nasar"))
                imageSurah.setImageResource(R.drawable.surahenasar);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Khafirun"))
                imageSurah.setImageResource(R.drawable.surahkafirun);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Kawsar"))
                imageSurah.setImageResource(R.drawable.surahkawsar);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Maun"))
                imageSurah.setImageResource(R.drawable.surahalmaun);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Quraish"))
                imageSurah.setImageResource(R.drawable.surahquraish);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al fill"))
                imageSurah.setImageResource(R.drawable.surahfeel);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Humaza"))
                imageSurah.setImageResource(R.drawable.surahhumaza);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Asar"))
                imageSurah.setImageResource(R.drawable.surahasr);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Takasur"))
                imageSurah.setImageResource(R.drawable.surahtakasur);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Qaria"))
                imageSurah.setImageResource(R.drawable.surahqaria);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Adiyat"))
                imageSurah.setImageResource(R.drawable.surahadiyat);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Zalzala"))
                imageSurah.setImageResource(R.drawable.surahjaljalalah);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Baiyina"))
                imageSurah.setImageResource(R.drawable.surahalbaiyina);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Qadr"))
                imageSurah.setImageResource(R.drawable.surahalqadr);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Alaq"))
                imageSurah.setImageResource(R.drawable.surahalalaq);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Tin"))
                imageSurah.setImageResource(R.drawable.surahattin);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Sharh"))
                imageSurah.setImageResource(R.drawable.surahalsharh);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Adh Dhuha"))
                imageSurah.setImageResource(R.drawable.surahadhdhuha);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Lail"))
                imageSurah.setImageResource(R.drawable.surahallail);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Ash Shams"))
                imageSurah.setImageResource(R.drawable.surahashshams);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Balad"))
                imageSurah.setImageResource(R.drawable.surahbalad);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Fajr"))
                imageSurah.setImageResource(R.drawable.surahafajr);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Gashiya"))
                imageSurah.setImageResource(R.drawable.surahalgashiya);
            else if(receiveSurahName.getString("SURAH NAME").equals("urah Al A’la"))
                imageSurah.setImageResource(R.drawable.surahalala);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Tariq"))
                imageSurah.setImageResource(R.drawable.surahattariq);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Buruj"))
                imageSurah.setImageResource(R.drawable.surahalburuj);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Inshiqaq"))
                imageSurah.setImageResource(R.drawable.surahalinshiqaq84);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Mutaffife"))
                imageSurah.setImageResource(R.drawable.surahalmutaffife83);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Infitar"))
                imageSurah.setImageResource(R.drawable.surahalinfitar82);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Takwir"))
                imageSurah.setImageResource(R.drawable.surahattakwir81);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Abasa"))
                imageSurah.setImageResource(R.drawable.surahabasa80);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah An Nazi’at"))
                imageSurah.setImageResource(R.drawable.surahannaziat79);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah An Nabaa"))
                imageSurah.setImageResource(R.drawable.surahannabaa78);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Mursalat"))
                imageSurah.setImageResource(R.drawable.surahalmursalat77);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Ad Dahr"))
                imageSurah.setImageResource(R.drawable.surahdahr76);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Qiyamat"))
                imageSurah.setImageResource(R.drawable.surahalqiyamat75);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Muddaththir"))
                imageSurah.setImageResource(R.drawable.surahalmuddaththir74);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Muzammil"))
                imageSurah.setImageResource(R.drawable.surahalmuzzammil73);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Jinn"))
                imageSurah.setImageResource(R.drawable.surahjinn72);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Nuh"))
                imageSurah.setImageResource(R.drawable.surahnuh71);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Ma’arij"))
                imageSurah.setImageResource(R.drawable.surahalmaarij70);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Haqqa"))
                imageSurah.setImageResource(R.drawable.surahhaqqa69);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Qalam"))
                imageSurah.setImageResource(R.drawable.surahqalam68);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Mulk"))
                imageSurah.setImageResource(R.drawable.surahmlk67);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Tahrim"))
                imageSurah.setImageResource(R.drawable.surahtahrim66);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Talaq"))
                imageSurah.setImageResource(R.drawable.surahtlq65);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah At Tagabun"))
                imageSurah.setImageResource(R.drawable.surahtagabun64);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Munafiqun"))
                imageSurah.setImageResource(R.drawable.surahmunafiqun63);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Jumu’a"))
                imageSurah.setImageResource(R.drawable.surahjumua62);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah As Saff"))
                imageSurah.setImageResource(R.drawable.surahsaff61);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Mumtahana"))
                imageSurah.setImageResource(R.drawable.surahm60);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Hashr"))
                imageSurah.setImageResource(R.drawable.surahhashr59);
            else if(receiveSurahName.getString("SURAH NAME").equals("Surah Al Mujadila"))
                imageSurah.setImageResource(R.drawable.surahmjdla58);
        }
    }
}
