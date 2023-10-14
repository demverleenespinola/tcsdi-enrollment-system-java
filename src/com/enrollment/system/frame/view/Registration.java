package com.enrollment.system.frame.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.SoftBevelBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnStudentSignUp;
	private JComboBox comboBoxStudentIntendedAcademicYear;
	private JComboBox comboBoxStudentGradingPeriod;
	private JComboBox comboBoxStudentIntendedSchool;
	private JComboBox comboBoxStudentProgram;
	private JDateChooser dateChooserStudentBirthDate;
	private JLabel lblSchoolLogo;
	private JLabel lblSignUpHeading;
	private JLabel lblStudentBirthDate;
	private JLabel lblStudentIntendedAcademicYear;
	private JLabel lblStudentConfirmPassword;
	private JLabel lblStudentContactNumber;
	private JLabel lblStudentEmailAddress;
	private JLabel lblStudentFirstName;
	private JLabel lblStudentGradingPeriod;
	private JLabel lblStudentLastName;
	private JLabel lblStudentMiddleName;
	private JLabel lblStudentPassword;
	private JLabel lblStudentProgram;
	private JLabel lblStudentStudentGrade;
	private JPanel contentPane;
	private JPanel panelSignUpForm;
	private JPanel panelSignUpSideBar;
	private JTextField textFieldStudentContactNumber;
	private JTextField textFieldStudentEmailAddress;
	private JTextField textFieldStudentFirstName;
	private JTextField textFieldStudentLastName;
	private JTextField textFieldStudentMiddleName;
	private JPasswordField passwordFieldUserConfirmPassword;
	private JPasswordField passwordFieldUserPassword;
	private JButton btnBack;

	/**
	 * Create the frame.
	 */
	public Registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 600);
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
		panelSignUpForm.setBounds(260, 11, 514, 550);
		panelSignUp.add(panelSignUpForm);
		panelSignUpForm.setLayout(null);

		JPanel panelForm3 = new JPanel();
		panelForm3.setBackground(new Color(0, 128, 192));
		panelForm3.setBounds(10, 304, 494, 235);
		panelSignUpForm.add(panelForm3);
		panelForm3.setLayout(null);

		comboBoxStudentIntendedAcademicYear = new JComboBox();
		comboBoxStudentIntendedAcademicYear
				.setModel(new DefaultComboBoxModel(new String[] { "S.Y. 2023-2024", "S.Y. 2024-2025" }));
		comboBoxStudentIntendedAcademicYear.setForeground(Color.BLACK);
		comboBoxStudentIntendedAcademicYear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentIntendedAcademicYear.setBorder(null);
		comboBoxStudentIntendedAcademicYear.setBounds(10, 25, 474, 22);
		panelForm3.add(comboBoxStudentIntendedAcademicYear);

		lblStudentIntendedAcademicYear = new JLabel("Category");
		lblStudentIntendedAcademicYear.setForeground(Color.WHITE);
		lblStudentIntendedAcademicYear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentIntendedAcademicYear.setBounds(10, 0, 474, 14);
		panelForm3.add(lblStudentIntendedAcademicYear);

		lblStudentProgram = new JLabel("Program");
		lblStudentProgram.setForeground(Color.WHITE);
		lblStudentProgram.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentProgram.setBounds(10, 58, 474, 14);
		panelForm3.add(lblStudentProgram);

		comboBoxStudentProgram = new JComboBox();
		comboBoxStudentProgram.setModel(new DefaultComboBoxModel(new String[] { "STEM Strand: Mathematics",
				"STEM Strand: Science", "STEM Strand: Engineering", "ICT Strand: Programming",
				"ICT Strand: Web Development", "ICT Strand Database Management", "Sport Track: Physical Education" }));
		comboBoxStudentProgram.setForeground(Color.BLACK);
		comboBoxStudentProgram.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentProgram.setBorder(null);
		comboBoxStudentProgram.setBounds(10, 83, 474, 22);
		panelForm3.add(comboBoxStudentProgram);

		lblStudentPassword = new JLabel("Password");
		lblStudentPassword.setForeground(Color.WHITE);
		lblStudentPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentPassword.setBounds(10, 116, 220, 14);
		panelForm3.add(lblStudentPassword);

		passwordFieldUserPassword = new JPasswordField();
		passwordFieldUserPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				checkPasswordMatch();
			}
		});
		passwordFieldUserPassword.setForeground(Color.BLACK);
		passwordFieldUserPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordFieldUserPassword.setColumns(10);
		passwordFieldUserPassword.setBorder(null);
		passwordFieldUserPassword.setBounds(10, 141, 220, 20);
		panelForm3.add(passwordFieldUserPassword);

		lblStudentConfirmPassword = new JLabel("Confirm Password");
		lblStudentConfirmPassword.setForeground(Color.WHITE);
		lblStudentConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentConfirmPassword.setBounds(264, 116, 220, 14);
		panelForm3.add(lblStudentConfirmPassword);

		passwordFieldUserConfirmPassword = new JPasswordField();
		passwordFieldUserConfirmPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				checkPasswordMatch();
			}
		});
		passwordFieldUserConfirmPassword.setForeground(Color.BLACK);
		passwordFieldUserConfirmPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordFieldUserConfirmPassword.setColumns(10);
		passwordFieldUserConfirmPassword.setBorder(null);
		passwordFieldUserConfirmPassword.setBounds(264, 141, 220, 20);
		panelForm3.add(passwordFieldUserConfirmPassword);

		btnStudentSignUp = new JButton("Sign Up");
		btnStudentSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] password = passwordFieldUserPassword.getPassword();
				char[] confirmPassword = passwordFieldUserConfirmPassword.getPassword();

				if (isAnyFieldBlank(textFieldStudentFirstName, textFieldStudentContactNumber,
						textFieldStudentEmailAddress, textFieldStudentFirstName, textFieldStudentLastName,
						textFieldStudentMiddleName, passwordFieldUserPassword, passwordFieldUserConfirmPassword)
						|| isDateChooserBlank(dateChooserStudentBirthDate)) {
					JOptionPane.showMessageDialog(null,
							"Error: Some fields are blank. Please fill in all the required fields.");
				} else {
					// Passwords match, proceed with the sign-up process.
					// Replace this with your actual sign-up logic.

					dispose();
					Login loginFrame = new Login();
					loginFrame.setVisible(true);
				}
			}
		});
		btnStudentSignUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnStudentSignUp.setFocusable(false);
		btnStudentSignUp.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnStudentSignUp.setBackground(Color.YELLOW);
		btnStudentSignUp.setBounds(384, 203, 100, 21);
		panelForm3.add(btnStudentSignUp);

		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Login loginFrame = new Login();
				loginFrame.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnBack.setFocusable(false);
		btnBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnBack.setBackground(Color.YELLOW);
		btnBack.setBounds(10, 203, 100, 21);
		panelForm3.add(btnBack);

		JPanel panelForm1 = new JPanel();
		panelForm1.setBackground(new Color(0, 128, 192));
		panelForm1.setBounds(10, 63, 240, 240);
		panelSignUpForm.add(panelForm1);
		panelForm1.setLayout(null);

		lblStudentFirstName = new JLabel("Student First Name");
		lblStudentFirstName.setForeground(new Color(255, 255, 255));
		lblStudentFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentFirstName.setBounds(10, 11, 220, 14);
		panelForm1.add(lblStudentFirstName);

		textFieldStudentFirstName = new JTextField();
		textFieldStudentFirstName.setBorder(null);
		textFieldStudentFirstName.setForeground(new Color(0, 0, 0));
		textFieldStudentFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentFirstName.setBounds(10, 36, 220, 20);
		panelForm1.add(textFieldStudentFirstName);
		textFieldStudentFirstName.setColumns(10);

		lblStudentLastName = new JLabel("Student Last Name");
		lblStudentLastName.setForeground(new Color(255, 255, 255));
		lblStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentLastName.setBounds(10, 67, 220, 14);
		panelForm1.add(lblStudentLastName);

		textFieldStudentLastName = new JTextField();
		textFieldStudentLastName.setBorder(null);
		textFieldStudentLastName.setForeground(new Color(0, 0, 0));
		textFieldStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentLastName.setBounds(10, 92, 220, 20);
		panelForm1.add(textFieldStudentLastName);
		textFieldStudentLastName.setColumns(10);

		lblStudentEmailAddress = new JLabel("Student Email Address");
		lblStudentEmailAddress.setForeground(new Color(255, 255, 255));
		lblStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentEmailAddress.setBounds(10, 123, 220, 14);
		panelForm1.add(lblStudentEmailAddress);

		textFieldStudentEmailAddress = new JTextField();
		textFieldStudentEmailAddress.setBorder(null);
		textFieldStudentEmailAddress.setForeground(new Color(0, 0, 0));
		textFieldStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentEmailAddress.setBounds(10, 148, 220, 20);
		panelForm1.add(textFieldStudentEmailAddress);
		textFieldStudentEmailAddress.setColumns(10);

		lblStudentStudentGrade = new JLabel("Intended School");
		lblStudentStudentGrade.setForeground(new Color(255, 255, 255));
		lblStudentStudentGrade.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentStudentGrade.setBounds(10, 179, 220, 14);
		panelForm1.add(lblStudentStudentGrade);

		comboBoxStudentIntendedSchool = new JComboBox();
		comboBoxStudentIntendedSchool.setModel(
				new DefaultComboBoxModel(new String[] { "Manila - Tesda High School", "Makati - Tesda High School" }));
		comboBoxStudentIntendedSchool.setBorder(null);
		comboBoxStudentIntendedSchool.setForeground(new Color(0, 0, 0));
		comboBoxStudentIntendedSchool.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentIntendedSchool.setBounds(10, 204, 220, 22);
		panelForm1.add(comboBoxStudentIntendedSchool);

		JPanel panelForm2 = new JPanel();
		panelForm2.setBackground(new Color(0, 128, 192));
		panelForm2.setBounds(264, 63, 240, 240);
		panelSignUpForm.add(panelForm2);
		panelForm2.setLayout(null);

		lblStudentGradingPeriod = new JLabel("Grading Period");
		lblStudentGradingPeriod.setForeground(new Color(255, 255, 255));
		lblStudentGradingPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentGradingPeriod.setBounds(10, 179, 220, 14);
		panelForm2.add(lblStudentGradingPeriod);

		textFieldStudentContactNumber = new JTextField();
		textFieldStudentContactNumber.setBorder(null);
		textFieldStudentContactNumber.setForeground(new Color(0, 0, 0));
		textFieldStudentContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentContactNumber.setColumns(10);
		textFieldStudentContactNumber.setBounds(10, 92, 220, 20);
		panelForm2.add(textFieldStudentContactNumber);

		lblStudentContactNumber = new JLabel("Student Contact Number");
		lblStudentContactNumber.setForeground(new Color(255, 255, 255));
		lblStudentContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentContactNumber.setBounds(10, 67, 220, 14);
		panelForm2.add(lblStudentContactNumber);

		textFieldStudentMiddleName = new JTextField();
		textFieldStudentMiddleName.setBorder(null);
		textFieldStudentMiddleName.setForeground(new Color(0, 0, 0));
		textFieldStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentMiddleName.setColumns(10);
		textFieldStudentMiddleName.setBounds(10, 36, 220, 20);
		panelForm2.add(textFieldStudentMiddleName);

		lblStudentMiddleName = new JLabel("Student Middle Name");
		lblStudentMiddleName.setForeground(new Color(255, 255, 255));
		lblStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentMiddleName.setBounds(10, 11, 220, 14);
		panelForm2.add(lblStudentMiddleName);

		comboBoxStudentGradingPeriod = new JComboBox();
		comboBoxStudentGradingPeriod.setModel(new DefaultComboBoxModel(new String[] { "First Quarter (Q1)",
				"Second Quarter (Q2)", "Third Quarter (Q3)", "Fourth Quarter (Q4)" }));
		comboBoxStudentGradingPeriod.setBorder(null);
		comboBoxStudentGradingPeriod.setForeground(new Color(0, 0, 0));
		comboBoxStudentGradingPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentGradingPeriod.setBounds(10, 202, 220, 22);
		panelForm2.add(comboBoxStudentGradingPeriod);

		lblStudentBirthDate = new JLabel("Student Birth Date");
		lblStudentBirthDate.setForeground(new Color(255, 255, 255));
		lblStudentBirthDate.setBounds(10, 123, 220, 14);
		panelForm2.add(lblStudentBirthDate);

		dateChooserStudentBirthDate = new JDateChooser();
		dateChooserStudentBirthDate.setBounds(10, 148, 220, 20);
		panelForm2.add(dateChooserStudentBirthDate);

		lblSignUpHeading = new JLabel("Student Sign Up");
		lblSignUpHeading.setHorizontalAlignment(SwingConstants.CENTER);
		lblSignUpHeading.setForeground(Color.WHITE);
		lblSignUpHeading.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblSignUpHeading.setBounds(10, 0, 494, 50);
		panelSignUpForm.add(lblSignUpHeading);
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

	private boolean isDateChooserBlank(JDateChooser dateChooser) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return dateChooser.getDate() == null || sdf.format(dateChooser.getDate()).isEmpty();
	}

	/**
	 * Add a method to check if passwords match
	 * 
	 * @param password
	 * @param confirmPassword
	 * @return
	 */

	private void checkPasswordMatch() {
		char[] password = passwordFieldUserPassword.getPassword();
		char[] confirmPassword = passwordFieldUserConfirmPassword.getPassword();

		if (Arrays.equals(password, confirmPassword)) {
			passwordFieldUserPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
			passwordFieldUserConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		} else {
			passwordFieldUserPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
			passwordFieldUserConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
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
