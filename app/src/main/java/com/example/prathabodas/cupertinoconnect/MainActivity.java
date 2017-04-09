package com.example.prathabodas.cupertinoconnect;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by prathabodas on 4/8/17.
 */

public class MainActivity extends Activity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        final Button go = (Button)findViewById(R.id.go);
        go.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapActivity.class));
            }
        });
    }
}
