/**
* Name: Jerome Sparnaay
* Date: January 18th, 2022
* Description: Hello world program and first time experimentation's
 */
package Lab01;
import java.util.*;
public class Lab1 {
    public static void main(String[] args)
    {
        System.out.println("Hello world! TIL why paying attention while reading instruction is important");
    Random ran = new Random();
    Scanner input = new Scanner(System.in);
    int guessNumber = 0 , guess = -1 , answer = ran.nextInt(100);
    //guess is initialised to -1 as to make it is out of the bounds of the answer
    System.out.println("please enter a guess between 0 and 100: ");
    while (guess != answer){
        guessNumber++;      //simple counter for number of guesses, starts at zero and is iterated for every guess
        guess = input.nextInt();
        if (guess < answer)
            System.out.println("Guess too low \n\ntry again: ");
        if (guess > answer)
            System.out.println("Guess too high \n\ntry again: ");
    }
    System.out.println("\n\nCongrats you got it in " + guessNumber + " tries!");
    System.exit(0);
}
}
