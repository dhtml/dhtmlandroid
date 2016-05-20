package com.africoders.android.utilities.Modals;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.africoders.android.utilities.Callbacks.MyRunnable;


/**
 * Created by Dr. Anthony Ogundipe on 5/28/2015.
 */

public class Confirm {
    public static Context context;
    public static Confirm Instance;
    public static String yes="Yes";
    public static String no="No";

    public Confirm(Context context) {
        Instance=this;
        this.context=context;
    }

    public static void show(String Message,final MyRunnable func) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(Message)
                .setCancelable(false)
                .setPositiveButton(no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        func.run(context, false,"", dialog);
                    }
                })
                 .setNegativeButton(yes, new DialogInterface.OnClickListener() {
                             public void onClick(DialogInterface dialog, int id) {
                                 func.run(context,true,"",dialog);
                             }
                         }
                 );
        AlertDialog alert = builder.create();
        alert.show();
    }

    public static void show(String Message, String Title,final MyRunnable func) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(Title)
                .setMessage(Message)
                .setCancelable(false)
                .setPositiveButton(no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        func.run(context,false,"",dialog);
                    }
                })
                .setNegativeButton(yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                func.run(context,true,"",dialog);
                            }
                        }
                );
        AlertDialog alert = builder.create();
        alert.show();
    }

    public static void show(String Message,final MyRunnable func,final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(Message)
                .setCancelable(false)
                .setPositiveButton(no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        func.run(context, false,"", dialog);
                    }
                })
                .setNegativeButton(yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                func.run(context,true,"",dialog);
                            }
                        }
                );
        AlertDialog alert = builder.create();
        alert.show();
    }

    public static void show(String Message, String Title,final MyRunnable func,final Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(Title)
                .setMessage(Message)
                .setCancelable(false)
                .setPositiveButton(no, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        func.run(context,false,"",dialog);
                    }
                })
                .setNegativeButton(yes, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                func.run(context,true,"",dialog);
                            }
                        }
                );
        AlertDialog alert = builder.create();
        alert.show();
    }


}

