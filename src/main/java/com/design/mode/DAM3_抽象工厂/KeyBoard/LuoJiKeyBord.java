package com.design.mode.DAM3_抽象工厂.KeyBoard;


import com.design.mode.DAM3_抽象工厂.DM3.ProduceKeyBord;

/**
 * <p>罗技（G）键盘生产商</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 上午 11:39 2018-11-6
 * @Version V.1.0.1
 */
public class LuoJiKeyBord implements ProduceKeyBord {
    @Override
    public void produceKeyBord(String name, String color) {

        System.out.println("罗技键盘 -- " + name + "," + color);

    }
}
