package ca.on.conestogac.threescreens;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity
{

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        textView = (TextView) findViewById(R.id.text);

    }

    /*for the 2 buttons on home Screen*/
    public void Third_Page(View View)

    {
        String button_text;
        button_text =((Button)View).getText().toString();

        if(button_text.equals("Learn More"))
        {
            Intent second = new Intent(this,SecondActivity.class);
            startActivity(second);
        }

        else if (button_text.equals("Please Login"))
        {
            Intent third = new Intent(this,ThirdActivity.class);
            startActivity(third);

        }

        else if (button_text.equals("Register"))
        {
            Intent register = new Intent(this, Register.class);
            startActivity(register);

        }
    }
}
