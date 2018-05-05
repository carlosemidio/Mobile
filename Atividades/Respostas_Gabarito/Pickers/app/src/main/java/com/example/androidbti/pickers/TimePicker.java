package com.example.androidbti.pickers;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.Toast;

import java.util.GregorianCalendar;

/**
 * Created by android.bti on 24/04/18.
 */

public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    private GregorianCalendar calendar = new GregorianCalendar();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TimePickerDialog(getActivity(),this,calendar.get(calendar.HOUR_OF_DAY),calendar.get(calendar.MINUTE),true);
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        String msg = String.format("Você escolheu o horário %02d:%02d",hourOfDay,minute);
        Toast.makeText(getActivity(),msg,Toast.LENGTH_SHORT).show();
    }
}
