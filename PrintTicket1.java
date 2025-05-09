import javax.swing.*;
import java.awt.*;

public class PrintTicket1 extends JFrame {
    public PrintTicket1(String sFrom, String sTo, String sClass, Integer iAdult, Integer iChildren, Integer iInfant, String sBookingDate, Integer iPrice, String sTime) {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        JPanel Panel2 = new JPanel(null);
        Panel2.setPreferredSize(new Dimension(500, 200));

        JLabel LTitle = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">AirLine Ticket</font></b></html>");
        JLabel LFrom = new JLabel("<html><b><font color=\"#000000\">From: &nbsp;</font></b><font color=\"#778899\">" + sFrom + "</font></html>");
        JLabel LTo = new JLabel("<html><b><font color=\"#000000\">To: &nbsp;</font></b><font color=\"#778899\">" + sTo + "</font></html>");
        JLabel LClass = new JLabel("<html><b><font color=\"#000000\">Class: &nbsp;</font></b><font color=\"#778899\">" + sClass + "</font></html>");
        JLabel LBookingDate = new JLabel("<html><b><font color=\"#000000\">Traveling Date: &nbsp;</font></b><font color=\"#778899\">" + sBookingDate + "</font></html>");
        JLabel LPrice = new JLabel("<html><b><font color=\"#000000\">Total Price: &nbsp;</font></b><font color=\"#778899\">" + iPrice + "</font></html>");
        JLabel LTime = new JLabel("<html><b><font color=\"#000000\">Departure Time: &nbsp;</font></b><font color=\"#778899\">" + sTime + "</font></html>");
        JLabel LAdult = new JLabel("<html><b><font color=\"#000000\">Adult: &nbsp;</font></b><font color=\"#778899\">" + iAdult + "</font></html>");
        JLabel LChildren = new JLabel("<html><b><font color=\"#000000\">Children: &nbsp;</font></b><font color=\"#778899\">" + iChildren + "</font></html>");
        JLabel LInfant = new JLabel("<html><b><font color=\"#000000\">Infant: &nbsp;</font></b><font color=\"#778899\">" + iInfant + "</font></html>");
        JLabel LWishes = new JLabel("<html><I><font color=\"#D2B48C\">Wish you a happy journey</font></I></html>");

        JLabel LTicketNo = new JLabel("<html><b><font color=\"#000000\">Ticket Number: &nbsp;</font></b></html>");
        JLabel LBookedBy = new JLabel("<html><b><font color=\"#000000\">Booked By: &nbsp;</font></b></html>");





        // Set positions
        LTitle.setBounds(170, 15, 500, 45);
        LFrom.setBounds(20, 80, 300, 20);
        LTo.setBounds(20, 125, 300, 20);
        LClass.setBounds(20, 170, 300, 20);
        LBookingDate.setBounds(20, 215, 300, 20);
        LPrice.setBounds(20, 260, 300, 20);
        LTime.setBounds(20, 305, 300, 20);
        LAdult.setBounds(20, 345, 300, 20);
        LChildren.setBounds(20, 385, 300, 20);
        LInfant.setBounds(20, 430, 300, 20);
        LWishes.setBounds(530, 435, 300, 20);

        LTicketNo.setBounds(320, 80, 300, 20);
        LBookedBy.setBounds(320, 125, 300, 20);

        


        // Add elements to the panel
        Panel2.add(LTitle);
        Panel2.add(LFrom);
        Panel2.add(LTo);
        Panel2.add(LClass);
        Panel2.add(LBookingDate);
        Panel2.add(LAdult);
        Panel2.add(LChildren);
        Panel2.add(LInfant);
        Panel2.add(LPrice);
        Panel2.add(LTime);
        Panel2.add(LWishes);
        Panel2.add(LTicketNo);
        Panel2.add(LBookedBy);




        Panel2.setBackground(Color.white);
        c.add(Panel2, BorderLayout.CENTER);

        setSize(700, 650);
        setVisible(true);
    }
}
