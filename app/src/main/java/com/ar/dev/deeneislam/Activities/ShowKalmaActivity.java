package com.ar.dev.deeneislam.Activities;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.TextView;

import com.ar.dev.deeneislam.R;

public class ShowKalmaActivity extends AppCompatActivity {

    private TextView textArabic1, textKalma1, textTranslation1, textHeading1;
    private TextView textArabic2, textKalma2, textTranslation2, textHeading2;
    private TextView textArabic3, textKalma3, textTranslation3, textHeading3;
    private TextView textArabic4, textKalma4, textTranslation4, textHeading4;
    private TextView textArabic5, textKalma5, textTranslation5, textHeading5;
    private TextView textArabic6, textKalma6, textTranslation6, textHeading6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_kalma);

        textArabic1 = findViewById(R.id.tvArabic1);
        textKalma1 = findViewById(R.id.tvKalma1);
        textTranslation1 = findViewById(R.id.tvTranslation1);
        textHeading1 = findViewById(R.id.tvKalmaHeading1);

        textArabic2 = findViewById(R.id.tvArabic2);
        textKalma2 = findViewById(R.id.tvKalma2);
        textTranslation2 = findViewById(R.id.tvTranslation2);
        textHeading2 = findViewById(R.id.tvKalmaHeading2);


        textArabic3 = findViewById(R.id.tvArabic3);
        textKalma3 = findViewById(R.id.tvKalma3);
        textTranslation3 = findViewById(R.id.tvTranslation3);
        textHeading3 = findViewById(R.id.tvKalmaHeading3);

        textArabic4 = findViewById(R.id.tvArabic4);
        textKalma4 = findViewById(R.id.tvKalma4);
        textTranslation4 = findViewById(R.id.tvTranslation4);
        textHeading4 = findViewById(R.id.tvKalmaHeading4);

        textArabic5 = findViewById(R.id.tvArabic5);
        textKalma5 = findViewById(R.id.tvKalma5);
        textTranslation5 = findViewById(R.id.tvTranslation5);
        textHeading5 = findViewById(R.id.tvKalmaHeading5);

        textArabic6 = findViewById(R.id.tvArabic6);
        textKalma6 = findViewById(R.id.tvKalma6);
        textTranslation6 = findViewById(R.id.tvTranslation6);
        textHeading6 = findViewById(R.id.tvKalmaHeading6);


        textHeading1.setText("Kalma Tayyab");
        textArabic1.setText("لَا إِلٰهَ إِلَّا الله مُحَمَّدٌ رَسُولُ الله");
        textKalma1.setText(R.string.first_kalma);
        textTranslation1.setText(R.string.first_kalma_T);

        textHeading2.setText("Kalma Shahadat");
        textArabic2.setText("أَشْهَدُ أنْ لا إلَٰهَ إِلَّا اللهُ وَحْدَهُ لَا شَرِيْكَ لَهُ وَأشْهَدُ أنَّ مُحَمَّدًا عَبْدُهُ وَرَسُولُهُ");
        textKalma2.setText(R.string.second_kalma);
        textTranslation2.setText(R.string.second_kalma_T);

        textHeading3.setText("Kalma Tamjeed");
        textArabic3.setText("سُبْحَان اللهِ وَالْحَمْدُلِلّهِ وَلا إِلهَ إِلّااللّهُ وَاللّهُ أكْبَرُ وَلا حَوْلَ وَلاَ قُوَّةَ إِلَّا بِاللّهِ الْعَلِيِّ الْعَظِيْم");
        textKalma3.setText(R.string.third_kalma);
        textTranslation3.setText(R.string.third_kalma_T);

        textHeading4.setText("Kalma Touheed");
        textArabic4.setText("آ اِلٰهَ اِلَّا اللهُ وَحْدَهٗ لَا شَرِيْكَ لَهٗ لَهُ الْمُلْكُ وَ لَهُ الْحَمْدُ يُحْىٖ وَ يُمِيْتُ وَ هُوَحَیٌّ لَّا يَمُوْتُ اَبَدًا اَبَدًاؕ ذُو الْجَلَالِ وَالْاِكْرَامِؕ بِيَدِهِ الْخَيْرُؕ وَهُوَ عَلٰى كُلِّ شیْ ٍٔ قَدِیْرٌؕ");
        textKalma4.setText(R.string.forth_kalma);
        textTranslation4.setText(R.string.forth_kalma_T);

        textHeading5.setText("Kalma Astaghfaar");
        textArabic5.setText("اَسْتَغْفِرُ اللهَ رَبِّىْ مِنْ كُلِّ ذَنْۢبٍ اَذْنَبْتُهٗ عَمَدًا اَوْ خَطَا ًٔ سِرًّا اَوْ عَلَانِيَةً وَّاَتُوْبُ اِلَيْهِ مِنَ الذَّنْۢبِ الَّذِیْٓ اَعْلَمُ وَ مِنَ الذَّنْۢبِ الَّذِىْ لَآ اَعْلَمُ اِنَّكَ اَنْتَ عَلَّامُ الْغُيُوْبِ وَ سَتَّارُ الْعُيُوْبِ و َغَفَّارُ الذُّنُوْبِ وَ لَا حَوْلَ وَلَا قُوَّةَ اِلَّا بِاللهِ الْعَلِىِّ الْعَظِيْمِؕ");
        textKalma5.setText(R.string.fifth_kalma);
        textTranslation5.setText(R.string.fifth_kalma_T);

        textHeading6.setText("Kalma Radd-e-Kufar");
        textArabic6.setText("اَللّٰهُمَّ اِنِّیْٓ اَعُوْذُ بِكَ مِنْ اَنْ اُشْرِكَ بِكَ شَيْئًا وَّاَنَآ اَعْلَمُ بِهٖ وَ اَسْتَغْفِرُكَ لِمَا لَآ اَعْلَمُ بِهٖ تُبْتُ عَنْهُ وَ تَبَرَّأْتُ مِنَ الْكُفْرِ وَ الشِّرْكِ وَ الْكِذْبِ وَ الْغِيْبَةِ وَ الْبِدْعَةِ وَ النَّمِيْمَةِ وَ الْفَوَاحِشِ وَ الْبُهْتَانِ وَ الْمَعَاصِىْ كُلِّهَا وَ اَسْلَمْتُ وَ اَقُوْلُ لَآ اِلٰهَ اِلَّا اللهُ مُحَمَّدٌ رَّسُوْلُ اللهِؕ");
        textKalma6.setText(R.string.sixth_kalma);
        textTranslation6.setText(R.string.sixth_kalma_T);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Islamic Kalma");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
