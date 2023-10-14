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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
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

	/**
	 * Create the panel.
	 */
	
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
		textFieldUserEmailAddress.setText("student1@example.com");
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
			public void actionPerformed(ActionEvent e) {
				String emailCredential = "student1@example.com";
				String passwordCredential = "123";
				
				String email = textFieldUserEmailAddress.getText();
                String password = new String(passwordField.getPassword());

                if (email.isEmpty() && password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error login: Email and password cannot be blank");
                } else if (email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error login: Email cannot be blank");
                } else if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Error login: Password cannot be blank");
                } else if (email.equals(emailCredential) && password.equals(passwordCredential)) {
                	dispose();
    				StudentDashboard studentDashboardFrame = new StudentDashboard();
    				studentDashboardFrame.setVisible(true);
                }

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
