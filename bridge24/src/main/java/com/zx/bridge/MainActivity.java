package com.zx.bridge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //原味
        Ordinary implOrdinary = new Ordinary();

        //加糖
        Sugar implSugar = new Sugar();

        //大杯咖啡  原味
        LargeCoffee largeCoffeeOrdinary = new LargeCoffee(implOrdinary);
        largeCoffeeOrdinary.makeCoffee();

        //小杯咖啡  原味
        SmallCoffee smallCoffeeOrdinary = new SmallCoffee(implOrdinary);
        smallCoffeeOrdinary.makeCoffee();

        //大杯咖啡  加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        //小杯咖啡  加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();
    }
}
