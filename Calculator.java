//package import 
import java.awt.Color;
import java.awt.Font;



import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class  Calculator  implements ActionListener {
        boolean isoperatorClicked=false;
        int operator=0;
        Double result;
        
        JFrame jf;
        JLabel displayLabel;
        JButton zerobutton,onebutton,twobutton,threebutton,fourbutton,fivebutton,sixbutton,sevenbutton,eightbutton,ninebutton ;
        JButton  clearbutton,dotbutton,equalbutton,plusbutton,minusbutton,multybutton,divbutton;
        String oldvalue;
      

//class constructor
        public Calculator (){
//app icon
       
        
//create object of jframe class
//create a frame
        jf=new JFrame("calculator");
        jf.setLayout(null); 
        jf.setSize(600,600);
        
        jf.setLocation(900,100);
        
//create display
        displayLabel =new JLabel("",JLabel.CENTER);
        displayLabel.setBounds(30,30,520,70);
        displayLabel.setBackground(Color.white);
        displayLabel.setOpaque(true);
        Font font = new Font("Arial", Font.BOLD, 30);
        displayLabel.setFont(font);
        Border blackline = BorderFactory.createLineBorder(Color.BLACK);
        displayLabel.setBorder(blackline);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.BLACK);
        jf.add(displayLabel);

//create buttons
      
        Border line=new LineBorder(Color.gray);
        Border margin =new EmptyBorder(5,15,5,15);
        Border compound=new CompoundBorder(line,margin);

        Font sevenb =new Font ("Arial", Font.BOLD, 30);
        
       
//7
        sevenbutton=new JButton("7");
        sevenbutton.setBounds(30,130,80,80);
        sevenbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        sevenbutton.setFont(sevenb);
        sevenbutton.setBorder(compound);
        sevenbutton.addActionListener(this);
        jf.add(sevenbutton);
//8 
        eightbutton=new JButton("8");
        eightbutton.setBounds(130,130,80,80);
        eightbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        eightbutton.setFont(sevenb);
        eightbutton.setBorder(compound);
        jf.add(eightbutton);
        eightbutton.addActionListener(this);
//9
        ninebutton=new JButton("9");
        ninebutton.setBounds(230,130,80,80);
        ninebutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        ninebutton.setFont(sevenb);
        ninebutton.setBorder(compound);
        jf.add(ninebutton);
        ninebutton.addActionListener(this);
//4     
        fourbutton=new JButton("4");
        fourbutton.setBounds(30,230,80,80);
        fourbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        fourbutton.setFont(sevenb);
        fourbutton.setBorder(compound);
        jf.add(fourbutton);
        fourbutton.addActionListener(this); 
//5 
        fivebutton=new JButton("5");
        fivebutton.setBounds(130,230,80,80);
        fivebutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        fivebutton.setFont(sevenb);
        fivebutton.setBorder(compound);
        jf.add(fivebutton);
        fivebutton.addActionListener(this);
//6
        sixbutton=new JButton("6");
        sixbutton.setBounds(230,230,80,80);
        sixbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        sixbutton.setFont(sevenb);
        sixbutton.setBorder(compound);
        jf.add(sixbutton);
        sixbutton.addActionListener(this);
//1

        onebutton=new JButton("1");
        onebutton.setBounds(30,330,80,80);
        onebutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        onebutton.setFont(sevenb);
        onebutton.setBorder(compound);
        jf.add(onebutton);
        onebutton.addActionListener(this);
//2    
        twobutton=new JButton("2");
        twobutton.setBounds(130,330,80,80);
        twobutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        twobutton.setFont(sevenb);
        twobutton.setBorder(compound);
        jf.add(twobutton);
        twobutton.addActionListener(this);
//3
        threebutton=new JButton("3");
        threebutton.setBounds(230,330,80,80);
        threebutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        threebutton.setFont(sevenb);
        threebutton.setBorder(compound);
        jf.add(threebutton);
        threebutton.addActionListener(this);
//.dot
        dotbutton=new JButton(".");
        dotbutton.setBounds(30,430,80,80);
        dotbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        dotbutton.setFont(sevenb);
        dotbutton.setBorder(compound);
        jf.add(dotbutton);
        dotbutton.addActionListener(this);
//0
        zerobutton=new JButton("0");
        zerobutton.setBounds(130,430,80,80);
        zerobutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        zerobutton.setFont(sevenb);
        zerobutton.setBorder(compound);
        jf.add(zerobutton);
        zerobutton.addActionListener(this);
//= 
        equalbutton=new JButton("=");
        equalbutton.setBounds(230,430,80,80);
        equalbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        equalbutton.setFont(sevenb);
        equalbutton.setBorder(compound);
        jf.add(equalbutton);
        equalbutton.addActionListener(this);
//+
        plusbutton=new JButton("+");
        plusbutton.setBounds(330,430,80,80);
        plusbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        plusbutton.setFont(sevenb);
        plusbutton.setBorder(compound);
        jf.add(plusbutton);
        plusbutton.addActionListener(this);
//-
        minusbutton=new JButton("-");
        minusbutton.setBounds(330,330,80,80);
        minusbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        minusbutton.setFont(sevenb);
        minusbutton.setBorder(compound);
        jf.add(minusbutton);
        minusbutton.addActionListener(this);
//x
        multybutton=new JButton("x");
        multybutton.setBounds(330,230,80,80);
        multybutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        multybutton.setFont(sevenb);
        multybutton.setBorder(compound);
        jf.add(multybutton);
        multybutton.addActionListener(this);
// /
        divbutton=new JButton("/");
        divbutton.setBounds(330,130,80,80);
        divbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        divbutton.setFont(sevenb);
        divbutton.setBorder(compound);
        jf.add(divbutton);
        divbutton.addActionListener(this);
//clear button
        clearbutton=new JButton("c");
        clearbutton.setBounds(430,130,80,80);
        clearbutton.setBackground(Color.WHITE);
        //sevenbutton.setForeground(Color.BLACK);
        clearbutton.setFont(sevenb);
        clearbutton.setBorder(compound);
        jf.add( clearbutton);
        clearbutton.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
//display number  
@Override 
  public void actionPerformed(ActionEvent e){
 
        if(e.getSource()==zerobutton){
                if (isoperatorClicked){
                displayLabel.setText("0");
                isoperatorClicked=false;
              }
                else{
                 displayLabel.setText( displayLabel.getText()+"0");
              }

        }else if(e.getSource()==onebutton){
                if (isoperatorClicked){
                        displayLabel.setText("1");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"1");
                      }
        
                
        }else if(e.getSource()==twobutton){
                if (isoperatorClicked){
                        displayLabel.setText("2");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"2");
                      }
        
               
        }else if(e.getSource()==threebutton){
                if (isoperatorClicked){
                        displayLabel.setText("3");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"3");
                      }
        
              
        }else if(e.getSource()==fourbutton){
                if (isoperatorClicked){
                        displayLabel.setText("4");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"4");
                      }
        
               
        }else if(e.getSource()==fivebutton){
                if (isoperatorClicked){
                        displayLabel.setText("5");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"5");
                      }
        
                
        }else if(e.getSource()==sixbutton){
                if (isoperatorClicked){
                        displayLabel.setText("6");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"6");
                      }
        
        }else if(e.getSource()==sevenbutton){
                if (isoperatorClicked){
                        displayLabel.setText("7");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"7");
                      }
        
               
        }else if(e.getSource()==eightbutton){
                if (isoperatorClicked){
                        displayLabel.setText("8");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"8");
                      }
        
               
        }else if(e.getSource()==ninebutton){
                if (isoperatorClicked){
                        displayLabel.setText("9");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+"9");
                      }
        
               
        }else if(e.getSource()==dotbutton){
                if (isoperatorClicked){
                        displayLabel.setText(".");
                        isoperatorClicked=false;
                      }
                        else{
                         displayLabel.setText( displayLabel.getText()+".");
                      }
        
                
        
        
  // oparators      
        
        }else if(e.getSource()==multybutton){
                isoperatorClicked=true;
                oldvalue= displayLabel.getText();
                operator=1;
                
                
        }else if(e.getSource()==plusbutton){
                isoperatorClicked=true;
                oldvalue= displayLabel.getText();
                operator=2;
                
        }else if(e.getSource()==minusbutton){
                isoperatorClicked=true;
                oldvalue= displayLabel.getText();
                operator=3;
                
        }else if(e.getSource()==divbutton){
                isoperatorClicked=true;
                oldvalue= displayLabel.getText();
                operator=4;
        }else if(e.getSource()==clearbutton){
                displayLabel.setText("");
        }else if(e.getSource()==equalbutton){

                String newvalue=displayLabel.getText();
                Double oldvalueF=Double.parseDouble(oldvalue);
                Double newvalueF=Double.parseDouble(newvalue);
                

                
                switch(operator){
                        case 1:result=oldvalueF * newvalueF;
                        break;
                        case 2:result=oldvalueF + newvalueF;
                        break;
                        case 3:result=oldvalueF - newvalueF;
                        break;
                        case 4:result=oldvalueF / newvalueF;
                        break;
                }
                displayLabel.setText(result+"");

        }
}
// clear 
              

    // main method 
    public static void main(String[] args) {
    //create object class 
        new Calculator();
        
        
    }
}





