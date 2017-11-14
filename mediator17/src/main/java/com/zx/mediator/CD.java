package com.zx.mediator;

import com.zx.mediator.abs.Colleague;
import com.zx.mediator.abs.Mediator;

/**
 * Created by user on 2017/11/14.
 */

public class CD extends Colleague {

    private String data; //视频数据

    public CD(Mediator mediator) {
        super(mediator);
    }

    /**
     * 读取视频数据
     *
     * @return 视频数据
     */
    public String read(){
        return data;
    }

    /**
     * 加载视频数据
     *
     * @return 音频数据
     */
    public void load(){
        data = "视频数据,音频数据";
        //告诉中介者自身状态改变
        mediator.changed(this);
    }
}