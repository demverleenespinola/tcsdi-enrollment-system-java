package com.enrollment.system.frame.view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDateChooser;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel lblSchoolLogo;
	private JLabel lblSignUpHeading;
	private JLabel lblStudentEmailAddress;
	private JLabel lblStudentGivenName;
	private JLabel lblStudentLastName;
	private JLabel lblStudentMiddleName;
	private JLabel lblStudentPassword;
	private JPanel contentPane;
	private JPanel panelSignUpForm;
	private JPanel panelSignUpSideBar;
	private JTextField textFieldStudentEmailAddress;
	private JTextField textFieldStudentFirstName;
	private JTextField textFieldStudentLastName;
	private JTextField textFieldStudentMiddleName;
	private JPasswordField passwordFieldUserPassword;
	private JButton btnStudentSignUp;
	private JButton btnBack;

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 685, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panelSignUp = new JPanel();
		panelSignUp.setBackground(new Color(0, 128, 192));
		panelSignUp.setBounds(0, 0, 784, 561);
		contentPane.add(panelSignUp);
		panelSignUp.setLayout(null);

		panelSignUpSideBar = new JPanel();
		panelSignUpSideBar.setBackground(new Color(255, 255, 255));
		panelSignUpSideBar.setBounds(0, 0, 250, 561);
		panelSignUp.add(panelSignUpSideBar);
		panelSignUpSideBar.setLayout(null);

		lblSchoolLogo = new JLabel("");
		lblSchoolLogo.setIcon(new ImageIcon(getImage("school-logo.png")));
		lblSchoolLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchoolLogo.setBounds(0, 0, 250, 562);
		panelSignUpSideBar.add(lblSchoolLogo);

		panelSignUpForm = new JPanel();
		panelSignUpForm.setBackground(new Color(0, 128, 192));
		panelSignUpForm.setBounds(260, 11, 397, 550);
		panelSignUp.add(panelSignUpForm);
		panelSignUpForm.setLayout(null);
		
				lblSignUpHeading = new JLabel("Student Sign Up");
				lblSignUpHeading.setBounds(10, 32, 377, 50);
				panelSignUpForm.add(lblSignUpHeading);
				lblSignUpHeading.setHorizontalAlignment(SwingConstants.CENTER);
				lblSignUpHeading.setForeground(Color.WHITE);
				lblSignUpHeading.setFont(new Font("Tahoma", Font.BOLD, 22));

		JPanel panelForm1 = new JPanel();
		panelForm1.setBackground(new Color(0, 128, 192));
		panelForm1.setBounds(10, 61, 364, 478);
		panelSignUpForm.add(panelForm1);
		panelForm1.setLayout(null);

		lblStudentGivenName = new JLabel("Student Given Name");
		lblStudentGivenName.setForeground(new Color(255, 255, 255));
		lblStudentGivenName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentGivenName.setBounds(10, 60, 344, 14);
		panelForm1.add(lblStudentGivenName);

		textFieldStudentFirstName = new JTextField();
		textFieldStudentFirstName.setBorder(null);
		textFieldStudentFirstName.setForeground(new Color(0, 0, 0));
		textFieldStudentFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentFirstName.setBounds(10, 85, 344, 20);
		panelForm1.add(textFieldStudentFirstName);
		textFieldStudentFirstName.setColumns(10);

		lblStudentLastName = new JLabel("Student Last Name");
		lblStudentLastName.setForeground(new Color(255, 255, 255));
		lblStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentLastName.setBounds(10, 172, 344, 14);
		panelForm1.add(lblStudentLastName);

		textFieldStudentLastName = new JTextField();
		textFieldStudentLastName.setBorder(null);
		textFieldStudentLastName.setForeground(new Color(0, 0, 0));
		textFieldStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentLastName.setBounds(10, 197, 344, 20);
		panelForm1.add(textFieldStudentLastName);
		textFieldStudentLastName.setColumns(10);

		lblStudentEmailAddress = new JLabel("Student Email Address");
		lblStudentEmailAddress.setForeground(new Color(255, 255, 255));
		lblStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentEmailAddress.setBounds(10, 228, 344, 14);
		panelForm1.add(lblStudentEmailAddress);

		textFieldStudentEmailAddress = new JTextField();
		textFieldStudentEmailAddress.setBorder(null);
		textFieldStudentEmailAddress.setForeground(new Color(0, 0, 0));
		textFieldStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentEmailAddress.setBounds(10, 253, 344, 20);
		panelForm1.add(textFieldStudentEmailAddress);
		textFieldStudentEmailAddress.setColumns(10);
		
		textFieldStudentMiddleName = new JTextField();
		textFieldStudentMiddleName.setBounds(10, 141, 344, 20);
		panelForm1.add(textFieldStudentMiddleName);
		textFieldStudentMiddleName.setBorder(null);
		textFieldStudentMiddleName.setForeground(new Color(0, 0, 0));
		textFieldStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentMiddleName.setColumns(10);
		
		lblStudentMiddleName = new JLabel("Student Middle Name");
		lblStudentMiddleName.setBounds(10, 116, 344, 14);
		panelForm1.add(lblStudentMiddleName);
		lblStudentMiddleName.setForeground(new Color(255, 255, 255));
		lblStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
				
		lblStudentPassword = new JLabel("Password");
		lblStudentPassword.setBounds(10, 284, 344, 14);
		panelForm1.add(lblStudentPassword);
		lblStudentPassword.setForeground(Color.WHITE);
		lblStudentPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));		
						
		passwordFieldUserPassword = new JPasswordField();
		passwordFieldUserPassword.setBounds(10, 309, 344, 20);
		panelForm1.add(passwordFieldUserPassword);
		passwordFieldUserPassword.setForeground(Color.BLACK);
		passwordFieldUserPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordFieldUserPassword.setColumns(10);
		passwordFieldUserPassword.setBorder(null);				
								
		btnStudentSignUp = new JButton("Sign Up");
		btnStudentSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] password = passwordFieldUserPassword.getPassword();
//				char[] confirmPassword = passwordFieldUserConfirmPassword.getPassword();

//				if (isAnyFieldBlank(textFieldStudentFirstName, textFieldStudentContactNumber,
//						textFieldStudentEmailAddress, textFieldStudentFirstName, textFieldStudentLastName,
//						textFieldStudentMiddleName, passwordFieldUserPassword, passwordFieldUserConfirmPassword)
//						|| isDateChooserBlank(dateChooserStudentBirthDate)) {
				
				if (isAnyFieldBlank(textFieldStudentEmailAddress, textFieldStudentFirstName, textFieldStudentLastName,
						textFieldStudentMiddleName, passwordFieldUserPassword)) {
					JOptionPane.showMessageDialog(null,
							"Error: Some fields are blank. Please fill in all the required fields.");
				} else {
					// Passwords match, proceed with the sign-up process.
					// Replace this with your actual sign-up logic.
					
					String url = "jdbc:mysql://localhost:3306/enrollmentsystemdb";
	                String username = "root";
	                String pass = "";

	                try {
	                    Connection connection = DriverManager.getConnection(url, username, pass);
	                    String query = "INSERT INTO tbl_accounts (account_givenname,account_middlename,account_lastname,account_emailAddress,account_password) VALUES (?,?,?,?,?) ";
	                    PreparedStatement preparedStatement = connection.prepareStatement(query);
	                    preparedStatement.setString(1, textFieldStudentFirstName.getText());
	                    preparedStatement.setString(2, textFieldStudentMiddleName.getText());
	                    preparedStatement.setString(3, textFieldStudentLastName.getText());
	                    preparedStatement.setString(4, textFieldStudentEmailAddress.getText());
	                    preparedStatement.setString(5, new String(passwordFieldUserPassword.getPassword()));
//	                    preparedStatement.setString(6, new String(passwordFieldUserConfirmPassword.getPassword()));
	                    preparedStatement.executeUpdate();
	                    System.out.println("Data inserted successfully.");
	                    connection.close();
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }

					dispose();
					Login loginFrame = new Login();
					loginFrame.setVisible(true);
					
//					frame.add(textField);
				}	
			}
		});
		btnStudentSignUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStudentSignUp.setFocusable(false);
		btnStudentSignUp.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnStudentSignUp.setBackground(Color.YELLOW);
		btnStudentSignUp.setBounds(254, 423, 100, 21);
		panelForm1.add(btnStudentSignUp);
		
		
		
		btnBack = new JButton("Back");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setFocusable(false);
		btnBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBackground(Color.YELLOW);
		btnBack.setBounds(10, 423, 100, 21);
		panelForm1.add(btnBack);						
										
										
										
	}

	/**
	 * 
	 * Checks if any of the specified JTextField objects are empty.
	 * 
	 * @author Chacha
	 *
	 */

	private static boolean isAnyFieldBlank(JTextField... fields) {
		for (JTextField field : fields) {
			if (field.getText().trim().isEmpty()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method attempts to load an image from the resources folder.
	 * 
	 * @param filename
	 * @return
	 */

	private Image getImage(String filename) {
		try {
			return ImageIO.read(getClass().getResourceAsStream("/" + filename));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
