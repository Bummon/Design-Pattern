package com.bummon.composite.safe;

/**
 * @author Bummon
 * @description 组合模式-安全模式 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:30
 */
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Composite root = new Composite();
        root.operation();
        //创建一个树枝构件
        Composite branch = new Composite();
        //创建一个叶子节点
        Leaf leaf = new Leaf();
        //建立整体
        root.add(branch);
        branch.add(leaf);
        showTree(root);
    }

    //通过递归遍历树
    public static void showTree(Composite root) {
        root.getChildren().forEach(any -> {
            if (any instanceof Leaf) {
                // 叶子节点
                any.operation();
            } else {
                // 树枝节点
                showTree((Composite) any);
            }
        });
    }

}
