package jialidu.nanjing.com.dialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wch.xalertdialog.ProgressHelper;
import com.wch.xalertdialog.ProgressWheel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressHelper mProgressHelper = new ProgressHelper(this);
        mProgressHelper.setProgressWheel((ProgressWheel) findViewById(R.id.progressWheel));
    }
}
