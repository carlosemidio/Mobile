package com.example.carlosemidio.atividade_uni_ii_ex_1;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;

import java.util.GregorianCalendar;

public class TimePicker extends DialogFragment implements TimePickerDialog.OnTimeSetListener {
    private GregorianCalendar calendar = new GregorianCalendar();
    private setTimeListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(!(context instanceof setTimeListener)){

            throw new RuntimeException("A Activity deve implementar a Interface TimePicker.setTimeListener");
        }

        listener = (setTimeListener) context;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new TimePickerDialog(getActivity(),this,calendar.get(calendar.HOUR_OF_DAY),calendar.get(calendar.MINUTE),true);
    }

    @Override
    public void onTimeSet(android.widget.TimePicker view, int hourOfDay, int minute) {
        this.listener.setTime(String.format("%02d:%02d",hourOfDay,minute));

    }

    public interface setTimeListener{
        public void setTime(String time);
    }
}
