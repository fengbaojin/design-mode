package com.design.mode.DMA2_工厂方法.F1;

import com.design.mode.DMA2_工厂方法.DM1.Chat;
import com.design.mode.DMA2_工厂方法.DM1.QQ;
import com.design.mode.DMA2_工厂方法.DM1.WeiXin;

/**
 * <p>单方法工厂模式</p>
 * 简单工厂模式
 *
 * @author fengbaojin
 * @date 2022/09/22
 */
public class ChatFactory1 {

    public Chat createChat(String tools) {
        if ("QQ".equals(tools)) {
            return new QQ();
        } else if ("WeiXin".equals(tools)) {
            return new WeiXin();
        } else {
            return null;
        }
    }
}
