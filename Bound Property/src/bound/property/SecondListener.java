/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bound.property;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Ice
 */
public class SecondListener implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent pce) {
          System.out.println("live result :"+pce.getNewValue());//To change body of generated methods, choose Tools | Templates.
    }
    
}
