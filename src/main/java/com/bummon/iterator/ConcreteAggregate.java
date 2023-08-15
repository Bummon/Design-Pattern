package com.bummon.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 10:42
 */
public class ConcreteAggregate implements Aggregate {

    /**
     * 病人列表
     */
    private List<Patient> list;

    public ConcreteAggregate() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Patient patient) {
        this.list.add(patient);
    }

    @Override
    public void remove(Patient patient) {
        this.list.remove(patient);
    }

    @Override
    public PatientIterator createPatientIterator() {
        return new PatientIterator(this.list);
    }
}
