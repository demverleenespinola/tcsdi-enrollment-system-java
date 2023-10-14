package com.enrollment.system.frame.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.enrollment.system.pane.view.StudentDashboardAdmission;
import com.enrollment.system.pane.view.StudentDashboardOverview;
import com.formdev.flatlaf.FlatLightLaf;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.IOException;
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

	/**
	 * Create the frame.
	 */
	public StudentDashboard() {
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
		
		lblFullName = new JLabel("Juan Dela Cruz");
		lblFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFullName.setForeground(new Color(255, 255, 255));
		lblFullName.setHorizontalAlignment(SwingConstants.CENTER);
		lblFullName.setBounds(0, 11, 180, 14);
		panelUserInfo.add(lblFullName);
		
		lblEmailAddress = new JLabel("juandelacruz@gmail.com");
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
