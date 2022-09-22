package com.design.mode.DAM3_抽象工厂.Mouse;

import com.design.mode.DAM3_抽象工厂.DM3.ProduceMouse;

/**
 * <p>罗技（G）鼠标生产商</p>
 *
 * @Author fengbaojin
 * @Version V.1.0.1
 */
public class LuoJiMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 -- " + name + "," + type);
    }
}
