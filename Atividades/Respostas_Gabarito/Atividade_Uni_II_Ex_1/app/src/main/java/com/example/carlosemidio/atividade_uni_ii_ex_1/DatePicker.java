package com.example.carlosemidio.atividade_uni_ii_ex_1;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import java.util.GregorianCalendar;

public class DatePicker extends DialogFragment implements DatePickerDialog.OnDateSetListener  {
    private GregorianCalendar calendar = new GregorianCalendar();

    private setDateListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if(!(context instanceof setDateListener)){

            throw new RuntimeException("A Activity deve implementar a Interface DatePicker.setDateListener");
        }

        listener = (setDateListener) context;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(),this,calendar.get(calendar.YEAR),calendar.get(calendar.MONTH),calendar.get(calendar.DAY_OF_MONTH));
    }

    @Override
    public void onDateSet(android.widget.DatePicker view, int year, int month, int dayOfMonth) {
        this.listener.setDate(String.format("%02d/%02d/%d",dayOfMonth,month+1,year));
    }

    public interface setDateListener{
        public void setDate(String text);
    }
}
