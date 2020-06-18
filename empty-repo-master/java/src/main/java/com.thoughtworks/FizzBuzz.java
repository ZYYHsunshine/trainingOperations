package com.thoughtworks;

public class FizzBuzz {

    public String say(int number){
        String numberString = String.valueOf(number);
        Boolean three = (number % 3 == 0);
        Boolean five = (number % 5 == 0);
        Boolean seven = (number % 7 == 0);
        if( numberString.contains("7") ){
            if(three && seven){
                return "FizzWhizz";
            }
            if(three){
                return "Fizz";
            }
            if(seven){
                return "Whizz";
            }
        }
        if( numberString.contains("5") ){
            if(five && seven){
                return "BuzzWhizz";
            }
            if(five){
                return "Buzz";
            }
            if(seven){
                return "Whizz";
            }
        }
        if( numberString.contains("3") ){
            return "Fizz";
        }
        if(three && five && seven){
            return "FizzBuzzWhizz";
        }
        if(three && five){
            return "FizzBuzz";
        }
        if(three && seven){
            return "FizzWhizz";
        }
        if(five && seven){
            return "BuzzWhizz";
        }
        if(three){
            return "Fizz";
        }
        if(five){
            return "Buzz";
        }
        if(seven){
            return "Whizz";
        }

        return String.valueOf(number);
    }
}
