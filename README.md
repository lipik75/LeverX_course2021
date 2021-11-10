# LeverX_course2021

## HOMEWORK-1

# [1. Programm countwords](https://github.com/lipik75/LeverX_course2021/tree/master/src/main/java/com/leverx/homework1/countwords)

> ## Description:
>>This programm count words in a some text and return statistics.

>Details:
>>Implement  method "countWords" in "Words" class.

>Input parameter is a list of strings representing lines of text.
>
>Count words - map lowercased words to its frequency in text.
>
>If the word "the" occurred in text 23 times then its entry would be "the - 23\n".
>
>The programm omit any word with length less than 4 and frequency less than 5 (like too small or too rare words) and return a String having all the entries.
>
>Entries in the resulting String should be also sorted by amount and then in alphabetical order if needed.
>
>The programm may not use conditional statements and cycles in your code (that is right, no if, for, while, etc.))
>
>>Version: 13.0.1
>
>>Commands from directory "./com/":
1) javac com/leverx/homework1/countwords/main/Main.java
2) java com/leverx/homework1/countwords/main/Main



# [2. The game TicTacToe](https://github.com/lipik75/LeverX_course2021/tree/master/src/main/java/com/leverx/homework1/game)
> ## Description:
> 
>The game has 2 modes:
>>
>>PvE - Player versus Environment (computer)
>>
>>PvP - Player versus Player
>>



## HOMEWORK-2

# [1. ExampleDeadLockClass](https://github.com/lipik75/LeverX_course2021/blob/master/src/main/java/com/leverx/homework2/deadlock/ExampleDeadLockClass.java)
>## Description:
>>Deadlock describes a situation where two or more threads are blocked forever, waiting for each other. 
>>Deadlock occurs when multiple threads need the same locks but obtain them in different order. 
>>A Java multithreaded program may suffer from the deadlock condition because the synchronized keyword causes the executing thread to block while waiting for the lock, or monitor, associated with the specified object.

> Deadlock Solution Example
>> We can change the order of the lock and run of the same program to see if both the threads still wait for each other
>> 
>> [Example solution](https://github.com/lipik75/LeverX_course2021/blob/master/src/main/java/com/leverx/homework2/deadlock/SolutionForDeadLock.java)
>> 

# [2. SomeImmutableClass](https://github.com/lipik75/LeverX_course2021/blob/master/src/main/java/com/leverx/homework2/immutable/SomeImmutableClass.java)
>## Description:
>
>To write an immutable class, you need to follow next points:
>>1. make the class final.
>>2. make all fields private and create only getters for them. Setters are, of course, unnecessary.
>>3. Make all mutable fields "final" so that the value can only be set once.
>>4. initialize all fields through the constructor, performing deep copying (that is, copying the object itself, and its variables, and variable variables, and so on)
>>5. clone mutable variable objects in getters to only return copies of values, not references to actual objects.
