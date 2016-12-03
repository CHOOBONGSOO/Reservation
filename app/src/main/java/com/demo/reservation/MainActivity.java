package com.demo.reservation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

class MainActivity extends AppCompatActivity implements {
    TextView tv_today;
    RadioButton rd_date,rd_time;
    CalendarView cal;
    TimePicker time;
    Button bt_reserve;
    TextView tv_year,tv_month,tv_day,tv_hour,tv_min;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_day = (TextView)findViewById(R.id.tv_today);
        tv_hour = (TextView)findViewById(R.id.tv_hour);
        tv_min = (TextView)findViewById(R.id.tv_min);
        rd_date.setOnClickListener(this);
        rd_time.setOnClickListener(this);
        bt_reserve.setOnClickListener(this);
        
    }
}
