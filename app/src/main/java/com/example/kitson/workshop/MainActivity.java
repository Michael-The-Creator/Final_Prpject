package com.example.kitson.workshop;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView scratchsprite,nextPage_textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scratchsprite = (TextView)findViewById(R.id.scratchsprite);
        nextPage_textView = (TextView)findViewById(R.id.nextPage_textView);
        scratchsprite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String website = scratchsprite.getText().toString();
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse(website) );
                startActivity( browse );
            }
        });

        nextPage_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PageTwoActivity.class);
                startActivity(intent);
            }
        });
    }

}
