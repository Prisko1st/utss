package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";


    Button buttonNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonNama = (Button) findViewById(R.id.button_nama);

        buttonNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openisi();
            }
        });
    }

    public void openisi(){
        try {
            EditText inputnama = (EditText)findViewById(R.id.nama);
            String text = inputnama.getText().toString();
            Intent intent = new Intent(this, IsiActivity.class);
            intent.putExtra(EXTRA_TEXT,text);
            startActivity(intent);
        }
        catch (Exception e){

        }




    }
}