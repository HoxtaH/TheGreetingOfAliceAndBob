package com.tyrellhoxter;

import java.util.Scanner;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class User {
    Scanner sc = new Scanner(System.in);
    public String answer;

    public void inputIn(String message){
        System.out.println(message);
    }

    public String askUser(String message){
        inputIn(message);
        answer = sc.next().toLowerCase();
        return answer;
    }


}
