package com.example.hangman.views;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.hangman.R;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    Button continueButton;
    EditText editText;
    TextView textView;
    TextView greeting;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences("com.example.hangman.PREFERENCES", Context.MODE_PRIVATE);

        checkUser();
        Log.d(TAG, "onCreate: \nUser name is " + sharedPreferences.getString("USER_NAME", "test"));

        initializeViews();
    }

    private void checkUser() {
        if (sharedPreferences.getString("USER_NAME", null) == null) {
            //ask for user's name

            AlertDialog.Builder popup = new AlertDialog.Builder(this);

            final EditText editText = new EditText(this);
            editText.setSingleLine();

            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setPaddingRelative(45, 15, 45, 0);
            frameLayout.addView(editText);

            popup.setView(frameLayout);
            popup.setTitle("Welcome to the game!");
            popup.setMessage("Please enter your name:");
            popup.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //dialogInterface.cancel();
                    String name = editText.getText().toString();
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("USER_NAME", name);
                    editor.putStringSet("COMPLETED_WORDS", new HashSet<String>());
                    editor.apply();
                }
            });

            AlertDialog alertDialog = popup.create();
            alertDialog.show();
        }
    }

    private void initializeViews() {
        continueButton = findViewById(R.id.button_continue);
        if (sharedPreferences.getBoolean("GAME_ACTIVE", false) == false) {
            continueButton.setVisibility(View.GONE);
        }
        submitButton = findViewById(R.id.submit);
        submitButton.setVisibility(View.GONE);

        editText = findViewById(R.id.editText);
        editText.setVisibility(View.GONE);

        textView = findViewById(R.id.textView2);
        textView.setVisibility(View.GONE);

        greeting = findViewById(R.id.textView);
        greeting.setText("Hello, " + sharedPreferences.getString("USER_NAME", "guest") + "!");
    }

    public void onePlayerButton(View view) {
        if (sharedPreferences.getString("CURRENT_WORD", null) != null) {
            AlertDialog.Builder popup = new AlertDialog.Builder(this);

            FrameLayout frameLayout = new FrameLayout(this);
            //frameLayout.setPaddingRelative(45, 15, 45, 0);

            popup.setView(frameLayout);
            popup.setTitle("Are you sure?");
            popup.setMessage("You already have an active game. If you start a new game now, then your progress in the previous game will be lost.");
            popup.setPositiveButton(R.string.popup_positive, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    //dialogInterface.cancel();
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putStringSet("GUESSED_LETTERS", new HashSet<String>());
                    editor.apply();
                    Intent intent = new Intent(getApplicationContext(), GameActivity.class);
                    intent.putExtra("ONE_PLAYER", true);
                    startActivity(intent);
                }
            });
            popup.setNegativeButton(R.string.popup_negative, new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
                   dialogInterface.cancel();
               }
            });

            AlertDialog alertDialog = popup.create();
            alertDialog.show();
        }
        else {
            Intent intent = new Intent(this, GameActivity.class);
            intent.putExtra("ONE_PLAYER", true);
            startActivity(intent);
        }
    }

    public void twoPlayerButton(View view) {
        if (sharedPreferences.getString("CURRENT_WORD", null) != null) {
            AlertDialog.Builder popup = new AlertDialog.Builder(this);

            FrameLayout frameLayout = new FrameLayout(this);
            //frameLayout.setPaddingRelative(45, 15, 45, 0);

            popup.setView(frameLayout);
            popup.setTitle("Are you sure?");
            popup.setMessage("You already have an active game. If you start a new game now, then your progress in the previous game will be lost.");
            popup.setPositiveButton(R.string.popup_positive, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                    editText.setVisibility(View.VISIBLE);
                    submitButton.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                }
            });
            popup.setNegativeButton(R.string.popup_negative, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });

            AlertDialog alertDialog = popup.create();
            alertDialog.show();
        }
        else {
            editText.setVisibility(View.VISIBLE);
            submitButton.setVisibility(View.VISIBLE);
            textView.setVisibility(View.VISIBLE);
        }
    }

    public void submitButton(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("ONE_PLAYER", false);
        intent.putExtra("USER_WORD", editText.getText().toString());
        startActivity(intent);
    }

    public void continueButton(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("ONE_PLAYER", false);
        intent.putExtra("USER_WORD", sharedPreferences.getString("CURRENT_WORD", null));
        startActivity(intent);
    }
}