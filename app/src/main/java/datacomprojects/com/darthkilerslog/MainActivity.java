package datacomprojects.com.darthkilerslog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import datacomprojects.com.log.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        L.show("first message","hello");
    }
}
