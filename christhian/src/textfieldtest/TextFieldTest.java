package textfieldtest;

import javax.swing.JFrame;

public class TextFieldTest 
{
    public static void main(String[] args) 
    {
       TextFieldFrame textFieldFrame = new TextFieldFrame();
       textFieldFrame.setDefaultCloseOperation( JFRAME.EXIT_ON_CLOSE );
       textFieldFrame.setSize( 350, 100 );
       textFieldFrame.setVisible( true );
    }
}
