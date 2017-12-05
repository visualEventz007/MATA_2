package ca.on.conestogac.threescreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirdActivity extends Activity
{
    private MATADataBase db;
    EditText text_view,
            pass_word;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_third);

        text_view =(EditText) findViewById(R.id.username2);
        pass_word =(EditText) findViewById(R.id.password2);

    }




    public void Login(View view)
    {

        db = MATADataBase.getDatabase(getApplicationContext());

        String text2 = text_view.getText().toString().trim();
        String password2 = pass_word.getText().toString().trim();


        //Patient newPatient = new Patient(text2, password2);
       // db.patientDao().addPatient(newPatient);
    }
}
