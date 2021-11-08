# LeverX_course2021

## Homework1

>1.[Programm countwords](https://github.com/lipik75/LeverX_course2021/tree/master/src/main/java/com/leverx/homework1/countwords);

>Description:
>This programm count words in a some text and return statistics.

>Details:
>Implement  method "countWords" in "Words" class.

Input parameter is a list of strings representing lines of text.

Count words - map lowercased words to its frequency in text.

If the word "the" occurred in text 23 times then its entry would be "the - 23\n".

The programm omit any word with length less than 4 and frequency less than 5 (like too small or too rare words) and return a String having all the entries.

Entries in the resulting String should be also sorted by amount and then in alphabetical order if needed.

The programm may not use conditional statements and cycles in your code (that is right, no if, for, while, etc.))

>Version: 13.0.1
>Commands from directory "./com/":
1) javac com/leverx/homework1/countwords/main/Main.java
2) java com/leverx/homework1/countwords/main/Main
