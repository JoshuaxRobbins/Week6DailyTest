package com.example.josh.week6dailytest;

import java.util.HashMap;

public class Parenthesis {

    HashMap<Character,Integer> parenthesis = new HashMap<>();

    public Parenthesis() {

    }

    public boolean testParenth(String input){
        parenthesis.put('(',0);
        parenthesis.put('{',0);
        parenthesis.put('[',0);
        for(int i = 0;i < input.length();i++){

            switch(input.charAt(i)){

                case '(':
                    parenthesis.put('(',parenthesis.get('(') + 1);
                    break;
                case ')':
                    if(parenthesis.get('(') == 0)
                        return false;
                    else
                        parenthesis.put('(',parenthesis.get('(') - 1);
                    break;
                case '{':
                    parenthesis.put('{',parenthesis.get('{') + 1);
                    break;
                case '}':
                    if(parenthesis.get('{') == 0)
                        return false;
                    else
                        parenthesis.put('{',parenthesis.get('{') - 1);
                    break;
                case '[':
                    parenthesis.put('[',parenthesis.get('[') + 1);
                    break;
                case ']':
                    if(parenthesis.get('[') == 0)
                        return false;
                    else
                        parenthesis.put('[',parenthesis.get('[') - 1);
                    break;
            }

        }
        if(parenthesis.get('(') + parenthesis.get('{') + parenthesis.get('[') == 0){
            return true;
        }

        return false;
    }



}
