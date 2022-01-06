package com.example.hangman.views;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hangman.models.HangmanGame;
import com.example.hangman.R;
import com.example.hangman.presenters.GamePresenter;
import com.google.android.material.snackbar.Snackbar;

import java.util.HashSet;
import java.util.Set;

public class GameActivity extends AppCompatActivity implements IGameView {
    private ImageView image;
    private TextView displayWord;
    private Button buttonA;
    private Button buttonB;
    private Button buttonC;
    private Button buttonD;
    private Button buttonE;
    private Button buttonF;
    private Button buttonG;
    private Button buttonH;
    private Button buttonI;
    private Button buttonJ;
    private Button buttonK;
    private Button buttonL;
    private Button buttonM;
    private Button buttonN;
    private Button buttonO;
    private Button buttonP;
    private Button buttonQ;
    private Button buttonR;
    private Button buttonS;
    private Button buttonT;
    private Button buttonU;
    private Button buttonV;
    private Button buttonW;
    private Button buttonX;
    private Button buttonY;
    private Button buttonZ;
    private Button buttonHint;
    private SharedPreferences sharedPreferences;
    private GamePresenter gamePresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        sharedPreferences = getSharedPreferences("com.example.hangman.PREFERENCES", Context.MODE_PRIVATE);

        Intent intent = getIntent();
        Boolean onePlayer = intent.getBooleanExtra("ONE_PLAYER", true);
        String userWord = intent.getStringExtra("USER_WORD");
        Set<String> wordList = sharedPreferences.getStringSet("COMPLETED_WORDS", null);

        gamePresenter = new GamePresenter(this, getApplicationContext());

        //TODO: fix this, it will always return home because the word hasn't been set yet
        if ( (gamePresenter.getWord() != null)) {
            initializeViews();
            gamePresenter.startGame(onePlayer, userWord, wordList);

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("CURRENT_WORD", gamePresenter.getWord());
            editor.putBoolean("GAME_ACTIVE", true);
            editor.apply();
        } else {
            returnHome();
        }
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

    private void guessButton(String lowercase, Button button) {
        gamePresenter.checkGuess(lowercase);
        button.setEnabled(false);
    }

    @Override
    public void setDisplayWord(String s) {
        displayWord.setText(s);
    }

    @Override
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
                onPlayerWin();
                createPopup("You lost :(");
                break;
            default: break;
        }
    }

    public void onClickButtons(View view) {
        switch (view.getId()) {
            case R.id.buttonHint:
                gamePresenter.setWordVowels();
                buttonHint.setEnabled(false);
                buttonA.setEnabled(false);
                buttonE.setEnabled(false);
                buttonI.setEnabled(false);
                buttonO.setEnabled(false);
                buttonU.setEnabled(false);
                setDisplayWord(gamePresenter.getWordUnderlines());
                break;
            case R.id.buttonA:
                guessButton("a", buttonA);
                break;
            case R.id.buttonB:
                guessButton("b", buttonB);
                break;
            case R.id.buttonC:
                guessButton("c", buttonC);
                break;
            case R.id.buttonD:
                guessButton("d", buttonD);
                break;
            case R.id.buttonE:
                guessButton("e", buttonE);
                break;
            case R.id.buttonF:
                guessButton("f", buttonF);
                break;
            case R.id.buttonG:
                guessButton("g", buttonG);
                break;
            case R.id.buttonH:
                guessButton("h", buttonH);
                break;
            case R.id.buttonI:
                guessButton("i", buttonI);
                break;
            case R.id.buttonJ:
                guessButton("j", buttonJ);
                break;
            case R.id.buttonK:
                guessButton("k", buttonK);
                break;
            case R.id.buttonL:
                guessButton("l", buttonL);
                break;
            case R.id.buttonM:
                guessButton("m", buttonM);
                break;
            case R.id.buttonN:
                guessButton("n", buttonN);
                break;
            case R.id.buttonO:
                guessButton("o", buttonO);
                break;
            case R.id.buttonP:
                guessButton("p", buttonP);
                break;
            case R.id.buttonQ:
                guessButton("q", buttonQ);
                break;
            case R.id.buttonR:
                guessButton("r", buttonR);
                break;
            case R.id.buttonS:
                guessButton("s", buttonS);
                break;
            case R.id.buttonT:
                guessButton("t", buttonT);
                break;
            case R.id.buttonU:
                guessButton("u", buttonU);
                break;
            case R.id.buttonV:
                guessButton("v", buttonV);
                break;
            case R.id.buttonW:
                guessButton("w", buttonW);
                break;
            case R.id.buttonX:
                guessButton("x", buttonX);
                break;
            case R.id.buttonY:
                guessButton("y", buttonY);
                break;
            case R.id.buttonZ:
                guessButton("z", buttonZ);
                break;
            default:
                Snackbar.make(view, "Oh no! Something went wrong.", Snackbar.LENGTH_SHORT);
                break;
        }
    }

    @Override
    public void onPlayerWin() {
        Set<String> wordList = sharedPreferences.getStringSet("COMPLETED_WORDS", new HashSet<>());
        wordList.add(sharedPreferences.getString("CURRENT_WORD", null));

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putStringSet("COMPLETED_WORDS", wordList);
        editor.putString("CURRENT_WORD", null);
        editor.putBoolean("GAME_ACTIVE", false);

        editor.apply();
    }

    @Override
    public void createPopup(String title) {
        AlertDialog.Builder popup = new AlertDialog.Builder(this);
        popup.setTitle(title);
        popup.setMessage("The word was: " + gamePresenter.getWordUppercase() + "\n\nWould you like to play again?");

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

    @Override
    public void createSnackbar(String s) {
        Snackbar.make(findViewById(R.id.imageView), s, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void returnHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}