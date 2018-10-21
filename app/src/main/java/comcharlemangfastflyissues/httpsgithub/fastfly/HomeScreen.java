package comcharlemangfastflyissues.httpsgithub.fastfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HomeScreen extends AppCompatActivity {
    public static final String EXTRA_GATE = "comcharlemangfastflyissues.httpsgithub.GATE_NAME";
    public static final String EXTRA_TIME = "comcharlemangfastflyissues.httpsgithub.FLIGHT_TIME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

    }

    public void getGT(View view)
    {
        String[] gateData = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11",
                "B12", "B13", "B14", "B15", "B16"};
        boolean valAir = false;

        Intent intent = getIntent();
        String airportName = intent.getStringExtra(MainScreen.EXTRA_AIRPORT);

        Intent intent2 = new Intent(this, AirportView.class);
        EditText editText = findViewById(R.id.gate_name);
        String gateName = editText.getText().toString();
        EditText text2 = findViewById(R.id.departure_time);
        String flightTime = text2.getText().toString();
        intent.putExtra(EXTRA_GATE, gateName);
        intent.putExtra(EXTRA_TIME, flightTime);
        intent.putExtra(MainScreen.EXTRA_AIRPORT, airportName);
        startActivity(intent2);

    }
}
