package com.example.androidbti.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by android.bti on 19/04/18.
 */

public class MyDialog extends DialogFragment implements DialogInterface.OnClickListener{

    public Dialog onCreateDialog (Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setTitle("Pergunta");
        builder.setMessage("Entendeu?");
        builder.setPositiveButton("Sim",this);
        builder.setNegativeButton("Não",this);

        return builder.create();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int whith) {
        String msg = null;

        if (whith == DialogInterface.BUTTON_POSITIVE) {
            msg = "Voce escolheu Sim";
        } else if (whith == DialogInterface.BUTTON_NEGATIVE) {
            msg = "Você escolheu Não";
        }

        Toast.makeText(getActivity(), msg, Toast.LENGTH_LONG).show();
    }
}
