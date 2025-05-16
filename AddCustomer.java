package arilinemanagmentsystem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class AddCustomer extends JFrame implements ActionListener{
    JTextField tfname,tfnumber,tfadhar,tfnationality,tfaddress;
    JRadioButton rbmale,rbfemale;
    public AddCustomer(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("ADD COUSTOMER DETAILS");
        heading.setBounds(220,20,500,35);
        heading.setFont(new Font("Tahoma",Font.PLAIN,32));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60,80,150,25);
        lblname.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(220,80,150,25);
        add(tfname);
        
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60,130,150,25);
        lblnationality.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(220,130,150,25);
        add(tfnationality);
        
        JLabel lbladhar = new JLabel("Adhar Number");
        lbladhar.setBounds(60,180,150,25);
        lbladhar.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbladhar);
        
        tfadhar = new JTextField();
        tfadhar.setBounds(220,180,150,25);
        add(tfadhar);
        
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60,230,150,25);
        lbladdress.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220,230,150,25);
        add(tfaddress);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(60,280,150,25);
        lblgender.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblgender);
        
        ButtonGroup gendergroup = new ButtonGroup();
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(220,280,70,25);
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(300,280,70,25);
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        gendergroup.add(rbmale);
        gendergroup.add(rbfemale);
        
        JLabel lblnumber = new JLabel("Mobile Number");
        lblnumber.setBounds(60,330,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);
        
        tfnumber = new JTextField();
        tfnumber.setBounds(220,330,150,25);
        add(tfnumber);
        
        JButton save = new JButton("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setBounds(220,380,150,30);
        save.addActionListener(this);
        add(save);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("arilinemanagmentsystem/Icons/emp.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(450,80,280,400);
        add(image);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("arilinemanagmentsystem/Icons/front.jpg"));
        JLabel limage = new JLabel(i);
        limage.setBounds(0,0,1250, 700);
        add(limage);
          
        setSize(900,600);
        setLocation(300,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getText();
        String nationality = tfnationality.getText();
        String number = tfnumber.getText();
        String adhar = tfadhar.getText();
        String address =tfaddress.getText();
        String gender = null;
        if(rbmale.isSelected()){
            gender = "Male";
        }else{
            gender = "Female";
        }
        try {
        Conn conn = new Conn();
        String query ="Insert into passenger1 values('"+name+"','"+nationality+"','"+address+"','"+adhar+"','"+number+"','"+gender+"')";
        conn.s.executeUpdate(query);
        JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
        
        setVisible(false);
       
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
        

    public static void main(String args[]){
        new AddCustomer();
    }
}    

