package JavaS3;

import java.awt.*;

import java.awt.event.*;
import javax.swing.*;







public class MyTrafficLight extends JFrame implements ActionListener {
//JFrame j;
JRadioButton r1,r2,r3;
Color red_c,yellow_c,green_c;

MyTrafficLight()
{
	//j= new JFrame("TRAFFIC SIGNAL");
	r1= new JRadioButton("RED");
	//r1.setSize(50,100);
	r1.setBounds(100,50,100,50);
	r2= new JRadioButton("GREEN");
	//r2.setSize(100,100);
	r2.setBounds(200,50,100,50);
	r3= new JRadioButton("YELLOW");
	//r3.setSize(150,100);
	r3.setBounds(300,50,100,50);
	ButtonGroup gb =new ButtonGroup();
	gb.add(r1);
	gb.add(r2);
	gb.add(r3);
	add(r1);
	add(r2);
	add(r3);
	red_c=getBackground();
	yellow_c=getBackground();
	green_c=getBackground();
	
	
	setLayout(null);
	setSize(400,400);
	setVisible(true);
	r1.addActionListener(this);
	r2.addActionListener(this);
	r3.addActionListener(this);
	
}


public void actionPerformed(ActionEvent e)
{
	if(r1.isSelected())
	{
		red_c=Color.red;
		yellow_c=getBackground();
		green_c=getBackground();
	}
	else if(r2.isSelected())
	{
		red_c=getBackground();
		yellow_c=getBackground();
		green_c=Color.green;
		
	}
	else if(r3.isSelected())
	{
		red_c=getBackground();
		yellow_c=Color.yellow;
		green_c=getBackground();
	}
		repaint();
}
public void paint(Graphics g)
{
	super.paint(g);
	//this line calls implementation of paint method which clears previous drawings and prepared the components for fresh drawing
	g.drawOval(150, 150, 50, 50);
	g.drawOval(150, 210, 50, 50);
	g.drawOval(150, 270, 50, 50);
	g.setColor(red_c);
	g.fillOval(150, 150, 50, 50);
	g.setColor(green_c);
	g.fillOval(150, 210, 50, 50);
	g.setColor(yellow_c);
	g.fillOval(150, 270, 50, 50);

}

public static void main(String[] args)
{
	new MyTrafficLight();
}
}
