package com.bummon.responsibility;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

/**
 * @author Bummon
 * @description 具体处理者 博客地址：http://blog.bummon.com/blog/1644716670.html
 * @date 2023-08-15 10:28
 */
@Slf4j
public class CEOHandler extends Handler {
    public CEOHandler(String processorName) {
        super(processorName);
    }

    @Override
    public boolean leave(String name, int numOfDays) {
        // 创建一个随机数，大于3则为通过，否则为驳回
        boolean res = (new Random().nextInt(10)) > 3;
        String result = res ? "通过" : "驳回";
        log.info("CEO<{}>审批<{}>的请假申请，请假天数为：<{}>天，审批结果为：<{}>", processorName, name, numOfDays, result);

        if (Boolean.FALSE.equals(res)) {
            //驳回
            return false;
        }
        return true;
    }
}
