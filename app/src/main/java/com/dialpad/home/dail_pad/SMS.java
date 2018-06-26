package com.dialpad.home.dail_pad;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import static com.example.home.dail_pad.R.id.sms;



public class SMS extends Activity {
    EditText edt1;
String number="";
    EditText editText2,editText;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final EditText edt1=(EditText) findViewById ( R.id.edt1 );
        Button startBtn = (Button) findViewById(R.id.btnSendSMS);
        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMS();

            }
        });
    }


    protected void sendSMS() {
        Log.i ( "Send SMS","" );
        Intent smsIntent = new Intent ( Intent.ACTION_VIEW );
        smsIntent.setData ( Uri.parse ( "smsto:" ) );
        smsIntent.setType ( "vnd.android-dir/mms-sms" );

        smsIntent.putExtra ( "address", "" );
        smsIntent.putExtra ( "sms_body","editText" );

        try {
            startActivity ( smsIntent );
            finish ();
            Log.i ( "Finished sending SMS...",number );
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText ( SMS.this,
                    "SMS faild, please try again later.",Toast.LENGTH_SHORT ).show ();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}