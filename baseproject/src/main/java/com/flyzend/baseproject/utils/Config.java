package com.flyzend.baseproject.utils;

/**
 * Created by 王灿 on 2017/5/12.
 * BaseProject配置类
 */

public class Config {
    public static boolean IS_CACHE_JSON_DATA = true;//是否缓存json数据

    public static String ERROR_TOAST_STRING = "";//网络异常提示语

    public static int toastGravity = 0;//toast弹出的位置

    public static String getErrorToastString(){
        if (Util.isEmpty(ERROR_TOAST_STRING)){
            return "网络异常";
        }
        return ERROR_TOAST_STRING;
    }
}
