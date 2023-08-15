package com.bummon.iterator;

/**
 * @author Bummon
 * @description 迭代器模式  博客地址：http://blog.bummon.com/blog/2421543447.html
 * @date 2023-08-15 10:51
 */
public class Client {

    public static void main(String[] args) {
        Aggregate doctorA = new ConcreteAggregate();
        doctorA.add(new Patient("张三", 1));
        doctorA.add(new Patient("李四", 2));
        doctorA.add(new Patient("王五", 3));
        doctorA.add(new Patient("赵六", 4));

        PatientIterator iterator = doctorA.createPatientIterator();
        while (iterator.hasNext()) {
            Patient patient = iterator.next();
            patient.diagnosis();
        }
    }

}
