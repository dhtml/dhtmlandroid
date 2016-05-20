package com.africoders.android.utilities.Modals;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/**
 new WaitDialog(this).Show();
 new WaitDialog(Instance).setMessage("Please wait").Show();
 new WaitDialog(Instance).setMessage("Loading, please wait...").dismiss(6).show();
 new WaitDialog(Instance).setTitle("Fantastic").setIcon(R.mipmap.ic_launcher).setMessage("Loading, please wait...").dismiss(6).show();
 */

public class WaitDialog {
    public static Context context;
    public static ProgressDialog dialog=null;
    String message=null;
    String title=null;
    Drawable icon=null;
    int iconid=0;

    public WaitDialog(Context context) {
        this.context=context;
    }

    public WaitDialog show() {
        dialog = new ProgressDialog(context); // this = YourActivity
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        if(message!=null) {dialog.setMessage(message);}
        if(title!=null) {dialog.setTitle(title);}
        if(icon!=null) {dialog.setIcon(icon);}
        if(iconid!=0) {dialog.setIcon(iconid);}

        dialog.setIndeterminate(true);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
        return this;
    }

    //set message of dialog
    public WaitDialog setMessage(String message) {
        this.message=message;
        return this;
    }

    //set title of dialog
    public WaitDialog setTitle(String title) {
        this.title=title;
        return this;
    }

    //dismiss wait dialog immediately
    public WaitDialog dismiss() {
        try {
          if(dialog!=null)  {dialog.dismiss();dialog=null;}
        } catch (Exception e) {e.printStackTrace();}
        return this;
    }

    //dismiss dialog after a certain number of seconds
    public WaitDialog dismiss(int secs) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                dismiss();
            }
        },secs*1000);
        return this;
    }

    //set icon
    public WaitDialog setIcon(Drawable icon) {
        this.icon=icon;
        return this;
    }

    //set icon id
    public WaitDialog setIcon(int iconid) {
        this.iconid=iconid;
        return this;
    }

}
