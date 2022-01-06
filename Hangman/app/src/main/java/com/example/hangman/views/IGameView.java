package com.example.hangman.views;

public interface IGameView {
    void createPopup(String s);
    void createSnackbar(String s);
    void changeImage(int i);
    void setDisplayWord(String s);
    void onPlayerWin();
    void returnHome();
}
