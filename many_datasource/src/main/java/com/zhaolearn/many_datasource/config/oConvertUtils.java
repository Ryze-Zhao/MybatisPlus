//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.zhaolearn.many_datasource.config;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class oConvertUtils {
    public oConvertUtils() {
    }

    public static boolean isNotEmpty(Object object) {
        return object != null && !object.equals("") && !object.equals("null");
    }

    public static Field[] getAllFields(Object object) {
        Class<?> clazz = object.getClass();

        ArrayList fieldList;
        for(fieldList = new ArrayList(); clazz != null; clazz = clazz.getSuperclass()) {
            fieldList.addAll(new ArrayList(Arrays.asList(clazz.getDeclaredFields())));
        }

        Field[] fields = new Field[fieldList.size()];
        fieldList.toArray(fields);
        return fields;
    }
}
