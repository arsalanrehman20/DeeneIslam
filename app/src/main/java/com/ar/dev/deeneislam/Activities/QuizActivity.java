package com.ar.dev.deeneislam.Activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.ar.dev.deeneislam.R;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {

    private int i = 0, counter = 0;

    private TextView tvQuesNo, tvQues;
    private Button op1, op2, op3, op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Islamic Quiz");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        tvQuesNo = findViewById(R.id.tvQuesNo);
        tvQues = findViewById(R.id.tvQues);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        op4 = findViewById(R.id.op4);

        op1.setOnClickListener(this);
        op2.setOnClickListener(this);
        op3.setOnClickListener(this);
        op4.setOnClickListener(this);

        tvQuesNo.setText("Question : " + (++i));
        tvQues.setText("Pillars of Islam are called ?");
        op1.setText("Arkanal Islam");
        op2.setText("Qadr ul Islam");
        op3.setText("Fi Amanillah");
        op4.setText("Yusuf Islam");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v == op1) {
            if (i == 1 || i == 3 || i == 5 || i == 9) {
                counter += 10;
            }
            i++;
            changeQuesOpt();
        } else if (v == op2) {
            if (i == 2 || i == 6 || i == 8 || i == 10) {
                counter += 10;
            }
            i++;
            changeQuesOpt();
        } else if (v == op3) {
            i++;
            changeQuesOpt();
        } else if (v == op4) {
            if (i == 4 || i == 7) {
                counter += 10;
            }
            i++;
            changeQuesOpt();
        }

        if (v == op1 || v == op2 || v == op3 || v == op4) {
            if (i == 11) {
                final Dialog dialog = new Dialog(this);
                dialog.setContentView(R.layout.score_dialog);
                dialog.show();

                TextView tvScore = dialog.findViewById(R.id.tvScore);
                tvScore.setText(String.valueOf(counter));
                Button back = dialog.findViewById(R.id.btnBack);
                back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        finish();
                    }
                });
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public void onDismiss(DialogInterface dialog) {
                        finish();
                    }
                });
            }
        }

    }

    private void changeQuesOpt() {
        if (i <= 10)
            tvQuesNo.setText("Question : " + i);
        if (i == 2) {
            tvQues.setText("What is the first month of Islamic Calender ?");
            op1.setText("Shawwal");
            op2.setText("Muharram");
            op3.setText("Thul Qiddah");
            op4.setText("Thul Hijjah");
        } else if (i == 3) {
            tvQues.setText("The Holy Kabab is located in ? ");
            op1.setText("Makkah");
            op2.setText("Medinah");
            op3.setText("Al Khobar");
            op4.setText("Jeddah");
        } else if (i == 4) {
            tvQues.setText("What does Prophet Mussa's Stick turns into ?");
            op1.setText("Bird");
            op2.setText("Tiger");
            op3.setText("Camel");
            op4.setText("Snake");
        } else if (i == 5) {
            tvQues.setText("What are the companions of Prophet called ?");
            op1.setText("Shahabah");
            op2.setText("Friends");
            op3.setText("Ansar");
            op4.setText("None of the Above");
        } else if (i == 6) {
            tvQues.setText("How many pillars of Islam are there ? ");
            op1.setText("One");
            op2.setText("Five");
            op3.setText("Six");
            op4.setText("Three");
        } else if (i == 7) {
            tvQues.setText("When do we pray fajar ? ");
            op1.setText("At night");
            op2.setText("After sunrise");
            op3.setText("Afternoon");
            op4.setText("Before sunrise");
        } else if (i == 8) {
            tvQues.setText("When do we Muslims observe fasting (Sawm) for a month ?");
            op1.setText("Month of Rajjab");
            op2.setText("Month of Ramadhan");
            op3.setText("Month of Sha'ban");
            op4.setText("Month of Dil-Hijjah");
        } else if (i == 9) {
            tvQues.setText("How many times does a Muslim offer Obligatory Prayers (Salah) in a day ?");
            op1.setText("Five Times");
            op2.setText("Seven Times");
            op3.setText("Two Times");
            op4.setText("Three Times");
        } else if (i == 10) {
            tvQues.setText("Which one of the Pillars is considered as the most important Pillar in Islam ?");
            op1.setText("Prayers (Salah)");
            op2.setText("Belief (Shahadad)");
            op3.setText("Fasting (Sawm)");
            op4.setText("Pilgrimage (Hajj)");
        }
    }
}
