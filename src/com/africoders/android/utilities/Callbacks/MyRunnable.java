package com.africoders.android.utilities.Callbacks;


import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Dr. Anthony Ogundipe on 5/28/2015.
 */
public interface MyRunnable extends Runnable {
    public void run();
    public void run(Context ct, Boolean response, String rtext, DialogInterface dialog);
}
