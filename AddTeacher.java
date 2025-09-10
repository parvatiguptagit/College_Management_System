package course.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.*;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname, tffname, tfaddress, tfphone, tfemail, tfx, tfxii, tfaadhar;
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    
    Random ran = new Random();
    long first4 = Math.abs(ran.nextLong() % 9000L) + 1000L;
    
    AddTeacher(){
        setSize(900, 700);
        setLocation(350, 50);
        
        setLayout(null);
        
        JLabel heading = new JLabel("New Teacher Details");
        heading.setBounds(300, 30, 500, 50);
        heading.setFont(new Font("sarif", Font.BOLD, 18));
        add(heading);
        
        JLabel lblname = new JLabel("NAME :");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel lblfname = new JLabel("FATHER'S NAME :");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblfname);
        
        tffname = new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel lblempId = new JLabel("Employee ID:");
        lblempId.setBounds(50, 200, 200, 30);
        lblempId.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblempId);
        
        labelempId = new JLabel("1002"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("sarif", Font.BOLD, 18));
        add(labelempId);
        
        JLabel lbldob = new JLabel("DATE OF BIRTH :");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("sarif", Font.BOLD, 18));
        add(lbldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);
        
        JLabel lbladdress = new JLabel("ADDRESS :");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("sarif", Font.BOLD, 18));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel lblphone = new JLabel("PHONE :");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel lblemail = new JLabel("EMAIL ID:");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel lblx = new JLabel("Class X (%):");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblx);
        
        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
        JLabel lblxii = new JLabel("Class XII (%):");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblxii);
        
        tfxii = new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
        
        JLabel lblaadhar = new JLabel("AADHAR NO.:");
        lblaadhar.setBounds(400, 350, 200, 30);
        lblaadhar.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel lblcourse = new JLabel("QUALIFICATION:");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblcourse);
        
        String course[] = {"B.Tech", "BSC", "BCA", "BE", "MSC", "MCA", "MBA","PHD"};
        cbcourse = new JComboBox(course);
        cbcourse.setBounds(200, 400, 150, 30);
        cbcourse.setBackground(Color.white);
        add(cbcourse);
        
        JLabel lblbranch = new JLabel("DEPARTMENT :");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("sarif", Font.BOLD, 18));
        add(lblbranch);
        
        String branch[] = {"Computer Science", "Electronics", "Mechanical", "Civil", "Robotics", "IT"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150, 30);
        cbbranch.setBackground(Color.white);
        add(cbbranch);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    
}
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit){
            String name = tfname.getText();
            String fname = tffname.getText();
            String empId = labelempId.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String x = tfx.getText();
            String xii= tfxii.getText();
            String aadhar = tfaadhar.getText();
            String education = (String) cbcourse.getSelectedItem();
            String department = (String) cbbranch.getSelectedItem();
            
            try{
                String query = "insert into teachers values('"+name+"', '"+fname+"', '"+empId+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"','"+xii+"', '"+aadhar+"', '"+education+"', '"+department+"')";
                Conn con = new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Teacher Details Inserted succesfully");
                setVisible(false);
                        
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            setVisible(false);
        }
    } 
    public static void main(String[] args){
        new AddTeacher();
    }
}
