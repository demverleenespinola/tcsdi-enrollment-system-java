package com.enrollment.system.pane.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class StudentDashboardAdmission extends JPanel {

	private JButton btnAcademicInformationBack;
	private JButton btnAcademicInformationNext;
	private JButton btnDataPrivacyBack;
	private JButton btnDataPrivacyNext;
	private JButton btnFamilyDetailsBack;
	private JButton btnFamilyDetailsNext;
	private JButton btnPersonalDetailsBack;
	private JButton btnPersonalDetailsNext;
	private JButton btnPrimaryInformationBacj;
	private JButton btnPrimaryInformationNext;
	private JButton btnWelcomeNext;
	private JCheckBox chckbxDataPrivacyConsent;
	private JComboBox comboBoxStudentSex;
	private JLabel lblAcademicInformationHeading;
	private JLabel lblAdminAssistant;
	private JLabel lblDashboardOverview;
	private JLabel lblDataPrivacyMessage1;
	private JLabel lblDataPrivacyMessage1_1;
	private JLabel lblDataPrivacyMessage2;
	private JLabel lblDataPrivacyMessage3;
	private JLabel lblDataPrivacyMessage4;
	private JLabel lblDataPrivacyMessage5;
	private JLabel lblDataPrivacyMessage6;
	private JLabel lblDataPrivacyMessage7;
	private JLabel lblEmergencyContact;
	private JLabel lblEmergencyContactNumber;
	private JLabel lblEmergencyFullName;
	private JLabel lblEmergencyRelationshipToStudent;
	private JLabel lblFamilyDetailsBlock10;
	private JLabel lblFamilyDetailsBlock11;
	private JLabel lblFamilyDetailsBlock12;
	private JLabel lblFamilyDetailsBlock13;
	private JLabel lblFamilyDetailsBlock14;
	private JLabel lblFamilyDetailsBlock15;
	private JLabel lblFamilyDetailsBlock16;
	private JLabel lblFamilyDetailsBlock17;
	private JLabel lblFamilyDetailsBlock18;
	private JLabel lblFamilyDetailsBlock19;
	private JLabel lblFamilyDetailsBlock1;
	private JLabel lblFamilyDetailsBlock20;
	private JLabel lblFamilyDetailsBlock2;
	private JLabel lblFamilyDetailsBlock3;
	private JLabel lblFamilyDetailsBlock4;
	private JLabel lblFamilyDetailsBlock5;
	private JLabel lblFamilyDetailsBlock6;
	private JLabel lblFamilyDetailsBlock7;
	private JLabel lblFamilyDetailsBlock8;
	private JLabel lblFamilyDetailsBlock9;
	private JLabel lblFatherAge;
	private JLabel lblFatherCitizenship;
	private JLabel lblFatherContactNumber;
	private JLabel lblFatherFullName;
	private JLabel lblFatherInformationHeading;
	private JLabel lblFatherOccupation;
	private JLabel lblFatherStatus;
	private JLabel lblGuardianContactNumber;
	private JLabel lblGuardianFullName;
	private JLabel lblGuardianInformationHeading;
	private JLabel lblGuardianRelationshipToStudent;
	private JLabel lblGuidelinesInternational;
	private JLabel lblGuidelinesRegular;
	private JLabel lblGuidelinesTransfer;
	private JLabel lblHoweverWedLove;
	private JLabel lblMotherAge;
	private JLabel lblMotherCitizenship;
	private JLabel lblMotherContactNumber;
	private JLabel lblMotherFullName;
	private JLabel lblMotherInformation;
	private JLabel lblMotherLiving;
	private JLabel lblMotherOccupation;
	private JLabel lblStudentNumber;
	private JLabel lblSelectedFileName;
	private JLabel lblPersonalDetailsBlock1;
	private JLabel lblPersonalDetailsBlock2;
	private JLabel lblPersonalDetailsBlock3;
	private JLabel lblPersonalDetailsBlock4;
	private JLabel lblPersonalDetailsBlock5;
	private JLabel lblPersonalDetailsBlock6;
	private JLabel lblPersonalDetailsBlock7;
	private JLabel lblPersonalDetailsHeading;
	private JLabel lblPrimaryInformationHeading;
	private JLabel lblRegards;
	private JLabel lblStudentApplicationType;
	private JLabel lblStudentBarangay;
	private JLabel lblStudentBirthDate;
	private JLabel lblStudentCitizenship;
	private JLabel lblStudentCity;
	private JLabel lblStudentCountry;
	private JLabel lblStudentFirstName;
	private JLabel lblStudentLastName;
	private JLabel lblStudentLrnNo;
	private JLabel lblStudentMiddleName;
	private JLabel lblStudentNickName;
	private JLabel lblStudentPlaceOfBirth;
	private JLabel lblStudentPresentAddressBlock1;
	private JLabel lblStudentPresentAddressBlock2;
	private JLabel lblStudentPresentAddressBlock3;
	private JLabel lblStudentPresentAddressBlock4;
	private JLabel lblStudentPresentAddressBlock5;
	private JLabel lblStudentPresentAddressBlock6;
	private JLabel lblStudentPresentAddressBlock7;
	private JLabel lblStudentPresentAddressBlock8;
	private JLabel lblStudentPresentAddressHeading;
	private JLabel lblStudentPresentAge;
	private JLabel lblStudentProvince;
	private JLabel lblStudentReligion;
	private JLabel lblStudentSex;
	private JLabel lblStudentStatus;
	private JLabel lblStudentStreetAddress;
	private JLabel lblStudentSuffix;
	private JLabel lblStudentZipCode;
	private JLabel lblUploadFiles;
	private JLabel lblWarmGreetingsWe;
	private JLabel lblWelcomeMessage1;
	private JPanel panelGuidelines;
	private JPanel panelParentInformation;
	private JPanel panelUploadFiles;
	private JRadioButton rdbtnFatherDeceased;
	private JRadioButton rdbtnFatherLiving;
	private JRadioButton rdbtnMotherDeceased;
	private JRadioButton rdbtnMotherLiving;
	private JRadioButton rdbtnStudentInternational;
	private JRadioButton rdbtnStudentRegular;
	private JRadioButton rdbtnStudentTransfer;
	private JTextField textFieldEducationBackgroundRecentSchoolAttended;
	private JTextField textFieldEducationBackgroundLandlineNo;
	private JTextField textFieldEducationBackgroundSchoolAddress;
	private JTextField textFieldEmergencyContactNumber;
	private JTextField textFieldEmergencyFullName;
	private JTextField textFieldEmergencyRelationshipToStudent;
	private JTextField textFieldFatherAge;
	private JTextField textFieldFatherCitizenship;
	private JTextField textFieldFatherContactNumber;
	private JTextField textFieldFatherFullName;
	private JTextField textFieldFatherOccupation;
	private JTextField textFieldGuardianContactNumber;
	private JTextField textFieldGuardianFullName;
	private JTextField textFieldGuardianRelationshipToStudent;
	private JTextField textFieldStudentMiddleName;
	private JTextField textFieldMotherAge;
	private JTextField textFieldMotherCitizenship;
	private JTextField textFieldMotherContactNumber;
	private JTextField textFieldMotherFullName;
	private JTextField textFieldMotherOccupation;
	private JTextField textFieldStudentBarangay;
	private JTextField textFieldStudentCitizenship;
	private JTextField textFieldStudentCity;
	private JTextField textFieldStudentCountry;
	private JTextField textFieldStudentFirstName;
	private JTextField textFieldStudentLastName;
	private JTextField textFieldStudentLrnNo;
	private JTextField textFieldStudentNickName;
	private JTextField textFieldStudentNumber;
	private JTextField textFieldStudentPlaceOfBirth;
	private JTextField textFieldStudentPresentAge;
	private JTextField textFieldStudentProvince;
	private JTextField textFieldStudentReligion;
	private JTextField textFieldStudentStatus;
	private JTextField textFieldStudentStreetAddress;
	private JTextField textFieldStudentSuffix;
	private JTextField textFieldStudentZipCode;
	private final ButtonGroup btnGroupFatherLiving = new ButtonGroup();
	private final ButtonGroup btnGroupMotherLiving = new ButtonGroup();
	private final ButtonGroup btnGroupStudentApplicationType = new ButtonGroup();
	private static final long serialVersionUID = 1L;
	private JTabbedPane tabbedPaneAdmissionAssistant;
	private JPanel panelAcademicInformation;
	private JScrollPane panelSummary;
	private JPanel panelWelcome;
	private JPanel panelDataPrivacy;
	private JPanel panelPrimaryInformation;
	private JPanel panelPersonalDetails;
	private JPanel panelFamilyDetails;
	private JTextField textFieldStudentContactNumber;
	private JTextField textFieldStudentEmailAddress;
	private JLabel lblStudentEmailAddress;
	private JLabel lblStudentContactNumber;
	private JTextField textFieldStudentBirthDate;

	/**
	 * Create the panel.
	 */
	public StudentDashboardAdmission() {
		setEnabled(false);
		setBackground(new Color(192, 192, 192));
		setBounds(199, 0, 885, 641);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 885, 641);
		add(panel);
		panel.setLayout(null);

		JPanel panelAdmissionAssistant = new JPanel();
		panelAdmissionAssistant.setBackground(new Color(255, 255, 255));
		panelAdmissionAssistant.setBounds(20, 11, 845, 619);
		panel.add(panelAdmissionAssistant);
		panelAdmissionAssistant.setLayout(null);

		textFieldStudentStatus = new JTextField();
		textFieldStudentStatus.setText("NOT ENROLLED");
		textFieldStudentStatus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStudentStatus.setForeground(new Color(255, 0, 0));
		textFieldStudentStatus.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldStudentStatus.setEditable(false);
		textFieldStudentStatus.setColumns(10);
		textFieldStudentStatus.setBounds(730, 31, 100, 20);
		panelAdmissionAssistant.add(textFieldStudentStatus);

		lblStudentStatus = new JLabel("Student Status:");
		lblStudentStatus.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStudentStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentStatus.setBounds(614, 32, 106, 20);
		panelAdmissionAssistant.add(lblStudentStatus);

		textFieldStudentNumber = new JTextField();
		textFieldStudentNumber.setText("1001");
		textFieldStudentNumber.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldStudentNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		textFieldStudentNumber.setEditable(false);
		textFieldStudentNumber.setColumns(10);
		textFieldStudentNumber.setBounds(504, 31, 100, 20);
		panelAdmissionAssistant.add(textFieldStudentNumber);

		lblStudentNumber = new JLabel("Student Number:");
		lblStudentNumber.setVerticalAlignment(SwingConstants.BOTTOM);
		lblStudentNumber.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStudentNumber.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentNumber.setBounds(374, 30, 120, 20);
		panelAdmissionAssistant.add(lblStudentNumber);

		lblDashboardOverview = new JLabel("Admission Assistant");
		lblDashboardOverview.setVerticalAlignment(SwingConstants.BOTTOM);
		lblDashboardOverview.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDashboardOverview.setBounds(10, 11, 190, 39);
		panelAdmissionAssistant.add(lblDashboardOverview);

		tabbedPaneAdmissionAssistant = new JTabbedPane(JTabbedPane.TOP);
		tabbedPaneAdmissionAssistant.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.setBounds(10, 87, 825, 520);
		panelAdmissionAssistant.add(tabbedPaneAdmissionAssistant);

		panelWelcome = new JPanel();
		tabbedPaneAdmissionAssistant.addTab("Welcome", null, panelWelcome, null);
		panelWelcome.setLayout(null);

		lblWelcomeMessage1 = new JLabel("Hi,");
		lblWelcomeMessage1.setBounds(41, 20, 513, 15);
		lblWelcomeMessage1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelWelcome.add(lblWelcomeMessage1);

		lblWarmGreetingsWe = new JLabel("Warm greetings! We noticed that you're not yet a student at our school.");
		lblWarmGreetingsWe.setBounds(41, 60, 513, 15);
		lblWarmGreetingsWe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelWelcome.add(lblWarmGreetingsWe);

		lblHoweverWedLove = new JLabel(
				"However, we'd love for you to consider joining us-simply submit an application to get started.");
		lblHoweverWedLove.setBounds(41, 100, 513, 15);
		lblHoweverWedLove.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelWelcome.add(lblHoweverWedLove);

		lblRegards = new JLabel("Regards,");
		lblRegards.setBounds(41, 140, 513, 15);
		lblRegards.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelWelcome.add(lblRegards);

		btnWelcomeNext = new JButton("Next");
		btnWelcomeNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(1, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(1);
			}
		});
		btnWelcomeNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnWelcomeNext.setFocusable(false);
		btnWelcomeNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnWelcomeNext.setBackground(Color.YELLOW);
		btnWelcomeNext.setBounds(710, 460, 100, 21);
		panelWelcome.add(btnWelcomeNext);

		lblAdminAssistant = new JLabel("Admin Assistant");
		lblAdminAssistant.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdminAssistant.setBounds(41, 182, 513, 15);
		panelWelcome.add(lblAdminAssistant);

		panelDataPrivacy = new JPanel();
		panelDataPrivacy.setBackground(new Color(240, 240, 240));
		tabbedPaneAdmissionAssistant.addTab("Data Privacy", null, panelDataPrivacy, null);
		panelDataPrivacy.setLayout(null);

		lblDataPrivacyMessage1 = new JLabel("Data Privacy Consent");
		lblDataPrivacyMessage1.setBounds(36, 21, 754, 15);
		lblDataPrivacyMessage1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage1);

		lblDataPrivacyMessage1_1 = new JLabel(
				"By my child's application to Tesda High School, I am informed, and I give my consent to: ");
		lblDataPrivacyMessage1_1.setBounds(36, 71, 754, 15);
		lblDataPrivacyMessage1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage1_1);

		lblDataPrivacyMessage2 = new JLabel(
				"1. Grant permission for the school to handle my child's private and confidential data submitted during enrollment and registration. ");
		lblDataPrivacyMessage2.setBounds(36, 112, 754, 15);
		lblDataPrivacyMessage2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage2);

		lblDataPrivacyMessage3 = new JLabel(
				"2. Authorize the school to appropriately dispose of any forms and documents containing my child's personal and confidential information");
		lblDataPrivacyMessage3.setBounds(36, 153, 754, 15);
		lblDataPrivacyMessage3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage3);

		lblDataPrivacyMessage4 = new JLabel("if I choose not to proceed with the application and admission process. ");
		lblDataPrivacyMessage4.setBounds(36, 173, 754, 15);
		lblDataPrivacyMessage4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage4);

		lblDataPrivacyMessage5 = new JLabel(
				"3. Give consent to TESDA High School to gather, utilize, manage, and share, as stipulated by the Data Privacy Act of 2012, any personal ");
		lblDataPrivacyMessage5.setBounds(36, 214, 754, 15);
		lblDataPrivacyMessage5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage5);

		lblDataPrivacyMessage6 = new JLabel(
				"and sensitive information I have supplied during the registration and enrollment in SHS enrollment System ");
		lblDataPrivacyMessage6.setBounds(36, 234, 754, 15);
		lblDataPrivacyMessage6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage6);

		lblDataPrivacyMessage7 = new JLabel(
				"for school-related procedures and research, ensuring that my identity remains confidential.");
		lblDataPrivacyMessage7.setBounds(36, 254, 754, 15);
		lblDataPrivacyMessage7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelDataPrivacy.add(lblDataPrivacyMessage7);

		chckbxDataPrivacyConsent = new JCheckBox("PLEASE CHECK THE BOX IF YOU AGREE TO THE ABOVE CONDITIONS.");
		chckbxDataPrivacyConsent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxDataPrivacyConsent.isSelected()) {
					btnDataPrivacyNext.setEnabled(true);
				} else {
					btnDataPrivacyNext.setEnabled(false);
				}
			}
		});
		chckbxDataPrivacyConsent.setBackground(new Color(240, 240, 240));
		chckbxDataPrivacyConsent.setBounds(36, 304, 754, 23);
		chckbxDataPrivacyConsent.setForeground(new Color(255, 0, 0));
		panelDataPrivacy.add(chckbxDataPrivacyConsent);

		btnDataPrivacyNext = new JButton("Next");
		btnDataPrivacyNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(2, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(2);
				btnPrimaryInformationNext.setEnabled(true);
			}
		});
		btnDataPrivacyNext.setEnabled(false);
		btnDataPrivacyNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDataPrivacyNext.setFocusable(false);
		btnDataPrivacyNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDataPrivacyNext.setBackground(Color.YELLOW);
		btnDataPrivacyNext.setBounds(710, 460, 100, 21);
		panelDataPrivacy.add(btnDataPrivacyNext);

		btnDataPrivacyBack = new JButton("Back");
		btnDataPrivacyBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedIndex(0);
			}
		});
		btnDataPrivacyBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDataPrivacyBack.setFocusable(false);
		btnDataPrivacyBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnDataPrivacyBack.setBackground(Color.YELLOW);
		btnDataPrivacyBack.setBounds(620, 460, 85, 21);
		panelDataPrivacy.add(btnDataPrivacyBack);

		panelPrimaryInformation = new JPanel();
		panelPrimaryInformation.setBackground(new Color(240, 240, 240));
		tabbedPaneAdmissionAssistant.addTab("Primary Information", null, panelPrimaryInformation, null);
		panelPrimaryInformation.setLayout(null);

		lblPrimaryInformationHeading = new JLabel("Primary Information ");
		lblPrimaryInformationHeading.setBounds(46, 25, 159, 15);
		lblPrimaryInformationHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelPrimaryInformation.add(lblPrimaryInformationHeading);

		lblStudentApplicationType = new JLabel("Select Your Application Type");
		lblStudentApplicationType.setBounds(46, 69, 159, 15);
		lblStudentApplicationType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentApplicationType);

		rdbtnStudentRegular = new JRadioButton("Regular Applicant");
		rdbtnStudentRegular.setSelected(true);
		btnGroupStudentApplicationType.add(rdbtnStudentRegular);
		rdbtnStudentRegular.setBounds(210, 65, 275, 23);
		rdbtnStudentRegular.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(rdbtnStudentRegular);

		rdbtnStudentInternational = new JRadioButton("International: Different nationality");
		btnGroupStudentApplicationType.add(rdbtnStudentInternational);
		rdbtnStudentInternational.setBounds(210, 93, 275, 23);
		rdbtnStudentInternational.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(rdbtnStudentInternational);

		rdbtnStudentTransfer = new JRadioButton("Transfer: Different school");
		btnGroupStudentApplicationType.add(rdbtnStudentTransfer);
		rdbtnStudentTransfer.setBounds(210, 121, 275, 23);
		rdbtnStudentTransfer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(rdbtnStudentTransfer);

		lblStudentFirstName = new JLabel("First Name");
		lblStudentFirstName.setBounds(46, 152, 159, 15);
		lblStudentFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentFirstName);

		textFieldStudentFirstName = new JTextField();
		textFieldStudentFirstName.setEnabled(false);
		textFieldStudentFirstName.setBounds(210, 149, 275, 21);
		textFieldStudentFirstName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentFirstName.setColumns(10);
		panelPrimaryInformation.add(textFieldStudentFirstName);

		lblStudentMiddleName = new JLabel("Middle Name");
		lblStudentMiddleName.setBounds(46, 178, 159, 15);
		lblStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentMiddleName);

		textFieldStudentMiddleName = new JTextField();
		textFieldStudentMiddleName.setEnabled(false);
		textFieldStudentMiddleName.setBounds(210, 175, 275, 21);
		textFieldStudentMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentMiddleName.setColumns(10);
		panelPrimaryInformation.add(textFieldStudentMiddleName);

		lblStudentLastName = new JLabel("Last Name");
		lblStudentLastName.setBounds(46, 204, 159, 15);
		lblStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentLastName);

		textFieldStudentLastName = new JTextField();
		textFieldStudentLastName.setEnabled(false);
		textFieldStudentLastName.setBounds(210, 201, 275, 21);
		textFieldStudentLastName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentLastName.setColumns(10);
		panelPrimaryInformation.add(textFieldStudentLastName);

		lblStudentBirthDate = new JLabel("Birth Date");
		lblStudentBirthDate.setBounds(46, 229, 159, 15);
		lblStudentBirthDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentBirthDate);

		lblStudentPresentAge = new JLabel("Present Age");
		lblStudentPresentAge.setBounds(46, 255, 159, 15);
		lblStudentPresentAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panelPrimaryInformation.add(lblStudentPresentAge);

		textFieldStudentPresentAge = new JTextField();
		textFieldStudentPresentAge.setEditable(false);
		textFieldStudentPresentAge.setBounds(210, 252, 275, 21);
		textFieldStudentPresentAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentPresentAge.setColumns(10);
		panelPrimaryInformation.add(textFieldStudentPresentAge);

		btnPrimaryInformationNext = new JButton("Next");
		btnPrimaryInformationNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(3, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(3);
			}
		});
		btnPrimaryInformationNext.setEnabled(false);
		btnPrimaryInformationNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPrimaryInformationNext.setFocusable(false);
		btnPrimaryInformationNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPrimaryInformationNext.setBackground(Color.YELLOW);
		btnPrimaryInformationNext.setBounds(710, 460, 100, 21);
		panelPrimaryInformation.add(btnPrimaryInformationNext);

		btnPrimaryInformationBacj = new JButton("Back");
		btnPrimaryInformationBacj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedIndex(1);
			}
		});
		btnPrimaryInformationBacj.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPrimaryInformationBacj.setFocusable(false);
		btnPrimaryInformationBacj.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPrimaryInformationBacj.setBackground(Color.YELLOW);
		btnPrimaryInformationBacj.setBounds(620, 460, 85, 21);
		panelPrimaryInformation.add(btnPrimaryInformationBacj);

		lblStudentContactNumber = new JLabel("Contact Number");
		lblStudentContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentContactNumber.setBounds(46, 281, 159, 15);
		panelPrimaryInformation.add(lblStudentContactNumber);

		lblStudentEmailAddress = new JLabel("Email Address");
		lblStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentEmailAddress.setBounds(46, 310, 159, 15);
		panelPrimaryInformation.add(lblStudentEmailAddress);

		textFieldStudentContactNumber = new JTextField();
		textFieldStudentContactNumber.setEnabled(false);
		textFieldStudentContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentContactNumber.setColumns(10);
		textFieldStudentContactNumber.setBounds(210, 279, 275, 21);
		panelPrimaryInformation.add(textFieldStudentContactNumber);

		textFieldStudentEmailAddress = new JTextField();
		textFieldStudentEmailAddress.setEditable(false);
		textFieldStudentEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentEmailAddress.setColumns(10);
		textFieldStudentEmailAddress.setBounds(210, 307, 275, 21);
		panelPrimaryInformation.add(textFieldStudentEmailAddress);

		JLabel lblStudentIntendedAcademicYear = new JLabel("Intended Academic Year");
		lblStudentIntendedAcademicYear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentIntendedAcademicYear.setBounds(46, 337, 159, 15);
		panelPrimaryInformation.add(lblStudentIntendedAcademicYear);

		JLabel lblStudentGradingPeriod = new JLabel("Grading Period");
		lblStudentGradingPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentGradingPeriod.setBounds(46, 365, 159, 15);
		panelPrimaryInformation.add(lblStudentGradingPeriod);

		JLabel lblStudentCampus = new JLabel("Campus");
		lblStudentCampus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentCampus.setBounds(46, 393, 159, 15);
		panelPrimaryInformation.add(lblStudentCampus);

		JLabel lblStudentYearLevel = new JLabel("Year Level");
		lblStudentYearLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStudentYearLevel.setBounds(46, 421, 159, 15);
		panelPrimaryInformation.add(lblStudentYearLevel);

		JComboBox comboBoxStudentYearLevel = new JComboBox();
		comboBoxStudentYearLevel.setEnabled(false);
		comboBoxStudentYearLevel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentYearLevel.setBounds(210, 417, 275, 23);
		panelPrimaryInformation.add(comboBoxStudentYearLevel);

		JComboBox comboBoxStudentCampus = new JComboBox();
		comboBoxStudentCampus.setEnabled(false);
		comboBoxStudentCampus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentCampus.setBounds(210, 389, 275, 23);
		panelPrimaryInformation.add(comboBoxStudentCampus);

		JComboBox comboBoxStudentGradingPeriod = new JComboBox();
		comboBoxStudentGradingPeriod.setEnabled(false);
		comboBoxStudentGradingPeriod.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentGradingPeriod.setBounds(210, 361, 275, 23);
		panelPrimaryInformation.add(comboBoxStudentGradingPeriod);

		JComboBox comboBoxStudentIntendedAcademicYear = new JComboBox();
		comboBoxStudentIntendedAcademicYear.setEnabled(false);
		comboBoxStudentIntendedAcademicYear.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBoxStudentIntendedAcademicYear.setBounds(210, 333, 275, 23);
		panelPrimaryInformation.add(comboBoxStudentIntendedAcademicYear);

		textFieldStudentBirthDate = new JTextField();
		textFieldStudentBirthDate.setEditable(false);
		textFieldStudentBirthDate.setBounds(210, 227, 275, 20);
		panelPrimaryInformation.add(textFieldStudentBirthDate);
		textFieldStudentBirthDate.setColumns(10);

		panelPersonalDetails = new JPanel();
		tabbedPaneAdmissionAssistant.addTab("Personal Details", null, panelPersonalDetails, null);
		panelPersonalDetails.setLayout(null);

		JTabbedPane tabbedPanelPersonalDetails = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPanelPersonalDetails.setBackground(new Color(255, 255, 255));
		tabbedPanelPersonalDetails.setBounds(10, 11, 800, 436);
		panelPersonalDetails.add(tabbedPanelPersonalDetails);

		JPanel panelPersonalDetailsInner = new JPanel();
		panelPersonalDetailsInner.setBackground(new Color(255, 255, 255));
		tabbedPanelPersonalDetails.addTab("Personal Details", null, panelPersonalDetailsInner, null);
		GridBagLayout gbl_panelPersonalDetailsInner = new GridBagLayout();
		gbl_panelPersonalDetailsInner.columnWidths = new int[] { 0, 0, 65, 0, 0, 0, 0, 0 };
		gbl_panelPersonalDetailsInner.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelPersonalDetailsInner.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0,
				Double.MIN_VALUE };
		gbl_panelPersonalDetailsInner.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelPersonalDetailsInner.setLayout(gbl_panelPersonalDetailsInner);

		lblPersonalDetailsBlock1 = new JLabel("BLOCK");
		lblPersonalDetailsBlock1.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock1 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock1.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock1.gridx = 0;
		gbc_lblPersonalDetailsBlock1.gridy = 0;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock1, gbc_lblPersonalDetailsBlock1);

		lblPersonalDetailsBlock2 = new JLabel("BLOCK");
		lblPersonalDetailsBlock2.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock2 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock2.gridx = 3;
		gbc_lblPersonalDetailsBlock2.gridy = 0;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock2, gbc_lblPersonalDetailsBlock2);

		lblPersonalDetailsBlock3 = new JLabel("BLOCK");
		lblPersonalDetailsBlock3.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock3 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock3.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock3.insets = new Insets(0, 0, 5, 0);
		gbc_lblPersonalDetailsBlock3.gridx = 6;
		gbc_lblPersonalDetailsBlock3.gridy = 0;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock3, gbc_lblPersonalDetailsBlock3);

		lblPersonalDetailsHeading = new JLabel("Personal Details");
		lblPersonalDetailsHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblPersonalDetailsHeading = new GridBagConstraints();
		gbc_lblPersonalDetailsHeading.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsHeading.gridx = 1;
		gbc_lblPersonalDetailsHeading.gridy = 1;
		panelPersonalDetailsInner.add(lblPersonalDetailsHeading, gbc_lblPersonalDetailsHeading);

		lblPersonalDetailsBlock4 = new JLabel("BLOCK");
		lblPersonalDetailsBlock4.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock4 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock4.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock4.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock4.gridx = 0;
		gbc_lblPersonalDetailsBlock4.gridy = 2;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock4, gbc_lblPersonalDetailsBlock4);

		lblStudentSuffix = new JLabel("Suffix");
		lblStudentSuffix.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSuffix = new GridBagConstraints();
		gbc_lblStudentSuffix.anchor = GridBagConstraints.WEST;
		gbc_lblStudentSuffix.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSuffix.gridx = 1;
		gbc_lblStudentSuffix.gridy = 3;
		panelPersonalDetailsInner.add(lblStudentSuffix, gbc_lblStudentSuffix);

		textFieldStudentSuffix = new JTextField();
		textFieldStudentSuffix.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldStudentSuffix = new GridBagConstraints();
		gbc_textFieldStudentSuffix.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentSuffix.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentSuffix.gridx = 2;
		gbc_textFieldStudentSuffix.gridy = 3;
		panelPersonalDetailsInner.add(textFieldStudentSuffix, gbc_textFieldStudentSuffix);
		textFieldStudentSuffix.setColumns(10);

		lblStudentSex = new JLabel("Sex");
		lblStudentSex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSex = new GridBagConstraints();
		gbc_lblStudentSex.anchor = GridBagConstraints.WEST;
		gbc_lblStudentSex.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSex.gridx = 4;
		gbc_lblStudentSex.gridy = 3;
		panelPersonalDetailsInner.add(lblStudentSex, gbc_lblStudentSex);

		comboBoxStudentSex = new JComboBox();
		comboBoxStudentSex.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		comboBoxStudentSex.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBoxStudentSex = new GridBagConstraints();
		gbc_comboBoxStudentSex.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxStudentSex.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxStudentSex.gridx = 5;
		gbc_comboBoxStudentSex.gridy = 3;
		panelPersonalDetailsInner.add(comboBoxStudentSex, gbc_comboBoxStudentSex);

		lblPersonalDetailsBlock5 = new JLabel("BLOCK");
		lblPersonalDetailsBlock5.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock5 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock5.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock5.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock5.gridx = 0;
		gbc_lblPersonalDetailsBlock5.gridy = 4;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock5, gbc_lblPersonalDetailsBlock5);

		lblStudentNickName = new JLabel("Nick Name ");
		lblStudentNickName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentNickName = new GridBagConstraints();
		gbc_lblStudentNickName.anchor = GridBagConstraints.WEST;
		gbc_lblStudentNickName.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentNickName.gridx = 1;
		gbc_lblStudentNickName.gridy = 5;
		panelPersonalDetailsInner.add(lblStudentNickName, gbc_lblStudentNickName);

		textFieldStudentNickName = new JTextField();
		textFieldStudentNickName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentNickName.setColumns(10);
		GridBagConstraints gbc_textFieldStudentNickName = new GridBagConstraints();
		gbc_textFieldStudentNickName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentNickName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentNickName.gridx = 2;
		gbc_textFieldStudentNickName.gridy = 5;
		panelPersonalDetailsInner.add(textFieldStudentNickName, gbc_textFieldStudentNickName);

		lblStudentReligion = new JLabel("Religion");
		lblStudentReligion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentReligion = new GridBagConstraints();
		gbc_lblStudentReligion.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentReligion.anchor = GridBagConstraints.WEST;
		gbc_lblStudentReligion.gridx = 4;
		gbc_lblStudentReligion.gridy = 5;
		panelPersonalDetailsInner.add(lblStudentReligion, gbc_lblStudentReligion);

		textFieldStudentReligion = new JTextField();
		textFieldStudentReligion.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentReligion.setColumns(10);
		GridBagConstraints gbc_textFieldStudentReligion = new GridBagConstraints();
		gbc_textFieldStudentReligion.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentReligion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentReligion.gridx = 5;
		gbc_textFieldStudentReligion.gridy = 5;
		panelPersonalDetailsInner.add(textFieldStudentReligion, gbc_textFieldStudentReligion);

		lblPersonalDetailsBlock6 = new JLabel("BLOCK");
		lblPersonalDetailsBlock6.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock6 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock6.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock6.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock6.gridx = 0;
		gbc_lblPersonalDetailsBlock6.gridy = 6;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock6, gbc_lblPersonalDetailsBlock6);

		lblStudentPlaceOfBirth = new JLabel("Place of Birth ");
		lblStudentPlaceOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPlaceOfBirth = new GridBagConstraints();
		gbc_lblStudentPlaceOfBirth.anchor = GridBagConstraints.WEST;
		gbc_lblStudentPlaceOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPlaceOfBirth.gridx = 1;
		gbc_lblStudentPlaceOfBirth.gridy = 7;
		panelPersonalDetailsInner.add(lblStudentPlaceOfBirth, gbc_lblStudentPlaceOfBirth);

		textFieldStudentPlaceOfBirth = new JTextField();
		textFieldStudentPlaceOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentPlaceOfBirth.setColumns(10);
		GridBagConstraints gbc_textFieldStudentPlaceOfBirth = new GridBagConstraints();
		gbc_textFieldStudentPlaceOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentPlaceOfBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentPlaceOfBirth.gridx = 2;
		gbc_textFieldStudentPlaceOfBirth.gridy = 7;
		panelPersonalDetailsInner.add(textFieldStudentPlaceOfBirth, gbc_textFieldStudentPlaceOfBirth);

		lblStudentLrnNo = new JLabel("LRN No.");
		lblStudentLrnNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentLrnNo = new GridBagConstraints();
		gbc_lblStudentLrnNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentLrnNo.anchor = GridBagConstraints.WEST;
		gbc_lblStudentLrnNo.gridx = 4;
		gbc_lblStudentLrnNo.gridy = 7;
		panelPersonalDetailsInner.add(lblStudentLrnNo, gbc_lblStudentLrnNo);

		textFieldStudentLrnNo = new JTextField();
		textFieldStudentLrnNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentLrnNo.setColumns(10);
		GridBagConstraints gbc_textFieldStudentLrnNo = new GridBagConstraints();
		gbc_textFieldStudentLrnNo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentLrnNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentLrnNo.gridx = 5;
		gbc_textFieldStudentLrnNo.gridy = 7;
		panelPersonalDetailsInner.add(textFieldStudentLrnNo, gbc_textFieldStudentLrnNo);

		lblPersonalDetailsBlock7 = new JLabel("BLOCK");
		lblPersonalDetailsBlock7.setForeground(new Color(255, 255, 255));
		lblPersonalDetailsBlock7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPersonalDetailsBlock7 = new GridBagConstraints();
		gbc_lblPersonalDetailsBlock7.anchor = GridBagConstraints.WEST;
		gbc_lblPersonalDetailsBlock7.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsBlock7.gridx = 0;
		gbc_lblPersonalDetailsBlock7.gridy = 8;
		panelPersonalDetailsInner.add(lblPersonalDetailsBlock7, gbc_lblPersonalDetailsBlock7);

		lblStudentCitizenship = new JLabel("Citizenship ");
		lblStudentCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCitizenship = new GridBagConstraints();
		gbc_lblStudentCitizenship.anchor = GridBagConstraints.WEST;
		gbc_lblStudentCitizenship.insets = new Insets(0, 0, 0, 5);
		gbc_lblStudentCitizenship.gridx = 1;
		gbc_lblStudentCitizenship.gridy = 9;
		panelPersonalDetailsInner.add(lblStudentCitizenship, gbc_lblStudentCitizenship);

		textFieldStudentCitizenship = new JTextField();
		textFieldStudentCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentCitizenship.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCitizenship = new GridBagConstraints();
		gbc_textFieldStudentCitizenship.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldStudentCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCitizenship.gridx = 2;
		gbc_textFieldStudentCitizenship.gridy = 9;
		panelPersonalDetailsInner.add(textFieldStudentCitizenship, gbc_textFieldStudentCitizenship);

		JPanel panelEducationBackgroundInner = new JPanel();
		panelEducationBackgroundInner.setBackground(new Color(255, 255, 255));
		tabbedPanelPersonalDetails.addTab("Education Background", null, panelEducationBackgroundInner, null);
		GridBagLayout gbl_panelEducationBackgroundInner = new GridBagLayout();
		gbl_panelEducationBackgroundInner.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelEducationBackgroundInner.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelEducationBackgroundInner.columnWeights = new double[] { 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelEducationBackgroundInner.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelEducationBackgroundInner.setLayout(gbl_panelEducationBackgroundInner);

		JLabel lblNewLabel_5_2 = new JLabel("BLOCK");
		lblNewLabel_5_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2.gridx = 0;
		gbc_lblNewLabel_5_2.gridy = 0;
		panelEducationBackgroundInner.add(lblNewLabel_5_2, gbc_lblNewLabel_5_2);

		JLabel lblNewLabel_5_2_5 = new JLabel("BLOCK");
		lblNewLabel_5_2_5.setForeground(Color.WHITE);
		lblNewLabel_5_2_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_5 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2_5.gridx = 2;
		gbc_lblNewLabel_5_2_5.gridy = 0;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_5, gbc_lblNewLabel_5_2_5);

		JLabel lblNewLabel_5_2_1 = new JLabel("BLOCK");
		lblNewLabel_5_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5_2_1.gridx = 4;
		gbc_lblNewLabel_5_2_1.gridy = 0;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_1, gbc_lblNewLabel_5_2_1);

		JLabel lblEducationBackgroundHeading = new JLabel("Education Background ");
		lblEducationBackgroundHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblEducationBackgroundHeading = new GridBagConstraints();
		gbc_lblEducationBackgroundHeading.anchor = GridBagConstraints.WEST;
		gbc_lblEducationBackgroundHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundHeading.gridx = 1;
		gbc_lblEducationBackgroundHeading.gridy = 1;
		panelEducationBackgroundInner.add(lblEducationBackgroundHeading, gbc_lblEducationBackgroundHeading);

		JLabel lblNewLabel_5_2_7 = new JLabel("BLOCK");
		lblNewLabel_5_2_7.setForeground(Color.WHITE);
		lblNewLabel_5_2_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_7 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2_7.gridx = 0;
		gbc_lblNewLabel_5_2_7.gridy = 2;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_7, gbc_lblNewLabel_5_2_7);

		JLabel lblEducationBackgroundRecentSchoolAttended_1 = new JLabel("Recent School Attended ");
		lblEducationBackgroundRecentSchoolAttended_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundRecentSchoolAttended_1 = new GridBagConstraints();
		gbc_lblEducationBackgroundRecentSchoolAttended_1.anchor = GridBagConstraints.WEST;
		gbc_lblEducationBackgroundRecentSchoolAttended_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundRecentSchoolAttended_1.gridx = 1;
		gbc_lblEducationBackgroundRecentSchoolAttended_1.gridy = 3;
		panelEducationBackgroundInner.add(lblEducationBackgroundRecentSchoolAttended_1,
				gbc_lblEducationBackgroundRecentSchoolAttended_1);

		textFieldEducationBackgroundRecentSchoolAttended = new JTextField();
		textFieldEducationBackgroundRecentSchoolAttended.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldEducationBackgroundRecentSchoolAttended = new GridBagConstraints();
		gbc_textFieldEducationBackgroundRecentSchoolAttended.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundRecentSchoolAttended.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundRecentSchoolAttended.gridx = 3;
		gbc_textFieldEducationBackgroundRecentSchoolAttended.gridy = 3;
		panelEducationBackgroundInner.add(textFieldEducationBackgroundRecentSchoolAttended,
				gbc_textFieldEducationBackgroundRecentSchoolAttended);
		textFieldEducationBackgroundRecentSchoolAttended.setColumns(10);

		JLabel lblNewLabel_5_2_2 = new JLabel("BLOCK");
		lblNewLabel_5_2_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_2 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2_2.gridx = 0;
		gbc_lblNewLabel_5_2_2.gridy = 4;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_2, gbc_lblNewLabel_5_2_2);

		JLabel lblEducationBackgroundSchoolType = new JLabel("School Type ");
		lblEducationBackgroundSchoolType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundSchoolType = new GridBagConstraints();
		gbc_lblEducationBackgroundSchoolType.anchor = GridBagConstraints.WEST;
		gbc_lblEducationBackgroundSchoolType.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundSchoolType.gridx = 1;
		gbc_lblEducationBackgroundSchoolType.gridy = 5;
		panelEducationBackgroundInner.add(lblEducationBackgroundSchoolType, gbc_lblEducationBackgroundSchoolType);

		JComboBox comboBoxEducationBackgroundSchoolType = new JComboBox();
		comboBoxEducationBackgroundSchoolType.setModel(new DefaultComboBoxModel(new String[] { "Public", "Private" }));
		comboBoxEducationBackgroundSchoolType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_comboBoxEducationBackgroundSchoolType = new GridBagConstraints();
		gbc_comboBoxEducationBackgroundSchoolType.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxEducationBackgroundSchoolType.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxEducationBackgroundSchoolType.gridx = 3;
		gbc_comboBoxEducationBackgroundSchoolType.gridy = 5;
		panelEducationBackgroundInner.add(comboBoxEducationBackgroundSchoolType,
				gbc_comboBoxEducationBackgroundSchoolType);

		JLabel lblNewLabel_5_2_3 = new JLabel("BLOCK");
		lblNewLabel_5_2_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_3 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2_3.gridx = 0;
		gbc_lblNewLabel_5_2_3.gridy = 6;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_3, gbc_lblNewLabel_5_2_3);

		JLabel lblEducationBackgroundLandlineNo = new JLabel("Landline No. ");
		lblEducationBackgroundLandlineNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundLandlineNo = new GridBagConstraints();
		gbc_lblEducationBackgroundLandlineNo.anchor = GridBagConstraints.WEST;
		gbc_lblEducationBackgroundLandlineNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundLandlineNo.gridx = 1;
		gbc_lblEducationBackgroundLandlineNo.gridy = 7;
		panelEducationBackgroundInner.add(lblEducationBackgroundLandlineNo, gbc_lblEducationBackgroundLandlineNo);

		textFieldEducationBackgroundLandlineNo = new JTextField();
		textFieldEducationBackgroundLandlineNo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEducationBackgroundLandlineNo.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundLandlineNo = new GridBagConstraints();
		gbc_textFieldEducationBackgroundLandlineNo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundLandlineNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundLandlineNo.gridx = 3;
		gbc_textFieldEducationBackgroundLandlineNo.gridy = 7;
		panelEducationBackgroundInner.add(textFieldEducationBackgroundLandlineNo,
				gbc_textFieldEducationBackgroundLandlineNo);

		JLabel lblNewLabel_5_2_4 = new JLabel("BLOCK");
		lblNewLabel_5_2_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_5_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel_5_2_4 = new GridBagConstraints();
		gbc_lblNewLabel_5_2_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5_2_4.gridx = 0;
		gbc_lblNewLabel_5_2_4.gridy = 8;
		panelEducationBackgroundInner.add(lblNewLabel_5_2_4, gbc_lblNewLabel_5_2_4);

		JLabel lblEducationBackgroundSchoolAddress = new JLabel("Address of the School");
		lblEducationBackgroundSchoolAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundSchoolAddress = new GridBagConstraints();
		gbc_lblEducationBackgroundSchoolAddress.insets = new Insets(0, 0, 0, 5);
		gbc_lblEducationBackgroundSchoolAddress.anchor = GridBagConstraints.WEST;
		gbc_lblEducationBackgroundSchoolAddress.gridx = 1;
		gbc_lblEducationBackgroundSchoolAddress.gridy = 9;
		panelEducationBackgroundInner.add(lblEducationBackgroundSchoolAddress, gbc_lblEducationBackgroundSchoolAddress);

		textFieldEducationBackgroundSchoolAddress = new JTextField();
		textFieldEducationBackgroundSchoolAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEducationBackgroundSchoolAddress.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundSchoolAddress = new GridBagConstraints();
		gbc_textFieldEducationBackgroundSchoolAddress.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldEducationBackgroundSchoolAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundSchoolAddress.gridx = 3;
		gbc_textFieldEducationBackgroundSchoolAddress.gridy = 9;
		panelEducationBackgroundInner.add(textFieldEducationBackgroundSchoolAddress,
				gbc_textFieldEducationBackgroundSchoolAddress);

		JPanel panelStudentPresentAddress = new JPanel();
		panelStudentPresentAddress.setBackground(new Color(255, 255, 255));
		tabbedPanelPersonalDetails.addTab("Student Present Address", null, panelStudentPresentAddress, null);
		GridBagLayout gbl_panelStudentPresentAddress = new GridBagLayout();
		gbl_panelStudentPresentAddress.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelStudentPresentAddress.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelStudentPresentAddress.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelStudentPresentAddress.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelStudentPresentAddress.setLayout(gbl_panelStudentPresentAddress);

		lblStudentPresentAddressBlock1 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock1.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock1 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock1.gridx = 0;
		gbc_lblStudentPresentAddressBlock1.gridy = 0;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock1, gbc_lblStudentPresentAddressBlock1);

		lblStudentPresentAddressBlock2 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock2.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock2 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock2.insets = new Insets(0, 0, 5, 0);
		gbc_lblStudentPresentAddressBlock2.gridx = 3;
		gbc_lblStudentPresentAddressBlock2.gridy = 0;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock2, gbc_lblStudentPresentAddressBlock2);

		lblStudentPresentAddressHeading = new JLabel("Student Present Address ");
		lblStudentPresentAddressHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentPresentAddressHeading = new GridBagConstraints();
		gbc_lblStudentPresentAddressHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressHeading.gridx = 1;
		gbc_lblStudentPresentAddressHeading.gridy = 1;
		panelStudentPresentAddress.add(lblStudentPresentAddressHeading, gbc_lblStudentPresentAddressHeading);

		lblStudentPresentAddressBlock3 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock3.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock3 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock3.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock3.gridx = 0;
		gbc_lblStudentPresentAddressBlock3.gridy = 2;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock3, gbc_lblStudentPresentAddressBlock3);

		lblStudentStreetAddress = new JLabel("House No. / Street Address");
		lblStudentStreetAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentStreetAddress = new GridBagConstraints();
		gbc_lblStudentStreetAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentStreetAddress.gridx = 1;
		gbc_lblStudentStreetAddress.gridy = 3;
		panelStudentPresentAddress.add(lblStudentStreetAddress, gbc_lblStudentStreetAddress);

		textFieldStudentStreetAddress = new JTextField();
		textFieldStudentStreetAddress.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldStudentStreetAddress = new GridBagConstraints();
		gbc_textFieldStudentStreetAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentStreetAddress.gridx = 2;
		gbc_textFieldStudentStreetAddress.gridy = 3;
		panelStudentPresentAddress.add(textFieldStudentStreetAddress, gbc_textFieldStudentStreetAddress);
		textFieldStudentStreetAddress.setColumns(10);

		lblStudentPresentAddressBlock4 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock4.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock4 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock4.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock4.gridx = 0;
		gbc_lblStudentPresentAddressBlock4.gridy = 4;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock4, gbc_lblStudentPresentAddressBlock4);

		lblStudentBarangay = new JLabel("Barangay ");
		lblStudentBarangay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentBarangay = new GridBagConstraints();
		gbc_lblStudentBarangay.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentBarangay.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentBarangay.gridx = 1;
		gbc_lblStudentBarangay.gridy = 5;
		panelStudentPresentAddress.add(lblStudentBarangay, gbc_lblStudentBarangay);

		textFieldStudentBarangay = new JTextField();
		textFieldStudentBarangay.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentBarangay.setColumns(10);
		GridBagConstraints gbc_textFieldStudentBarangay = new GridBagConstraints();
		gbc_textFieldStudentBarangay.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentBarangay.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentBarangay.gridx = 2;
		gbc_textFieldStudentBarangay.gridy = 5;
		panelStudentPresentAddress.add(textFieldStudentBarangay, gbc_textFieldStudentBarangay);

		lblStudentPresentAddressBlock5 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock5.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock5 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock5.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock5.gridx = 0;
		gbc_lblStudentPresentAddressBlock5.gridy = 6;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock5, gbc_lblStudentPresentAddressBlock5);

		lblStudentCity = new JLabel("City ");
		lblStudentCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCity = new GridBagConstraints();
		gbc_lblStudentCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCity.gridx = 1;
		gbc_lblStudentCity.gridy = 7;
		panelStudentPresentAddress.add(lblStudentCity, gbc_lblStudentCity);

		textFieldStudentCity = new JTextField();
		textFieldStudentCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentCity.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCity = new GridBagConstraints();
		gbc_textFieldStudentCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCity.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCity.gridx = 2;
		gbc_textFieldStudentCity.gridy = 7;
		panelStudentPresentAddress.add(textFieldStudentCity, gbc_textFieldStudentCity);

		lblStudentPresentAddressBlock6 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock6.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock6 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock6.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock6.gridx = 0;
		gbc_lblStudentPresentAddressBlock6.gridy = 8;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock6, gbc_lblStudentPresentAddressBlock6);

		lblStudentProvince = new JLabel("Province");
		lblStudentProvince.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentProvince = new GridBagConstraints();
		gbc_lblStudentProvince.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentProvince.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentProvince.gridx = 1;
		gbc_lblStudentProvince.gridy = 9;
		panelStudentPresentAddress.add(lblStudentProvince, gbc_lblStudentProvince);

		textFieldStudentProvince = new JTextField();
		textFieldStudentProvince.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentProvince.setColumns(10);
		GridBagConstraints gbc_textFieldStudentProvince = new GridBagConstraints();
		gbc_textFieldStudentProvince.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentProvince.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentProvince.gridx = 2;
		gbc_textFieldStudentProvince.gridy = 9;
		panelStudentPresentAddress.add(textFieldStudentProvince, gbc_textFieldStudentProvince);

		lblStudentPresentAddressBlock7 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock7.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock7 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock7.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock7.gridx = 0;
		gbc_lblStudentPresentAddressBlock7.gridy = 10;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock7, gbc_lblStudentPresentAddressBlock7);

		lblStudentZipCode = new JLabel("Zip Code");
		lblStudentZipCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentZipCode = new GridBagConstraints();
		gbc_lblStudentZipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentZipCode.gridx = 1;
		gbc_lblStudentZipCode.gridy = 11;
		panelStudentPresentAddress.add(lblStudentZipCode, gbc_lblStudentZipCode);

		textFieldStudentZipCode = new JTextField();
		textFieldStudentZipCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentZipCode.setColumns(10);
		GridBagConstraints gbc_textFieldStudentZipCode = new GridBagConstraints();
		gbc_textFieldStudentZipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentZipCode.gridx = 2;
		gbc_textFieldStudentZipCode.gridy = 11;
		panelStudentPresentAddress.add(textFieldStudentZipCode, gbc_textFieldStudentZipCode);

		lblStudentPresentAddressBlock8 = new JLabel("BLOCK");
		lblStudentPresentAddressBlock8.setForeground(new Color(255, 255, 255));
		lblStudentPresentAddressBlock8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAddressBlock8 = new GridBagConstraints();
		gbc_lblStudentPresentAddressBlock8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressBlock8.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressBlock8.gridx = 0;
		gbc_lblStudentPresentAddressBlock8.gridy = 12;
		panelStudentPresentAddress.add(lblStudentPresentAddressBlock8, gbc_lblStudentPresentAddressBlock8);

		lblStudentCountry = new JLabel("Country");
		lblStudentCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCountry = new GridBagConstraints();
		gbc_lblStudentCountry.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentCountry.insets = new Insets(0, 0, 0, 5);
		gbc_lblStudentCountry.gridx = 1;
		gbc_lblStudentCountry.gridy = 13;
		panelStudentPresentAddress.add(lblStudentCountry, gbc_lblStudentCountry);

		textFieldStudentCountry = new JTextField();
		textFieldStudentCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldStudentCountry.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCountry = new GridBagConstraints();
		gbc_textFieldStudentCountry.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCountry.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldStudentCountry.gridx = 2;
		gbc_textFieldStudentCountry.gridy = 13;
		panelStudentPresentAddress.add(textFieldStudentCountry, gbc_textFieldStudentCountry);

		btnPersonalDetailsNext = new JButton("Next");
		btnPersonalDetailsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(4, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(4);
			}
		});
		btnPersonalDetailsNext.setEnabled(false);
		btnPersonalDetailsNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPersonalDetailsNext.setFocusable(false);
		btnPersonalDetailsNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPersonalDetailsNext.setBackground(Color.YELLOW);
		btnPersonalDetailsNext.setBounds(720, 460, 90, 21);
		panelPersonalDetails.add(btnPersonalDetailsNext);

		btnPersonalDetailsBack = new JButton("Back");
		btnPersonalDetailsBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedIndex(2);
			}
		});
		btnPersonalDetailsBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPersonalDetailsBack.setFocusable(false);
		btnPersonalDetailsBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPersonalDetailsBack.setBackground(Color.YELLOW);
		btnPersonalDetailsBack.setBounds(620, 460, 90, 21);
		panelPersonalDetails.add(btnPersonalDetailsBack);

		panelFamilyDetails = new JPanel();
		tabbedPaneAdmissionAssistant.addTab("Family Details", null, panelFamilyDetails, null);
		panelFamilyDetails.setLayout(null);

		JTabbedPane tabbedPaneFamilyDetails = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPaneFamilyDetails.setBackground(new Color(255, 255, 255));
		tabbedPaneFamilyDetails.setBounds(10, 11, 800, 434);
		panelFamilyDetails.add(tabbedPaneFamilyDetails);

		panelParentInformation = new JPanel();
		panelParentInformation.setMinimumSize(new Dimension(10, 0));
		panelParentInformation.setBackground(new Color(255, 255, 255));
		tabbedPaneFamilyDetails.addTab("Parent Information", null, panelParentInformation, null);
		GridBagLayout gbl_panelParentInformation = new GridBagLayout();
		gbl_panelParentInformation.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelParentInformation.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelParentInformation.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panelParentInformation.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelParentInformation.setLayout(gbl_panelParentInformation);

		lblFamilyDetailsBlock1 = new JLabel("BLOCK");
		lblFamilyDetailsBlock1.setForeground(Color.WHITE);
		lblFamilyDetailsBlock1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock1 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock1.gridx = 0;
		gbc_lblFamilyDetailsBlock1.gridy = 0;
		panelParentInformation.add(lblFamilyDetailsBlock1, gbc_lblFamilyDetailsBlock1);

		lblFamilyDetailsBlock2 = new JLabel("BLOCK");
		lblFamilyDetailsBlock2.setForeground(Color.WHITE);
		lblFamilyDetailsBlock2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock2 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock2.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock2.gridx = 3;
		gbc_lblFamilyDetailsBlock2.gridy = 0;
		panelParentInformation.add(lblFamilyDetailsBlock2, gbc_lblFamilyDetailsBlock2);

		lblFamilyDetailsBlock3 = new JLabel("BLOCK");
		lblFamilyDetailsBlock3.setForeground(Color.WHITE);
		lblFamilyDetailsBlock3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock3 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock3.insets = new Insets(0, 0, 5, 0);
		gbc_lblFamilyDetailsBlock3.gridx = 7;
		gbc_lblFamilyDetailsBlock3.gridy = 0;
		panelParentInformation.add(lblFamilyDetailsBlock3, gbc_lblFamilyDetailsBlock3);

		lblMotherInformation = new JLabel("Mother Information ");
		lblMotherInformation.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblMotherInformation = new GridBagConstraints();
		gbc_lblMotherInformation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherInformation.gridx = 1;
		gbc_lblMotherInformation.gridy = 1;
		panelParentInformation.add(lblMotherInformation, gbc_lblMotherInformation);

		lblFamilyDetailsBlock4 = new JLabel("BLOCK");
		lblFamilyDetailsBlock4.setForeground(Color.WHITE);
		lblFamilyDetailsBlock4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock4 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock4.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock4.gridx = 0;
		gbc_lblFamilyDetailsBlock4.gridy = 2;
		panelParentInformation.add(lblFamilyDetailsBlock4, gbc_lblFamilyDetailsBlock4);

		lblMotherFullName = new JLabel("Full Name");
		lblMotherFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherFullName = new GridBagConstraints();
		gbc_lblMotherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherFullName.gridx = 1;
		gbc_lblMotherFullName.gridy = 3;
		panelParentInformation.add(lblMotherFullName, gbc_lblMotherFullName);

		textFieldMotherFullName = new JTextField();
		textFieldMotherFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldMotherFullName = new GridBagConstraints();
		gbc_textFieldMotherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherFullName.gridx = 2;
		gbc_textFieldMotherFullName.gridy = 3;
		panelParentInformation.add(textFieldMotherFullName, gbc_textFieldMotherFullName);
		textFieldMotherFullName.setColumns(10);

		lblMotherCitizenship = new JLabel("Citizenship");
		lblMotherCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherCitizenship = new GridBagConstraints();
		gbc_lblMotherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherCitizenship.gridx = 4;
		gbc_lblMotherCitizenship.gridy = 3;
		panelParentInformation.add(lblMotherCitizenship, gbc_lblMotherCitizenship);

		textFieldMotherCitizenship = new JTextField();
		textFieldMotherCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMotherCitizenship.setColumns(10);
		GridBagConstraints gbc_textFieldMotherCitizenship = new GridBagConstraints();
		gbc_textFieldMotherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherCitizenship.gridx = 5;
		gbc_textFieldMotherCitizenship.gridy = 3;
		panelParentInformation.add(textFieldMotherCitizenship, gbc_textFieldMotherCitizenship);

		lblFamilyDetailsBlock5 = new JLabel("BLOCK");
		lblFamilyDetailsBlock5.setForeground(Color.WHITE);
		lblFamilyDetailsBlock5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock5 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock5.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock5.gridx = 0;
		gbc_lblFamilyDetailsBlock5.gridy = 4;
		panelParentInformation.add(lblFamilyDetailsBlock5, gbc_lblFamilyDetailsBlock5);

		lblMotherAge = new JLabel("Age");
		lblMotherAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherAge = new GridBagConstraints();
		gbc_lblMotherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherAge.gridx = 1;
		gbc_lblMotherAge.gridy = 5;
		panelParentInformation.add(lblMotherAge, gbc_lblMotherAge);

		textFieldMotherAge = new JTextField();
		textFieldMotherAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMotherAge.setColumns(10);
		GridBagConstraints gbc_textFieldMotherAge = new GridBagConstraints();
		gbc_textFieldMotherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherAge.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherAge.gridx = 2;
		gbc_textFieldMotherAge.gridy = 5;
		panelParentInformation.add(textFieldMotherAge, gbc_textFieldMotherAge);

		lblMotherContactNumber = new JLabel("Contact Number");
		lblMotherContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherContactNumber = new GridBagConstraints();
		gbc_lblMotherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherContactNumber.gridx = 4;
		gbc_lblMotherContactNumber.gridy = 5;
		panelParentInformation.add(lblMotherContactNumber, gbc_lblMotherContactNumber);

		textFieldMotherContactNumber = new JTextField();
		textFieldMotherContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMotherContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldMotherContactNumber = new GridBagConstraints();
		gbc_textFieldMotherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherContactNumber.gridx = 5;
		gbc_textFieldMotherContactNumber.gridy = 5;
		panelParentInformation.add(textFieldMotherContactNumber, gbc_textFieldMotherContactNumber);

		lblFamilyDetailsBlock6 = new JLabel("BLOCK");
		lblFamilyDetailsBlock6.setForeground(Color.WHITE);
		lblFamilyDetailsBlock6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock6 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock6.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock6.gridx = 0;
		gbc_lblFamilyDetailsBlock6.gridy = 6;
		panelParentInformation.add(lblFamilyDetailsBlock6, gbc_lblFamilyDetailsBlock6);

		lblMotherOccupation = new JLabel("Occupation");
		lblMotherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherOccupation = new GridBagConstraints();
		gbc_lblMotherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherOccupation.gridx = 1;
		gbc_lblMotherOccupation.gridy = 7;
		panelParentInformation.add(lblMotherOccupation, gbc_lblMotherOccupation);

		textFieldMotherOccupation = new JTextField();
		textFieldMotherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldMotherOccupation.setColumns(10);
		GridBagConstraints gbc_textFieldMotherOccupation = new GridBagConstraints();
		gbc_textFieldMotherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherOccupation.gridx = 2;
		gbc_textFieldMotherOccupation.gridy = 7;
		panelParentInformation.add(textFieldMotherOccupation, gbc_textFieldMotherOccupation);

		lblMotherLiving = new JLabel("Status");
		lblMotherLiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherLiving = new GridBagConstraints();
		gbc_lblMotherLiving.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherLiving.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherLiving.gridx = 4;
		gbc_lblMotherLiving.gridy = 7;
		panelParentInformation.add(lblMotherLiving, gbc_lblMotherLiving);

		rdbtnMotherLiving = new JRadioButton("Living");
		rdbtnMotherLiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnMotherLiving.setSelected(true);
		btnGroupMotherLiving.add(rdbtnMotherLiving);
		rdbtnMotherLiving.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_rdbtnMotherLiving = new GridBagConstraints();
		gbc_rdbtnMotherLiving.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnMotherLiving.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMotherLiving.gridx = 5;
		gbc_rdbtnMotherLiving.gridy = 7;
		panelParentInformation.add(rdbtnMotherLiving, gbc_rdbtnMotherLiving);

		rdbtnMotherDeceased = new JRadioButton("Deceased");
		rdbtnMotherDeceased.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGroupMotherLiving.add(rdbtnMotherDeceased);
		rdbtnMotherDeceased.setBackground(Color.WHITE);
		GridBagConstraints gbc_rdbtnMotherDeceased = new GridBagConstraints();
		gbc_rdbtnMotherDeceased.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnMotherDeceased.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMotherDeceased.gridx = 6;
		gbc_rdbtnMotherDeceased.gridy = 7;
		panelParentInformation.add(rdbtnMotherDeceased, gbc_rdbtnMotherDeceased);

		lblFamilyDetailsBlock7 = new JLabel("BLOCK");
		lblFamilyDetailsBlock7.setForeground(Color.WHITE);
		lblFamilyDetailsBlock7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock7 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock7.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock7.gridx = 0;
		gbc_lblFamilyDetailsBlock7.gridy = 8;
		panelParentInformation.add(lblFamilyDetailsBlock7, gbc_lblFamilyDetailsBlock7);

		lblFatherInformationHeading = new JLabel("Father Information");
		lblFatherInformationHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblFatherInformationHeading = new GridBagConstraints();
		gbc_lblFatherInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherInformationHeading.gridx = 1;
		gbc_lblFatherInformationHeading.gridy = 9;
		panelParentInformation.add(lblFatherInformationHeading, gbc_lblFatherInformationHeading);

		lblFamilyDetailsBlock8 = new JLabel("BLOCK");
		lblFamilyDetailsBlock8.setForeground(Color.WHITE);
		lblFamilyDetailsBlock8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock8 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock8.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock8.gridx = 0;
		gbc_lblFamilyDetailsBlock8.gridy = 10;
		panelParentInformation.add(lblFamilyDetailsBlock8, gbc_lblFamilyDetailsBlock8);

		lblFatherFullName = new JLabel("Full Name");
		lblFatherFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherFullName = new GridBagConstraints();
		gbc_lblFatherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherFullName.gridx = 1;
		gbc_lblFatherFullName.gridy = 11;
		panelParentInformation.add(lblFatherFullName, gbc_lblFatherFullName);

		textFieldFatherFullName = new JTextField();
		textFieldFatherFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFatherFullName.setColumns(10);
		GridBagConstraints gbc_textFieldFatherFullName = new GridBagConstraints();
		gbc_textFieldFatherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherFullName.gridx = 2;
		gbc_textFieldFatherFullName.gridy = 11;
		panelParentInformation.add(textFieldFatherFullName, gbc_textFieldFatherFullName);

		lblFatherCitizenship = new JLabel("Citizenship");
		lblFatherCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherCitizenship = new GridBagConstraints();
		gbc_lblFatherCitizenship.anchor = GridBagConstraints.WEST;
		gbc_lblFatherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherCitizenship.gridx = 4;
		gbc_lblFatherCitizenship.gridy = 11;
		panelParentInformation.add(lblFatherCitizenship, gbc_lblFatherCitizenship);

		textFieldFatherCitizenship = new JTextField();
		textFieldFatherCitizenship.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFatherCitizenship.setColumns(10);
		GridBagConstraints gbc_textFieldFatherCitizenship = new GridBagConstraints();
		gbc_textFieldFatherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherCitizenship.gridx = 5;
		gbc_textFieldFatherCitizenship.gridy = 11;
		panelParentInformation.add(textFieldFatherCitizenship, gbc_textFieldFatherCitizenship);

		lblFamilyDetailsBlock9 = new JLabel("BLOCK");
		lblFamilyDetailsBlock9.setForeground(Color.WHITE);
		lblFamilyDetailsBlock9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock9 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock9.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock9.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock9.gridx = 0;
		gbc_lblFamilyDetailsBlock9.gridy = 12;
		panelParentInformation.add(lblFamilyDetailsBlock9, gbc_lblFamilyDetailsBlock9);

		lblFatherAge = new JLabel("Age");
		lblFatherAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherAge = new GridBagConstraints();
		gbc_lblFatherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherAge.gridx = 1;
		gbc_lblFatherAge.gridy = 13;
		panelParentInformation.add(lblFatherAge, gbc_lblFatherAge);

		textFieldFatherAge = new JTextField();
		textFieldFatherAge.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFatherAge.setColumns(10);
		GridBagConstraints gbc_textFieldFatherAge = new GridBagConstraints();
		gbc_textFieldFatherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherAge.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherAge.gridx = 2;
		gbc_textFieldFatherAge.gridy = 13;
		panelParentInformation.add(textFieldFatherAge, gbc_textFieldFatherAge);

		lblFatherContactNumber = new JLabel("Contact Number");
		lblFatherContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherContactNumber = new GridBagConstraints();
		gbc_lblFatherContactNumber.anchor = GridBagConstraints.WEST;
		gbc_lblFatherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherContactNumber.gridx = 4;
		gbc_lblFatherContactNumber.gridy = 13;
		panelParentInformation.add(lblFatherContactNumber, gbc_lblFatherContactNumber);

		textFieldFatherContactNumber = new JTextField();
		textFieldFatherContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFatherContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldFatherContactNumber = new GridBagConstraints();
		gbc_textFieldFatherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherContactNumber.gridx = 5;
		gbc_textFieldFatherContactNumber.gridy = 13;
		panelParentInformation.add(textFieldFatherContactNumber, gbc_textFieldFatherContactNumber);

		lblFamilyDetailsBlock10 = new JLabel("BLOCK");
		lblFamilyDetailsBlock10.setForeground(Color.WHITE);
		lblFamilyDetailsBlock10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock10 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock10.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock10.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock10.gridx = 0;
		gbc_lblFamilyDetailsBlock10.gridy = 14;
		panelParentInformation.add(lblFamilyDetailsBlock10, gbc_lblFamilyDetailsBlock10);

		lblFatherOccupation = new JLabel("Occupation");
		lblFatherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherOccupation = new GridBagConstraints();
		gbc_lblFatherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherOccupation.gridx = 1;
		gbc_lblFatherOccupation.gridy = 15;
		panelParentInformation.add(lblFatherOccupation, gbc_lblFatherOccupation);

		textFieldFatherOccupation = new JTextField();
		textFieldFatherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldFatherOccupation.setColumns(10);
		GridBagConstraints gbc_textFieldFatherOccupation = new GridBagConstraints();
		gbc_textFieldFatherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherOccupation.gridx = 2;
		gbc_textFieldFatherOccupation.gridy = 15;
		panelParentInformation.add(textFieldFatherOccupation, gbc_textFieldFatherOccupation);

		lblFatherStatus = new JLabel("Status");
		lblFatherStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherStatus = new GridBagConstraints();
		gbc_lblFatherStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherStatus.gridx = 4;
		gbc_lblFatherStatus.gridy = 15;
		panelParentInformation.add(lblFatherStatus, gbc_lblFatherStatus);

		rdbtnFatherLiving = new JRadioButton("Living");
		rdbtnFatherLiving.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnFatherLiving.setSelected(true);
		btnGroupFatherLiving.add(rdbtnFatherLiving);
		rdbtnFatherLiving.setBackground(Color.WHITE);
		GridBagConstraints gbc_rdbtnFatherLiving = new GridBagConstraints();
		gbc_rdbtnFatherLiving.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnFatherLiving.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFatherLiving.gridx = 5;
		gbc_rdbtnFatherLiving.gridy = 15;
		panelParentInformation.add(rdbtnFatherLiving, gbc_rdbtnFatherLiving);

		rdbtnFatherDeceased = new JRadioButton("Deceased");
		rdbtnFatherDeceased.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGroupFatherLiving.add(rdbtnFatherDeceased);
		rdbtnFatherDeceased.setBackground(Color.WHITE);
		GridBagConstraints gbc_rdbtnFatherDeceased = new GridBagConstraints();
		gbc_rdbtnFatherDeceased.fill = GridBagConstraints.HORIZONTAL;
		gbc_rdbtnFatherDeceased.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFatherDeceased.gridx = 6;
		gbc_rdbtnFatherDeceased.gridy = 15;
		panelParentInformation.add(rdbtnFatherDeceased, gbc_rdbtnFatherDeceased);

		JPanel panelGuardian = new JPanel();
		panelGuardian.setBackground(new Color(255, 255, 255));
		tabbedPaneFamilyDetails.addTab("Guardian Information", null, panelGuardian, null);
		GridBagLayout gbl_panelGuardian = new GridBagLayout();
		gbl_panelGuardian.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelGuardian.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelGuardian.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelGuardian.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelGuardian.setLayout(gbl_panelGuardian);

		lblFamilyDetailsBlock11 = new JLabel("BLOCK");
		lblFamilyDetailsBlock11.setForeground(Color.WHITE);
		lblFamilyDetailsBlock11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock11 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock11.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock11.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock11.gridx = 0;
		gbc_lblFamilyDetailsBlock11.gridy = 0;
		panelGuardian.add(lblFamilyDetailsBlock11, gbc_lblFamilyDetailsBlock11);

		lblFamilyDetailsBlock12 = new JLabel("BLOCK");
		lblFamilyDetailsBlock12.setForeground(Color.WHITE);
		lblFamilyDetailsBlock12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock12 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock12.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock12.insets = new Insets(0, 0, 5, 0);
		gbc_lblFamilyDetailsBlock12.gridx = 3;
		gbc_lblFamilyDetailsBlock12.gridy = 0;
		panelGuardian.add(lblFamilyDetailsBlock12, gbc_lblFamilyDetailsBlock12);

		lblGuardianInformationHeading = new JLabel("Guardian Information ");
		lblGuardianInformationHeading.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblGuardianInformationHeading = new GridBagConstraints();
		gbc_lblGuardianInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianInformationHeading.gridx = 1;
		gbc_lblGuardianInformationHeading.gridy = 1;
		panelGuardian.add(lblGuardianInformationHeading, gbc_lblGuardianInformationHeading);

		lblFamilyDetailsBlock13 = new JLabel("BLOCK");
		lblFamilyDetailsBlock13.setForeground(Color.WHITE);
		lblFamilyDetailsBlock13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock13 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock13.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock13.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock13.gridx = 0;
		gbc_lblFamilyDetailsBlock13.gridy = 2;
		panelGuardian.add(lblFamilyDetailsBlock13, gbc_lblFamilyDetailsBlock13);

		lblGuardianFullName = new JLabel("Full Name");
		lblGuardianFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianFullName = new GridBagConstraints();
		gbc_lblGuardianFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianFullName.gridx = 1;
		gbc_lblGuardianFullName.gridy = 3;
		panelGuardian.add(lblGuardianFullName, gbc_lblGuardianFullName);

		textFieldGuardianFullName = new JTextField();
		textFieldGuardianFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldGuardianFullName = new GridBagConstraints();
		gbc_textFieldGuardianFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianFullName.gridx = 2;
		gbc_textFieldGuardianFullName.gridy = 3;
		panelGuardian.add(textFieldGuardianFullName, gbc_textFieldGuardianFullName);
		textFieldGuardianFullName.setColumns(10);

		lblFamilyDetailsBlock14 = new JLabel("BLOCK");
		lblFamilyDetailsBlock14.setForeground(Color.WHITE);
		lblFamilyDetailsBlock14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock14 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock14.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock14.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock14.gridx = 0;
		gbc_lblFamilyDetailsBlock14.gridy = 4;
		panelGuardian.add(lblFamilyDetailsBlock14, gbc_lblFamilyDetailsBlock14);

		lblGuardianRelationshipToStudent = new JLabel("Relationship to Student");
		lblGuardianRelationshipToStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianRelationshipToStudent = new GridBagConstraints();
		gbc_lblGuardianRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianRelationshipToStudent.gridx = 1;
		gbc_lblGuardianRelationshipToStudent.gridy = 5;
		panelGuardian.add(lblGuardianRelationshipToStudent, gbc_lblGuardianRelationshipToStudent);

		textFieldGuardianRelationshipToStudent = new JTextField();
		textFieldGuardianRelationshipToStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldGuardianRelationshipToStudent.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianRelationshipToStudent = new GridBagConstraints();
		gbc_textFieldGuardianRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianRelationshipToStudent.gridx = 2;
		gbc_textFieldGuardianRelationshipToStudent.gridy = 5;
		panelGuardian.add(textFieldGuardianRelationshipToStudent, gbc_textFieldGuardianRelationshipToStudent);

		lblFamilyDetailsBlock15 = new JLabel("BLOCK");
		lblFamilyDetailsBlock15.setForeground(Color.WHITE);
		lblFamilyDetailsBlock15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock15 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock15.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock15.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock15.gridx = 0;
		gbc_lblFamilyDetailsBlock15.gridy = 6;
		panelGuardian.add(lblFamilyDetailsBlock15, gbc_lblFamilyDetailsBlock15);

		lblGuardianContactNumber = new JLabel("Contact Number");
		lblGuardianContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianContactNumber = new GridBagConstraints();
		gbc_lblGuardianContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianContactNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblGuardianContactNumber.gridx = 1;
		gbc_lblGuardianContactNumber.gridy = 7;
		panelGuardian.add(lblGuardianContactNumber, gbc_lblGuardianContactNumber);

		textFieldGuardianContactNumber = new JTextField();
		textFieldGuardianContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldGuardianContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianContactNumber = new GridBagConstraints();
		gbc_textFieldGuardianContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianContactNumber.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldGuardianContactNumber.gridx = 2;
		gbc_textFieldGuardianContactNumber.gridy = 7;
		panelGuardian.add(textFieldGuardianContactNumber, gbc_textFieldGuardianContactNumber);

		JPanel panelEmergencyContact = new JPanel();
		panelEmergencyContact.setBackground(new Color(255, 255, 255));
		tabbedPaneFamilyDetails.addTab("Emergency Contact", null, panelEmergencyContact, null);
		GridBagLayout gbl_panelEmergencyContact = new GridBagLayout();
		gbl_panelEmergencyContact.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelEmergencyContact.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelEmergencyContact.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panelEmergencyContact.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panelEmergencyContact.setLayout(gbl_panelEmergencyContact);

		lblFamilyDetailsBlock16 = new JLabel("BLOCK");
		lblFamilyDetailsBlock16.setForeground(Color.WHITE);
		lblFamilyDetailsBlock16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock16 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock16.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock16.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock16.gridx = 0;
		gbc_lblFamilyDetailsBlock16.gridy = 0;
		panelEmergencyContact.add(lblFamilyDetailsBlock16, gbc_lblFamilyDetailsBlock16);

		lblFamilyDetailsBlock17 = new JLabel("BLOCK");
		lblFamilyDetailsBlock17.setForeground(Color.WHITE);
		lblFamilyDetailsBlock17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock17 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock17.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock17.insets = new Insets(0, 0, 5, 0);
		gbc_lblFamilyDetailsBlock17.gridx = 3;
		gbc_lblFamilyDetailsBlock17.gridy = 0;
		panelEmergencyContact.add(lblFamilyDetailsBlock17, gbc_lblFamilyDetailsBlock17);

		lblEmergencyContact = new JLabel("Emergency Contact ");
		lblEmergencyContact.setFont(new Font("Tahoma", Font.BOLD, 12));
		GridBagConstraints gbc_lblEmergencyContact = new GridBagConstraints();
		gbc_lblEmergencyContact.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyContact.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyContact.gridx = 1;
		gbc_lblEmergencyContact.gridy = 1;
		panelEmergencyContact.add(lblEmergencyContact, gbc_lblEmergencyContact);

		lblFamilyDetailsBlock18 = new JLabel("BLOCK");
		lblFamilyDetailsBlock18.setForeground(Color.WHITE);
		lblFamilyDetailsBlock18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock18 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock18.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock18.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock18.gridx = 1;
		gbc_lblFamilyDetailsBlock18.gridy = 2;
		panelEmergencyContact.add(lblFamilyDetailsBlock18, gbc_lblFamilyDetailsBlock18);

		lblEmergencyFullName = new JLabel("Full Name");
		lblEmergencyFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyFullName = new GridBagConstraints();
		gbc_lblEmergencyFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyFullName.gridx = 1;
		gbc_lblEmergencyFullName.gridy = 3;
		panelEmergencyContact.add(lblEmergencyFullName, gbc_lblEmergencyFullName);

		textFieldEmergencyFullName = new JTextField();
		textFieldEmergencyFullName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_textFieldEmergencyFullName = new GridBagConstraints();
		gbc_textFieldEmergencyFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyFullName.gridx = 2;
		gbc_textFieldEmergencyFullName.gridy = 3;
		panelEmergencyContact.add(textFieldEmergencyFullName, gbc_textFieldEmergencyFullName);
		textFieldEmergencyFullName.setColumns(10);

		lblFamilyDetailsBlock19 = new JLabel("BLOCK");
		lblFamilyDetailsBlock19.setForeground(Color.WHITE);
		lblFamilyDetailsBlock19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock19 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock19.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock19.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock19.gridx = 1;
		gbc_lblFamilyDetailsBlock19.gridy = 4;
		panelEmergencyContact.add(lblFamilyDetailsBlock19, gbc_lblFamilyDetailsBlock19);

		lblEmergencyRelationshipToStudent = new JLabel("Relationship to Student");
		lblEmergencyRelationshipToStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyRelationshipToStudent = new GridBagConstraints();
		gbc_lblEmergencyRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyRelationshipToStudent.gridx = 1;
		gbc_lblEmergencyRelationshipToStudent.gridy = 5;
		panelEmergencyContact.add(lblEmergencyRelationshipToStudent, gbc_lblEmergencyRelationshipToStudent);

		textFieldEmergencyRelationshipToStudent = new JTextField();
		textFieldEmergencyRelationshipToStudent.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEmergencyRelationshipToStudent.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyRelationshipToStudent = new GridBagConstraints();
		gbc_textFieldEmergencyRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyRelationshipToStudent.gridx = 2;
		gbc_textFieldEmergencyRelationshipToStudent.gridy = 5;
		panelEmergencyContact.add(textFieldEmergencyRelationshipToStudent, gbc_textFieldEmergencyRelationshipToStudent);

		lblFamilyDetailsBlock20 = new JLabel("BLOCK");
		lblFamilyDetailsBlock20.setForeground(Color.WHITE);
		lblFamilyDetailsBlock20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFamilyDetailsBlock20 = new GridBagConstraints();
		gbc_lblFamilyDetailsBlock20.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFamilyDetailsBlock20.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetailsBlock20.gridx = 1;
		gbc_lblFamilyDetailsBlock20.gridy = 6;
		panelEmergencyContact.add(lblFamilyDetailsBlock20, gbc_lblFamilyDetailsBlock20);

		lblEmergencyContactNumber = new JLabel("Contact Number");
		lblEmergencyContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyContactNumber = new GridBagConstraints();
		gbc_lblEmergencyContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyContactNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblEmergencyContactNumber.gridx = 1;
		gbc_lblEmergencyContactNumber.gridy = 7;
		panelEmergencyContact.add(lblEmergencyContactNumber, gbc_lblEmergencyContactNumber);

		textFieldEmergencyContactNumber = new JTextField();
		textFieldEmergencyContactNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textFieldEmergencyContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyContactNumber = new GridBagConstraints();
		gbc_textFieldEmergencyContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyContactNumber.insets = new Insets(0, 0, 0, 5);
		gbc_textFieldEmergencyContactNumber.gridx = 2;
		gbc_textFieldEmergencyContactNumber.gridy = 7;
		panelEmergencyContact.add(textFieldEmergencyContactNumber, gbc_textFieldEmergencyContactNumber);

		btnFamilyDetailsNext = new JButton("Next");
		btnFamilyDetailsNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(5, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(5);
				btnAcademicInformationNext.setEnabled(true);
			}
		});
		btnFamilyDetailsNext.setEnabled(false);
		btnFamilyDetailsNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFamilyDetailsNext.setFocusable(false);
		btnFamilyDetailsNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnFamilyDetailsNext.setBackground(Color.YELLOW);
		btnFamilyDetailsNext.setBounds(720, 460, 90, 21);
		panelFamilyDetails.add(btnFamilyDetailsNext);

		btnFamilyDetailsBack = new JButton("Back");
		btnFamilyDetailsBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedIndex(3);
			}
		});
		btnFamilyDetailsBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFamilyDetailsBack.setFocusable(false);
		btnFamilyDetailsBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnFamilyDetailsBack.setBackground(Color.YELLOW);
		btnFamilyDetailsBack.setBounds(620, 460, 90, 21);
		panelFamilyDetails.add(btnFamilyDetailsBack);

		panelAcademicInformation = new JPanel();
		panelAcademicInformation.setBackground(new Color(240, 240, 240));
		tabbedPaneAdmissionAssistant.addTab("Academic Information", null, panelAcademicInformation, null);
		panelAcademicInformation.setLayout(null);

		lblAcademicInformationHeading = new JLabel("Academic Information (Optional)");
		lblAcademicInformationHeading.setBounds(35, 21, 750, 19);
		lblAcademicInformationHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		panelAcademicInformation.add(lblAcademicInformationHeading);

		panelGuidelines = new JPanel();
		panelGuidelines.setBounds(35, 51, 750, 194);
		panelAcademicInformation.add(panelGuidelines);
		panelGuidelines.setLayout(null);

		lblGuidelinesInternational = new JLabel("");
		lblGuidelinesInternational.setIcon(new ImageIcon(getImage("guideline-foreign-applicant.png")));
		lblGuidelinesInternational.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuidelinesInternational.setBounds(260, 11, 230, 172);
		panelGuidelines.add(lblGuidelinesInternational);

		lblGuidelinesRegular = new JLabel("");
		lblGuidelinesRegular.setIcon(new ImageIcon(getImage("guideline-regular-applicant.png")));
		lblGuidelinesRegular.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuidelinesRegular.setBounds(510, 11, 230, 172);
		panelGuidelines.add(lblGuidelinesRegular);

		lblGuidelinesTransfer = new JLabel("");
		lblGuidelinesTransfer.setIcon(new ImageIcon(getImage("guideline-transfer-applicant.png")));
		lblGuidelinesTransfer.setHorizontalAlignment(SwingConstants.CENTER);
		lblGuidelinesTransfer.setBounds(10, 11, 230, 172);
		panelGuidelines.add(lblGuidelinesTransfer);

		lblUploadFiles = new JLabel("Upload Files ");
		lblUploadFiles.setFont(new Font("Dialog", Font.BOLD, 14));
		lblUploadFiles.setBounds(35, 256, 151, 19);
		panelAcademicInformation.add(lblUploadFiles);

		panelUploadFiles = new JPanel();
		panelUploadFiles.setBackground(new Color(235, 235, 235));
		panelUploadFiles.setBounds(35, 286, 750, 60);
		panelAcademicInformation.add(panelUploadFiles);
		panelUploadFiles.setLayout(null);

		JButton btnChooseFile = new JButton("Choose File ");
		btnChooseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showFileUploadDialog();
			}
		});
		btnChooseFile.setBounds(20, 20, 128, 23);
		panelUploadFiles.add(btnChooseFile);

		lblSelectedFileName = new JLabel("");
		lblSelectedFileName.setForeground(new Color(0, 0, 0));
		lblSelectedFileName.setBounds(160, 24, 580, 14);
		panelUploadFiles.add(lblSelectedFileName);

		btnAcademicInformationNext = new JButton("Next");
		btnAcademicInformationNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(6, true);
				tabbedPaneAdmissionAssistant.setSelectedIndex(6);
			}
		});
		btnAcademicInformationNext.setEnabled(false);
		btnAcademicInformationNext.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAcademicInformationNext.setFocusable(false);
		btnAcademicInformationNext.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAcademicInformationNext.setBackground(Color.YELLOW);
		btnAcademicInformationNext.setBounds(720, 460, 90, 21);
		panelAcademicInformation.add(btnAcademicInformationNext);

		btnAcademicInformationBack = new JButton("Back");
		btnAcademicInformationBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedIndex(4);
			}
		});
		btnAcademicInformationBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAcademicInformationBack.setFocusable(false);
		btnAcademicInformationBack.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnAcademicInformationBack.setBackground(Color.YELLOW);
		btnAcademicInformationBack.setBounds(620, 460, 90, 21);
		panelAcademicInformation.add(btnAcademicInformationBack);

		panelSummary = new JScrollPane();
		panelSummary.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		panelSummary.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		tabbedPaneAdmissionAssistant.addTab("Summary", null, panelSummary, null);

		StudentDashboardAdmissionSummary panelSummaryContent = new StudentDashboardAdmissionSummary();
		panelSummary.setViewportView(panelSummaryContent);

		// initial disabled tabs in the JTabbedPane
		for (int index = 1; index < tabbedPaneAdmissionAssistant.getTabCount(); index++) {
			tabbedPaneAdmissionAssistant.setEnabledAt(index, false);
		}

		JTextField[] textFieldPersonalDetails = { textFieldStudentBarangay, textFieldStudentCitizenship,
				textFieldStudentCity, textFieldStudentCountry, textFieldStudentLrnNo, textFieldStudentNickName,
				textFieldStudentPlaceOfBirth, textFieldStudentProvince, textFieldStudentReligion,
				textFieldStudentStatus, textFieldStudentStreetAddress, textFieldStudentSuffix, textFieldStudentZipCode,
				textFieldEducationBackgroundRecentSchoolAttended, textFieldEducationBackgroundLandlineNo,
				textFieldEducationBackgroundSchoolAddress, };

		JTextField[] textFieldFamilyDetails = { textFieldEmergencyContactNumber, textFieldEmergencyFullName,
				textFieldEmergencyRelationshipToStudent, textFieldFatherAge, textFieldFatherCitizenship,
				textFieldFatherContactNumber, textFieldFatherFullName, textFieldFatherOccupation,
				textFieldGuardianContactNumber, textFieldGuardianFullName, textFieldGuardianRelationshipToStudent,
				textFieldMotherAge, textFieldMotherCitizenship, textFieldMotherContactNumber, textFieldMotherFullName,
				textFieldMotherOccupation };

		/**
		 * DocumentListener to monitor changes in text fields and update button states
		 * accordingly. It checks if personal details and family details text fields are
		 * filled, enabling/disabling corresponding next buttons and tabs in a tabbed
		 * pane.
		 */

		DocumentListener documentListener = new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				updateButtonState();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateButtonState();
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateButtonState();
			}

			private void updateButtonState() {
				boolean arePersonalDetailsFilled = true;
				boolean areFamilyDetailsFilled = true;

				for (JTextField textField : textFieldPersonalDetails) {
					if (textField.getText().isEmpty()) {
						arePersonalDetailsFilled = false;
						break;
					}
				}

				if (!arePersonalDetailsFilled) {
					btnPersonalDetailsNext.setEnabled(arePersonalDetailsFilled);
					for (int index = 3; index < tabbedPaneAdmissionAssistant.getTabCount(); index++) {
						btnPersonalDetailsNext.setEnabled(arePersonalDetailsFilled);
						tabbedPaneAdmissionAssistant.setEnabledAt(4, arePersonalDetailsFilled);
					}
				}

				for (JTextField textField : textFieldFamilyDetails) {
					if (textField.getText().isEmpty()) {
						areFamilyDetailsFilled = false;
						break;
					}
				}

				if (!areFamilyDetailsFilled) {
					btnFamilyDetailsNext.setEnabled(areFamilyDetailsFilled);
					for (int index = 4; index < tabbedPaneAdmissionAssistant.getTabCount(); index++) {
						btnFamilyDetailsNext.setEnabled(areFamilyDetailsFilled);
						tabbedPaneAdmissionAssistant.setEnabledAt(5, areFamilyDetailsFilled);
					}
				}

				btnFamilyDetailsNext.setEnabled(areFamilyDetailsFilled);
				btnPersonalDetailsNext.setEnabled(arePersonalDetailsFilled);
			}
		};

		for (JTextField textField : textFieldPersonalDetails) {
			textField.getDocument().addDocumentListener(documentListener);
		}

		for (JTextField textField : textFieldFamilyDetails) {
			textField.getDocument().addDocumentListener(documentListener);
		}
	}

	/**
	 * Displays a file upload dialog to allow the user to select a file for
	 * processing.
	 */
	protected void showFileUploadDialog() {
		JFileChooser fileChooser = new JFileChooser();

		// Set the file selection mode to allow only files, not directories.
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		// Allow multiple file selection.
		fileChooser.setMultiSelectionEnabled(true);

		int result = fileChooser.showOpenDialog(this);

		if (result == JFileChooser.APPROVE_OPTION) {
			File[] selectedFiles = fileChooser.getSelectedFiles();

			for (File file : selectedFiles) {
				String filename = file.getName();
				lblSelectedFileName.setText(lblSelectedFileName.getText() + "\"" + filename + "\", ");
			}
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