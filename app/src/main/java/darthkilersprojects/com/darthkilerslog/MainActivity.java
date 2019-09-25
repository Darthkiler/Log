package darthkilersprojects.com.darthkilerslog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import darthkilersprojects.com.log.L;

public class MainActivity extends AppCompatActivity {

    public static int qwe=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        L.show("first message","hello");

        L.show(L.Utils.asList("qwe",null,1.5f,true));

        L.show(L.Utils.getConstantName(MainActivity.class,MainActivity.qwe));

        L.showAsToast(this,"toast",-5L);

        L.showAsToast(this,666);
    }
}
