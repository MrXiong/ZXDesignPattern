package com.zx.mediator;

import android.util.Log;

import com.zx.mediator.abs.Colleague;
import com.zx.mediator.abs.Mediator;

/**
 * Created by user on 2017/11/14.
 * 主板中介者
 */

public class MainBoard extends Mediator {

    private CD cdDevice; //光驱设备
    private CPU cpu; //CPU

    @Override
    public void changed(Colleague c) {
        //如果光驱读取了数据
        if(c == cdDevice){
            handleCD((CD) c);
        }
        //如果CPU处理完数据
        else if(c == cpu){
            handleCD((CPU) c);
        }
    }

    public void handleCD(CPU cpu){
        Log.v("tag", "====播放==="+cpu.getDataSound()+cpu.getDataVideo());
    }

    /**
     * 处理光驱读取数据后与其他设备的交互
     *
     * @param cdDevice 光驱设备
     */
    public void handleCD(CD cdDevice){
        cpu.decodeData(cdDevice.read());
    }


    /**
     * 设置CD设备
     *
     * @param
     */
    public void setCDDevice(CD cdDevice){
        this.cdDevice = cdDevice;
    }

    /**
     * 设置CPU
     *
     * @param cpu CPU
     */
    public void setCPU(CPU cpu){
        this.cpu = cpu;
    }

}