package com.design.mode.DAM3_抽象工厂.Factory;

import com.design.mode.DAM3_抽象工厂.DM3.AComputerFactory;
import com.design.mode.DAM3_抽象工厂.DM3.ProduceKeyBord;
import com.design.mode.DAM3_抽象工厂.DM3.ProduceMouse;
import com.design.mode.DAM3_抽象工厂.KeyBoard.LeiBoKeyBord;
import com.design.mode.DAM3_抽象工厂.Mouse.LeiBoMouse;

/**
 * <p>戴尔电脑生产商 == 【固定键盘和鼠标生产商】</p>
 *
 * @Author fengabaojin
 * @Version V.1.0.1
 */
public class DellFactory implements AComputerFactory {
    @Override
    public ProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyBord();
    }

    @Override
    public ProduceMouse createMouse() {
        // 使用雷柏的鼠标
        return new LeiBoMouse();
    }
}
