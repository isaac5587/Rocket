package houseproject;

import javax.swing.*;
import java.awt.*;

class HousePanel extends JPanel
{
  final int width  = 200, height = 400;
  
  final int rocketbaseX =  80, houseY = 80, houseW = 50, houseH = 180 ; // ROCKET BASE
  
  final int lWindX =  90, lWindY = 100, lWindW =  30, lWindH =  30 ; // TOP WINDOW
  final int rWindX = 90, rWindY = 200, rWindW = 30 , rWindH =  30 ; // BOTTOM WINDOW
  
  
  final int L1X1   = 30,  L1Y1 = 250,      	L1X2 = 80,      	L1Y2 = 250; //LEFT TRAINGLE WING
  final int L2X1   = 80,  L2Y1 = 250,    	L2X2 = 80,     		L2Y2 = 200;
  final int L3X1   = 80,  L3Y1 = 200,     	L3X2 = 30,     		L3Y2 = 250;
  
  
  final int L4X1   = 130, L4Y1 = 250,   	L4X2 = 180,   		L4Y2 = 250;//RIGHT TRIANGLE WING
  final int L5X1   = 180, L5Y1 = 250,    	L5X2 = 130,    		L5Y2 = 200;
  final int L6X1   = 130, L6Y1 = 200,    	L6X2 = 130,    		L6Y2 = 250;
  
  
  final int L7X1   = 70,  L7Y1 = 80,   		L7X2 = 140,   		L7Y2 = 80;// TOP TRIAGLE / ROOF / NOSE
  final int L8X1   = 140, L8Y1 = 80,    	L8X2 = 100,    		L8Y2 = 40;
  final int L9X1   = 100, L9Y1 = 40,    	L9X2 = 70,    		L9Y2 = 80;
  
  
  final int L10X1   = 70, L10Y1 = 290,   	L10X2 = 90,   		L10Y2 = 260;// BOTTOM LEFT TRIANGLE
  final int L11X1   = 90, L11Y1 = 260,    	L11X2 = 100,    	L11Y2 = 290;
  final int L12X1   = 100, L12Y1 = 290,    	L12X2 = 70,    		L12Y2 = 290;
  
  
  final int L13X1   = 110, L13Y1 = 290,   	L13X2 = 140,   		L13Y2 = 290;// BOTTOM RIGHT TRIANGLE
  final int L14X1   = 140, L14Y1 = 290,    	L14X2 = 120,    	L14Y2 = 260;
  final int L15X1   = 120, L15Y1 = 260,    	L15X2 = 110,    	L15Y2 = 290;
  
  
  
 

  public HousePanel()
  {
    setPreferredSize( new Dimension( width, height) );
    setBackground( Color.WHITE);   
  }
  
  public void paintComponent ( Graphics gr )
  { 
     super.paintComponent( gr );

     gr.setColor( Color.BLUE ); // there is no color brown
     gr.drawRect( rocketbaseX , houseY , houseW, houseH); // ROCKET BASE
   
     
     gr.setColor( Color.RED ); 
     gr.drawOval( lWindX , lWindY , lWindW, lWindH); // TOP WINDOW
     gr.drawOval( rWindX , rWindY , rWindW, rWindH); // BOTTOM WINDOW
     
    
     gr.setColor( Color.RED );
   
         
     gr.drawLine( L1X1, L1Y1, L1X2, L1Y2 ); //LEFT TRAINGLE WING
     gr.drawLine( L2X1, L2Y1, L2X2, L2Y2 ); 
     gr.drawLine( L3X1, L3Y1, L3X2, L3Y2 ); 
     
     
     gr.drawLine( L4X1, L4Y1, L4X2, L4Y2 ); //RIGHT TRIANGLE WING
     gr.drawLine( L5X1, L5Y1, L5X2, L5Y2 ); 
     gr.drawLine( L6X1, L6Y1, L6X2, L6Y2 ); 
     
     
     gr.drawLine( L7X1, L7Y1, L7X2, L7Y2 ); // TOP TRIAGLE / ROOF / NOSE 
     gr.drawLine( L8X1, L8Y1, L8X2, L8Y2 ); 
     gr.drawLine( L9X1, L9Y1, L9X2, L9Y2 ); 
     
     
     gr.drawLine( L10X1, L10Y1, L10X2, L10Y2 ); // BOTTOM LEFT TRIANGLE
     gr.drawLine( L11X1, L11Y1, L11X2, L11Y2 ); 
     gr.drawLine( L12X1, L12Y1, L12X2, L12Y2 ); 
    
     
     gr.drawLine( L13X1, L13Y1, L13X2, L13Y2 ); // BOTTOM RIGHT TRIANGLE
     gr.drawLine( L14X1, L14Y1, L14X2, L14Y2 ); 
     gr.drawLine( L15X1, L15Y1, L15X2, L15Y2 ); 
     
  
  
  
  
  }
  
  
}

