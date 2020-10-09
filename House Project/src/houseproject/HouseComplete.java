package houseproject;

import javax.swing.JFrame;

public class HouseComplete
{
   public static void main ( String[] args )
   {
      JFrame frame = new JFrame( "House Picture: Complete" );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      
      frame.getContentPane().add( new HousePanel() );
      
      frame.pack(); 
      frame.setVisible( true );
   }
}