package com.example.administrator.timing2;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button btn_start_time;
    private TextView tv_start_time;
    private Button btn_stop_time;
    private TextView tv_stop_time;

    private  int hour;
    private  int minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        setTitle("定时一");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_start_time = findViewById(R.id.start_time_tv);
        btn_start_time = findViewById(R.id.start_time_btn);
        btn_start_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                        tv_start_time.setText(hour+ ":"+minute);
                    }
                }, hour, minute,true).show();

            }
        });


        tv_stop_time = findViewById(R.id.stop_time_tv);
        btn_stop_time = findViewById(R.id.stop_time_btn);
        btn_stop_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hour, int minute) {
                        tv_stop_time.setText(hour+":"+minute);
                    }
                },hour,minute,true).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.item,menu);
        return true;
}

}
