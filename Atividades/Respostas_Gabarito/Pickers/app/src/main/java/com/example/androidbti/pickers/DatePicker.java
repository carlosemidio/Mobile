package com.example.androidbti.pickers;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.Toast;

import java.util.GregorianCalendar;

/**
 * Created by android.bti on 24/04/18.
 */

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    private GregorianCalendar calendar = new GregorianCalendar();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(),this,calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH));
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        String msg = String.format("Você escolheu a data %02d/%02d/%d",dayOfMonth,month,year);
        Toast.makeText(getActivity(),msg, Toast.LENGTH_SHORT).show();
    }
}
