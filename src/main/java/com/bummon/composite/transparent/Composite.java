package com.bummon.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bummon
 * @description 树枝构件 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:12
 */
public class Composite extends Component {

    //构件容器
    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public List<Component> getChildren() {
        return this.componentList;
    }
}
