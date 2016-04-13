package com.fzb.common.util;

public class ParseTools {
    public static int getFirstRecord(int page, int pageSize) {
        return (page - 1) * pageSize;
    }

    public static int getTotalPate(long count, int pageSize) {
        return (int) Math.ceil(count / (pageSize * 1.0D));
    }

    public static String autoDigest(String str, int size) {
        String digest = str.replaceAll("<[^>]*>", "").replaceAll("\t|\r|", "").replace("\n", " ");
        if (digest.length() > size) {
            digest = digest.substring(0, size) + "  ...";
        }
        return digest;
    }

    /**
     * @param str
     * @param defaultValue
     * @return
     */
    public static int strToInt(String str, int defaultValue) {
        if (str == null) return defaultValue;
        if (str.matches("^-?[1-9]\\d*$")) {
            return Integer.parseInt(str);
        }
        return defaultValue;
    }
}