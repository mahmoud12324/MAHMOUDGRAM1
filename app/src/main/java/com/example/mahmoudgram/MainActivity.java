package com.example.mahmoudgram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private EditText etEmail,etPassword;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       conectComponents();
    }

    private void conectComponents() {
        etEmail= findViewById(R.id.etEmailMain);
                etPassword=findViewById(R.id.etPasswordMain);
    }

    public void signup(View view) {
        String password,email;
        email=etEmail.getText().toString();
        password=etPassword.getText().toString();
if(email.trim().isEmpty()||password.trim().isEmpty())
{
    Toast.makeText(this, "some feilds are missing!", Toast.LENGTH_SHORT).show();
    return;
}

// ExampleFragment.java





    }
}