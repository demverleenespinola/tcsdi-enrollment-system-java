package com.enrollmentsys.module;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatLightLaf;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.awt.Toolkit;

public class Registration extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBoxRegistrationStudentGrade;
	private JComboBox schoolCategoryComboBox;
	private JComboBox programComboBox;
	private JDateChooser studentBirthDate;
	private JTextField textFieldRegistrationFirstName;
	private JTextField textFieldRegistrationMiddleName;
	private JTextField textFieldRegistrationLastName; 
	private JTextField textFieldRegistrationContactNumber;
	private JTextField textFieldRegistrationEmail;
	private JPasswordField textFieldRegistrationStudentPassword;
	private JPasswordField textFieldRegistrationStudentConfirmPassword;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				    UIManager.setLookAndFeel( new FlatLightLaf() );
					Registration frame = new Registration();
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
	public Registration() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\EnrollmentSystem\\img\\school-icon.png"));
		setResizable(false);
		setTitle("SHS Enrollment System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 573);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        ImageIcon imageIcon = new ImageIcon("..\\EnrollmentSystem\\img\\school-logo.png");
        
        JPanel paneRegistrationSideBar = new JPanel();
        paneRegistrationSideBar.setBackground(new Color(255, 255, 255));
        paneRegistrationSideBar.setBounds(0, 0, 201, 533);
        contentPane.add(paneRegistrationSideBar);
        paneRegistrationSideBar.setLayout(null);
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(0, 0, 201, 533);
        paneRegistrationSideBar.add(imageLabel);
        imageLabel.setBackground(new Color(0, 0, 0));
        
        JLabel lblRegistrationFirstName = new JLabel("Student First Name");
        lblRegistrationFirstName.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationFirstName.setForeground(new Color(255, 255, 255));
        lblRegistrationFirstName.setBounds(230, 77, 183, 14);
        contentPane.add(lblRegistrationFirstName);
        
        textFieldRegistrationFirstName = new JTextField();
        textFieldRegistrationFirstName.setFont(new Font("Arial", Font.PLAIN, 12));
        textFieldRegistrationFirstName.setBackground(new Color(255, 255, 255));
        textFieldRegistrationFirstName.setBounds(229, 102, 184, 20);
        contentPane.add(textFieldRegistrationFirstName);
        textFieldRegistrationFirstName.setColumns(10);
        
        JLabel lblRegistrationMiddleName = new JLabel("Student Middle Name");
        lblRegistrationMiddleName.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationMiddleName.setForeground(Color.WHITE);
        lblRegistrationMiddleName.setBounds(424, 77, 183, 14);
        contentPane.add(lblRegistrationMiddleName);

        textFieldRegistrationMiddleName = new JTextField();
        textFieldRegistrationMiddleName.setFont(new Font("Arial", Font.PLAIN, 12));
        textFieldRegistrationMiddleName.setColumns(10);
        textFieldRegistrationMiddleName.setBounds(423, 102, 184, 20);
        contentPane.add(textFieldRegistrationMiddleName);
        
        JLabel lblRegistrationLastName = new JLabel("Student Last Name");
        lblRegistrationLastName.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationLastName.setForeground(Color.WHITE);
        lblRegistrationLastName.setBounds(231, 133, 183, 14);
        contentPane.add(lblRegistrationLastName);
        
        textFieldRegistrationLastName = new JTextField();
        textFieldRegistrationLastName.setFont(new Font("Arial", Font.PLAIN, 12));
        textFieldRegistrationLastName.setColumns(10);
        textFieldRegistrationLastName.setBounds(230, 158, 184, 20);
        contentPane.add(textFieldRegistrationLastName);
        
        JLabel lblRegistrationContactNumber = new JLabel("Student Contact Number");
        lblRegistrationContactNumber.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationContactNumber.setForeground(Color.WHITE);
        lblRegistrationContactNumber.setBounds(424, 133, 183, 14);
        contentPane.add(lblRegistrationContactNumber);
        
        textFieldRegistrationContactNumber = new JTextField();
        textFieldRegistrationContactNumber.setFont(new Font("Arial", Font.PLAIN, 12));
        textFieldRegistrationContactNumber.setColumns(10);
        textFieldRegistrationContactNumber.setBounds(423, 158, 184, 20);
        contentPane.add(textFieldRegistrationContactNumber);
        
        JLabel lblRegistrationEmail = new JLabel("Student Email Address");
        lblRegistrationEmail.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationEmail.setForeground(Color.WHITE);
        lblRegistrationEmail.setBounds(230, 189, 183, 14);
        contentPane.add(lblRegistrationEmail);
        
        textFieldRegistrationEmail = new JTextField();
        textFieldRegistrationEmail.setFont(new Font("Arial", Font.PLAIN, 12));
        textFieldRegistrationEmail.setColumns(10);
        textFieldRegistrationEmail.setBounds(229, 214, 184, 20);
        contentPane.add(textFieldRegistrationEmail);
        
        JLabel lblRegistrationStudentGrade = new JLabel("Student Grade");
        lblRegistrationStudentGrade.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationStudentGrade.setForeground(Color.WHITE);
        lblRegistrationStudentGrade.setBounds(230, 245, 183, 14);
        contentPane.add(lblRegistrationStudentGrade);
        
        JLabel intendedSchoolLabel = new JLabel("Intended School");
        intendedSchoolLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        intendedSchoolLabel.setForeground(Color.WHITE);
        intendedSchoolLabel.setBounds(230, 359, 92, 14);
        contentPane.add(intendedSchoolLabel);
        
        JLabel lblRegistrationSchoolCategory = new JLabel("Category");
        lblRegistrationSchoolCategory.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationSchoolCategory.setForeground(Color.WHITE);
        lblRegistrationSchoolCategory.setBounds(424, 245, 183, 14);
        contentPane.add(lblRegistrationSchoolCategory);
        
        JLabel lblRegistrationSchoolProgram = new JLabel("Program");
        lblRegistrationSchoolProgram.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationSchoolProgram.setForeground(Color.WHITE);
        lblRegistrationSchoolProgram.setBounds(231, 301, 376, 14);
        contentPane.add(lblRegistrationSchoolProgram);
        
        JLabel lblRegistrationStudentPassword = new JLabel("Password");
        lblRegistrationStudentPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationStudentPassword.setForeground(Color.WHITE);
        lblRegistrationStudentPassword.setBounds(230, 416, 183, 14);
        contentPane.add(lblRegistrationStudentPassword);
        
        JLabel lblRegistrationStudentConfirmPassword = new JLabel("Confirm Password");
        lblRegistrationStudentConfirmPassword.setFont(new Font("Arial", Font.PLAIN, 12));
        lblRegistrationStudentConfirmPassword.setForeground(Color.WHITE);
        lblRegistrationStudentConfirmPassword.setBounds(424, 416, 183, 14);
        contentPane.add(lblRegistrationStudentConfirmPassword);
        
        JComboBox intendedSchoolComboBox = new JComboBox();
        intendedSchoolComboBox.setModel(new DefaultComboBoxModel(new String[] {"Tesda High School"}));
        intendedSchoolComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        intendedSchoolComboBox.setBounds(230, 383, 377, 22);
        contentPane.add(intendedSchoolComboBox);
        
        comboBoxRegistrationStudentGrade = new JComboBox();
        comboBoxRegistrationStudentGrade.setModel(new DefaultComboBoxModel(new String[] {"Grade 11", "Grade 12"}));
        comboBoxRegistrationStudentGrade.setFont(new Font("Arial", Font.PLAIN, 12));
        comboBoxRegistrationStudentGrade.setBounds(230, 270, 183, 22);
        contentPane.add(comboBoxRegistrationStudentGrade);
        
        schoolCategoryComboBox = new JComboBox();
        schoolCategoryComboBox.setModel(new DefaultComboBoxModel(new String[] {"Senior High School"}));
        schoolCategoryComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        schoolCategoryComboBox.setBounds(424, 270, 183, 22);
        contentPane.add(schoolCategoryComboBox);
        
        programComboBox = new JComboBox();
        programComboBox.setModel(new DefaultComboBoxModel(new String[] {"SHS - Academic Track (STEM)"}));
        programComboBox.setFont(new Font("Arial", Font.PLAIN, 12));
        programComboBox.setBounds(230, 326, 377, 22);
        contentPane.add(programComboBox);
        
        JLabel studentBirthDateLabel = new JLabel("Student Birth Date");
        studentBirthDateLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        studentBirthDateLabel.setForeground(Color.WHITE);
        studentBirthDateLabel.setBounds(424, 189, 183, 14);
        contentPane.add(studentBirthDateLabel);
        
        studentBirthDate = new JDateChooser();
        studentBirthDate.setBounds(424, 214, 183, 20);
        contentPane.add(studentBirthDate);
        
        JLabel signUpLabel = new JLabel("Sign Up");
        signUpLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signUpLabel.setForeground(new Color(255, 255, 255));
        signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
        signUpLabel.setBounds(231, 24, 376, 42);
        contentPane.add(signUpLabel);
        
        textFieldRegistrationStudentPassword = new JPasswordField();
        textFieldRegistrationStudentPassword.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyReleased(KeyEvent e) {
                char[] password = textFieldRegistrationStudentPassword.getPassword();
                char[] confirmPassword = textFieldRegistrationStudentConfirmPassword.getPassword();

                if (Arrays.equals(password, confirmPassword)) {
                    textFieldRegistrationStudentPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.GREEN));
                    textFieldRegistrationStudentConfirmPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.GREEN));
                } else {
                    textFieldRegistrationStudentPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
                    textFieldRegistrationStudentConfirmPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
                }
        	}
        });
        textFieldRegistrationStudentPassword.setBounds(230, 441, 183, 20);
        contentPane.add(textFieldRegistrationStudentPassword);
        
        textFieldRegistrationStudentConfirmPassword = new JPasswordField();
        textFieldRegistrationStudentConfirmPassword.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                char[] password = textFieldRegistrationStudentPassword.getPassword();
                char[] confirmPassword = textFieldRegistrationStudentConfirmPassword.getPassword();

                if (Arrays.equals(password, confirmPassword)) {
                    textFieldRegistrationStudentPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.GREEN));
                    textFieldRegistrationStudentConfirmPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.GREEN));
                } else {
                    textFieldRegistrationStudentPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
                    textFieldRegistrationStudentConfirmPassword.setBorder(new MatteBorder(1, 1, 1, 1, Color.RED));
                }
            }
        });
        textFieldRegistrationStudentConfirmPassword.setBounds(424, 441, 183, 20);
        contentPane.add(textFieldRegistrationStudentConfirmPassword);
        
        JButton btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	char[] x = textFieldRegistrationStudentConfirmPassword.getPassword();
            	char[] y = textFieldRegistrationStudentPassword.getPassword();
            	
            	String a = new String(x);
            	String b = new String(y);

            	if (validateFields(true) && !a.isEmpty() && a.compareTo(b) == 0) {
					JOptionPane.showMessageDialog(null, "Thank you for signing up. Your account is now registered.", "Message", getDefaultCloseOperation(), null);	
                	dispose();
                	Login loginFrame = new Login();
                	loginFrame.setVisible(true);
                }
            }
        });

        btnRegister.setFont(new Font("Arial", Font.PLAIN, 12));
        btnRegister.setBackground(new Color(255, 255, 255));
        btnRegister.setBounds(473, 485, 134, 20);
        contentPane.add(btnRegister);
        
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		Login loginFrame = new Login();
        		loginFrame.setVisible(true);
        	}
        });
        btnBack.setFont(new Font("Arial", Font.PLAIN, 12));
        btnBack.setBackground(Color.WHITE);
        btnBack.setBounds(230, 485, 134, 20);
        contentPane.add(btnBack);
	}
	
    private boolean validateFields(boolean isFilled) {
        JTextField[] textFieldsToValidate = {
            textFieldRegistrationFirstName, textFieldRegistrationMiddleName, textFieldRegistrationLastName,
            textFieldRegistrationContactNumber, textFieldRegistrationEmail, textFieldRegistrationStudentPassword, textFieldRegistrationStudentConfirmPassword
        };

        Border errorBorder = BorderFactory.createLineBorder(Color.RED);

        for (JTextField field : textFieldsToValidate) {
            if (field.getText().trim().isEmpty()) {
                field.setBorder(errorBorder);
                isFilled = false;
            } else {
                field.setBorder(UIManager.getBorder("TextField.border"));
                isFilled = true;
            }
        }

        if (studentBirthDate.getDate() == null) {
            ((JTextField) studentBirthDate.getDateEditor()).setBorder(errorBorder);
        } else {
            ((JTextField) studentBirthDate.getDateEditor()).setBorder(UIManager.getBorder("TextField.border"));
        }
		return isFilled;
    }
}
