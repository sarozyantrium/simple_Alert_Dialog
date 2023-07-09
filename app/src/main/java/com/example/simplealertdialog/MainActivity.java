package com.example.simplealertdialog;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_show;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_show=(Button) findViewById(R.id.btn_show);

    }

    public void show_alert_dialog(View view)
    {
        //alert dialog is a predefine class for Alertdialog
        AlertDialog.Builder alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder.setIcon(R.drawable.balance);
        alertDialogBuilder.setTitle("CLOSE THE SCREEN");
        alertDialogBuilder.setMessage("Do you want to close the Screen");

        //jata click gareni banda hune features lai banda garna set this attribute
        alertDialogBuilder.setCancelable(false);

        //to set button like yes no or cancel (This is for positive button )
        alertDialogBuilder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //here you can do as your wish i.e what you need to show to the user.
                //here i am just showing the toast
                Toast.makeText(MainActivity.this,"YES button is clicked",Toast.LENGTH_LONG).show();

            }
        });
      //  alertDialogBuilder.show();

        //to set negative button

        alertDialogBuilder.setNegativeButton("NO ", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                //Here you can do whatever you like but i am just showing a toast

                Toast.makeText(MainActivity.this,"NO button is clicked",Toast.LENGTH_LONG).show();
            }
        });


       // alertDialogBuilder.show();

        //THIS BUTTON IS CALLED AS NEUTRAL BUTTON I.E IT IS NOT FOR YES NEITHER FOR NO .IT IS SIMPLY TO CANCEL THE ALERT DIALOG
       alertDialogBuilder.setNeutralButton("CANCEL", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {

               Toast.makeText(MainActivity.this,"CANCEL button is clicked",Toast.LENGTH_LONG).show();
           }
       }) ;


       //last ma euta matra alertDialogBuilder.show() dekhae pugxa .
       alertDialogBuilder.show();
    }


}