package com.example.a44countr_profile_project_part_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button Bbutton1,Pbutton2,Ibutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bbutton1=(Button) findViewById(R.id.bangladeshbutton);
        Pbutton2=(Button) findViewById(R.id.pakistanbutton);
        Ibutton3=(Button) findViewById(R.id.indabutton);

        Bbutton1.setOnClickListener(this);
        Pbutton2.setOnClickListener(this);
        Ibutton3.setOnClickListener(this);




    }





    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangladeshbutton)
        {
            Intent intent =new Intent(MainActivity.this,ProfileActivity.class);

            intent.putExtra("name","Bangladesh");
            startActivity(intent);

        }
        if(v.getId()==R.id.pakistanbutton)
        {
            Intent intent =new Intent(MainActivity.this,ProfileActivity.class);

            intent.putExtra("name","Pakistan");
            startActivity(intent);

        }
        if(v.getId()==R.id.indabutton)
        {
            Intent intent =new Intent(MainActivity.this,ProfileActivity.class);

            intent.putExtra("name","India");
            startActivity(intent);

        }







    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder alertDialogBuilder;

        alertDialogBuilder =new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.sub1);
        alertDialogBuilder.setMessage(R.string.Dialog);
        alertDialogBuilder.setTitle(R.string.Title);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

              finish();

            }
        });

        alertDialogBuilder.setNegativeButton(" No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();

            }
        });

        AlertDialog alertDialog= alertDialogBuilder.create();
        alertDialog.show();




    }




}
