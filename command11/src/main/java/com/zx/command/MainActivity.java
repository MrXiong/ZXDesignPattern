package com.zx.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

//第十一章：命令模式
public class MainActivity extends AppCompatActivity {

    @butterknife.Bind(R.id.btn_left)
    Button btnLeft;
    @butterknife.Bind(R.id.btn_right)
    Button btnRight;
    private LeftCommand leftCommand;
    private RightCommand rightCommand;
    private ShutdownCommand shutdownCommand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);

        Receiver receiver = new Receiver();

        leftCommand = new LeftCommand(receiver);
        rightCommand = new RightCommand(receiver);
        shutdownCommand = new ShutdownCommand();
    }

    @butterknife.OnClick({R.id.btn_left, R.id.btn_right})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_left:
                leftCommand.execute();
                break;
            case R.id.btn_right:
                //rightCommand.execute();
                shutdownCommand.execute();
                break;
        }
    }
}
