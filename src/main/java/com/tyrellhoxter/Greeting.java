package com.tyrellhoxter;

/**
 * Created by tyrellhoxter on 5/19/16.
 */
public class Greeting {

    User user = new User();


    public void aliceAndBobChecker(){
        user.askUser("Hello! what is your name?");
        if(user.answer.equals("alice")){
            user.inputIn("Why Hello alice!");
        }else if(user.answer.equals("bob")){
            user.inputIn("Hello There bob!");
        }else {
            user.inputIn("Im sorry... I dnt know you.  This program only responds to two people");
        }
    }
}
