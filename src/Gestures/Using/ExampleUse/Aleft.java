/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Gestures.Using.ExampleUse;

import Manager.Gesture.Action.VirtualAction;
import Manager.Gesture.Man.ManagerGA;
import Manager.Gesture.Panel.MyscreenPanel;

/**
 *
 * @author 20111lired0190
 */
public class Aleft extends VirtualAction{

    @Override
    public void run(MyscreenPanel sp, ManagerGA gerente) {
      System.out.println("Left");
    }

}