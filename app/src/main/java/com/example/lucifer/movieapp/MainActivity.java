package com.example.lucifer.movieapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startDunkirk(View v){

        Intent dunkirkActivity = new Intent();
        dunkirkActivity.setClass(this , activityDunkirk.class);
        startActivity(dunkirkActivity);

    }

    public void startTheDarkKnight(View v){
        Intent theDarkKnightActivity = new Intent();
        theDarkKnightActivity.setClass(this , activityTheDarkKnight.class);
        startActivity(theDarkKnightActivity);

    }

    public void toSuggest(View v){
        String suggestion = ((EditText)(findViewById(R.id.suggestionTextBox))).getText().toString();
        Uri destination = Uri.parse("smsto:0000000000");
        Intent sendMessage = new Intent(Intent.ACTION_SENDTO , destination);
        sendMessage.putExtra("sms_body" , suggestion);
        startActivity(sendMessage);
    }


}
