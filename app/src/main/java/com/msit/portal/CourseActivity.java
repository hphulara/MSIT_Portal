package com.msit.portal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;


public class CourseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        TextView cse=(TextView)findViewById(R.id.cse);
        TextView eee=(TextView)findViewById(R.id.eee);
        TextView it=(TextView)findViewById(R.id.it);
        TextView ece=(TextView)findViewById(R.id.ece);

        cse.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent cseIntent = new Intent(getApplicationContext(), cseActivity2.class);
                startActivity(cseIntent);
                return false;
            }
        });
        it.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent itIntent = new Intent(getApplicationContext(), itActivity2.class);
                startActivity(itIntent);
                return false;
            }
        });
        eee.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent eeeIntent = new Intent(getApplicationContext(), eeeActivity2.class);
                startActivity(eeeIntent);
                return false;
            }
        });
        ece.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Intent eceIntent = new Intent(getApplicationContext(), eceActivity2.class);
                startActivity(eceIntent);
                return false;
            }
        });
    }



}
