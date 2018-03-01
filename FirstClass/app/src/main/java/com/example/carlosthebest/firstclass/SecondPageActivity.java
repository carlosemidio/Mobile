package com.example.carlosthebest.firstclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.TextView;

public class SecondPageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        Intent intent = getIntent();
        Bundle param = intent.getExtras();
        String menssagem = param.getString("texto");

        TextView textView = findViewById(R.id.editText);
        textView.setText(menssagem);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("messagem", "Valor Retornado");
        setResult(RESULT_OK, intent);
        finish();
    }
}
