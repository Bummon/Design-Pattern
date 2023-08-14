package com.bummon.composite.transparent;

import java.util.List;

/**
 * @author Bummon
 * @description 叶子构件 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:13
 */
public class Leaf extends Component {
    @Override
    public void add(Component component) {
        //空实现
    }

    @Override
    public void remove(Component component) {
        //空实现
    }

    @Override
    public List<Component> getChildren() {
        //空实现
        return null;
    }
}
