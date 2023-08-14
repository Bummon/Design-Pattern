package com.bummon.prototype.register.prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Bummon
 * @description 原型管理器（Prototype Manager） 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 16:06
 */
public class PrototypeManager {

    /**
     * 记录原型的编号同原型实例的对象关系
     */
    private static Map<String, Prototype> map = new HashMap<>();

    /**
     * 私有化构造方法 避免从外部创建实例
     */
    private PrototypeManager() {
    }

    /**
     * @param prototypeId 原型编号
     * @param prototype   原型对象
     * @date 2023-08-14 16:16
     * @author Bummon
     * @description 向原型管理器中添加或修改原型
     */
    public static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * @param prototypeId 原型编号
     * @date 2023-08-14 16:17
     * @author Bummon
     * @description 根据原型编号删除原型对象
     */
    public static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * @param prototypeId 原型编号
     * @return {@link Prototype}
     * @date 2023-08-14 16:19
     * @author Bummon
     * @description 根据原型编号获取原型对象
     */
    public static Prototype getPrototype(String prototypeId) {
        Prototype prototype = map.get(prototypeId);
        if (Objects.isNull(prototype)) {
            throw new RuntimeException("原型" + prototypeId + "不存在");
        }
        return prototype;
    }

}
