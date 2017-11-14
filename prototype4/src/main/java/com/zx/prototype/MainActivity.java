package com.zx.prototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WordDocument wordDocument = new WordDocument();
        wordDocument.setText("标题1");
        wordDocument.addImg("图片1");
        wordDocument.addImg("图片2");
        wordDocument.show("原始");

        try {
            WordDocument clone = wordDocument.clone();
            clone.show("拷贝后");

            clone.setText("标题2");
            clone.addImg("哈哈");
            clone.show("拷贝修改后");

            wordDocument.show("原始再次");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
