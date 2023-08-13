package com.codingtest.service.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @Author: Alan Liu
 * 13-08-2023
 * @Version: 1.0
 */
public class UnitCodingTest {
    String test1Str1 = "";
    String test1Str1Result = "";
    String test1Str2 = "abcccbad";
    String test1Str2Result = "abbad";
    String test1Str3 = "aabcccbbad";
    String test1Str3Result = "d";

    String test2Str1 = "aaaaaaaaaaaaaaa";
    String test2Str1Result = "";
    String test2Str2 = "abccccbba";
    String test2Str2Result = "";
    String test2Str3 = "aaabb";
    String test2Str3Result = "bb";
    @Test
    public void codingTest1(){
        System.out.println("UnitTest1 the test characters are: "+test1Str1);
        assertEquals(test1Str1Result,new CodingTest1().dealCharacters(test1Str1));
        System.out.println("UnitTest1 the test characters are: "+test1Str2);
        assertEquals(test1Str2Result,new CodingTest1().dealCharacters(test1Str2));
        System.out.println("UnitTest1 the test characters are: "+test1Str3);
        assertEquals(test1Str3Result,new CodingTest1().dealCharacters(test1Str3));
    }
    @Test
    public void codingTest2(){
        System.out.println("UnitTest2 the test characters are: "+test2Str1);
        assertEquals(test2Str1Result,new CodingTest2().dealCharacters(test2Str1));
        System.out.println("UnitTest2 the test characters are: "+test2Str2);
        assertEquals(test2Str2Result,new CodingTest2().dealCharacters(test2Str2));
        System.out.println("UnitTest2 the test characters are: "+test2Str3);
        assertEquals(test2Str3Result,new CodingTest2().dealCharacters(test2Str3));
    }
}
