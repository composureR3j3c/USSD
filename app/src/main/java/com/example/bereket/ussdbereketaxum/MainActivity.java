package com.example.bereket.ussdbereketaxum;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button btnRec,btnBal,btnTran,btnCmb,btngeb,btncre,btnfwd,btnbwd,btnPhone,btnmenu;
    EditText editTextPh,editTextam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBal= (Button) findViewById(R.id.buttonbal);
        btnRec= (Button) findViewById(R.id.buttonrech);
        btnTran= (Button) findViewById(R.id.buttontrn);
        btnCmb= (Button) findViewById(R.id.buttoncmb);
        btngeb=(Button) findViewById(R.id.buttongb);
        btncre=(Button) findViewById(R.id.buttoncr);
        btnfwd=(Button) findViewById(R.id.buttonfwd);
        btnbwd=(Button) findViewById(R.id.buttonbwd);
        btnPhone=(Button) findViewById(R.id.buttonNo);
        btnmenu=(Button) findViewById(R.id.b0);
        editTextPh=(EditText) findViewById(R.id.editText);
        editTextam=(EditText) findViewById(R.id.editText2);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                Intent ussdintent = new Intent(MainActivity.this,Main2Activity.class);

                    startActivity(ussdintent);
            }
        });
        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                if(editTextPh.getText().equals("")){
                    editTextPh.setText("");
                }
                else{
                    String ussd = editTextPh.getText().toString();

                Intent ussdintent = new Intent(Intent.ACTION_CALL);
                ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 805 + Uri.encode("*") + ussd + Uri.encode("#")));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                    startActivity(ussdintent);
                }
                startActivity(ussdintent);}
            }
        });
        btnBal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                    Intent ussdintent = new Intent(Intent.ACTION_CALL);
                    ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 804 + Uri.encode("#")));
                    if (ActivityCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                        startActivity(ussdintent);
                    }
                    startActivity(ussdintent);
            }
        });
        btnCmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                if(editTextPh.getText().equals("")){
                    editTextPh.setText("");
                }
                else{
                    String phone = editTextPh.getText().toString();

                    Intent ussdintent = new Intent(Intent.ACTION_CALL);
                    ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 807 + Uri.encode("*") + phone + Uri.encode("#")));
                    if (ActivityCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                        startActivity(ussdintent);
                    }
                    startActivity(ussdintent);}
            }
        });
        btnTran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                if(editTextPh.getText().equals("")){
                    editTextPh.setText("");
                }
                else{
                    String phone = editTextPh.getText().toString();
                    String amount=editTextam.getText().toString();
                    Intent ussdintent = new Intent(Intent.ACTION_CALL);
                    ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 806 + Uri.encode("*") + phone +  Uri.encode("*") +amount+Uri.encode("#")));
                    if (ActivityCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                        startActivity(ussdintent);
                    }
                    startActivity(ussdintent);}
            }
        });
        btngeb.setOnClickListener(new View.OnClickListener() {
            @Override
    public void onClick(View View) {
        if(editTextPh.getText().equals("")){
            editTextPh.setText("");
        }
        else{
            String phone = editTextPh.getText().toString();
            String amount=editTextam.getText().toString();
            Intent ussdintent = new Intent(Intent.ACTION_CALL);
            ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 999 + Uri.encode("#")));
            if (ActivityCompat.checkSelfPermission(MainActivity.this,
                    Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                startActivity(ussdintent);
            }
            startActivity(ussdintent);
        }
            }
        });
        btncre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {
                    String phone = "810";
                    String mess="L";
                    SmsManager Sm= SmsManager.getDefault();
                    Sm.sendTextMessage(phone,null,mess,null,null);
                mess="1";
                Sm.sendTextMessage(phone,null,mess,null,null);
            }
        });
        btnfwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                    String phone = editTextPh.getText().toString();

                    Intent ussdintent = new Intent(Intent.ACTION_CALL);
                    ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 21 + Uri.encode("*") + phone + Uri.encode("#")));
                    if (ActivityCompat.checkSelfPermission(MainActivity.this,
                            Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                        startActivity(ussdintent);
                    }
                    startActivity(ussdintent);
            }
        });
        btnbwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                String phone = editTextPh.getText().toString();

                Intent ussdintent = new Intent(Intent.ACTION_CALL);
                ussdintent.setData(Uri.parse("tel:" + Uri.encode("#") + 21 + Uri.encode("#") + phone + Uri.encode("#")));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                    startActivity(ussdintent);
                }
                startActivity(ussdintent);
            }
        });
        btnPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View View) {

                String phone = editTextPh.getText().toString();

                Intent ussdintent = new Intent(Intent.ACTION_CALL);
                ussdintent.setData(Uri.parse("tel:" + Uri.encode("*") + 111+ Uri.encode("*") + 6 + Uri.encode("#")));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED) {
                    startActivity(ussdintent);
                }
                startActivity(ussdintent);
            }
        });

    }
}
