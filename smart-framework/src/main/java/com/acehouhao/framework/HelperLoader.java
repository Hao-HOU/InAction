package com.acehouhao.framework;

import com.acehouhao.framework.helper.BeanHelper;
import com.acehouhao.framework.helper.ClassHelper;
import com.acehouhao.framework.helper.ControllerHelper;
import com.acehouhao.framework.helper.IocHelper;
import com.acehouhao.framework.util.ClassUtil;

/**
 * Created by Hao HOU on 2017/6/16.
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
