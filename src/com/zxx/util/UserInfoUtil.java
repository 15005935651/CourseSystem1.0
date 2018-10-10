package com.zxx.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zxx
 * @date 2018/10/10 15:47
 */
public class UserInfoUtil {
    public static Map<Integer, String> getMap() {
        return map;
    }

    public static void setMap(Map<Integer, String> map) {
        UserInfoUtil.map = map;
    }

    //用于记录用户登录信息Integer用户ID，String用户名
    public static Map<Integer,String> map = new HashMap<Integer, String>();
}
