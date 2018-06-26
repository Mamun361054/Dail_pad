package com.dialpad.home.dail_pad;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class About_ME extends AppCompatActivity {
    private Object Menu;
    private Object MenuItem;
    private android.view.Menu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_about__me );
final Button num1=findViewById ( R.id.num1 );
final Button num2=findViewById ( R.id.num2 );
final ImageButton home=findViewById ( R.id.home );

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData( Uri.parse("tel:01835830281"));
                startActivity(intent);

            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData( Uri.parse("tel:01676331306"));
                startActivity(intent);

            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),Theme_2.class));

            }
        });

    }
}
