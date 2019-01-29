package com.example.aartilakkad.myapplication.DateTask;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TimePicker;


import com.example.aartilakkad.myapplication.R;

import java.util.Calendar;

import static android.media.CamcorderProfile.get;

public class DateTaskActivity extends AppCompatActivity {
    Button button;
    EditText Date, Time;
    ImageView imageView,imageView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_task);
        button=(Button)findViewById(R.id.buttonPanel);
        Date=(EditText)findViewById(R.id.date1);
        Time=(EditText)findViewById(R.id.Time1);
        imageView=(ImageView)findViewById(R.id.image1);
        imageView1=(ImageView)findViewById(R.id.image2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date.setVisibility(View.VISIBLE);
                Time.setVisibility(View.VISIBLE);
            }
        });
        Time.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    Calendar mcurrenttime = Calendar.getInstance();
                    int hour = mcurrenttime.get(Calendar.HOUR_OF_DAY);
                    int minute = mcurrenttime.get(Calendar.MINUTE);

                    TimePickerDialog timePickerDialog;

                    timePickerDialog = new TimePickerDialog(DateTaskActivity.this, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                            Time.setText(hourOfDay + ":" + minute);

                        }
                    }, hour, minute, true);

                    timePickerDialog.setTitle("Select Time");
                    timePickerDialog.show();
                }
            }

        });
        Date.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus)
                {
                    Calendar calendar=Calendar.getInstance();

                    int day=calendar.get(Calendar.DAY_OF_WEEK);
                    int month=calendar.get(Calendar.MONTH);
                    int year=calendar.get(Calendar.YEAR);

                    DatePickerDialog datePickerDialog;

                    datePickerDialog=new DatePickerDialog(DateTaskActivity.this, new DatePickerDialog.OnDateSetListener() {
                        @Override
                        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                            Date.setText(dayOfMonth+"/"+month+"/"+year);
                        }
                    },day,year,month);

                    datePickerDialog.setTitle("Select Date");
                    datePickerDialog.show();
                }
            }
        });
    }
}

