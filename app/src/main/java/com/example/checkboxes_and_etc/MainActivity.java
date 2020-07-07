package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.checkboxes_and_etc.R;

public class MainActivity extends AppCompatActivity {

    CheckBox chocolate_syrup, sprinkles, crushed_nuts, cherries, orio_cookies_crumbles_txt;
    Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate_syrup = findViewById(R.id. check_orio_cookies_crumbles_checkbox);
        sprinkles = findViewById(R.id. check_sprinkles_checkbox);
        crushed_nuts = findViewById(R.id. check_crushed_nuts_checkbox);
        cherries = findViewById(R.id. check_cherries_checkbox);
        orio_cookies_crumbles_txt = findViewById(R.id. check_orio_cookies_crumbles_checkbox);
        show_toast = findViewById(R.id. btn_show_toast);
        show_toast.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                StringBuffer result = new StringBuffer();
                result.append("Topping :");
                if(chocolate_syrup.isChecked()){
                    result.append("\t" + chocolate_syrup.getText().toString());
                }
                if(sprinkles.isChecked()){
                    result.append("\t" + sprinkles.getText().toString());
                }
                if (crushed_nuts.isChecked()) {

                    result.append("\t"+ crushed_nuts.getText().toString());
                }
                if(cherries.isChecked()){
                    result.append("\t" +cherries.getText().toString());
                }
                if(orio_cookies_crumbles_txt.isChecked()){
                    result.append("\t" +orio_cookies_crumbles_txt.getText().toString());
                }
                if(!chocolate_syrup.isChecked() && !sprinkles.isChecked() && !crushed_nuts.isChecked() && !cherries.isChecked() && !orio_cookies_crumbles_txt.isChecked())
                    result.append("\tNone");
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void onCheckBoxClicked(View view){
        boolean checked = ((CheckBox)view).isChecked();
        switch (view.getId()){
            case R.id. check_chocolate_syrup_checkbox:
                if(checked)
                    Log.d("chocolate_syrup","Checked");
                else
                    Log.d("chocolate_syrup","Uncheck");
                break;

            case R.id. check_sprinkles_checkbox:
                if(checked)
                    Log.d("sprinkles","Check");
                else
                    Log.d("sprinkles","Uncheck");
                break;

            case R.id. check_crushed_nuts_checkbox:
                if(checked)
                    Log.d("crushed_nuts","Check");
                else
                    Log.d("crushed_nuts","Uncheck");
                break;

            case R.id. check_cherries_checkbox:
                if(checked)
                    Log.d("cherries","Check");
                else
                    Log.d("cherries","Uncheck");
                break;

            case R.id. check_orio_cookies_crumbles_checkbox:
                if(checked)
                    Log.d("orio_cookies_crumbles","Check");
                else
                    Log.d("orio_cookies_crumbles","Uncheck");
                break;
        }
    }
}