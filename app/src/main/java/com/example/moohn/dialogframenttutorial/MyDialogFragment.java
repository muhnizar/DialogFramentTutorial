package com.example.moohn.dialogframenttutorial;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class MyDialogFragment extends DialogFragment  {

    private EditText mEditText;

    public MyDialogFragment() {
        // Empty constructor required for DialogFragment
    }

    //    create custom dialog
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_username, container);

        mEditText = (EditText) view.findViewById(R.id.username);
        getDialog().setTitle("Please enter username");

        return view;
    }

}
