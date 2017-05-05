package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Controller;
import org.smart4j.framework.annotation.Service;
import org.smart4j.framework.util.ClassUtil;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 类操作助手类
 */
public final class ClassHelper {

    /**
     * 定义类集合（用于存放所加载的类）
     */
    private static final Set<Class<?>> CLASS_SET;

    static {
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }

    /**
     * 获取应用包名下的所有类
     */
    public static Set<Class<?>> getClassSet() {
        return CLASS_SET;
    }

    /**
     * 获取应用包名下所有service类
     */
    public static Set<Class<?>> getServiceClassSet() {
        return CLASS_SET.stream().filter(cls -> cls.isAnnotationPresent(Service.class)).collect(Collectors.toSet());
    }

    /**
     * 获取应用包名下所有Controller类
     */
    public static Set<Class<?>> getControllerClassSet() {
        return CLASS_SET.stream().filter(cls -> cls.isAnnotationPresent(Controller.class)).collect(Collectors.toSet());
    }

    /**
     * 获取应用包名下所有Bean类（包括: Service、 Controller等）
     */
    public static Set<Class<?>> getBeanClassSet() {
        Set<Class<?>> beanClassSet = new HashSet<>();
        beanClassSet.addAll(getServiceClassSet());
        beanClassSet.addAll(getControllerClassSet());
        return beanClassSet;
    }
}
