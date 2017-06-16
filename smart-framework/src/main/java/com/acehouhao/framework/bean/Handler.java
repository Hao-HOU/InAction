package com.acehouhao.framework.bean;

import java.lang.reflect.Method;

/**
 * Created by Hao HOU on 2017/6/16.
 * 封装 Action 信息
 */
public class Handler {
    /**
     * Controller 类
     */
    private  Class<?> controllerClass;

    /**
     * Action 方法
     */
    private Method actionMethod;

    public Handler(Class<?> controllerClass, Method actionMethod) {
        this.controllerClass = controllerClass;
        this.actionMethod = actionMethod;
    }

    public Class<?> getControllerClass() {
        return controllerClass;
    }

    public Method getActionMethod() {
        return actionMethod;
    }
}
