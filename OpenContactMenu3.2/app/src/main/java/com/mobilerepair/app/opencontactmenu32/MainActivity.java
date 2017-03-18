package com.mobilerepair.app.opencontactmenu32;

import android.content.Intent;
import android.net.Uri;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button click_btn;
    private static final int PICK_CONTACT = 1234;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_btn = (Button)findViewById(R.id.click_btn);

        click_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              //  Intent it= new Intent(Intent.ACTION_PICK,  Contacts.CONTENT_URI);

              //  startActivityForResult(it, PICK_CONTACT);

                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://contacts/people/"));
                startActivity(intent);

            }
        });
    }
}
