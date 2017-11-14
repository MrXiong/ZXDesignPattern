package com.zx.memento;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zx.memento.note.NoteActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
游戏存档
Android 源码中的备忘录模式
1.onSaveInstanceState和onRestoreInstanceState

当Activity不是正常方式退出，
且Activity在随后的时间内被系统杀死之前会调用这两个方法让开发人员可以有机会存储Activity相关信息，且在下次返回Activity时恢复这些数据。
通过这两个函数。开发人员能够在某些特殊场景下储存与界面相关的信息，提升用户体验。
 */

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.btn_start)
    Button btnStart;
    @Bind(R.id.btn_logout)
    Button btnLogout;
    @Bind(R.id.btn_resume)
    Button btnResume;
    @Bind(R.id.btn_note)
    Button btnNote;
    private CallOfDuty game;
    private Caretaker caretaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        //构建游戏对象
        game = new CallOfDuty();
        caretaker = new Caretaker();
    }

    @OnClick({R.id.btn_start, R.id.btn_logout, R.id.btn_resume})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_start:
                //1.打游戏
                game.play();
                break;
            case R.id.btn_logout:
                //2.游戏存档
                caretaker.archive(game.createMemoto());
                //3.退出游戏
                game.quit();
                break;
            case R.id.btn_resume:

                //4.恢复游戏
                CallOfDuty newGame = new CallOfDuty();
                newGame.restore(caretaker.getMemento());
                break;
        }
    }

    @OnClick(R.id.btn_note)
    public void onViewClicked() {
        startActivity(new Intent(this, NoteActivity.class));
    }
}
