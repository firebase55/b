package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.activities.maplocation.MapsActivity;

public class create_convoy extends AppCompatActivity {

    private EditText name_text , data_text ,
                     time_text , desitnation_text,
                     point_text , selectdes_text;
    private Button convoy_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_convoy);
        name_text = (EditText)findViewById(R.id.convoy_name);
        data_text = (EditText)findViewById(R.id.convoy_date);
        time_text = (EditText)findViewById(R.id.convoy_Time);
        desitnation_text = (EditText)findViewById(R.id.convoy_destination);
        point_text = (EditText)findViewById(R.id.convoy_check_point);
        selectdes_text = (EditText)findViewById(R.id.convoy_destination_points);
        convoy_button = (Button)findViewById(R.id.creat_convey_id);
        convoy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String namefield = name_text.getText().toString().trim();
                String datafield = data_text.getText().toString().trim();
                String timefield = time_text.getText().toString().trim();
                String destinationfield = desitnation_text.getText().toString().trim();
                String pointfiled = point_text.getText().toString().trim();
                String selectdesfield = selectdes_text.getText().toString().trim();
//                if(namefield.isEmpty()|| datafield.isEmpty()||timefield.isEmpty()|| destinationfield.isEmpty()||
//                  pointfiled.isEmpty()||selectdesfield.isEmpty())
//                {
//                    Toast.makeText(create_convoy.this, "please fill the fields", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
                    convoyFunction();


//                }
//                if(namefield.isEmpty()&& datafield.isEmpty()&&timefield.isEmpty()&& destinationfield.isEmpty()&&
//                        pointfiled.isEmpty()&&selectdesfield.isEmpty())
//                {
//                    Toast.makeText(create_convoy.this, "please fill all the fields", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
                    convoyFunction();
               // }

            }
        });






    }

    private void convoyFunction()
    {
        Intent map = new Intent(getApplicationContext(), MapsActivity.class);
        startActivity(map);

    }


}