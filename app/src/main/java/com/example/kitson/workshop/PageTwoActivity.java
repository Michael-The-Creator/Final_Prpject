package com.example.kitson.workshop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by kitson on 2016/3/20.
 */
public class PageTwoActivity extends Activity {
    private TextView moveToPageThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_two);
        moveToPageThree = (TextView)findViewById(R.id.moveToPageThree);
        moveToPageThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PageTwoActivity.this,PageThreeActivity.class);
                startActivity(intent);
            }
        });
    }
}
