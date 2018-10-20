package comcharlemangfastflyissues.httpsgithub.fastfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity {
    public static final String EXTRA_AIRPORT = "comcharlemangfastflyissues.httpsgithub.AIRPORT_NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void sendAirport(View view) {
        Intent intent = new Intent(this, HomeScreen.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String airportName = editText.getText().toString();
        intent.putExtra(EXTRA_AIRPORT, airportName);
        startActivity(intent);
    }
}
