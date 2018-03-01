package com.example.carlosthebest.firstclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void next(View view) {
        Intent intent = new Intent(this, SecondPageActivity.class);
        intent.putExtra("texto", "deu certo!!!");
        startActivityForResult(intent, 5);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5){
            String mens = data.getStringExtra("messagem");
            Toast.makeText(this, mens, Toast.LENGTH_LONG).show();
            Button button = findViewById(R.id.button);
            button.setEnabled(false);
        }
    }
}
