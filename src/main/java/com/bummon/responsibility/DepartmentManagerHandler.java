package com.bummon.responsibility;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author Bummon
 * @description 具体处理者 博客地址：http://blog.bummon.com/blog/1644716670.html
 * @date 2023-08-15 10:27
 */
@Slf4j
public class DepartmentManagerHandler extends Handler {
    public DepartmentManagerHandler(String processorName) {
        super(processorName);
    }

    @Override
    public boolean leave(String name, int numOfDays) {
        // 创建一个随机数 当随机数大于3时为通过，否则为不通过
        boolean res = (new Random().nextInt(10)) > 3;
        String result = res ? "通过" : "驳回";
        log.info("部门经理<{}>审批<{}>的请假申请，请假天数为：<{}>天，审批结果为：<{}>", processorName, name, numOfDays, result);

        if (Boolean.FALSE.equals(res)) {
            // 审批驳回
            return false;
        } else if (numOfDays < 7) {
            // 审批通过且审批天数小于7天时直接通过
            return true;
        }
        // 批准天数大于等于7天时提交给下一个审批人
        return nextHandler.leave(name, numOfDays);
    }
}
