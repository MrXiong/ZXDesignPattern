package com.zx.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zx.observer.custom.Person;
import com.zx.observer.custom.QQ;
import com.zx.observer.system.Coder;
import com.zx.observer.system.Weixin;

//第十二章：观察者模式 ：UI层与业务逻辑层解耦

//Android源码中：
//Listview的数据发生变化时，调用adapter的notifyDataSetChanged函数，这个函数又调用DatasetObservable的notifyChanged函数
//这个函数会调用所有观察者的onChange方法，在onChange方法中又会调用Listview重新布局的函数使的listview刷新页面，这就是一个观察者模式

//广播机制也是我们的观察者模式
//EventBus
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doSystem();

        doCustom();


    }

    private void doSystem() {

        //观察者
        Coder coder = new Coder("张三");
        Coder coder2 = new Coder("李四");
        Coder coder3 = new Coder("王五");
        //被观察者
        Weixin weixin = new Weixin();
        //观察者（程序员）订阅被观察者（微信）
        weixin.addObserver(coder);
        weixin.addObserver(coder2);
        weixin.addObserver(coder3);

        weixin.sendMessages("微信3.0.0新版本今天发布啦！！！");
    }

    private void doCustom() {

        Person c = new Person("张飞");
        Person c2 = new Person("诸葛亮");
        Person c3 = new Person("战云");

        QQ weinxin2 = new QQ();
        weinxin2.addObserver(c);
        weinxin2.addObserver(c2);
        weinxin2.addObserver(c3);
        weinxin2.sendMessage("QQ5.0新版本今天发布啦！！！");
    }
}
