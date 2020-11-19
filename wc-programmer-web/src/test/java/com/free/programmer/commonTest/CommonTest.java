package com.free.programmer.commonTest;

import org.junit.Test;

import java.text.MessageFormat;

/**
 * @Title: CommonTest
 * @author: wangcheng
 * @createTime 2020/11/13 0013
 * @content
 */
public class CommonTest {

    @Test
    public void testStringFormat(){
        Long ss= 3L;
        String s = String.format("%s%d",ss,1);
        String s1 = MessageFormat.format("{0},{1},{2},{4}", 1, 2, 3);
        System.out.println(s + "  ->StringFormat");
        System.out.println(s1 + "  ->MessageFormat");
    }
}
