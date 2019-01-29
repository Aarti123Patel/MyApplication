package com.example.aartilakkad.myapplication.Date;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

import com.example.aartilakkad.myapplication.R;

import java.sql.Time;
import java.util.Calendar;

public class DateActivity extends AppCompatActivity {

    EditText Time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        Time = (EditText)findViewById(R.id.edittext);
        Time.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
          public void onFocusChange(View view, boolean hasFocus) {

              if (hasFocus)
              {
                  Calendar mcuurentTime = Calendar.getInstance();

                  int hour= mcuurentTime.get(Calendar.HOUR_OF_DAY);
                  int minute= mcuurentTime.get(Calendar.MINUTE);

                  TimePickerDialog mTimepicker;
                  mTimepicker=new TimePickerDialog(DateActivity.this, new TimePickerDialog.OnTimeSetListener() {
                      @Override
                      public void onTimeSet(TimePicker timePicker, int Hour, int Minute) {
                          Time.setText(Hour+":"+Minute);
                      }
                  },hour,minute,true);
                  mTimepicker.setTitle("select time");
                  mTimepicker.show();
              }

          }
      });

    }
}
