package com.example.moohn.dialogframenttutorial;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // close existing dialog fragments
        FragmentManager manager = getFragmentManager();
        switch (item.getItemId()) {
            case R.id.actionitem_userdialog:
                MyDialogFragment editNameDialog = new MyDialogFragment();
                editNameDialog.setRetainInstance(true);
                editNameDialog.show(manager, "user fragment");
                break;
            case R.id.actionitem_alertdialog:
                AlertDialogFragment alertDialogFragment = new AlertDialogFragment();
                alertDialogFragment.setRetainInstance(true);
                alertDialogFragment.show(manager, "alert fragment");
                break;
        }
        return true;
    }
}
