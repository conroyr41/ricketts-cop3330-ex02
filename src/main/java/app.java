/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class app
{
    public static void main(String[] args)
    {
        System.out.println("Enter an input string.");

        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println("The string that you entered was \"" + s + "\" which has " + s.length() + " characters!");
    }
}
