package com.bummon.responsibility;

/**
 * @author Bummon
 * @description 责任链模式 博客地址：http://blog.bummon.com/blog/1644716670.html
 * @date 2023-08-15 10:29
 */
public class Client {

    public static void main(String[] args) {
        Handler zhangsan = new TeamLeaderHandler("张三");
        Handler lisi = new DepartmentManagerHandler("李四");
        Handler wangwu = new CEOHandler("王五");

        // 创建责任链
        zhangsan.setNextHandler(lisi);
        lisi.setNextHandler(wangwu);

        // 发起请假申请
        boolean res1 = zhangsan.leave("小A", 2);
        System.out.println("最终结果：" + res1);

        boolean res2 = zhangsan.leave("小B", 5);
        System.out.println("最终结果：" + res2);

        boolean res3 = zhangsan.leave("小C", 10);
        System.out.println("最终结果：" + res3);
    }

}
