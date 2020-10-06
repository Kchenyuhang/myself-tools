package com.yhchen.myself.tools.utils;

import java.security.MessageDigest;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/10/6
 */
public class Md5Util {
    public static String getMd5(String source) {
        return getMd5(source.getBytes());
    }

    public static String getMd5(byte[] source) {
        String s = null;
        char[] hexDigits = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] tmp;
            synchronized (Md5Util.class) {
                md.update(source);
                tmp = md.digest();
            }
            char[] str = new char[16 * 2];
            int k = 0;
            for (int i = 0; i < 16; i++) {
                byte byte0 = tmp[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            s = new String(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }
}
