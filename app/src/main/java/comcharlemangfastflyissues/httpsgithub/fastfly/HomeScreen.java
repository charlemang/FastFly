package comcharlemangfastflyissues.httpsgithub.fastfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Intent intent = getIntent();
        String airportName = intent.getStringExtra(MainScreen.EXTRA_AIRPORT);


    }


}
