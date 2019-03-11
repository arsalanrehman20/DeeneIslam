package com.ar.dev.deeneislam.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.ar.dev.deeneislam.R;

public class SalahCategoryActivity extends AppCompatActivity {

    public static int flag;
    private Button btnWuzu, btnSalahMen, btnSalahWomen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salah_category);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("How to Pray : Salah");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);

        btnWuzu = findViewById(R.id.btnWudu);
        btnSalahMen = findViewById(R.id.btnSalahMen);
        btnSalahWomen = findViewById(R.id.btnSalahWomen);

        btnWuzu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(v.getContext());
                dialog.setContentView(R.layout.wuzu_dialog);
                dialog.show();
            }
        });

        final Intent intent = new Intent(this, ShowSalahActivity.class);

        btnSalahMen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 0;
                startActivity(intent);
            }
        });

        btnSalahWomen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = 1;
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
