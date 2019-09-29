package com.martahrefs.nutrition;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.martahrefs.nutrition.ui.MainActivity;

public class LoginActivity extends AppCompatActivity {

    private TextView register;
    private EditText Email, Password;
    private Button login;
    TextView title2;
    Typeface tp2;

    private ProgressDialog progressDialog;

    //private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        title2 = (TextView) findViewById(R.id.registration_title);
        tp2 = Typeface.createFromAsset(getAssets(), "fonts/QuickKiss.ttf");
        title2.setTypeface(tp2);

        register=(TextView)findViewById(R.id.register_button);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regpage=new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(regpage);
            }
        });

        Email = (EditText) findViewById(R.id.email_login);
        Password = (EditText) findViewById(R.id.password_login);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading...");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        //mAuth=FirebaseAuth.getInstance();

        login = (Button) findViewById(R.id.button_post);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //signinUser();
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    /*private void signinUser() {
        final String email = Email.getText().toString();
        final String password = Password.getText().toString();

        if (email.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
            return;
        }

        if (password.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        /*progressDialog.show();
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            progressDialog.cancel();
                            Intent success=new Intent(com.martahrefs.nutrition.LoginActivity.this, MainActivity.class);
                            startActivity(success);
                            finish();
                        }

                        else {
                            progressDialog.cancel();
                            Toast.makeText(getApplicationContext(), "SignIn failed!", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }*/


}
