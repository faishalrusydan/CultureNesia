package com.runupstdio.culturenesia;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;

public class trueAnswerLoad {
    Activity activity;
    Dialog dialog;
    //..we need the context else we can not create the dialog so get context in constructor
    public trueAnswerLoad(Activity activity) {
        this.activity = activity;
    }

    public void showDialog() {
        dialog  = new Dialog(activity);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //...set cancelable false so that it's never get hidden
        dialog.setCancelable(false);
        //...that's the layout i told you will inflate later
        dialog.setContentView(R.layout.dialog_true_load);
        //...finaly show it
        dialog.show();
    }

    //..also create a method which will hide the dialog when some work is done
    public void hideDialog(){
        dialog.dismiss();
    }
}