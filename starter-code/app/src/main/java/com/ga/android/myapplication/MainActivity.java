package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements PlaceholderFragment.OnListItemClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_content_container,
                        MainFragment.newInstance(this))
                .commit();

    }

   @Override
    public void onListItemClicked(int tabPosition, int listItemPosition) {

   }
}
