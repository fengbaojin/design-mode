package com.design.mode.DMA2_工厂方法.F3;

import com.design.mode.DMA2_工厂方法.DM1.Chat;
import com.design.mode.DMA2_工厂方法.DM1.QQ;
import com.design.mode.DMA2_工厂方法.DM1.WeiXin;

/**
 * <p>静态工厂模式，无需创建工厂类实例</p>
 *
 * @author fengbaojin
 * @date 2022/09/22
 */
public class ChatFactory3 {
    public static Chat createQQChat() {
        return new QQ();
    }

    public static Chat createWeiXinChat() {
        return new WeiXin();
    }
}
