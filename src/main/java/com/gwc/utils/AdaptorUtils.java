package com.gwc.utils;

import com.gwc.adaptor.adaptors.Adaptor;
import com.gwc.adaptor.adaptors.Impl.DoctorAdaptorImpl;
import com.gwc.adaptor.adaptors.Impl.TeacherAdaptorImpl;
import com.gwc.adaptor.service.Doctor;
import com.gwc.adaptor.service.Impl.DoctorImpl;
import com.gwc.adaptor.service.Impl.TeacherImpl;
import com.gwc.adaptor.service.Teacher;

import java.util.ArrayList;
import java.util.List;

public class AdaptorUtils {
    public static void tarverse(){
        List<Object> list = getList();
        List<Adaptor> listAdaptor = getAdaptorList();
        for (Object o : list) {
            for (Adaptor adaptor : listAdaptor) {
                if (adaptor.isAdapted(o)) {
                    adaptor.work(o);
                    break;
                }
            }
        }
    }
    private static List<Object> getList() {
        Teacher teacher = new TeacherImpl();
        Doctor doctor = new DoctorImpl();
        List<Object> list = new ArrayList<Object>();
        list.add(teacher);
        list.add(doctor);
        return list;
    }
    private static List<Adaptor> getAdaptorList(){
        List<Adaptor> list = new ArrayList<Adaptor>();
        list.add(new TeacherAdaptorImpl());
        list.add(new DoctorAdaptorImpl());
        return list;
    }
}
