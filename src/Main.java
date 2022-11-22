import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main (String[] args){

        Frame frame = new Frame("Metric Version 1.0");
        frame.setSize(1200,800);

        //insert paint method

        Canvas canvas = new Canvas();
        Sketcharea area51 = new Sketcharea();
        frame.add(area51);

        area51.addMouseListener();
        frame.addWindowListener(new WindowAdapter() {  });
        frame.setVisible(true);
    }
    
}