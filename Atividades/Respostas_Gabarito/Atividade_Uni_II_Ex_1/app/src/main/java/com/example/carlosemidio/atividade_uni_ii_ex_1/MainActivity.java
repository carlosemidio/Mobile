package com.example.carlosemidio.atividade_uni_ii_ex_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity implements DatePicker.setDateListener, TimePicker.setTimeListener{
    private GregorianCalendar calendar = new GregorianCalendar();
    private TextView data;
    private TextView hora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.data = findViewById(R.id.data);
        this.hora = findViewById(R.id.hora);
    }

    public void openDate(View view) {
        DatePicker datePicker = new DatePicker();
        datePicker.show(getFragmentManager(),"datePicker");
    }


    public void openTime(View view) {
        TimePicker timePicker = new TimePicker();
        timePicker.show(getFragmentManager(),"timePicker");
    }

    @Override
    public void setDate(String date) {
        this.data.setText(date);
    }

    @Override
    public void setTime(String time) {
        this.hora.setText(time);
    }
}