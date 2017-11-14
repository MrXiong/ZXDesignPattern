package com.zx.decorator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //首先有一个男孩
        AbsPerson person = new Boy();

        //在家
        AbsPersonCloth personCloth = new HomeCloth(person);
        personCloth.dressed();
        System.out.println("--------------");
        //出门
        AbsPersonCloth personCloth1 = new OutsideCloth(person);
        personCloth1.dressed();
    }
}
