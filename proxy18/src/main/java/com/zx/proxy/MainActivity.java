package com.zx.proxy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doTest();


        //装个逼，使用动态代理
        doDynamic();
    }

    private void doTest() {
        //构造出诉讼人小民
        ILawsuit xiaomin = new XiaoMin();

        //构造一个代理律师，并将小民传递进去
        ILawsuit lawyer = new Lawyer(xiaomin);

        //律师提交申请
        lawyer.submit();

        //律师进行举证
        lawyer.burden();

        //律师代小民辩护
        lawyer.defend();

        //完成诉讼
        lawyer.finish();
    }

    private void doDynamic() {
        //构造出诉讼人小民
        ILawsuit xiaomin = new XiaoMin();

        //1.静态代理
        //构造一个代理律师，并将小民传递进去
        //ILawsuit lawyer = new Lawyer(xiaomin);

        //--------------------------------------
        //2.动态代理
        //构造一个动态代理
        DynamicPorxy proxy = new DynamicPorxy(xiaomin);

        //获取被代理类小民的ClassLoader
        ClassLoader loader = xiaomin.getClass().getClassLoader();

        //动态构造一个代理者律师
        ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader, new Class[]{ILawsuit.class}, proxy);

        //律师提交申请
        lawyer.submit();

        //律师进行举证
        lawyer.burden();

        //律师代小民辩护
        lawyer.defend();

        //完成诉讼
        lawyer.finish();
    }
}
