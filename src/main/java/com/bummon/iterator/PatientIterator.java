package com.bummon.iterator;

import java.util.List;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 10:40
 */
public class PatientIterator implements Iterator {

    private List<Patient> list;
    private int position = 0;
    private Patient currentPatient;

    public PatientIterator(List<Patient> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < this.list.size();
    }

    @Override
    public Patient next() {
        currentPatient = list.get(position);
        position++;
        return currentPatient;
    }
}
