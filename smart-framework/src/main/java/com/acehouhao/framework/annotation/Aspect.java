package com.acehouhao.framework.annotation;

import java.lang.annotation.*;

/**
 * Created by Hao HOU on 2017/6/28.
 * 切面注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    /**
     * 注解
     */
    Class<? extends Annotation> value();
}
