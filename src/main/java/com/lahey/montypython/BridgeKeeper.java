package com.lahey.montypython;

import org.springframework.stereotype.Service;

@Service
public class BridgeKeeper {

    private String nameQuestion;
    private String questQuestion;
    private String colorQuestion;
    private String velocityQuestion;
//    private String currentQuestion;
//    private String challenge;

    public BridgeKeeper(){

        nameQuestion = "What is your name?";
        questQuestion = "What is your quest?";
        colorQuestion = "What is your favorite color?";
        velocityQuestion = "What is the airspeed velocity of an unladen swallow?";
//        challenge = "He who would cross the Bridge of Death\n" +
//                "Must answer me\n" +
//                "These questions three\n" +
//                "\nEre the other side he see.";
    }

    public String getNameQuestion() {
        return nameQuestion;
    }

    public String getQuestQuestion() {
        return questQuestion;
    }

    public String getColorQuestion() {
        return colorQuestion;
    }

    public String getVelocityQuestion() {
        return velocityQuestion;
    }


}
