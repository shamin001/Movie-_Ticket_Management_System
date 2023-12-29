package Admin;

import java.lang.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.*;
import java.awt.event.*;

import Admin.*;

public class UserData extends JFrame implements ActionListener{
    JLabel  name1 , name2, name3, name4;
    Font f1, f2;
    JTextArea adminId;
    JPasswordField password;
    JButton bt0, deletButton , addButton, refreshButton, backButton;
    JPanel panel;
    ImageIcon  image1 , image2, bgimage ;
    
    public UserData(){
        super("Star Cineplex");
		this.setSize(1100, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        this.setResizable(false);
		panel = new JPanel();
		panel.setLayout(null);
		
        name1 = new JLabel("USER DATA");
        name1.setBounds(430,30,450,50);
        f1 = new Font("Cambria", Font.BOLD, 40);
        name1.setFont(f1);
        name1.setForeground(Color.BLACK);
        panel.add(name1);

        f2 = new Font("Cambria", Font.BOLD, 30);
        
        bt0 = new JButton("Back");
       bt0.setBounds(0,0,0,0);
       bt0.setFont(f2);
       bt0.setForeground(Color.BLACK);
       panel.add(bt0); 

      
       addButton = new JButton("ADD");
       addButton.setBounds(300,500,150,45);
       addButton.setFont(f2);
       addButton.setForeground(Color.BLACK);
	   addButton.addActionListener(this);
       panel.add(addButton); 

       deletButton = new JButton("DELETE");
       deletButton.setBounds(500,500,150,45);
       deletButton.setFont(f2);
       deletButton.setForeground(Color.BLACK);
	   deletButton.addActionListener(this);
       panel.add(deletButton); 

       refreshButton = new JButton("Refresh");
       refreshButton.setBounds(700,500,150,45);
       refreshButton.setFont(f2);
       refreshButton.setForeground(Color.BLACK);
	   refreshButton.addActionListener(this);
       panel.add(refreshButton); 

       backButton = new JButton("Back");
       backButton.setBounds(500,570,150,45);
       backButton.setFont(f2);
       backButton.setForeground(Color.BLACK);
	   backButton.addActionListener(this);
       panel.add(backButton); 

       bgimage = new ImageIcon("Image/oke.jpg");
       name4 = new JLabel(bgimage);
       name4.setBounds(0,0,1100,700);
       panel.add(name4);

      
        this.add(panel);
    }
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== refreshButton){
			this.setVisible(false);
			UserData show = new UserData();
			show.setVisible(true);
		}
		if(e.getSource()== backButton){
			this.setVisible(false);
			Admin show = new Admin();
			show.setVisible(true);
		}
		if(e.getSource()== addButton){
			/////eq
		}
		if(e.getSource()== deletButton){
			////eq
		}
		
	}
    
}
