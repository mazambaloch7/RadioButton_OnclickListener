package com.inovedia.radiobutton_onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button=findViewById(R.id.buton);
        final RadioGroup radioGroup=findViewById(R.id.radioGroup);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int clickedRadioButton=radioGroup.getCheckedRadioButtonId();
                radioButton=findViewById(clickedRadioButton);
                if(clickedRadioButton ==-1){
                    button.setError("Error");
                } else {
                    button.setError(null);
                    Toast.makeText(MainActivity.this,radioButton.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
