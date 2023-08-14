package com.bummon.composite.transparent;

/**
 * @author Bummon
 * @description 组合模式-透明模式  博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:14
 */
public class Client {

    public static void main(String[] args) {
        //创建一个根节点
        Component root = new Composite();
        root.operation();
        //创建一个树枝构件
        Component branch = new Composite();
        //创建一个叶子节点
        Component leaf = new Leaf();
        //构件整体
        branch.add(leaf);
        root.add(branch);
        //展示结构
        showTree(root);
    }

    /**
     * @param root 根节点
     * @date 2023-08-14 18:18
     * @author Bummon
     * @description 展示结构
     */
    public static void showTree(Component root) {
        root.getChildren().forEach(any -> {
            if (any instanceof Leaf) {
                any.operation();
            } else {
                showTree(any);
            }
        });
    }

}
