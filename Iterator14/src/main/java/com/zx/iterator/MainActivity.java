package com.zx.iterator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//第十四章、迭代器模式

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CompanyHui hui = new CompanyHui();
        check(hui.iterator());

        CompanyMin min = new CompanyMin();
        check(min.iterator());
    }

    private static void check(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println("======="+iterator.next().toString());
        }
    }
}
