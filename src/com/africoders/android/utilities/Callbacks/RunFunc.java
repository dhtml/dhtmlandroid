package com.africoders.android.utilities.Callbacks;


import android.app.Dialog;

/**
 * Created by Dr. Anthony Ogundipe on 5/28/2015.
 */
public class RunFunc implements Runnable {
    public static Response response = null;
    public static String popuptext = null;
    public static Dialog dialog = null;

    public RunFunc(Response response) {
        this.response=response;
    }

    public RunFunc() {

    }


    @Override
    public void run() {

    }


}
