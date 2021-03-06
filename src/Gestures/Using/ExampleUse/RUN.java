/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestures.Using.ExampleUse;

import Gestures.Using.ExemploUso.MyscreenPanel;
import javax.swing.JFrame;
import presentation.ALayerShape;
import presentation.impl.KinectMotionCapture.KinectControl.KinectAccess;
import presentation.impl.KinectMotionCapture.layers.LayerRGB;
import presentation.impl.KinectMotionCapture.layers.LayerSkeletonBone;

/**
 *
 * @author JB
 */
public class RUN {

    public static void main(String[] args) throws Exception {

        MyscreenPanel sp = new MyscreenPanel();

        ALayerShape rgb = null;
        LayerSkeletonBone sb = null;
        try {
            rgb = new LayerRGB();
            sb = new LayerSkeletonBone();
        } catch (Exception erro) {
            System.out.println("erro");
        }
        sp.addLayerShape(rgb);
        sp.addLayerShape(sb);

        JFrame frame = new JFrame();
        frame.setSize(KinectAccess.getPrefSize());
        frame.add(sp);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
