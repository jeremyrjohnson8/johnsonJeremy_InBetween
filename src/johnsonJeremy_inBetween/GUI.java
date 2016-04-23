/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnsonJeremy_inBetween;

/**

/**
 * Description: Actual Slide Show Display Pane
 * @author Jeremy Johnson
 * 
 */

import java.awt.*;
import javax.swing.*; 
import java.awt.event.*; 

public class GUI extends JPanel {
    /**
    private DLL imageList; 
    private JButton leftButton; 
    private JButton rightButton; 
    private JButton quitButton;     
    private JLabel imageLabel;
    private ImageIcon imageIcon; 
    
    
    public SlideShowPane(DLL imageList){
        this.imageList = imageList; 
        leftButton = new JButton("Previous"); 
        rightButton = new JButton("Next");        
        quitButton = new JButton ("Quit"); 
        
        imageIcon = new ImageIcon(imageList.currentImage()); 
        
        imageLabel = new JLabel(imageIcon); 
        
        leftButton.addActionListener(new ButtonListener());
        rightButton.addActionListener(new ButtonListener());
        quitButton.addActionListener(new ButtonListener());
        
        
        
        add(imageLabel);
        add(leftButton);
        add(rightButton);
        add(quitButton);
        
        setBackground(Color.green);
        
        setPreferredSize(new Dimension(300,400)); 
    }
    
    private class ButtonListener implements ActionListener{
        
        public void actionPerformed(ActionEvent event){ 
            if(event.getSource() == leftButton){
                imageIcon = new ImageIcon(imageList.previousImage()); 
                imageLabel.setIcon(imageIcon);
            } else if (event.getSource() == rightButton){
                imageIcon = new ImageIcon(imageList.nextImage());
                imageLabel.setIcon(imageIcon);
            } else if (event.getSource() == quitButton){
                System.exit(0); 
            }
                
        }
    }
   **/
    
}
