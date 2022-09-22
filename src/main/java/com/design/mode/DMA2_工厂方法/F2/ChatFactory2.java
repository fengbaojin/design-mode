package com.design.mode.DMA2_工厂方法.F2;

import com.design.mode.DMA2_工厂方法.DM1.Chat;
import com.design.mode.DMA2_工厂方法.DM1.QQ;
import com.design.mode.DMA2_工厂方法.DM1.WeiXin;

/**
 * <p>多方法工厂模式 == 需要哪个，就用哪个方法</p>
 *
 * @Author fengbaojin
 */
public class ChatFactory2 {

    public Chat createQQChat(){
        return  new QQ();
    }
    public Chat createWeiXinChat(){
        return new WeiXin();
    }
}
