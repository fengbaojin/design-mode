package com.design.mode.DAM3_抽象工厂.Mouse;

import com.design.mode.DAM3_抽象工厂.DM3.ProduceMouse;

/**
 * <p>雷柏（Rapoo）鼠标生产商</p>
 *
 * @Author fengbaojin
 * @Version V.1.0.1
 */
public class LeiBoMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 -- " + name + "," + type);
    }
}
