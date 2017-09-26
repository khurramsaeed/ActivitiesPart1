package com.ksm.activitiespart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private int counter;
    private static final String BUNDLE_COUNTER = "BUNDLE_COUNTER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recovering the instance state
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(BUNDLE_COUNTER);
        }

        final TextView textView = (TextView) findViewById(R.id.activity_main_text);
        View button = findViewById(R.id.activity_main_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textView.setText(Integer.toString(counter));
            }
        });

        textView.setText(Integer.toString(counter));
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt(BUNDLE_COUNTER, counter);
    }
}
