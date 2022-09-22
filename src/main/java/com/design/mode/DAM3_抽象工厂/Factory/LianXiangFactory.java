package com.design.mode.DAM3_抽象工厂.Factory;

import com.design.mode.DAM3_抽象工厂.DM3.AComputerFactory;
import com.design.mode.DAM3_抽象工厂.DM3.ProduceKeyBord;
import com.design.mode.DAM3_抽象工厂.DM3.ProduceMouse;
import com.design.mode.DAM3_抽象工厂.KeyBoard.LuoJiKeyBord;
import com.design.mode.DAM3_抽象工厂.Mouse.LuoJiMouse;

/**
 * <p>联想电脑生产商 == 【固定键盘和鼠标生产商】</p>
 *
 * @Author fengabaojin
 * @Version V.1.0.1
 */
public class LianXiangFactory implements AComputerFactory {

    @Override
    public ProduceKeyBord createKeyBord() {
        // 使用罗技键盘
        return new LuoJiKeyBord();
    }

    @Override
    public ProduceMouse createMouse() {
        // 使用罗技鼠标
        return new LuoJiMouse();
    }
}
