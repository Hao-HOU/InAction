package com.acehouhao.framework.bean;

/**
 * Created by Hao HOU on 2017/6/16.
 * 返回数据对象
 */
public class Data {
    /**
     * 模型数据
     */
    private Object model;

    public Data(Object model) {
        this.model = model;
    }
    public Object getModel() {
        return model;
    }
}
