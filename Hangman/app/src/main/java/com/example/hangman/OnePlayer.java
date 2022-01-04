package com.example.hangman;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class OnePlayer extends AppCompatActivity {

    HangmanGame game;
    ImageView image;
    TextView displayWord;
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonF;
    Button buttonG;
    Button buttonH;
    Button buttonI;
    Button buttonJ;
    Button buttonK;
    Button buttonL;
    Button buttonM;
    Button buttonN;
    Button buttonO;
    Button buttonP;
    Button buttonQ;
    Button buttonR;
    Button buttonS;
    Button buttonT;
    Button buttonU;
    Button buttonV;
    Button buttonW;
    Button buttonX;
    Button buttonY;
    Button buttonZ;
    Button buttonHint;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);

        initializeViews();

        game = new HangmanGame(this);

        setDisplayWord(game.getWordUnderlines());
    }

    private void initializeViews() {
        displayWord = findViewById(R.id.displayWord);
        image = findViewById(R.id.imageView);
        buttonHint = (Button) findViewById(R.id.buttonHint);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonF = (Button) findViewById(R.id.buttonF);
        buttonG = (Button) findViewById(R.id.buttonG);
        buttonH = (Button) findViewById(R.id.buttonH);
        buttonI = (Button) findViewById(R.id.buttonI);
        buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonK = (Button) findViewById(R.id.buttonK);
        buttonL = (Button) findViewById(R.id.buttonL);
        buttonM = (Button) findViewById(R.id.buttonM);
        buttonN = (Button) findViewById(R.id.buttonN);
        buttonO = (Button) findViewById(R.id.buttonO);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonQ = (Button) findViewById(R.id.buttonQ);
        buttonR = (Button) findViewById(R.id.buttonR);
        buttonS = (Button) findViewById(R.id.buttonS);
        buttonT = (Button) findViewById(R.id.buttonT);
        buttonU = (Button) findViewById(R.id.buttonU);
        buttonV = (Button) findViewById(R.id.buttonV);
        buttonW = (Button) findViewById(R.id.buttonW);
        buttonX = (Button) findViewById(R.id.buttonX);
        buttonY = (Button) findViewById(R.id.buttonY);
        buttonZ = (Button) findViewById(R.id.buttonZ);
    }

    private void guessButton(String uppercase, String lowercase, Button button) {
        game.checkGuessOnePlayer(uppercase, lowercase);
        button.setEnabled(false);
    }

    public void onClickButtons(View view) {
        switch (view.getId()) {
            case R.id.buttonHint:
                game.setWordVowels();
                buttonHint.setEnabled(false);
                buttonA.setEnabled(false);
                buttonE.setEnabled(false);
                buttonI.setEnabled(false);
                buttonO.setEnabled(false);
                buttonU.setEnabled(false);
                setDisplayWord(game.getWordUnderlines());
                break;
            case R.id.buttonA:
                guessButton("A ", "a", buttonA);
                break;
            case R.id.buttonB:
                guessButton("B ", "b", buttonB);
                break;
            case R.id.buttonC:
                guessButton("C ", "c", buttonC);
                break;
            case R.id.buttonD:
                guessButton("D ", "d", buttonD);
                break;
            case R.id.buttonE:
                guessButton("E ", "e", buttonE);
                break;
            case R.id.buttonF:
                guessButton("F ", "f", buttonF);
                break;
            case R.id.buttonG:
                guessButton("G ", "g", buttonG);
                break;
            case R.id.buttonH:
                guessButton("H ", "h", buttonH);
                break;
            case R.id.buttonI:
                guessButton("I ", "i", buttonI);
                break;
            case R.id.buttonJ:
                guessButton("J ", "j", buttonJ);
                break;
            case R.id.buttonK:
                guessButton("K ", "k", buttonK);
                break;
            case R.id.buttonL:
                guessButton("L ", "l", buttonL);
                break;
            case R.id.buttonM:
                guessButton("M ", "m", buttonM);
                break;
            case R.id.buttonN:
                guessButton("N ", "n", buttonN);
                break;
            case R.id.buttonO:
                guessButton("O ", "o", buttonO);
                break;
            case R.id.buttonP:
                guessButton("P ", "p", buttonP);
                break;
            case R.id.buttonQ:
                guessButton("Q ", "q", buttonQ);
                break;
            case R.id.buttonR:
                guessButton("R ", "r", buttonR);
                break;
            case R.id.buttonS:
                guessButton("S ", "s", buttonS);
                break;
            case R.id.buttonT:
                guessButton("T ", "t", buttonT);
                break;
            case R.id.buttonU:
                guessButton("U ", "u", buttonU);
                break;
            case R.id.buttonV:
                guessButton("V ", "v", buttonV);
                break;
            case R.id.buttonW:
                guessButton("W ", "w", buttonW);
                break;
            case R.id.buttonX:
                guessButton("X ", "x", buttonX);
                break;
            case R.id.buttonY:
                guessButton("Y ", "y", buttonY);
                break;
            case R.id.buttonZ:
                guessButton("Z ", "z", buttonZ);
                break;
            default:
                Snackbar.make(view, "Oh no! Something went wrong.", Snackbar.LENGTH_SHORT);
                break;
        }
    }

    public void setDisplayWord(String s) {
        displayWord.setText(s);
    }

    public void changeImage(int i) {
        switch (i) {
            case 1:
                image.setImageResource(R.drawable.head);
                break;
            case 2:
                image.setImageResource(R.drawable.body);
                break;
            case 3:
                image.setImageResource(R.drawable.left_leg);
                break;
            case 4:
                image.setImageResource(R.drawable.right_leg);
                break;
            case 5:
                image.setImageResource(R.drawable.left_arm);
                break;
            case 6:
                image.setImageResource(R.drawable.right_arm);
                createPopup("You lost :(");
                break;
            default: break;
        }
    }

    public void createPopup(String title) {
        AlertDialog.Builder popup = new AlertDialog.Builder(this);
        popup.setTitle(title);
        popup.setMessage("The word was: " + game.getWordUppercase() + "\n\nWould you like to play again?");

        popup.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                recreate();
                dialogInterface.cancel();
            }
        });

        popup.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                dialogInterface.cancel();
            }
        });

        AlertDialog alertDialog = popup.create();
        alertDialog.show();
    }
}