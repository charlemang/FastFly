package comcharlemangfastflyissues.httpsgithub.fastfly;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity
{
    public static final String EXTRA_AIRPORT = "comcharlemangfastflyissues.httpsgithub.AIRPORT_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void sendAirport(View view) {
        String[] airportData = {"EWR", "ATL", "JFK", "TIA", "DFW", "LHR"};
        boolean valAir = false;

        EditText editText = findViewById(R.id.airport_name);
        String airportName = editText.getText().toString();
        TextInputLayout errorMsg = (TextInputLayout) findViewById(R.id.errorMsg);

        for (String s : airportData) {
            if (s.equals(airportName))
                valAir = true;
        }

        if (valAir)
        {
            errorMsg.setError("");
            Intent intent = new Intent(this, HomeScreen.class);
            intent.putExtra(EXTRA_AIRPORT, airportName);
            startActivity(intent);
        }
        else
        {
            errorMsg.setError("@string/error_msg");
        }
    }
}
