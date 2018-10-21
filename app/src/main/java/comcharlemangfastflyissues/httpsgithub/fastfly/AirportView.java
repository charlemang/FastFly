package comcharlemangfastflyissues.httpsgithub.fastfly;

import android.Manifest;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.kml.KmlLayer;

public class AirportView extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    /*private LocationManager locationManager;
    private Location location;
    private final int LOCATION_PERMISSION_CODE = 1;*/
    private String airportName;
    private char terminal;
    private int gateNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airport_view);

        airportName = getIntent().getStringExtra(MainScreen.EXTRA_AIRPORT);
        String gate = getIntent().getStringExtra(HomeScreen.EXTRA_GATE);
        //terminal = gate.charAt(0);
        //gateNumber = Integer.parseInt(gate.substring(1));
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        /**/

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng loc = new LatLng(33.640775, -84.433333);

        /*LatLng center;

        switch(terminal) {
            case 'A':
                center = new LatLng(33.64083, -84.43919);
            case 'B':
                center = new LatLng(33.64071, -84.43591);
            case 'C':
                center = new LatLng(33.64083, -84.43264);
            case 'D':
                center = new LatLng(33.6408, -84.42928);
            case 'E':
                center = new LatLng(33.64066, -84.42572);
        }*/

        //locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        /*if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this,
                    new String[] {Manifest.permission.ACCESS_FINE_LOCATION}, LOCATION_PERMISSION_CODE);

        Location location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double longitude = location.getLongitude();
        double latitude = location.getLatitude();*/

        LatLngBounds ATLAirport = new LatLngBounds(new LatLng(33.637194, -84.446728), new LatLng(33.644034,-84.417289));
        mMap.addMarker(new MarkerOptions().position(loc).title("Current Location"));
        mMap.setMinZoomPreference(17);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, 19));
        mMap.setLatLngBoundsForCameraTarget(ATLAirport);

        /*LatLng currLoc = new LatLng(latitude, longitude);

        mMap.addMarker(new MarkerOptions().position(currLoc).title("Current Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currLoc, 20));

        // Add a marker in Sydney and move the camera
        /*LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));*/
    }

}