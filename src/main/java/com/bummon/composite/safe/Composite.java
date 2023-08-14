package com.bummon.composite.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bummon
 * @description 树枝构件 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:21
 */
public class Composite extends Component {

    // 构件容器
    private List<Component> componentList = new ArrayList<>();

    /**
     * 新增一个叶子构件或树枝构件
     * @param component
     */
    public void add(Component component) {
        this.componentList.add(component);
    }

    /**
     * 删除一个叶子构件或树枝构件
     */
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    /**
     * 获取分支下的所有叶子构件和树枝构件
     */
    public List<Component> getChildren() {
        return this.componentList;
    }

}
