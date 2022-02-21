package com.codedifferentlty;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void uniqueCharactersTest01(){
        String input = "abcabc";
        Boolean expected = false;
        Boolean actual = Solution.uniqueCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void uniqueCharactersTest02(){
        String input = "123abcABC";
        Boolean expected = true;
        Boolean actual = Solution.uniqueCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void uniqueCharactersTest03(){
        String input = "abc123kkmmmm";
        Boolean expected = false;
        Boolean actual = Solution.uniqueCharacters(input);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void uniqueCharactersTest04(){
        String input = "abc123km";
        Boolean expected = true;
        Boolean actual = Solution.uniqueCharacters(input);
        Assertions.assertEquals(expected, actual);
    }
}
