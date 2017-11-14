package com.zx.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VoltAdapter adapter = new VoltAdapter();
        TextView tv = (TextView) findViewById(R.id.tv_test);
        tv.setText("输出电压：" + adapter.getVolt5());
    }
}
