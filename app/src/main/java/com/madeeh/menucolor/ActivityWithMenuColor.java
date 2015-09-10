package com.madeeh.menucolor;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class ActivityWithMenuColor extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_with_menu_color);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_activity_with_menu_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        RelativeLayout layout=(RelativeLayout)findViewById(R.id.mylayout);

        int id = item.getItemId();


        if (id == R.id.action_settings) {
            Toast.makeText(getApplicationContext(),"Settings will appear shortyl",Toast.LENGTH_SHORT).show();
        }
        else if(id==R.id.menu_blue){
            layout.setBackgroundColor(Color.BLUE);
        }
        else if(id==R.id.menu_green){
            layout.setBackgroundColor(Color.GREEN);
        }
        else if(id==R.id.menu_red){
            layout.setBackgroundColor(Color.RED);
        }
        else if(id==R.id.menu_yellow){
            layout.setBackgroundColor(Color.YELLOW);
        }

        return super.onOptionsItemSelected(item);
    }
}
