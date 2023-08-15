package com.bummon.responsibility;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author Bummon
 * @description 具体处理者 博客地址：http://blog.bummon.com/blog/1644716670.html
 * @date 2023-08-15 10:26
 */
@Slf4j
public class TeamLeaderHandler extends Handler {
    public TeamLeaderHandler(String processorName) {
        super(processorName);
    }

    @Override
    public boolean leave(String name, int numOfDays) {
        // 创建随机数，值大于3则为通过，否则为不通过
        boolean res = (new Random().nextInt(10)) > 3;
        String result = res ? "通过" : "驳回";
        log.info("组长<{}>审批<{}>的请假申请，请假天数为：<{}>天，审批结果为：<{}>", processorName, name, numOfDays, result);

        if (Boolean.FALSE.equals(res)) {
            // 审批驳回
            return false;
        } else if (numOfDays < 3) {
            // 请假通过且请假天数小于3天时直接通过
            return true;
        }
        // 若审批通过且请假天数大于等于3天时提交给下一个审批人
        return nextHandler.leave(name, numOfDays);
    }
}
