package course.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {
    
    Project() {
        setSize(1500, 900);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("course/inst.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        JMenuBar mb = new JMenuBar();
        
        JMenu newInformation = new JMenu("New Information");
        newInformation.setForeground(Color.BLACK);
        mb.add(newInformation);   
        
        JMenuItem facultyInfo = new JMenuItem("New Faculty Information"); 
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        JMenuItem studentInfo = new JMenuItem("New Student Information"); 
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        //Details
        
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        mb.add(details);   
        
        JMenuItem facultydetails = new JMenuItem("View Faculty Details"); 
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);
        
        JMenuItem studentdetails = new JMenuItem("View Student Details"); 
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);
        
        //Leave
        
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);   
        
        JMenuItem facultyleave = new JMenuItem(" Faculty Leave"); 
        facultyleave.setBackground(Color.WHITE);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);
        
        JMenuItem studentleave = new JMenuItem(" Student Leave"); 
        studentleave.setBackground(Color.WHITE);
        studentleave.addActionListener(this);
        leave.add(studentleave);
        
        //Leave Details
        
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);   
        
        JMenuItem facultyleavedetails = new JMenuItem(" Faculty Leave Details"); 
        facultyleavedetails.setBackground(Color.WHITE);
        facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);
        
        JMenuItem studentleavedetails = new JMenuItem(" Student Leave Details"); 
        studentleavedetails.setBackground(Color.WHITE);
        studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);
        
        //Exams
        
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);   
        
        JMenuItem examinationDetails = new JMenuItem("Examination Results"); 
        examinationDetails.setBackground(Color.WHITE);
        examinationDetails.addActionListener(this);
        exam.add(examinationDetails);
        
        JMenuItem entermarks = new JMenuItem("Enter Marks"); 
        entermarks.setBackground(Color.WHITE);
        entermarks.addActionListener(this);
        exam.add(entermarks);
        
        //UpdateInfo
        
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);   
        
        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details"); 
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);
        
        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details"); 
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);
        
        //Fees
        
        JMenu fees = new JMenu(" Fees Details");
        fees.setForeground(Color.BLACK);
        mb.add(fees);   
        
        JMenuItem feestructure = new JMenuItem(" Fees Structure"); 
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fees.add(feestructure);
        
        JMenuItem feesform = new JMenuItem(" Student Fees Form"); 
        feesform.setBackground(Color.WHITE);
        feesform.addActionListener(this);
        fees.add(feesform);
        
        //Utility
        
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);   
        
        JMenuItem notepad = new JMenuItem("Notepad"); 
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);
        
        JMenuItem calc = new JMenuItem("Calculator"); 
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
        //Exit
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);   
        
        JMenuItem ab = new JMenuItem("About"); 
        notepad.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);   
        
        JMenuItem ex = new JMenuItem("Exit"); 
        notepad.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        

        setJMenuBar(mb);
        
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        
        if(msg.equals("Exit")){
            setVisible(false);
        }else if (msg.equals("Calculator")) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            } catch (Exception e) {
            
            }
        }else if (msg.equals("Notepad")) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
            
            }
        } else if(msg.equals("New Faculty Information")) {
            new AddTeacher();
        }else if (msg.equals("New Student Information")) {
            new AddStudents();
        }else if (msg.equals("View Faculty Details")) {
            new TeacherDetails();
        }else if (msg.equals("View Student Details")) {
            new StudentDetails();
        }else if (msg.equals(" Faculty Leave")) {
            new TeacherLeave();
        }else if (msg.equals(" Student Leave")) {
            new StudentLeave();
        }else if (msg.equals(" Faculty Leave Details")) {
            new TeacherLeaveDetails();
        }else if (msg.equals(" Student Leave Details")) {
            new StudentLeaveDetails();
        }else if (msg.equals("Update Faculty Details")) {
            new UpdateTeacher();
        }else if (msg.equals("Update Student Details")) {
            new UpdateStudent();
        }else if (msg.equals("Enter Marks")) {
            new EnterMarks();
        }else if (msg.equals("Examination Results")) {
            new ExaminationDetails();
        }else if (msg.equals(" Fees Structure")) {
            new FeeStructure();
        } else if (msg.equals("About")) {
            new About();
        } else if (msg.equals(" Student Fees Form")) {
            new StudentFeeForm();
        } 
        
    }
    
    
    public static void main(String[] args) {
        
        new Project();
    }
}
