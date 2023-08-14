package com.bummon.prototype.register;

import com.bummon.prototype.register.prototype.Prototype;
import com.bummon.prototype.register.prototype.PrototypeManager;
import com.bummon.prototype.register.prototype.concrete.ConcretePrototypeA;
import com.bummon.prototype.register.prototype.concrete.ConcretePrototypeB;

/**
 * @author Bummon
 * @description 登记形式 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 16:19
 */
public class Client {

    public static void main(String[] args) {
        try {
            // 创建实例
            Prototype prototypeA = new ConcretePrototypeA();
            // 注册实例
            PrototypeManager.setPrototype("prototypeA", prototypeA);
            // 克隆
            Prototype prototypeC = PrototypeManager.getPrototype("prototypeA").clone();
            prototypeC.setName("张三");
            System.out.println("第一个实例副本：" + prototypeC);

            // 创建实例
            Prototype prototypeB = new ConcretePrototypeB();
            // 注册实例
            PrototypeManager.setPrototype("prototypeB", prototypeB);
            // 克隆
            Prototype prototypeD = PrototypeManager.getPrototype("prototypeB").clone();
            prototypeD.setName("李四");
            System.out.println("第二个实例副本：" + prototypeD);

            // 销毁第一个实例
            PrototypeManager.removePrototype("prototypeA");
            // 再次克隆第一个实例
            Prototype prototypeE = PrototypeManager.getPrototype("prototypeA").clone();
            prototypeE.setName("王五");
            System.out.println("第一个实例副本：" + prototypeE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
