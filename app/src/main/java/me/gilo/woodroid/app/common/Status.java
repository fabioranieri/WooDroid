package me.gilo.woodroid.app.common;

public enum Status {
    EMPTY,
    SUCCESS,
    ERROR,
    LOADING;

    public Status isLoading(){
        return LOADING;
    }
}
