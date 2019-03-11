package com.ar.dev.deeneislam.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.ar.dev.deeneislam.R;


public class MainActivity extends AppCompatActivity {

    public static final String KALMA = "kalma";
    private Button k1, k2, k3, k4, k5, k6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("  Deen e Islam");
        actionBar.setDisplayShowHomeEnabled(true);

        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setLogo(R.mipmap.app_logo_round);
    }

    public void onClicked99Names(View view) {
        startActivity(new Intent(this, NamesofAllahActivity.class));
    }

    public void onClickedKalma(View view) {
        Intent intent = new Intent(this, ShowKalmaActivity.class);
        startActivity(intent);
    }

    public void onClickedSalahCategory(View view) {
        startActivity(new Intent(this,SalahCategoryActivity.class));
    }

    public void onClickedQuiz(View view) {
        startActivity(new Intent(this,QuizActivity.class));
    }

    public void onClickedCompass(View view) {
        startActivity(new Intent(this,CompassActivity.class));
    }

    public void onClickedSurah(View view) {
        startActivity(new Intent(this,QuranActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_developer) {
            Dialog dialog = new Dialog(this);
            dialog.setContentView(R.layout.developer_dialog);
            dialog.show();

            ImageView img = dialog.findViewById(R.id.imageViewDeveloper);
            Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.devimage);
            RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
            roundedBitmapDrawable.setCircular(true);
            img.setImageDrawable(roundedBitmapDrawable);
        }

        return super.onOptionsItemSelected(item);
    }
}
