/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound.property;

import java.util.*;

/**
 *
 * @author Ice
 */
public class BoundProperty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "start";
        while(!input.isEmpty()){
              System.out.println("Press Enter to quit");
              System.out.print("Pls enter Score football : ");
              input = sc.nextLine();
              if(input.isEmpty()){
                  break;
              }
              ScorePropertyBean scorePropertyBean = new ScorePropertyBean();
              FirstListener firstListener = new FirstListener();
              SecondListener secondListener = new SecondListener();
        
              scorePropertyBean.addPropertyChangeListener(firstListener);
              scorePropertyBean.addPropertyChangeListener(secondListener);
        
              scorePropertyBean.setScoreProperty(input);
        }
        
        
    }
    
}
