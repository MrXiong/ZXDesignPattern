package com.zx.builder;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;

/*
builder模式在Android开发中比较常见，通常作为配置类的构造器将配置的构建和表示分离，
同时也是将配置从目标类中隔离开，避免过多的set方法。

Builder模式比较常见的实现是通过链式调用，这样使代码简介、易懂，例如ImageLoader通过ImageLoaderConfig进行配置，避免了目标类被过多的接口污染。
优点：
1、良好的封装性，使客户端不必知道产品内部组成细节
2、建造者独立，容易拓展
缺点：
1、会产生多余的Builder对象，消耗内存
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildTest();
    }

    private void buildTest() {

        new AlertDialog.Builder(this)
                .setTitle("标题")
                .setMessage("简单消息框")
                .setPositiveButton("确定", null)
                .show();

        new CommonDilaogFragment.Builder(getSupportFragmentManager())
                .title("标题")
                .message("简单消息框")
                .positive("你好")
                .negative("哈哈")
                .build();
    }
}
