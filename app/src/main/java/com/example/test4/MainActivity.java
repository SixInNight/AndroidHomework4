package com.example.test4;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.test4.widget.Clock;

public class MainActivity extends AppCompatActivity {

    private View mRootView;
    private Clock mClockView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRootView = findViewById(R.id.root);
        mClockView = findViewById(R.id.clock);

    }
}
