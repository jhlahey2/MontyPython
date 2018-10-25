package com.lahey.montypython;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Random;


@Controller
public class HomeController {

    Pilgrim pilgrim;
    BridgeKeeper bridgeKeeper;
    Random random;

    public HomeController(){

        pilgrim = new Pilgrim();
        bridgeKeeper = new BridgeKeeper();
    }

    @RequestMapping("/askQuestion")
    public String askQuestion(Model model){

        String bridgeQuestion = null;

//        if(pilgrim.getName().equals(null)){
//
//            bridgeQuestion = bridgeKeeper.getNameQuestion();
//
//        }else if(pilgrim.getQuest().equalsIgnoreCase(null)){
//
//            bridgeQuestion = bridgeKeeper.getQuestQuestion();
//
//        }else if (pilgrim.getQuest().equals(null)){
//
//            int iQuestNum = (random.nextInt(100) %2);
//
//            if(iQuestNum == 0 ){
//
//                bridgeQuestion = bridgeKeeper.getColorQuestion();
//            }
//            else {
//
//                bridgeQuestion = bridgeKeeper.getVelocityQuestion();
//
//            }
//
//        }
//        else{
//
//            //generate random question
//        }
            //bridgeQuestion

        return "/questions";
    }


}//end public class HomeController
