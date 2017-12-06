package com.example.suyashshukla.blooddonoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView textView = (TextView)findViewById(R.id.infocus);
        textView.setText(information);
    }



    public void SMS(View view){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("smsto:"+mobile));
        intent.putExtra("sms_body", "I'm in urgent need of blood! It'll be great if you can just help my cause.");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
