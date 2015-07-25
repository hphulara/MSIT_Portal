package com.msit.portal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class SyllabusActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus);
        TextView cse= (TextView) findViewById(R.id.cse);
        TextView ece= (TextView) findViewById(R.id.ece);
        TextView it= (TextView) findViewById(R.id.it);
        TextView eee= (TextView) findViewById(R.id.eee);
        cse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent cseIntent= new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(cseIntent);
                return false;


            }
        });
       ece.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eceIntent= new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(eceIntent);
                return false;

            }
        });
        it.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent itIntent = new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(itIntent);
                return false;

            }
        });
        eee.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                Intent eeeIntent = new Intent(getApplicationContext(), SemesterActivity.class);
                startActivity(eeeIntent);
                return false;

            }
        });
    }

    // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return true;
    }

    /**
     * Event Handling for Individual menu item selected
     * Identify single menu item by it's id
     * */
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId())
        {
            case R.id.menu_bookmark:
                // Single menu item is selected do something
                // Ex: launching new activity/screen or show alert message
                Toast.makeText(SyllabusActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_save:
                Intent b = new Intent(getApplicationContext(),FaqActivity.class);
                Toast.makeText(SyllabusActivity.this, "FAQ is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_search:
                Toast.makeText(SyllabusActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_share:
                Toast.makeText(SyllabusActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_delete:
                Toast.makeText(SyllabusActivity.this, "Delete is Selected", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menu_preferences:
                Toast.makeText(SyllabusActivity.this, "Preferences is Selected", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

}



