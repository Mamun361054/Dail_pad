package com.dialpad.home.dail_pad;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

import static android.net.Uri.encode;

public class theme_6 extends AppCompatActivity {

    TextToSpeech t1;
    Button btn1, d2, d3, d4, d5, d6, d7, d8, d9, d0, dstar, dhash, one, bclear, call, contack, call_list, c;

    // TextView result;

    TextView edt1;
    String number = "";
    private Object Menu;
    private Object MenuItem;
    private Menu menu;

    Boolean theme1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_theme_6 );

        // result=(TextView) findViewById(R.id.result);
        edt1 = findViewById ( R.id.edt1 );
        one = findViewById ( R.id.one );
        d2 = findViewById ( R.id.d2 );
        d3 = findViewById ( R.id.d3 );
        d4 = findViewById ( R.id.d4 );
        d5 = findViewById ( R.id.d5 );
        d6 = findViewById ( R.id.d6 );
        d7 = findViewById ( R.id.d7 );
        d8 = findViewById ( R.id.d8 );
        d9 = findViewById ( R.id.d9 );
        d0 = findViewById ( R.id.d0 );
        call = findViewById ( R.id.call );
        bclear = findViewById ( R.id.bclear );
        c = findViewById ( R.id.c );
        dstar = findViewById ( R.id.dstar );
        dhash = findViewById ( R.id.dhash );
        call_list = findViewById ( R.id.call_list );
        contack = findViewById ( R.id.contack );


        one.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "1";
                edt1.setText ( number );
                String toSpeak = one.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "2";
                edt1.setText ( number );
                String toSpeak = d2.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "3";
                edt1.setText ( number );
                String toSpeak = d3.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "4";
                edt1.setText ( number );
                String toSpeak = d4.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d5.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "5";
                edt1.setText ( number );
                String toSpeak = d5.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d6.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "6";
                edt1.setText ( number );
                String toSpeak = d6.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d7.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "7";
                edt1.setText ( number );

                String toSpeak = d7.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d8.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "8";
                edt1.setText ( number );
                String toSpeak = d8.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d9.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "9";
                edt1.setText ( number );
                String toSpeak = d9.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

        d0.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "0";
                edt1.setText ( number );
                String toSpeak = d0.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );
        dhash.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number=number+encode ( "#" );
                if(number==number){

                    edt1.setText ( "#" );
                }

//                edt1.setText ( "#");
                String toSpeak = dhash.getText ().toString ();
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );

//            @Override
//            public void onClick(View v) {
//                number = number + encode ( "#" );
//             if (number==number+encode ( "#" )){
//
//                 number=number+"#";
//                 edt1.setText ( number );
//             }
//                String toSpeak = "Hashh";
//                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
//
//            }
//        } );null
        dstar.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                number = number + "*";
                edt1.setText ( number );
                String toSpeak = "Star";
                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
            }
        } );


        t1 = new TextToSpeech ( getApplicationContext (), new TextToSpeech.OnInitListener () {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage ( Locale.ENGLISH );

                }
            }
        } );


//        bclear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                edt1.setText("");
//            }
//        });
        call.setOnClickListener ( new View.OnClickListener () {
            @Override
            public String toString() {
                return "$classname{}";
            }

            @SuppressLint("MissingPermission")
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                String toSpeak = "Calling   \n" + number;
                Toast.makeText ( getApplicationContext (), toSpeak, Toast.LENGTH_LONG ).show ();

                t1.speak ( toSpeak, TextToSpeech.QUEUE_FLUSH, null );
                Intent intent = new Intent ( Intent.ACTION_CALL );
                intent.setData ( Uri.parse ( "tel:" + number ) );
                // TODO: Consider calling
//    ActivityCompat#requestPermissions
// here to request the missing permissions, and then overriding
//   public void onRequestPermissionsResult(int requestCode, String[] permissions,
//                                          int[] grantResults)
// to handle the case where the user grants the permission. See the documentation
// for ActivityCompat#requestPermissions for more details.

                startActivity ( intent );

            }
        });
        contack .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = contack.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_LONG).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
//                Intent intent=new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);

                startActivity(intent);

            }
        });
        call_list .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = call_list.getText().toString();
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_LONG).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setType(CallLog.Calls.CONTENT_TYPE);
                intent.putExtra(CallLog.Calls.EXTRA_CALL_TYPE_FILTER, CallLog.Calls.MISSED_TYPE);
                startActivity(intent);
            }
        });

        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Clear";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                number="";
                edt1.setText(number);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "BackSpace";
                Toast.makeText(getApplicationContext(), toSpeak,Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                if (number.length()>0){

                    number=number.substring(0,number.length()-1);
                    edt1.setText(number);
                }
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu( android.view.Menu menu ) {
        getMenuInflater().inflate( R.menu.main_menu, menu );
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( android.view.MenuItem menu ) {
        switch (menu.getItemId ()) {

            case R.id.theme1:
                startActivity ( new Intent ( this,Theme_1.class ) );
                break;
            case R.id.theme2:
                startActivity ( new Intent ( this,Theme_2.class ) );
                break;
            case R.id.theme3:
                startActivity ( new Intent ( this,Theme_3.class ) );
                break;
            case R.id.theme4:
                startActivity ( new Intent ( this,theme_4.class ) );
                break;
            case R.id.theme5:
                startActivity ( new Intent ( this,theme_5.class ) );
                break;
            case R.id.theme6:
                startActivity ( new Intent ( this,theme_6.class ) );
                break;
            case R.id.theme7:
                startActivity ( new Intent ( this,theme_7.class ) );
                break;
            case R.id.theme8:
                startActivity ( new Intent ( this,theme_8.class ) );
                break;
            case R.id.main:
                startActivity ( new Intent ( this,MainActivity.class ) );
                break;
            case R.id.contact:
                startActivity ( new Intent ( this,About_ME.class ) );
                break;
            case R.id.samsung:
                startActivity (new Intent (this,samsung.class  )  );
                break;


            case R.id.ios:
                startActivity (new Intent (this,ios.class  )  );
                break;
//        @Override
//        public boolean onOptionsItemSelected;( MenuItem item ){
//            MenuInflater inflater = getMenuInflater ();
//            inflater.inflate ( R.menu.mastermenu,menu );
//            return true;
//        }

        }
        return true;
    }}