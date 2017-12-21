package com.gwc.adaptor.adaptors.Impl;

import com.gwc.adaptor.adaptors.Adaptor;
import com.gwc.adaptor.service.Teacher;

public class TeacherAdaptorImpl implements Adaptor {
    public void work(Object object) {

            ((Teacher)object) .teach();

    }

    public boolean isAdapted(Object object) {
        return object instanceof Teacher;
    }
}
