package com.enrollment.system.pane.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDashboardOverview extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textFieldStudentNumber;
	private JTextField textFieldStudentStatus;

	/**
	 * Create the panel.
	 */
	public StudentDashboardOverview() {
		setEnabled(false);
		setBackground(new Color(192, 192, 192));
		setBounds(199, 0, 885, 641);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setEnabled(false);
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 885, 641);
		add(panel);
		panel.setLayout(null);
		
		JPanel panelOverview = new JPanel();
		panelOverview.setBackground(new Color(255, 255, 255));
		panelOverview.setBounds(20, 11, 840, 619);
		panel.add(panelOverview);
		panelOverview.setLayout(null);
		
		JLabel lblHeading = new JLabel("Dashboard Overview");
		lblHeading.setVerticalAlignment(SwingConstants.BOTTOM);
		lblHeading.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHeading.setBounds(10, 11, 190, 39);
		panelOverview.add(lblHeading);
		
		JLabel lblStudentNumber = new JLabel("Student Number:");
		lblStudentNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStudentNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentNumber.setBounds(374, 30, 120, 20);
		panelOverview.add(lblStudentNumber);
		
		textFieldStudentNumber = new JTextField();
		textFieldStudentNumber.setText("1001");
		textFieldStudentNumber.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStudentNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldStudentNumber.setEditable(false);
		textFieldStudentNumber.setColumns(10);
		textFieldStudentNumber.setBounds(504, 31, 100, 20);
		panelOverview.add(textFieldStudentNumber);
		
		JLabel lblStudentStatus = new JLabel("Student Status:");
		lblStudentStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStudentStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentStatus.setBounds(614, 32, 106, 20);
		panelOverview.add(lblStudentStatus);
		
		textFieldStudentStatus = new JTextField();
		textFieldStudentStatus.setText("NOT ENROLLED");
		textFieldStudentStatus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStudentStatus.setForeground(new Color(255, 0, 0));
		textFieldStudentStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldStudentStatus.setEditable(false);
		textFieldStudentStatus.setColumns(10);
		textFieldStudentStatus.setBounds(730, 31, 100, 20);
		panelOverview.add(textFieldStudentStatus);
		
		JLabel lblMessage = new JLabel("You are currently not enrolled. Please go to admission assistant and submit an application form.");
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setBounds(20, 314, 820, 30);
		panelOverview.add(lblMessage);
	}
}
