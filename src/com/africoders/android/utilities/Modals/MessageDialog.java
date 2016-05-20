package com.africoders.android.utilities.Modals;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;

/**
 new MessageDialog(Instance).setTitle("Fantastic").setIcon(R.mipmap.ic_launcher).setMessage("Loading, please wait...").show();
 */
public class MessageDialog {
    public static Context context;

    public static AlertDialog.Builder dialog;
    public static boolean initialize=false;
    public static Runnable finalizer=null;
    String message=null;
    String title=null;
    Drawable icon=null;
    int iconid=0;

    private String close_text="Close";

    public MessageDialog(Context context) {
        this.context=context;
    }

    public MessageDialog show() {
        dialog = new AlertDialog.Builder(context);

        if(message!=null) {dialog.setMessage(message);}
        if(title!=null) {dialog.setTitle(title);}
        if(icon!=null) {dialog.setIcon(icon);}
        if(iconid!=0) {dialog.setIcon(iconid);}


        dialog.setPositiveButton(close_text, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                if(finalizer!=null) {
                    finalizer.run();
                }
            }
        });

        dialog.show();

        return this;
    }

    public MessageDialog set_close_text(String close_text) {
        this.close_text=close_text;
        return this;
    }

    public MessageDialog setFinalizer(Runnable finalizer) {
        this.finalizer=finalizer;
        return this;
    }


    //set message of dialog
    public MessageDialog setMessage(String message) {
        this.message=message;
        return this;
    }

    //set title of dialog
    public MessageDialog setTitle(String title) {
        this.title=title;
        return this;
    }

    //set icon
    public MessageDialog setIcon(Drawable icon) {
        this.icon=icon;
        return this;
    }

    //set icon id
    public MessageDialog setIcon(int iconid) {
        this.iconid=iconid;
        return this;
    }


}
