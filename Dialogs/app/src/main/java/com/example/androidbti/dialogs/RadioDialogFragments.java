package com.example.androidbti.dialogs;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by android.bti on 19/04/18.
 */

public class RadioDialogFragments extends DialogFragment implements DialogInterface.OnClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        android.app.AlertDialog.Builder builder =  new android.app.AlertDialog.Builder(getActivity());

        builder.setTitle("Escolha uma linguagem");

        builder.setItems(R.array.linguagens, this);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.linguagens);

        String linguagen = linguagens[i];

        Toast.makeText(getActivity(), "Você escolheu a linguagem: "+linguagen, Toast.LENGTH_LONG).show();
    }
}
