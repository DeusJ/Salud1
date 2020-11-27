package com.example.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ZonaRiesgo extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zona_riesgo);
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
        LatLng confra = new LatLng(-13.527102753521447, -71.9698628622372);
        mMap.addMarker(new MarkerOptions().position(confra).title("Centro comercial Confraternidad").icon(BitmapDescriptorFactory.fromResource(R.drawable.pppp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(confra));

        LatLng MW = new LatLng(-13.522139444169525, -71.97135110511233);
        mMap.addMarker(new MarkerOptions().position(MW).title("Mercado Wanchaq").icon(BitmapDescriptorFactory.fromResource(R.drawable.pppp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MW));

        LatLng vino = new LatLng(-13.543905354516, -71.88773434046738);
        mMap.addMarker(new MarkerOptions().position(vino).title("Mercado Vinocanchon").icon(BitmapDescriptorFactory.fromResource(R.drawable.pppp)));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(vino));
    }
}