package com.codingtest.service.impl;

import com.codingtest.service.testInterface;
import org.apache.commons.lang3.StringUtils;
import java.util.regex.Pattern;
/**
 * @Author: Alan Liu
 * 13-08-2023
 * @Version: 1.0
 */
public class CodingTest1 implements testInterface {
    public static final String REG = "([a-z])\\1\\1+";
    public static final Pattern RULE = Pattern.compile(REG);
    public static String replaceRepeatChar(String characters){
        boolean isNeedRemove = RULE.matcher(characters).find();
        if(StringUtils.isBlank(characters)&&!isNeedRemove){
            return characters;
        }
        while (RULE.matcher(characters).find()){
            characters = characters.replaceAll(REG,"");
            System.out.println(characters);
        }
        return characters;
    }
    @Override
    public String dealCharacters(String characters){
        return replaceRepeatChar(characters);
    }
}
