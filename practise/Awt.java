import java.awt.*;
class Awt{
public static void main(String ar[]){
// create instance of frame with the label   
Frame f = new Frame("Button Example");    
  
// create instance of button with label  
Button b = new Button("Click Here");   

// set the position for the button in frame   
b.setBounds(50,100,80,30);    

// add button to the frame  
f.add(b);    
// set size, layout and visibility of frame  
f.setSize(400,400);    
f.setLayout(null);    
f.setVisible(true); 

}
}