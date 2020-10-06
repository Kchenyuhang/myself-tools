package com.yhchen.myself.tools.service;

import com.yhchen.myself.tools.utils.Md5Util;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/10/6
 */
public class Md5Service {
    public String getMd5(String input) {
        return Md5Util.getMd5(input.getBytes());
    }
}
