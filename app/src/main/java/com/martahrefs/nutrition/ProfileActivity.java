package com.martahrefs.nutrition;

import android.app.ProgressDialog;
import android.content.Intent;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView usName, usEmail, usPhone, usLocation;
    Button editProf, signOut;
    String latitude, longitude, city;

    //DatabaseReference databaseReference;
    //FirebaseUser firebaseUser;
    //FirebaseAuth firebaseAuth;
    private LocationManager locationManager;

    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //checkLocationPermission();


    usName = (TextView) findViewById(R.id.profile_userName);
        usEmail = (TextView) findViewById(R.id.profile_emailAddress);
        usPhone = (TextView) findViewById(R.id.profile_phonenumber);
        usLocation = (TextView) findViewById(R.id.profile_userAddress);


        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        //firebaseAuth=FirebaseAuth.getInstance();


        signOut=(Button)findViewById(R.id.btn_signOut);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //firebaseAuth.signOut();
                Intent logoff=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(logoff);
                finish();
            }
        });

        //loadProfile();
    }

    /*private void checkLocationPermission() {
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED){
            requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1000);
        }else {
            LocationManager locationManager=(LocationManager)getSystemService(Context.LOCATION_SERVICE);
            Location location=locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            try {
                String cityName = hereLocation(location.getLatitude(), location.getLongitude());
                usLocation.setText(cityName);
            } catch (Exception e){
                e.printStackTrace();
                Toast.makeText(getApplicationContext(), "Not Found!", Toast.LENGTH_SHORT).show();
            }
        }
    }*/

    /*public void loadProfile(){
        firebaseUser= FirebaseAuth.getInstance().getCurrentUser();
        String userid=firebaseUser.getUid();

        progressDialog.show();

        databaseReference= FirebaseDatabase.getInstance().getReference().child("Users");
        databaseReference.child(userid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String fname=dataSnapshot.child("firstname").getValue().toString();
                String lname=dataSnapshot.child("lastname").getValue().toString();
                String emailaddress=dataSnapshot.child("email").getValue().toString();
                String phone=dataSnapshot.child("phonenumber").getValue().toString();

                usName.setText(fname + " " + lname);
                usEmail.setText(emailaddress);
                usPhone.setText(phone);


                progressDialog.cancel();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(getApplicationContext(), "Failed to get user data!", Toast.LENGTH_SHORT).show();
            }
        });
    }*/

    /*private String hereLocation(double lat, double lon){
        String cityName="";

        Geocoder geocoder=new Geocoder(this, Locale.getDefault());
        List<Address> addresses;
        try{
            addresses=geocoder.getFromLocation(lat, lon, 10);
            if (addresses.size()>0){
                for (Address adr: addresses){
                    if (adr.getAdminArea() !=null && adr.getAdminArea().length()>0){
                        cityName=adr.getAdminArea();
                        break;
                    }
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return cityName;
    }*/

    /*@Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1000: {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
                    Location location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
                    try {
                        String cityName = hereLocation(location.getLatitude(), location.getLongitude());
                        usLocation.setText(cityName);
                    } catch (Exception e) {
                        e.printStackTrace();
                        Toast.makeText(getApplicationContext(), "Not Found!" +e , Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "Permission not granted", Toast.LENGTH_SHORT).show();
                }
                break;
            }
        }
    }*/
}
