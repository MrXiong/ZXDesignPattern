package com.zx.memento.note;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zx.memento.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NoteActivity extends AppCompatActivity {

    @Bind(R.id.et_write)
    NoteEditText etWrite;
    @Bind(R.id.btn_revoke)
    Button btnRevoke;
    @Bind(R.id.btn_save)
    Button btnSave;
    @Bind(R.id.btn_regain)
    Button btnRegain;
    private NoteManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        ButterKnife.bind(this);
        manager = new NoteManager();


    }

    @OnClick({R.id.btn_revoke, R.id.btn_save, R.id.btn_regain})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_revoke:
                etWrite.restoreEditText(manager.getPrevMemoto());
                toast("撤销");
                break;
            case R.id.btn_save:
                manager.saveMemoto(etWrite.createMemoto());
                toast("保存");
                break;
            case R.id.btn_regain:
                etWrite.restoreEditText(manager.getNextMemoto());
                toast("恢复");
                break;
        }
    }


    private void toast(String msg) {
        Toast.makeText(this, msg + etWrite.getText() + "位置==" + etWrite.getSelectionStart(), Toast.LENGTH_SHORT).show();
    }
}
