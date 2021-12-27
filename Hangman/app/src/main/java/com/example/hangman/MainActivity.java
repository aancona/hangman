package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_WORD = "com.example.hangman.MESSAGE";
    Button submitButton;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.submit);
        submitButton.setVisibility(View.GONE);

        editText = findViewById(R.id.editText);
        editText.setVisibility(View.GONE);

        textView = findViewById(R.id.textView2);
        textView.setVisibility(View.GONE);
    }

    public void onePlayerButton(View view) {
        Intent intent = new Intent(this, OnePlayer.class);
        startActivity(intent);
    }

    public void twoPlayerButton(View view) {
        editText.setVisibility(View.VISIBLE);
        submitButton.setVisibility(View.VISIBLE);
        textView.setVisibility(View.VISIBLE);
    }

    public void submitButton(View view) {
        Intent intent = new Intent(this, TwoPlayer.class);
        intent.putExtra(EXTRA_WORD, editText.getText().toString());
        startActivity(intent);
    }
}