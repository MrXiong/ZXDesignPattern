package com.zx.abstractfactory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*
抽象工厂模式在Android源码中使用较少，因为很少会出现多个产品种类的情况，大部分使用工厂方法模式即可解决。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //A车厂
        CarFactory factoryA = new AFactory();
        factoryA.createTire().tire();
        factoryA.createEngine().engine();
        System.out.println("---------------");
        //B车厂
        CarFactory factoryB = new BFactory();
        factoryB.createTire().tire();
        factoryB.createEngine().engine();
    }
}
