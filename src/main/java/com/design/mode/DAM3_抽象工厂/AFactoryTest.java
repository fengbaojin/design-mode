package com.design.mode.DAM3_抽象工厂;

import com.design.mode.DAM3_抽象工厂.DM3.ProduceKeyBord;
import com.design.mode.DAM3_抽象工厂.DM3.ProduceMouse;
import com.design.mode.DAM3_抽象工厂.Factory.DellFactory;
import com.design.mode.DAM3_抽象工厂.Factory.LianXiangFactory;

public class AFactoryTest {

    public static void main(String[] args) {
        // 用户需要购买联想的电脑，但要求键盘和鼠标都是雷柏的，于是便找到了对应的电脑组装工厂进行生产
        LianXiangFactory lianXiangFactory = new LianXiangFactory();
        ProduceKeyBord keyBord = lianXiangFactory.createKeyBord();
        keyBord.produceKeyBord("M550", "黑色");
        ProduceMouse mouse = lianXiangFactory.createMouse();
        mouse.produceMouse("M590", "有线");

        System.out.println("=======================分割线，注意区别");

        // 用户需要购买戴尔的电脑，但要求键盘和鼠标都是罗技的，于是便找到了对应的电脑组装工厂进行生产
        DellFactory dellFactory = new DellFactory();
        ProduceKeyBord keyBord1 = dellFactory.createKeyBord();
        keyBord1.produceKeyBord("M550", "黑色");
        ProduceMouse Mouse1 = dellFactory.createMouse();
        Mouse1.produceMouse("M590", "无线");

        /**
         * 好处：横向扩展很容易，如果我需要再增加一个电脑型号的生产线，比如HP【惠普】，只需要在创建一个对应的工厂实现抽象工厂即可
         * 坏处：纵向扩展很麻烦，如果我需要增加显示器的生产接口，那么改动的地方就太多了，自己领会吧，可以尝试一下
         */
    }
}
