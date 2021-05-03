package com.example.labass1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstName, secondName, marks10, marks12, stream, paname, maname, city, monum;
    RadioGroup rgmarks, rggender;
    CheckBox cpp, py, andRoid;
    Button btnsbm;
    String lang = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName=findViewById(R.id.etfname);
        secondName=findViewById(R.id.etlname);
        marks10=findViewById(R.id.etmarks10);
        marks12=findViewById(R.id.etmarks12);
        stream=findViewById(R.id.etstream);
        paname=findViewById(R.id.etpaname);
        maname=findViewById(R.id.etmaname);
        city=findViewById(R.id.etcity);
        monum=findViewById(R.id.etPhone);
        rgmarks=findViewById(R.id.rgmarks);
        rggender=findViewById(R.id.rggender);
        cpp=findViewById(R.id.checkBox);
        py=findViewById(R.id.checkBox1);
        andRoid=findViewById(R.id.checkBox2);
        btnsbm=findViewById(R.id.btnsbm);








        btnsbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if (cpp.isChecked()) {
                    lang+=" C++ ";
                }
                if (py.isChecked()) {
                    lang+=" Python ";
                }
                if (andRoid.isChecked()) {
                    lang+=" Android ";
                }

                //String finalLang = lang;

                int selected_rb_marks = rgmarks.getCheckedRadioButtonId();
                RadioButton radioButtonmarks = findViewById(selected_rb_marks);

                int selected_rb_gender = rggender.getCheckedRadioButtonId();
                RadioButton radioButtongender = findViewById(selected_rb_gender);

                Toast.makeText(MainActivity.this,"submitted",Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this,MainActivity2.class)
                        .putExtra("Name", firstName.getText().toString()+" "+secondName.getText().toString())
                        .putExtra("10", marks10.getText().toString())
                        .putExtra("12", marks12.getText().toString())
                        .putExtra("stream", stream.getText().toString())
                        .putExtra("paname", paname.getText().toString())
                        .putExtra("maname", maname.getText().toString())
                        .putExtra("city", city.getText().toString())
                        .putExtra("monum", monum.getText().toString())
                        .putExtra("markstype",radioButtonmarks.getText().toString())
                        .putExtra("gender",radioButtongender.getText().toString())
                        .putExtra("skill", lang)
                );

            }
        });

    }

}