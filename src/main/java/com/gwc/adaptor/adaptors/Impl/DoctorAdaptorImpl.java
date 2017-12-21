package com.gwc.adaptor.adaptors.Impl;

import com.gwc.adaptor.adaptors.Adaptor;
import com.gwc.adaptor.service.Doctor;

public class DoctorAdaptorImpl implements Adaptor {
    public void work(Object object) {

            ((Doctor)object).physic();

    }

    public boolean isAdapted(Object object) {
        return object instanceof Doctor;
    }
}
