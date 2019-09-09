package com.martahrefs.nutrition;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    EditText fname, lname, email, phonenumber, password;
    TextView title3;
    Typeface tp3;
    Button register;

    private ProgressDialog progressDialog;

    //private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        title3=(TextView)findViewById(R.id.login_title);
        tp3= Typeface.createFromAsset(getAssets(), "fonts/QuickKiss.ttf");
        title3.setTypeface(tp3);

        fname = (EditText) findViewById(R.id.FirstName);
        lname = (EditText) findViewById(R.id.LastName);
        email = (EditText) findViewById(R.id.Email);
        phonenumber = (EditText) findViewById(R.id.PhoneNumber);
        password = (EditText) findViewById(R.id.Password);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        //mAuth=FirebaseAuth.getInstance();

        register=(Button)findViewById(R.id.RegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //registerUser();
                Toast.makeText(getApplicationContext(), "Registered user successfully!", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    /*private void registerUser() {
        final String firstname=fname.getText().toString().trim();
        final String lastname=lname.getText().toString().trim();
        final String emailaddress=email.getText().toString().trim();
        final String phone=phonenumber.getText().toString().trim();
        String pass=password.getText().toString().trim();

        if (firstname.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter first name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (lastname.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter last name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (emailaddress.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter email address", Toast.LENGTH_SHORT).show();
            return;
        }

        if (phone.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter phone number", Toast.LENGTH_SHORT).show();
            return;
        }

        if (pass.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Set password", Toast.LENGTH_SHORT).show();
            return;
        }

        else if (pass.length()<8){
            Toast.makeText(getApplicationContext(), "Password should be at least 8 characters long", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.show();
        mAuth.createUserWithEmailAndPassword(emailaddress, pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){

                           User user=new User(
                           firstname,
                           lastname,
                           emailaddress,
                           phone
                           );


                           FirebaseDatabase.getInstance().getReference("Users")
                                   .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                   .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                               @Override
                               public void onComplete(@NonNull Task<Void> task) {
                                   if (task.isSuccessful()){
                                       progressDialog.cancel();
                                       Toast.makeText(getApplicationContext(), "com.martahrefs.nutrition.RegistrationActivity Successful", Toast.LENGTH_SHORT).show();

                                       Intent success=new Intent(com.martahrefs.nutrition.RegistrationActivity.this, com.martahrefs.nutrition.LoginActivity.class);
                                       startActivity(success);
                                       finish();
                                   }
                                   else {
                                       progressDialog.cancel();
                                       Toast.makeText(getApplicationContext(), "com.martahrefs.nutrition.RegistrationActivity Failed", Toast.LENGTH_SHORT).show();
                                   }
                               }
                           });

                        }

                        else {
                            Toast.makeText(getApplicationContext(), "com.martahrefs.nutrition.RegistrationActivity Failed", Toast.LENGTH_SHORT).show();
                        }

                    }
                });


    }*/
}
