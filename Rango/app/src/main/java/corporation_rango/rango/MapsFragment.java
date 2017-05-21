package corporation_rango.rango;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsFragment extends SupportMapFragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        //Add Zomm

        // Add a marker
        LatLng papaiz = new LatLng(-23.6767577, -46.6202573);
        MarkerOptions marker= new MarkerOptions();
        marker.position(papaiz);
        marker.title("Avenida Papaiz");

        mMap.addMarker(marker);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(papaiz));


    }
}
