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

        initializeButtons();

        displayWord = findViewById(R.id.displayWord);
        image = findViewById(R.id.imageView);
        game = new HangmanGame(this);

        setDisplayWord(game.getWordUnderlines());
    }

    private void initializeButtons() {
        buttonHint = (Button) findViewById(R.id.buttonHint);
        buttonHint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                game.setWordVowels();
                buttonHint.setEnabled(false);
                buttonA.setEnabled(false);
                buttonE.setEnabled(false);
                buttonI.setEnabled(false);
                buttonO.setEnabled(false);
                buttonU.setEnabled(false);
                setDisplayWord(game.getWordUnderlines());
            }
        });

        buttonA = (Button) findViewById(R.id.buttonA);
        buttonA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("A ", "a", buttonA);
            }
        });

        buttonB = (Button) findViewById(R.id.buttonB);
        buttonB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("B ", "b", buttonB);
            }
        });

        buttonC = (Button) findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("C ", "c", buttonC);
            }
        });

        buttonD = (Button) findViewById(R.id.buttonD);
        buttonD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("D ", "d", buttonD);
            }
        });

        buttonE = (Button) findViewById(R.id.buttonE);
        buttonE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("E ", "e", buttonE);
            }
        });

        buttonF = (Button) findViewById(R.id.buttonF);
        buttonF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("F ", "f", buttonF);
            }
        });

        buttonG = (Button) findViewById(R.id.buttonG);
        buttonG.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("G ", "g", buttonG);
            }
        });

        buttonH = (Button) findViewById(R.id.buttonH);
        buttonH.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("H ", "h", buttonH);
            }
        });

        buttonI = (Button) findViewById(R.id.buttonI);
        buttonI.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("I ", "i", buttonI);
            }
        });

        buttonJ = (Button) findViewById(R.id.buttonJ);
        buttonJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("J ", "j", buttonJ);
            }
        });

        buttonK = (Button) findViewById(R.id.buttonK);
        buttonK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("K ", "k", buttonK);
            }
        });

        buttonL = (Button) findViewById(R.id.buttonL);
        buttonL.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("L ", "l", buttonL);
            }
        });

        buttonM = (Button) findViewById(R.id.buttonM);
        buttonM.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("M ", "m", buttonM);
            }
        });

        buttonN = (Button) findViewById(R.id.buttonN);
        buttonN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("N ", "n", buttonN);
            }
        });

        buttonO = (Button) findViewById(R.id.buttonO);
        buttonO.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("O ", "o", buttonO);
            }
        });

        buttonP = (Button) findViewById(R.id.buttonP);
        buttonP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("P ", "p", buttonP);
            }
        });

        buttonQ = (Button) findViewById(R.id.buttonQ);
        buttonQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("Q ", "q", buttonQ);
            }
        });

        buttonR = (Button) findViewById(R.id.buttonR);
        buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("R ", "r", buttonR);
            }
        });

        buttonS = (Button) findViewById(R.id.buttonS);
        buttonS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("S ", "s", buttonS);
            }
        });

        buttonT = (Button) findViewById(R.id.buttonT);
        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("T ", "t", buttonT);
            }
        });

        buttonU = (Button) findViewById(R.id.buttonU);
        buttonU.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("U ", "u", buttonU);
            }
        });

        buttonV = (Button) findViewById(R.id.buttonV);
        buttonV.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("V ", "v", buttonV);
            }
        });

        buttonW = (Button) findViewById(R.id.buttonW);
        buttonW.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("W ", "w", buttonW);
            }
        });

        buttonX = (Button) findViewById(R.id.buttonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("X ", "x", buttonX);
            }
        });

        buttonY = (Button) findViewById(R.id.buttonY);
        buttonY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("Y ", "y", buttonY);
            }
        });

        buttonZ = (Button) findViewById(R.id.buttonZ);
        buttonZ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guessButton("Z ", "z", buttonZ);
            }
        });
    }

    private void guessButton(String uppercase, String lowercase, Button button) {
        game.checkGuessOnePlayer(uppercase, lowercase);
        button.setEnabled(false);
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