package com.example.androidbti.dialogs;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by android.bti on 19/04/18.
 */

public class MultiDialogFragments extends DialogFragment implements DialogInterface.OnMultiChoiceClickListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        boolean [] checked = {true, false, true, false, false};
        android.app.AlertDialog.Builder builder =  new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle("Escolha uma linguagem");
        builder.setMultiChoiceItems(R.array.linguagens, checked, this);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i, boolean isChecked) {
        String[] linguagens = getActivity().getResources().getStringArray(R.array.linguagens);
        String linguagen = linguagens[i];

        if (isChecked)
            Toast.makeText(getActivity(), "Você escolheu a linguagem: "+linguagen, Toast.LENGTH_LONG).show();
        else
            Toast.makeText(getActivity(), "Você não escolheu uma linguagem: ", Toast.LENGTH_LONG).show();
    }
}
