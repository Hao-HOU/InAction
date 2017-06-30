package com.acehouhao.framework;

import com.acehouhao.framework.helper.*;
import com.acehouhao.framework.util.ClassUtil;

/**
 * 加载相应的 Helper 类
 * Created by Hao HOU on 2017/6/16.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
