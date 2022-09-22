package com.design.mode.DAM3_抽象工厂.DM3;

/**
 * <p>鼠标接口 -- 生产鼠标</p>
 *
 * @Author fengbaojin
 * @Version V.1.0.1
 */
public interface ProduceMouse {
    /**
     * 约定鼠标生产的规格数据
     *
     * @param name 名称
     * @param type 类型
     */
    public void produceMouse(String name, String type);
}
