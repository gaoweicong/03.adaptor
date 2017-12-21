package com.gwc.test;

import com.gwc.adaptor.service.Impl.TeacherImpl;
import com.gwc.adaptor.service.Teacher;
import com.gwc.utils.AdaptorUtils;

public class Test {
    public static void main(String[] args) {
        AdaptorUtils.tarverse();
        Teacher teacher = new TeacherImpl();

    }
}
