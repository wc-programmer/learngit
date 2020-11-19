package com.free.programmer.Utils;

/**
 * @Title: Convert
 * @author: wangcheng
 * @createTime 2020/10/31 0031
 * @content
 */
public class Convert {

    /**
     * 过滤字符串中的汉字、数字、中文符号。英文符号.
     * */
    public static String convertStringDeleteDigitalAndChineseCharacters(String str){
        return str.replaceAll("[\\u4e00-\\u9fa5]{1}[\\u4e00-\\u9fa5，。a-zA-Z]*","")
                .replaceAll("[\\d]+[.]+[ ]*","");
    }
}
