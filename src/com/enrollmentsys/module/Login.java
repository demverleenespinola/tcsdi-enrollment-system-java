package com.enrollmentsys.module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldLoginEmailAddress;
	private JPasswordField textFieldLoginPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlatLightLaf.setup();
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\EnrollmentSystem\\img\\school-icon.png"));
		setTitle("SHS Enrollment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 499);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        ImageIcon imageIcon = new ImageIcon("..\\EnrollmentSystem\\img\\school-logo.png");
        JLabel lblLoginLogo = new JLabel(imageIcon);
        lblLoginLogo.setLocation(0, 29);
        lblLoginLogo.setSize(405, 126);
        contentPane.add(lblLoginLogo, BorderLayout.CENTER);
		
		JPanel paneLogin = new JPanel();
		paneLogin.setBackground(new Color(0, 128, 192));
		paneLogin.setBounds(0, 184, 405, 276);
		contentPane.add(paneLogin);
		paneLogin.setLayout(null);
		
		JLabel lblLoginRegisterMessage = new JLabel("Newcomer? Register Now");
		lblLoginRegisterMessage.setBounds(213, 231, 157, 14);
		paneLogin.add(lblLoginRegisterMessage);
		lblLoginRegisterMessage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Registration registrationFrame = new Registration();
				registrationFrame.setVisible(true);
			}
		});
		lblLoginRegisterMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblLoginRegisterMessage.setForeground(new Color(255, 255, 255));
		lblLoginRegisterMessage.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JButton btnLoginButton = new JButton("Login");
		btnLoginButton.setBounds(225, 190, 145, 30);
		paneLogin.add(btnLoginButton);
		btnLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDashboardOverview studentDashboardFrame = new StudentDashboardOverview();
				String username = "student";
				String password = "123";
				
				String usernameFieldStr = textFieldLoginEmailAddress.getText();
				String passwordFieldStr = textFieldLoginPassword.getText();
				
				if (usernameFieldStr.matches(username) && passwordFieldStr.matches(password)) {
					dispose();
					studentDashboardFrame.setVisible(true);
				} else if (!usernameFieldStr.matches(username) && passwordFieldStr.matches(password)) {
					JOptionPane.showMessageDialog(null, "Login failed. Username is incorrect.", "Message", getDefaultCloseOperation(), null);	
				} else if (usernameFieldStr.matches("") && passwordFieldStr.length() > 1) {
					JOptionPane.showMessageDialog(null, "Login failed. Username cannot be blank.", "Message", getDefaultCloseOperation(), null);	
				} else if (passwordFieldStr.matches("") && usernameFieldStr.length() > 1) {
					JOptionPane.showMessageDialog(null, "Login failed. Password cannot be blank.", "Message", getDefaultCloseOperation(), null);	
				} else if (usernameFieldStr.matches(username) && !passwordFieldStr.matches(password)) {
					JOptionPane.showMessageDialog(null, "Login failed. Password is incorrect.", "Message", getDefaultCloseOperation(), null);	
				}  else if (usernameFieldStr.contains("") || passwordFieldStr.contains("")) {
					JOptionPane.showMessageDialog(null, "Login failed. Please check your username or password.", "Message", getDefaultCloseOperation(), null);
				}
			}
		});
		btnLoginButton.setForeground(new Color(0, 0, 0));
		btnLoginButton.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLoginButton.setBackground(new Color(255, 255, 255));
		
		JCheckBox comboBoxLoginShowPassword = new JCheckBox("show password");
		comboBoxLoginShowPassword.setBounds(38, 160, 320, 23);
		paneLogin.add(comboBoxLoginShowPassword);
		comboBoxLoginShowPassword.setForeground(new Color(255, 255, 255));
		comboBoxLoginShowPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxLoginShowPassword.isSelected()) {
                    textFieldLoginPassword.setEchoChar((char) 0);
                } else {
                    textFieldLoginPassword.setEchoChar('*');
                }
			}
		});
		comboBoxLoginShowPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxLoginShowPassword.setBackground(new Color(0, 128, 192));
		
		textFieldLoginPassword = new JPasswordField();
		textFieldLoginPassword.setBounds(38, 123, 332, 30);
		paneLogin.add(textFieldLoginPassword);
		textFieldLoginPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		
		JLabel lblLoginPassword = new JLabel("Password");
		lblLoginPassword.setBounds(38, 100, 110, 14);
		paneLogin.add(lblLoginPassword);
		lblLoginPassword.setForeground(new Color(255, 255, 255));
		lblLoginPassword.setFont(new Font("Arial", Font.PLAIN, 12));
		
		textFieldLoginEmailAddress = new JTextField();
		textFieldLoginEmailAddress.setBounds(38, 59, 332, 30);
		paneLogin.add(textFieldLoginEmailAddress);
		textFieldLoginEmailAddress.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldLoginEmailAddress.setColumns(10);
		
		JLabel lblLoginEmailAddress = new JLabel("Email Address");
		lblLoginEmailAddress.setBounds(38, 38, 110, 14);
		paneLogin.add(lblLoginEmailAddress);
		lblLoginEmailAddress.setForeground(new Color(255, 255, 255));
		lblLoginEmailAddress.setFont(new Font("Arial", Font.PLAIN, 12));
	}

}
