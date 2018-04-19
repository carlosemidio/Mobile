package com.example.androidbti.dialogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open (View view) {
        MyDialog myDialog = new MyDialog();

        myDialog.show(getFragmentManager(), "myDialog");
    }

    public void openSimples (View view) {
        SimpleDialogFragment simpleDialog = new SimpleDialogFragment();

        simpleDialog.show(getFragmentManager(), "mySimpleDialog");
    }

    public void openRadio (View view) {
        RadioDialogFragments radioDialog = new RadioDialogFragments();

        radioDialog.show(getFragmentManager(), "radioDialog");
    }

    public void openMulti (View view) {
        RadioDialogFragments radioDialog = new RadioDialogFragments();

        radioDialog.show(getFragmentManager(), "radioDialog");
    }
}
