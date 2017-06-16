package com.acehouhao.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by Hao HOU on 2017/6/16.
 * 数组工具类
 */

public final class ArrayUtil {
    /**
     * 判断数组是否非空
     */
    public static boolean isNotEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }

    /**
     * 判断数组是否为空
     */
    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
