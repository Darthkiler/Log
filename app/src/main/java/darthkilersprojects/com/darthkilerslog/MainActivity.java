package darthkilersprojects.com.darthkilerslog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import darthkilersprojects.com.log.L;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestLog.INSTANCE.simpleShow();
        L.show();
        TestLog.INSTANCE.showObject();
        L.show();
        TestLog.INSTANCE.showLambda();
        L.show();
        TestLog.INSTANCE.showDebug();
        L.show();
        TestLog.INSTANCE.showNull();
    }
}
