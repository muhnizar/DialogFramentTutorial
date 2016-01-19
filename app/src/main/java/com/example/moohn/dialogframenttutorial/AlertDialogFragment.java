package com.example.moohn.dialogframenttutorial;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by moohn on 1/20/2016.
 */
public class AlertDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
        alertDialog.setTitle("Alert!");
        alertDialog.setMessage("This is a notication dialog");
        return alertDialog.create();

    }
}
