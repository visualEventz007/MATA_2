package ca.on.conestogac.threescreens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SecondActivity extends Activity

{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // Set the layout for the layout we created
        setContentView(R.layout.layout_second);




    }


    //for the ENTER button on Second Screen
    public void memberNameOnClick(View view)

    {

        // Get the users name from the EditText
        EditText memberName = (EditText) findViewById(R.id.members_name_edit_text);

        // Get the name typed into the EditText
        String memberNameGet = String.valueOf(memberName.getText());



        //my intention to open up another screen
        Intent sendToThirdScreen = new Intent(this, ThirdActivity.class);

        sendToThirdScreen.putExtra("message", memberNameGet);
        //the Third Screen will then start
        startActivity(sendToThirdScreen);






    }
}
