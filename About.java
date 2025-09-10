package course.management.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.white);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("course/about.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("Developed By: Parvati Gupta");
        heading.setBounds(70, 220, 500, 40);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(heading);
        
        JLabel rollno = new JLabel("Roll Number: 13129");
        rollno.setBounds(70, 280, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: parvatigupta2006@gmil.com");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        JLabel name = new JLabel("<html>College<br/>Management System</html>");
        name.setBounds(70, 20, 250, 130);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        setLayout(null);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new About();
    }
}
