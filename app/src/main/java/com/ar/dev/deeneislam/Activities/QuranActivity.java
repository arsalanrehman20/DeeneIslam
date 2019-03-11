package com.ar.dev.deeneislam.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.ar.dev.deeneislam.R;

public class QuranActivity extends AppCompatActivity {

    private String[] Surah = new String[]{"Surah Fatiha", "Surah Naas", "Surah Falak", "Surah Ikhlas",
            "Surah Lahab", "Surah Nasar", "Surah Al Khafirun", "Surah Kawsar",
            "Surah Al Maun", "Surah Al Quraish", "Surah Al fill", "Surah Al Humaza",
            "Surah Al Asar", "Surah At Takasur", "Surah Al Qaria", "Surah Adiyat",
            "Surah Zalzala", "Surah Al Baiyina", "Surah Al Qadr", "Surah Al Alaq",
            "Surah At Tin", "Surah Al Sharh", "Surah Adh Dhuha", "Surah Al Lail",
            "Surah Ash Shams", "Surah Al Balad", "Surah Al Fajr", "Surah Al Gashiya",
            "Surah Al A’la", "Surah At Tariq", "Surah Al Buruj", "Surah Al Inshiqaq",
            "Surah Al Mutaffife", "Surah Al Infitar", "Surah At Takwir", "Surah Abasa",
            "Surah An Nazi’at", "Surah An Nabaa", "Surah Al Mursalat", "Surah Ad Dahr",
            "Surah Al Qiyamat", "Surah Al Muddaththir", "Surah Al Muzammil", "Surah Al Jinn",
            "Surah Nuh", "Surah Al Ma’arij", "Surah Al Haqqa", "Surah Al Qalam", "Surah Al Mulk",
            "Surah At Tahrim", "Surah At Talaq", "Surah At Tagabun", "Surah Al Munafiqun",
            "Surah Al Jumu’a", "Surah As Saff", "Surah Al Mumtahana", "Surah Al Hashr",
            "Surah Al Mujadila"};
    private ListView ListSurah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Holy Quran");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        ListSurah = findViewById(R.id.listSurah);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Surah);
        ListSurah.setAdapter(adapter);

        ListSurah.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(QuranActivity.this,ShowSurahActivity.class);
                intent.putExtra("SURAH NAME",ListSurah.getItemAtPosition(position).toString());
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
