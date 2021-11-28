package com.example.a44countr_profile_project_part_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    ImageView imageView ;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        imageView =(ImageView) findViewById(R.id.imageviewid);
        textView=(TextView) findViewById(R.id.textviewid);

        Bundle bundle= getIntent().getExtras();

        if(bundle!=null)
        {

            String s=bundle.getString("name");


            ShowDetails(s);

        }








    }


    void ShowDetails(String countryman)
    {



        if(countryman.equals("Bangladesh"))
        {
          imageView.setImageResource(R.drawable.bangladesh);
          textView.setText(R.string.Bangladesh);

        }

        if(countryman.equals("Pakistan"))
        {
            imageView.setImageResource(R.drawable.pakistan);
            textView.setText(R.string.Pakistan);

        }

        if(countryman.equals("India"))
        {
            imageView.setImageResource(R.drawable.india);
            textView.setText(R.string.India);

        }
    }





}
