package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class IsiActivity extends AppCompatActivity{

    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";

    EditText inputjawab;
    Button btnjawab;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.isi);

        Intent i=getIntent();
        String text = i.getStringExtra(MainActivity.EXTRA_TEXT);

        TextView nama =(TextView) findViewById(R.id.output_nama);

        nama.setText(text);

        btnjawab = (Button) findViewById(R.id.button_jawab);
        btnjawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jawaban();
            }
        });


    }

    public void jawaban(){
        inputjawab = (EditText) findViewById(R.id.input_jawaban);
        Integer jawab = Integer.parseInt(inputjawab.getText().toString());
        if(jawab == 30){
            Intent intent = new Intent(this, PenutupActivity.class);
            startActivity(intent);
        }
        else{
            Dialoglog a = new Dialoglog();
            a.show(getSupportFragmentManager(),"Dialoglog");
        }

    }
}
