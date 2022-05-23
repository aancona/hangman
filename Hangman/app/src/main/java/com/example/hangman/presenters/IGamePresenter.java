package com.example.hangman.presenters;

import java.util.ArrayList;
import java.util.Set;

public interface IGamePresenter {
    void setWordVowels();
    //void setWord();
    String getWordUppercase();
    String getWordUnderlines();
    String getWord();
    void checkGuess(String lowercase);
    void startGame(Boolean onePlayer, String userWord, Set<String> wordList);
    public ArrayList<String> getGuessedLetters();
}
