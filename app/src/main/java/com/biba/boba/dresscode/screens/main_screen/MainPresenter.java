package com.biba.boba.dresscode.screens.main_screen;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.annotation.NonNull;

import com.biba.boba.dresscode.R;
import com.biba.boba.dresscode.screens.news_screen.NewsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainPresenter implements OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener
{
    private MainView view;

    MainPresenter(MainView view)
    {
        this.view = view;
    }

    @Override
    public void onClick(View v)
    {
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.news_page:
                view.loadActivity(NewsActivity.class);
                return true;

            case R.id.main_page:
                return true;
        }

        return false;
    }

    void onDetachView()
    {
        view = null;
    }
}
