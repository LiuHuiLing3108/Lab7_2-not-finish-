package com.example.lab7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText ed_height, ed_weigth;
    private RadioButton btn_boy;
    private TextView tv_weight, tv_bmi, tv_progress;
    private LinearLayout ll_progress;
    private ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_height = findViewById(R.id.ed_height);
        ed_weigth = findViewById(R.id.ed_weight);
        btn_boy = findViewById(R.id.btn_boy);
        tv_weight = findViewById(R.id.tv_weight);
        tv_bmi = findViewById(R.id.tv_bmi);
        tv_progress = findViewById(R.id.tv_progress);
        ll_progress = findViewById(R.id.ll_progress);
        progressBar2 = findViewById(R.id.progressBar2);

        findViewById(R.id.btn_calculate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ed_height.length()<1)
                    Toast.makeText(MainActivity.this,"請輸入身高",Toast.LENGTH_SHORT).show();
                else if (ed_weigth.length()<1)
                    Toast.makeText(MainActivity.this,"請輸入體重",Toast.LENGTH_SHORT).show();
                else
                    runAsyncTask();
            }
        });
    }

    @SuppressLint("StaticFieldLeak")
    private void runAsyncTask(){
        new AsyncTask<Void, Integer, Boolean>(){
            @Override
            protected void onPreExcute(){
                super.onPreExecute();
                tv_weight.setText("標準體重\n無");
                tv_bmi.setText("體脂肪\n無");
                progressBar2.setProgress(0);
                tv_progress.setText("0%");
                ll_progress.setVisibility(View.VISIBLE);
            }
            @Override
            protected Boolean doInBackground(Void){
                int progress = 0;
            }
        }
    }
}