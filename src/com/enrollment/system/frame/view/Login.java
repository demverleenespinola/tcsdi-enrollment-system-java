package com.enrollment.system.frame.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Database.enrollmentDatabase;

import javax.swing.JPasswordField;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnLogin;
	private JCheckBox chckbxShowPassword;
	private JLabel lblUserEmailAddress;
	private JLabel lblUserPassword;
	private JLabel lblSchoolLogo;
	private JLabel lblSignInHeading;
	private JLabel lblSignUpLink;
	private JPanel paneSignInForm;
	private JPanel panelInnerForm;
	private JPanel panelSignInLogo;
	private JTextField textFieldUserEmailAddress;
	private JPasswordField passwordField;
//    Statement statement = null;

	/**
	 * Create the panel.
	 */
	private Connection connection;
    private String url;
    private String username;
    private String password;

    public Login(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        connect();
    }
    private void connect() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
            if (this.connection != null) {
                System.out.println("Connected to the database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

	
	public Login() {
		setBackground(new Color(0, 128, 192));
		setBounds(0, 0, 400, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		panelSignInLogo = new JPanel();
		panelSignInLogo.setBackground(new Color(255, 255, 255));
		panelSignInLogo.setBounds(0, 0, 384, 200);
		getContentPane().add(panelSignInLogo);
		panelSignInLogo.setLayout(null);

		lblSchoolLogo = new JLabel("");
		lblSchoolLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolLogo.setIcon(new ImageIcon(getImage("school-logo.png")));
		lblSchoolLogo.setBounds(0, 0, 384, 200);
		panelSignInLogo.add(lblSchoolLogo);

		paneSignInForm = new JPanel();
		paneSignInForm.setBackground(new Color(0, 128, 192));
		paneSignInForm.setBounds(0, 198, 384, 363);
		getContentPane().add(paneSignInForm);
		paneSignInForm.setLayout(null);

		panelInnerForm = new JPanel();
		panelInnerForm.setBackground(new Color(0, 128, 192));
		panelInnerForm.setBounds(10, 11, 364, 341);
		paneSignInForm.add(panelInnerForm);
		panelInnerForm.setLayout(null);

		lblSignUpLink = new JLabel("Newcomer? sign up here");
		lblSignUpLink.setBounds(89, 290, 221, 14);
		panelInnerForm.add(lblSignUpLink);
		lblSignUpLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Registration registrationFrame = new Registration();
//				getDataForComboBox registrationFrame = new getDataForComboBox();
				registrationFrame.setVisible(true);
			}
		});
		lblSignUpLink.setForeground(new Color(255, 255, 255));
		lblSignUpLink.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSignUpLink.setHorizontalAlignment(SwingConstants.RIGHT);

		chckbxShowPassword = new JCheckBox("Show Password");
		chckbxShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox checkBox = (JCheckBox) e.getSource();
                passwordField.setEchoChar(checkBox.isSelected() ? '\0' : '\u2022');
			}
		});
		chckbxShowPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxShowPassword.setBounds(45, 192, 265, 23);
		panelInnerForm.add(chckbxShowPassword);
		chckbxShowPassword.setForeground(new Color(255, 255, 255));
		chckbxShowPassword.setBackground(new Color(0, 128, 192));

		lblUserPassword = new JLabel("Password");
		lblUserPassword.setBounds(45, 141, 265, 23);
		panelInnerForm.add(lblUserPassword);
		lblUserPassword.setForeground(Color.WHITE);
		lblUserPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));

		textFieldUserEmailAddress = new JTextField();
		textFieldUserEmailAddress.setBounds(45, 107, 265, 23);
		panelInnerForm.add(textFieldUserEmailAddress);
		textFieldUserEmailAddress.setText("");
		textFieldUserEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldUserEmailAddress.setColumns(10);

		lblUserEmailAddress = new JLabel("Email Address ");
		lblUserEmailAddress.setBounds(45, 84, 265, 23);
		panelInnerForm.add(lblUserEmailAddress);
		lblUserEmailAddress.setForeground(Color.WHITE);
		lblUserEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));

		lblSignInHeading = new JLabel("Sign In ");
		lblSignInHeading.setForeground(new Color(255, 255, 255));
		lblSignInHeading.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSignInHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignInHeading.setBounds(45, 11, 265, 50);
		panelInnerForm.add(lblSignInHeading);

		btnLogin = new JButton("Sign in");
		btnLogin.addActionListener(new ActionListener() {
			public  void actionPerformed(ActionEvent e) {
				String email = textFieldUserEmailAddress.getText();
                String passwords = new String(passwordField.getPassword());
                
				String url = "jdbc:mysql://localhost:3306/enrollmentsystemdb";
			    String username = "root";
			    String password = "";
			    enrollmentDatabase connector = new enrollmentDatabase(url, username, password);
			    connector.connect();
			    int accountID = -1;
				try {
		            String query = "SELECT * FROM tbl_accounts as tbl1 LEFT JOIN tbl_account_description as tbl2 ON tbl1.account_descriptionID = tbl2.account_descriptionID WHERE account_emailAddress = ?  AND account_password = ?";
		            PreparedStatement preparedStatement = connector.getConnection().prepareStatement(query);
		            preparedStatement.setString(1, email);
		            preparedStatement.setString(2, passwords);
		            ResultSet resultSet = preparedStatement.executeQuery();
		            if (resultSet.next()) {
		                // The query returned a result, indicating successful login
		                System.out.println("Login successful");
		                accountID = resultSet.getInt("accountID");
		                if(resultSet.getInt("account_descriptionID") == 01) {
//		                	System.out.println("admin");
		                	dispose();
		    				AdminDashboard adminDashboard = new AdminDashboard();
		    				adminDashboard.processData(accountID); 
		    				adminDashboard.setVisible(true);
		                }else if(resultSet.getInt("account_descriptionID") == 02) {
//		                	System.out.println("student");
		                	dispose();
		    				StudentDashboard studentDashboardFrame = new StudentDashboard();
		    				studentDashboardFrame.processData(accountID); 
		    				studentDashboardFrame.setVisible(true);
		                }
		                
	    				
		            } else {
		                // The query didn't return any results, indicating invalid login credentials
		                System.out.println("Invalid login credentials");
		                JOptionPane.showMessageDialog(null, "Invalid login credentials");
		            }
		        } catch (SQLException e1) {
		            e1.printStackTrace();
		        }
			connector.closeConnection();
			
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setFocusable(false);
		btnLogin.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogin.setBackground(Color.YELLOW);
		btnLogin.setBounds(210, 258, 100, 21);
		panelInnerForm.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(45, 165, 265, 20);
		panelInnerForm.add(passwordField);
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
