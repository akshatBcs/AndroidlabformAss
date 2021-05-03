package com.example.labass1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name, markstype, mark10, mark12, tstream, pname, mname, city, mnum, gender, skill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.textViewname);
        markstype=findViewById(R.id.textViewmarktype);
        mark10=findViewById(R.id.textViewmarks10);
        mark12=findViewById(R.id.textViewmarks12);
        tstream=findViewById(R.id.textViewstream);
        pname=findViewById(R.id.textViewpaname);
        mname=findViewById(R.id.textViewmaname);
        city=findViewById(R.id.textViewcity);
        mnum=findViewById(R.id.textViewmonum);
        gender=findViewById(R.id.textViewgender);
        skill=findViewById(R.id.textViewskill);

        name.setText(getIntent().getStringExtra("Name"));
        mark10.setText(getIntent().getStringExtra("10"));
        mark12.setText(getIntent().getStringExtra("12"));
        markstype.setText(getIntent().getStringExtra("markstype"));
        tstream.setText(getIntent().getStringExtra("stream"));
        pname.setText(getIntent().getStringExtra("paname"));
        mname.setText(getIntent().getStringExtra("maname"));
        city.setText(getIntent().getStringExtra("city"));
        mnum.setText(getIntent().getStringExtra("monum"));
        gender.setText(getIntent().getStringExtra("gender"));
        skill.setText(getIntent().getStringExtra("skill"));



    }
}