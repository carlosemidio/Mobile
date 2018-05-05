package com.example.carlosemidio.aula5_atividade_excicio_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn = findViewById(R.id.button1);
    }

    public void vaiPraTela2(View view) {
        // Intent que chama a subActivity
        Intent it = new Intent(getApplicationContext(), Main2Activity.class);
        // Pacote que passa parâmetros para a subActivity
        Bundle params = new Bundle();
        params.putInt("contador", Integer.parseInt(this.btn.getText().toString()));
        it.putExtras(params);
        startActivityForResult(it, 1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                int contador = Integer.parseInt(data.getStringExtra("contador"));
                this.btn.setText((contador+1)+"");
            }
        }
    }
}
