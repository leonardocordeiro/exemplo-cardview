package net.leonardocordeiro.testerecycleviewecardview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity {

    private Toolbar mToolbar;
    private Toolbar mToolbarBottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar_main);

        mToolbar.setNavigationIcon(R.drawable.ic_menu);
        mToolbar.setTitle("UEZO");

        setSupportActionBar(mToolbar);

        mToolbarBottom = (Toolbar) findViewById(R.id.inc_toolbar_bottom);
        mToolbarBottom.inflateMenu(R.menu.toolbar_bottom_menu);

    }



}
