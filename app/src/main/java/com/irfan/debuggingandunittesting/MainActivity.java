package com.irfan.debuggingandunittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethod;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btnToast, btnSnackbar;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.etMain);
        btnToast = findViewById(R.id.btnToast);
        btnSnackbar = findViewById(R.id.btnSnackbar);

        btnToast.setOnClickListener(v -> {
            Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
            hideKeyboard();
        });

        btnSnackbar.setOnClickListener(v -> {
            Snackbar.make(findViewById(R.id.root), R.string.app_name, Snackbar.LENGTH_SHORT).show();
            hideKeyboard();
        });
    }

    private void hideKeyboard(){
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
}