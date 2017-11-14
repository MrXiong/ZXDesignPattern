package com.zx.policy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
/*
简化if else ，switch case
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Policy policy = new PrimaryPolicy();
        Policy policy = new SeniorPolicy();

        Price price = new Price(policy);

        double newprice = price.count(300);
        Log.v("tag", "========" + newprice);
    }
}
