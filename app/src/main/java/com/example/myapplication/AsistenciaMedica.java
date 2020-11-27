package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class AsistenciaMedica extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private Marker markerPrueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistencia_medica);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sjd = new LatLng(-13.522220785784256, -71.95371607277116);
        mMap.addMarker(new MarkerOptions().position(sjd).title("Clinica San Juan de Dios").snippet(" Para gente de dinero segun Harner").icon(BitmapDescriptorFactory.fromResource(R.drawable.hhhh)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sjd));

        LatLng hospital = new LatLng(-13.523722906287873, -71.9550786349441);
        mMap.addMarker(new MarkerOptions().position(hospital).title("Hospital Regional").snippet("Colas extensas y no te atienden bien").icon(BitmapDescriptorFactory.fromResource(R.drawable.hhhh)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hospital));

        LatLng Alo = new LatLng(-13.527340833407749, -71.97994281019953);
        mMap.addMarker(new MarkerOptions().position(Alo).title("Hospital Antonio Lorena").snippet(" la Contruccion continuara...").icon(BitmapDescriptorFactory.fromResource(R.drawable.hhhh)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Alo));

        LatLng Posta = new LatLng(-13.532154,-71.9597817);
        markerPrueba=googleMap.addMarker(new MarkerOptions().position(Posta).title("Class de Ttio").snippet(" Posta medica que no es posta segun Harner ").icon(BitmapDescriptorFactory.fromResource(R.drawable.hhhh)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Posta));

        googleMap.setOnMarkerClickListener(this);

    }

    @Override
    public boolean onMarkerClick(Marker marker) {

        if (marker.equals(markerPrueba)){
            String lat,lng;
            lat=Double.toString(marker.getPosition().latitude);
            lng=Double.toString(marker.getPosition().latitude);

            Toast.makeText(this,lat + "," + lng,Toast.LENGTH_LONG).show();
        }
        return false;

    }
}