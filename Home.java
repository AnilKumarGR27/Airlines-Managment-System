package arilinemanagmentsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Home extends JFrame implements ActionListener{
      public Home(){
        
         setLayout(null);
         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("arilinemanagmentsystem/Icons/front.jpg"));
         JLabel image = new JLabel(i1);
         image.setBounds(0,0,1600,800);
          add(image);
          
          JLabel heading = new JLabel("WELCOMES TO AIR INDIA ARILINES");
          heading.setBounds(400,60,1000,60);
          heading.setForeground(Color.RED);
          heading.setFont(new Font("Tahoma",Font.CENTER_BASELINE,40));
          image.add(heading);
          
          JMenuBar menubar = new JMenuBar();
          setJMenuBar(menubar);
          
          JMenu details = new JMenu("Details");
          menubar.add(details);
         
          JMenuItem flightDetails = new JMenuItem("Flight details");
          flightDetails.addActionListener(this);
          details.add(flightDetails);
          
           JMenuItem customerDetails = new JMenuItem("Add Customer Details");
           customerDetails.addActionListener(this);
            details.add(customerDetails);
          
           JMenuItem bookFlight = new JMenuItem("Book Flight");
           bookFlight.addActionListener(this);
            details.add(bookFlight);
            
            JMenuItem journeyDetails = new JMenuItem("Journey details");
            journeyDetails.addActionListener(this);
            details.add(journeyDetails);
          
            JMenuItem ticketcancellationDetails = new JMenuItem("Cancel Ticket");
            ticketcancellationDetails.addActionListener(this);
             details.add(ticketcancellationDetails);
             
             JMenu ticket = new JMenu("Ticket");
             menubar.add(ticket);
         
          JMenuItem boardingPass = new JMenuItem("Boarding Pass");
          boardingPass.addActionListener(this);
          ticket.add(boardingPass);
             
             
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setLocation(600,250);
         setVisible(true);
}
     public void actionPerformed(ActionEvent ae) {
         String text = ae.getActionCommand();
         
          if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        } else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }  
          
     }
      public static void main(String args[]){ 
        new Home();
}
}
