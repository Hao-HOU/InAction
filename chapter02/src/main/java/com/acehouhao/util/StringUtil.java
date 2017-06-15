package com.acehouhao.util;

/**
 * Created by Hao HOU on 2017/6/15.
 * 字符串工具类
 */
public final class StringUtil {
    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    /**
     * 判断字符串时候非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
