package com.enrollmentsys.module;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Toolkit;

public class StudentDashboardOverview extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean buttonClicked = false;
	private JTextField textFieldStudentNumberDashboard;
	private JTextField textFieldDashboardStudentStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new FlatIntelliJLaf());
					StudentDashboardOverview frame = new StudentDashboardOverview();
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
	public StudentDashboardOverview() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("..\\EnrollmentSystem\\img\\school-icon.png"));
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 587);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel navigationPane = new JPanel();
		navigationPane.setBounds(0, 0, 220, 548);
		navigationPane.setBackground(new Color(0, 128, 192));
		contentPane.add(navigationPane);
		navigationPane.setLayout(null);

		JButton btnAdmissionAssistant = new JButton("Admission Assistant");
		btnAdmissionAssistant.setForeground(new Color(255, 255, 255));
		btnAdmissionAssistant.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentDashboardAdmission studentDashboardAdmissionFrame = new StudentDashboardAdmission();
				studentDashboardAdmissionFrame.setVisible(true);
			}
		});
		btnAdmissionAssistant.setBackground(new Color(0, 128, 192));
		btnAdmissionAssistant.setFont(new Font("Arial", Font.BOLD, 16));
		btnAdmissionAssistant.setBounds(0, 301, 220, 60);
		btnAdmissionAssistant.setBorder(null);
		navigationPane.add(btnAdmissionAssistant);

		JButton btnDashboard = new JButton("Dashboard");
		btnDashboard.setForeground(new Color(0, 0, 0));
		btnDashboard.setFont(new Font("Arial", Font.BOLD, 16));
		btnDashboard.setBorder(null);
		btnDashboard.setBackground(new Color(255, 255, 255));
		btnDashboard.setBounds(0, 242, 220, 60);
		navigationPane.add(btnDashboard);

		JLabel profileImageLabel = new JLabel("");
		profileImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		profileImageLabel.setIcon(
				new ImageIcon("..\\EnrollmentSystem\\img\\user-profile.png"));
		profileImageLabel.setBounds(10, 11, 200, 164);
		navigationPane.add(profileImageLabel);

		JLabel lblDashboardStudentName = new JLabel("JUAN DELA CRUZ");
		lblDashboardStudentName.setForeground(new Color(255, 255, 255));
		lblDashboardStudentName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboardStudentName.setFont(new Font("Arial", Font.BOLD, 10));
		lblDashboardStudentName.setBounds(10, 186, 200, 26);
		navigationPane.add(lblDashboardStudentName);

		JLabel lblDashboardStudentEmaill = new JLabel("juandelacruz@gmail.com");
		lblDashboardStudentEmaill.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboardStudentEmaill.setForeground(Color.WHITE);
		lblDashboardStudentEmaill.setFont(new Font("Arial", Font.BOLD, 10));
		lblDashboardStudentEmaill.setBounds(10, 208, 200, 26);
		navigationPane.add(lblDashboardStudentEmaill);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(new Color(0, 128, 192));
		btnLogout.setBounds(64, 514, 89, 23);
		navigationPane.add(btnLogout);

		JLabel lblDashboardInformationMessage = new JLabel(
				"You are currently not enrolled. Please go to admission assistant and submit an application form.");
		lblDashboardInformationMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboardInformationMessage.setFont(new Font("Arial", Font.PLAIN, 12));
		lblDashboardInformationMessage.setBounds(229, 253, 829, 70);
		contentPane.add(lblDashboardInformationMessage);

		JLabel lblDashboardOverview = new JLabel("Dashboard Overview");
		lblDashboardOverview.setFont(new Font("Arial", Font.BOLD, 18));
		lblDashboardOverview.setBounds(240, 26, 362, 36);
		contentPane.add(lblDashboardOverview);

		JLabel lblStudentNumberDashboard = new JLabel("Student Number:");
		lblStudentNumberDashboard.setFont(new Font("Arial", Font.BOLD, 12));
		lblStudentNumberDashboard.setBounds(672, 33, 102, 26);
		contentPane.add(lblStudentNumberDashboard);

		textFieldStudentNumberDashboard = new JTextField();
		textFieldStudentNumberDashboard.setText("3-12-023");
		textFieldStudentNumberDashboard.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStudentNumberDashboard.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentNumberDashboard.setEditable(false);
		textFieldStudentNumberDashboard.setColumns(10);
		textFieldStudentNumberDashboard.setBounds(773, 33, 76, 26);
		contentPane.add(textFieldStudentNumberDashboard);

		JLabel lblDashboardStudentStatus = new JLabel("Student Status:");
		lblDashboardStudentStatus.setFont(new Font("Arial", Font.BOLD, 12));
		lblDashboardStudentStatus.setBounds(859, 33, 89, 26);
		contentPane.add(lblDashboardStudentStatus);

		textFieldDashboardStudentStatus = new JTextField();
		textFieldDashboardStudentStatus.setText("NOT ENROLLED");
		textFieldDashboardStudentStatus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDashboardStudentStatus.setForeground(Color.RED);
		textFieldDashboardStudentStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldDashboardStudentStatus.setEditable(false);
		textFieldDashboardStudentStatus.setColumns(10);
		textFieldDashboardStudentStatus.setBounds(958, 33, 114, 26);
		contentPane.add(textFieldDashboardStudentStatus);

	}
}
