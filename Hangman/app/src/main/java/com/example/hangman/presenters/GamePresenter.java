package com.example.hangman.presenters;

import android.content.Context;

import com.example.hangman.models.HangmanGame;
import com.example.hangman.views.IGameView;

import java.util.Set;

public class GamePresenter implements IGamePresenter{
    private HangmanGame model;
    private IGameView view;
    private Context context;

    public GamePresenter(IGameView view, Context context) {
        this.view = view;
        this.context = context;
        model = new HangmanGame(context, this);
    }

    @Override
    public void startGame(Boolean onePlayer, String userWord, Set<String> wordList) {
        if (onePlayer) {
            model.populateMasterWordBank();
            model.setUserWordBank(wordList);

            if (model.getUserWordBank().isEmpty()) {
                //model.setWord("test");
                view.createSnackbar("You are out of words!");
                view.returnHome();
            } else {
                model.setRandomWord();

            }


        } else {
            model.setWord(userWord);
        }
        view.setDisplayWord(model.getWordUnderlines());
    }

    @Override
    public String getWordUppercase() {
        return model.getWordUppercase();
    }

    @Override
    public void setWordVowels() {
        model.setWordVowels();
    }

    @Override
    public String getWordUnderlines() {
        return model.getWordUnderlines();
    }

    @Override
    public String getWord() {
        return model.getWord();
    }

    @Override
    public void checkGuess(String lowercase) {
        String uppercase = lowercase.toUpperCase() + " ";
        String word = model.getWord();

        //if guess is incorrect
        if (!(word.contains(lowercase))) {
            //incrementGuesses();
            model.incrementGuesses();
            view.changeImage(model.getGuesses());
        }
        //if guess is correct
        else {
            word = word.replaceAll(lowercase, uppercase);
            model.updateWord(word);
            view.setDisplayWord(model.getWordUnderlines());

            //if player has won
            if (word.matches("(.*)[a-z](.*)") == false) {
                view.onPlayerWin();
                view.createPopup("You win!");
            }
        }
        model.updateGuessedLetters(lowercase);
    }


//    public void setModel(HangmanGame hangmanGame) {
//        mHangmanGame = hangmanGame;
//    }
}
