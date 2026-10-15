package mainaha.java8features;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PriorFuncInterfaceExa extends JFrame {
	
	
	JButton button;
	public PriorFuncInterfaceExa()
    {
	setTitle("Button Action Example without Lambda Expression");
	setSize(400,300);
	setVisible(true);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	button = new JButton("Button");
	button.setBounds(100,100,90,40);
	/***
	 * ActionListener Example: Before Java 8: Using anonymous inner class
	 */
	button.addActionListener(new ActionListener(){
		
	   public void actionPerformed(ActionEvent e){ 
		System.out.println("You clicked the button."); 
	   }  
			
	});
	add(button);
    }
	
	
	public void LambdaExample()
    {
	setTitle("Button Action Example without Lambda Expression");
	setSize(400,300);
	setVisible(true);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	button = new JButton("Button New");
	button.setBounds(100,100,90,40);
	/***
	 * ActionListener Example: Before Java 8: Using anonymous inner class
	 */
		/*
		 * button.addActionListener(new ActionListener(){
		 * 
		 * public void actionPerformed(ActionEvent e){
		 * System.out.println("You clicked the button."); }
		 * 
		 * });
		 */
	
	//Lambda expression
		button.addActionListener(e-> 
		   System.out.println("You clicked on lambda function button.")); 
		
	add(button);
    }
	
	public static void main(String[] args) {
		
		PriorFuncInterfaceExa obj = new PriorFuncInterfaceExa();
		obj.LambdaExample();

	}

}
