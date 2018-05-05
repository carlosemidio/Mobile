package com.example.carlosemidio.aula5_atividade_excicio_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.btn = findViewById(R.id.button2);
        Intent it = getIntent();
        Bundle params = it.getExtras();
        int contador = params.getInt("contador");
        this.btn.setText((contador+1)+"");
    }

    public void vaiPraTela1(View view) {
        Intent data = new Intent();
        Bundle params = new Bundle();
        data.putExtra("contador", this.btn.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
