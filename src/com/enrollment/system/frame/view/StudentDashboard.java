package com.enrollment.system.frame.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.enrollment.system.pane.view.StudentDashboardAdmission;
import com.enrollment.system.pane.view.StudentDashboardOverview;
import com.formdev.flatlaf.FlatLightLaf;

import Database.enrollmentDatabase;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class StudentDashboard extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnDashboard;
	private JButton btnAdmissionAssistant;
	private JPanel panelSidabarButtons;
	private JButton btnLogout;
	private JPanel panelUserInfo;
	private JLabel lblFullName;
	private JLabel lblEmailAddress;
	private JLabel lblUserProfile;
	private JPanel panelSidebar;
	private StudentDashboardOverview panelOverview;
	private StudentDashboardAdmission paneAdmission;
	
	//variable
	String email;
	String givenname,middlename,lastname,fullname;
	
	public void processData(int accountID) {
        // Process the accountID as needed
//        System.out.println("Processing account ID: " + accountID);
        // Your other processing logic here
        String url = "jdbc:mysql://localhost:3306/enrollmentsystemdb";
	    String username = "root";
	    String password = "";
	    enrollmentDatabase connector = new enrollmentDatabase(url, username, password);
	    connector.connect();
        try {
            String query = "SELECT * FROM tbl_student_information as tbl1 LEFT JOIN tbl_accounts as tbl2 ON tbl1.accountID = tbl2.accountID WHERE tbl1.accountID = ?";
            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1,accountID);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                // Access the resultSet data as needed
//               DISPLAY DATA ON LABELS
            	email = resultSet.getString("account_emailAddress");
            	givenname = resultSet.getString("givenName");
            	middlename = resultSet.getString("middleName");
            	lastname = resultSet.getString("lastname");
            	fullname = givenname+" "+middlename+" "+lastname;
            			
            	lblEmailAddress.setText(email);
            	lblFullName.setText(fullname);
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
	connector.closeConnection();
    }
	/**
	 * Create the frame.
	 */
//	private enrollmentDatabase connector;
	public StudentDashboard() {
		 System.out.println(email);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1100, 680);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panelSidebar = new JPanel();
		panelSidebar.setBackground(new Color(0, 128, 192));
		panelSidebar.setBounds(0, 0, 200, 641);
		contentPane.add(panelSidebar);
		panelSidebar.setLayout(null);
		
		lblUserProfile = new JLabel("");
		lblUserProfile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUserProfile.setIcon(new ImageIcon(getImage("user-profile.png")));
		lblUserProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserProfile.setBounds(10, 11, 180, 180);
		panelSidebar.add(lblUserProfile);
		
		panelUserInfo = new JPanel();
		panelUserInfo.setBackground(new Color(0, 128, 192));
		panelUserInfo.setBounds(10, 202, 180, 80);
		panelSidebar.add(panelUserInfo);
		panelUserInfo.setLayout(null);
		
		lblFullName = new JLabel();
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFullName.setForeground(new Color(255, 255, 255));
		lblFullName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullName.setBounds(0, 11, 180, 14);
		panelUserInfo.add(lblFullName);
		
		
		
		
		lblEmailAddress = new JLabel();
		lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailAddress.setForeground(new Color(255, 255, 255));
		lblEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailAddress.setBounds(0, 36, 180, 14);
		panelUserInfo.add(lblEmailAddress);
		
		panelOverview = new StudentDashboardOverview();
		panelOverview.setEnabled(false);
		panelOverview.setBackground(new Color(255, 255, 255));
		panelOverview.setBounds(199, 0, 885, 641);
		contentPane.add(panelOverview);
		
		paneAdmission = new StudentDashboardAdmission();
		paneAdmission.setEnabled(false);
		paneAdmission.setBackground(new Color(255, 255, 255));
		paneAdmission.setBounds(199, 0, 885, 641);
		contentPane.add(paneAdmission);
		
		panelSidabarButtons = new JPanel();
		panelSidabarButtons.setBackground(new Color(0, 128, 192));
		panelSidabarButtons.setBounds(0, 293, 200, 120);
		panelSidebar.add(panelSidabarButtons);
		panelSidabarButtons.setLayout(null);
		
		paneAdmission.setVisible(false);
		
		btnDashboard = new JButton("DASHBOARD");
		btnDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAdmissionAssistant.setBackground(new Color(0, 128, 192));
				btnAdmissionAssistant.setForeground(new Color(255, 255, 255));
				btnDashboard.setBackground(new Color(255, 255, 255));
				btnDashboard.setForeground(new Color(0, 128, 192));
				panelOverview.setVisible(true);
				paneAdmission.setVisible(false);

			}
		});
		btnDashboard.setForeground(new Color(0, 128, 192));
		btnDashboard.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDashboard.setBorder(null);
		btnDashboard.setBackground(new Color(255, 255, 255));
		btnDashboard.setBounds(0, 0, 200, 60);
		panelSidabarButtons.add(btnDashboard);
		
		btnAdmissionAssistant = new JButton("ADMIN ASSISTANT");
		btnAdmissionAssistant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDashboard.setBackground(new Color(0, 128, 192));
				btnDashboard.setForeground(new Color(255, 255, 255));
				btnAdmissionAssistant.setBackground(new Color(255, 255, 255));
				btnAdmissionAssistant.setForeground(new Color(0, 128, 192));
				paneAdmission.setVisible(true);
				panelOverview.setVisible(false);

			}
		});
		btnAdmissionAssistant.setForeground(new Color(255, 255, 255));
		btnAdmissionAssistant.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdmissionAssistant.setBorder(null);
		btnAdmissionAssistant.setBackground(new Color(0, 128, 192));
		btnAdmissionAssistant.setBounds(0, 60, 200, 60);
		panelSidabarButtons.add(btnAdmissionAssistant);
		
		btnLogout = new JButton("LOGOUT");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLogout.setBorder(null);
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(0, 128, 192));
		btnLogout.setBounds(10, 607, 180, 23);
		panelSidebar.add(btnLogout);
	}
	
	/**
	 * This method attempts to load an image from the resources folder.
	 * @param filename
	 * @return
	 */
	
	private Image getImage(String filename) {
	    try {
	        return ImageIO.read(getClass().getResourceAsStream(
	                "/" + filename));
	    } catch (IOException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
}
