package com.codingtest.service.impl;

import com.codingtest.service.testInterface;
/**
 * @Author: Alan Liu
 * 13-08-2023
 * @Version: 1.0
 */
public class CodingTest2 implements testInterface {

    public String replaceRepeatChar(String characters){
        StringBuilder charactersCach = new StringBuilder();
        int k = 0;
        while (k<characters.length()){
            int h = 3;
            while (k+h<=characters.length()&&String.valueOf(characters.charAt(k)).repeat(h).equals(characters.substring(k,k+h))){
                h++;
            }
            if(String.valueOf(characters.charAt(k)).repeat(h).equals(characters)){
                char replacedChar = (char)(characters.charAt(k)-1);
                if(replacedChar!=96){
                    charactersCach.append(replacedChar);
                    return charactersCach.toString();
                }
                return "";
            }
            h--;
            if(h>=3){
                char replacedChar = (char)(characters.charAt(k)-1);
                if(replacedChar!=96){
                    charactersCach.append(replacedChar);
                }
                k+=h;
            }else {
                charactersCach.append(characters.charAt(k));
                k++;
            }
        }
        if(charactersCach.toString().length()==characters.length()){
            return charactersCach.toString();
        }else {
            System.out.println(charactersCach.toString());
            return replaceRepeatChar(charactersCach.toString());
        }
    }

    @Override
    public String dealCharacters(String characters){
        return replaceRepeatChar(characters);
    }
}
