package com.codedifferentlty;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    /**
     * Have the function DistinctCharacters(str) take the str parameter being passed
     * and determine if it contains at least 10 distinct characters,
     * if so, then your program should return the string true,
     * otherwise it should return the string false.
     * ---
     * For example: if str is "abc123kkmmmm?" then your program should return the string false
     * because this string contains only 9 distinct characters.
     */
    public static Boolean uniqueCharacters(String input){
        HashSet<Character> characters = new HashSet<>();
        for (int x=0 ; x < input.length(); x++)
        {
            Character character = input.charAt(x);
            if (characters.contains(character)){
                return false;
            }
            characters.add(character);
        }
        return true;
    }

    public static Boolean uniqueCharactersV2(String input){
        StringBuilder builder = new StringBuilder();
        for(int x =0; x < input.length(); x++){
            Character character = input.charAt(x);
            if(builder.indexOf(String.valueOf(character)) != -1){
                return false;
            }
            builder.append(character);
        }
        return true;
    }

    public static Boolean uniqueCharactersV3(String input){
        char[] characters = input.toCharArray();
        Arrays.sort(characters);
        for (int x=1; x < characters.length; x++){
           if (characters[x] == characters[x-1]){
               return false;
           }
        }
        return true;
    }

    public static Boolean uniqueCharactersV4(String input){
        for(int x = 0; x < input.length(); x++){
            Character character = input.charAt(x);
            for(int y= x+1; y < input.length(); y++){
                Character compare = input.charAt(y);
                if (character == compare){
                    return false;
                }
            }
        }
        return true;
    }


}
