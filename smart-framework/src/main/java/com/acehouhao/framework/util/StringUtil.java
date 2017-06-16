package com.acehouhao.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Hao HOU on 2017/6/15.
 * 字符串工具类
 */
public final class StringUtil {
    /**
     * 字符串分割符
     */
    public static final String SEPARATOR = String.valueOf((char) 29);
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

    /**
     * 分割固定格式的字符串
     */
    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }
}
