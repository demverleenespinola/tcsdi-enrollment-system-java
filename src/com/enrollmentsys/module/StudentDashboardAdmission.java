package com.enrollmentsys.module;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.Toolkit;

public class StudentDashboardAdmission extends JFrame {

	private static final long serialVersionUID = 1L;
	private JButton btnAdmissionAssistant;
	private JButton btnBackFD;
	private JButton btnBackPD;
	private JButton btnBackPI;
	private JButton btnBackSM;
	private JButton btnDashboard;
	private JButton btnDataPrivacyBack;
	private JButton btnLogout;
	private JButton btnNextAI;
	private JButton btnNextDP;
	private JButton btnNextFD;
	private JButton btnNextPD;
	private JButton btnNextPI;
	private JButton btnWelcomeNext;
	private JButton btnWelcomeSM;
	private JComboBox comboBoxCampusPI;
	private JComboBox comboBoxGenderPD;
	private JComboBox comboBoxGradingPeriodPI;
	private JComboBox comboBoxIntendedAcademicYearPI;
	private JComboBox comboBoxSchoolTypePD;
	private JComboBox comboBoxYearLevelPI;
	private JLabel lblAcademicInformation;
	private JLabel lblAdmissionAssistantHeader;
	private JLabel lblApplicationTypePI;
	private JLabel lblBirthdayPI;
	private JLabel lblBlank10SM;
	private JLabel lblBlank11SM;
	private JLabel lblBlank12SM;
	private JLabel lblBlank13SM;
	private JLabel lblBlank1SM;
	private JLabel lblBlank2SM;
	private JLabel lblBlank3SM;
	private JLabel lblBlank5SM;
	private JLabel lblBlank6SM;
	private JLabel lblBlank7SM;
	private JLabel lblBlank8SM;
	private JLabel lblBlank9SM;
	private JLabel lblCampusPI;
	private JLabel lblCitizenshipPD;
	private JLabel lblDashboardStudentEmaill;
	private JLabel lblDashboardStudentName;
	private JLabel lblDashboardStudentNumber;
	private JLabel lblDashboardStudentStatus;
	private JLabel lblEducationBackgroundPD;
	private JLabel lblEducationalBackground;
	private JLabel lblEmailAddressPI;
	private JLabel lblEmergencyContactNumberFD;
	private JLabel lblEmergencyContactNumberSM;
	private JLabel lblEmergencyFullNameFD;
	private JLabel lblEmergencyFullNameSM;
	private JLabel lblEmergencyRelationshipFD;
	private JLabel lblEmergencyRelationshipSM;
	private JLabel lblFamilyDetails;
	private JLabel lblFatherAgeFD;
	private JLabel lblFatherAgeSM;
	private JLabel lblFatherCitizenshipFD;
	private JLabel lblFatherCitizenshipSM;
	private JLabel lblFatherContactNumber;
	private JLabel lblFatherContactNumberSM;
	private JLabel lblFatherFullnameFD;
	private JLabel lblFatherInformationSM;
	private JLabel lblFatherOccupationFD;
	private JLabel lblFatherOccupationSM;
	private JLabel lblFatherStatusFD;
	private JLabel lblFatherStatusSM;
	private JLabel lblFirstNamePI;
	private JLabel lblForeignGuidelineAI;
	private JLabel lblForeignTransferAI;
	private JLabel lblGradingPeriodPI;
	private JLabel lblGuardianContactNumberFD;
	private JLabel lblGuardianContactNumberSM;
	private JLabel lblGuardianFullNameFD;
	private JLabel lblGuardianFullNameSM;
	private JLabel lblGuardianRelationshipFD;
	private JLabel lblGuardianRelationshipSM;
	private JLabel lblIntendedAcademicYearPI;
	private JLabel lblLRNHighSchoolPD;
	private JLabel lblLandlinePD;
	private JLabel lblLastNamePI;
	private JLabel lblMessage1;
	private JLabel lblMessage2;
	private JLabel lblMessage3;
	private JLabel lblMessage4;
	private JLabel lblMessage5;
	private JLabel lblMessage6;
	private JLabel lblMessage7;
	private JLabel lblMessage8;
	private JLabel lblMiddleNamePI;
	private JLabel lblMotherAgeFD;
	private JLabel lblMotherAgeSM;
	private JLabel lblMotherCitizenshipFD;
	private JLabel lblMotherCitizenshipSM;
	private JLabel lblMotherContactNumberFD;
	private JLabel lblMotherContactNumberSM;
	private JLabel lblMotherFullnameFD;
	private JLabel lblMotherInformationSM;
	private JLabel lblMotherOccupationFD;
	private JLabel lblMotherOccupationSM;
	private JLabel lblMotherStatusFD;
	private JLabel lblMotherStatusSM;
	private JLabel lblNewLabel_56;
	private JLabel lblNickNamePD;
	private JLabel lblPersonalDetails;
	private JLabel lblPlaceOfBirthPD;
	private JLabel lblPresentAddress;
	private JLabel lblPresentAgePI;
	private JLabel lblPrimaryInformation;
	private JLabel lblRecentSchoolAttendedPD;
	private JLabel lblRegularGuidelineAI;
	private JLabel lblReligionPD;
	private JLabel lblSchoolAddressPD;
	private JLabel lblSchoolAddressSM;
	private JLabel lblSchoolLandlineSM;
	private JLabel lblSchoolTypePD;
	private JLabel lblSchoolTypeSM;
	private JLabel lblSexPD;
	private JLabel lblStudentAddressPD;
	private JLabel lblStudentBarangayPD;
	private JLabel lblStudentBarangaySM;
	private JLabel lblStudentCitizenshipSM;
	private JLabel lblStudentCityPD;
	private JLabel lblStudentCitySM;
	private JLabel lblStudentCountryPD;
	private JLabel lblStudentCountrySM;
	private JLabel lblStudentEmergencyInformation;
	private JLabel lblStudentEmergencyInformationFD;
	private JLabel lblStudentFatherInformation;
	private JLabel lblStudentGuardianInformation;
	private JLabel lblStudentGuardianInformationFD;
	private JLabel lblStudentLRNHighSchoolSM;
	private JLabel lblStudentMotherInformation;
	private JLabel lblStudentNickNameSM;
	private JLabel lblStudentPersonalDetailsSM;
	private JLabel lblStudentPlaceBirthSM;
	private JLabel lblStudentPresentAddressPD;
	private JLabel lblStudentProvinceSM;
	private JLabel lblStudentRecentSchoolAttendedSM;
	private JLabel lblStudentReligionSM;
	private JLabel lblStudentSexSM;
	private JLabel lblStudentStreetAddressSM;
	private JLabel lblStudentSuffixSM;
	private JLabel lblStudentZipCodePD;
	private JLabel lblStudentsFatherInfomation;
	private JLabel lblStudentsMotherInfomation;
	private JLabel lblSuffixPD;
	private JLabel lblUserProfile;
	private JLabel lblWelcomeMessage1;
	private JLabel lblWelcomeMessage2;
	private JLabel lblWelcomeMessage3;
	private JLabel lblYearLevelPI;
	private JPanel contentPane;
	private JPanel navigationPane;
	private JPanel paneAcademicInformation;
	private JPanel paneContentPrimaryInformation;
	private JPanel paneDataPrivacyConsent;
	private JPanel paneEmergencyContactFD;
	private JPanel paneFamilyDetails;
	private JPanel paneFatherFD;
	private JPanel paneGuardianFD;
	private JPanel paneMotherFD;
	private JPanel panePersonalDetails;
	private JPanel panePrimaryInformation;
	private JPanel paneWelcome;
	private JPanel summaryPane;
	private JPanel summaryPanel;
	private JRadioButton rdbtnFatherDeceased;
	private JRadioButton rdbtnFatherLiving;
	private JRadioButton rdbtnMotherDeceased;
	private JRadioButton rdbtnMotherLiving;
	private JRadioButton rdbtnNewRadioButton_1_1;
	private JRadioButton rdbtnNewRadioButton_2_1;
	private JRadioButton rdbtnNewRadioButton_3;
	private JScrollPane paneSummary;
	private JTabbedPane tabbedPaneAdmissionAssistant;
	private JTextField textField;
	private JTextField textFieldCitizenshipPD;
	private JTextField textFieldContactNumberSM;
	private JTextField textFieldDashboardStudentNumber;
	private JTextField textFieldDashboardStudentStatus;
	private JTextField textFieldEmailAddressPI;
	private JTextField textFieldEmergencyContactNumberFD;
	private JTextField textFieldEmergencyContactNumberSM;
	private JTextField textFieldEmergencyFullNameFD;
	private JTextField textFieldEmergencyFullNameSM;
	private JTextField textFieldEmergencyRelationshipFD;
	private JTextField textFieldEmergencyRelationshipSM;
	private JTextField textFieldFatherAgeFD;
	private JTextField textFieldFatherAgeSM;
	private JTextField textFieldFatherCitizenshipFD;
	private JTextField textFieldFatherCitizenshipSM;
	private JTextField textFieldFatherContactNumberFD;
	private JTextField textFieldFatherFullNameFD;
	private JTextField textFieldFatherInformationSM;
	private JTextField textFieldFatherOccupationFD;
	private JTextField textFieldFatherOccupationSM;
	private JTextField textFieldFatherStatusSM;
	private JTextField textFieldFirstNamePI;
	private JTextField textFieldGuardianContactNumberFD;
	private JTextField textFieldGuardianContactNumberSM;
	private JTextField textFieldGuardianFullNameFD;
	private JTextField textFieldGuardianFullNameSM;
	private JTextField textFieldGuardianRelationshipFD;
	private JTextField textFieldGuardianRelationshipSM;
	private JTextField textFieldLRNHighSchoolPD;
	private JTextField textFieldLandlinePD;
	private JTextField textFieldLastNamePI;
	private JTextField textFieldMiddleNamePI;
	private JTextField textFieldMotherAgeFD;
	private JTextField textFieldMotherAgeSM;
	private JTextField textFieldMotherCitizenshipFD;
	private JTextField textFieldMotherCitizenshipSM;
	private JTextField textFieldMotherContactNumberFD;
	private JTextField textFieldMotherContactNumberSM;
	private JTextField textFieldMotherFullNameFD;
	private JTextField textFieldMotherInformationSM;
	private JTextField textFieldMotherOccupationFD;
	private JTextField textFieldMotherOccupationSM;
	private JTextField textFieldMotherStatusSM;
	private JTextField textFieldNickNamePD;
	private JTextField textFieldPlaceOfBirthPD;
	private JTextField textFieldPresentPI;
	private JTextField textFieldRecentSchoolAttendedPD;
	private JTextField textFieldReligionPD;
	private JTextField textFieldSchoolAddressPD;
	private JTextField textFieldSchoolLandlineSM;
	private JTextField textFieldSchoolTypeSM;
	private JTextField textFieldStudentAddressPD;
	private JTextField textFieldStudentApplicationTypeSM;
	private JTextField textFieldStudentBarangayPD;
	private JTextField textFieldStudentBarangaySM;
	private JTextField textFieldStudentBirthdaySM;
	private JTextField textFieldStudentCampusSM;
	private JTextField textFieldStudentCitizenshipSM;
	private JTextField textFieldStudentCityPD;
	private JTextField textFieldStudentCitySM;
	private JTextField textFieldStudentCountrySM;
	private JTextField textFieldStudentEmailAddressSM;
	private JTextField textFieldStudentFirstNameSM;
	private JTextField textFieldStudentGradingPeriodSM;
	private JTextField textFieldStudentIntendedAcademicYearSM;
	private JTextField textFieldStudentLRNHighSchoolSM;
	private JTextField textFieldStudentMiddleNameSM;
	private JTextField textFieldStudentNickNameSM;
	private JTextField textFieldStudentPlaceBirthSM;
	private JTextField textFieldStudentPresentAgeSM;
	private JTextField textFieldStudentProvinceSM;
	private JTextField textFieldStudentRecentSchoolAttendedSM;
	private JTextField textFieldStudentReligionSM;
	private JTextField textFieldStudentSex;
	private JTextField textFieldStudentStreetAddressSM;
	private JTextField textFieldStudentSuffixSM;
	private JTextField textFieldStudentYearSM;
	private JTextField textFieldStudentZipCodePD;
	private JTextField textFieldsStudentCountryPD;
	private JTextField textSchoolAddressSM;
	private JTextField textStudentFieldLastNameSM;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					UIManager.setLookAndFeel(new FlatIntelliJLaf());
					StudentDashboardAdmission frame = new StudentDashboardAdmission();
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
	public StudentDashboardAdmission() {
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

		navigationPane = new JPanel();
		navigationPane.setBounds(0, 0, 220, 548);
		navigationPane.setBackground(new Color(0, 128, 192));
		contentPane.add(navigationPane);
		navigationPane.setLayout(null);

		lblUserProfile = new JLabel("");
		lblUserProfile.setIcon(new ImageIcon("..\\EnrollmentSystem\\img\\user-profile.png"));
		lblUserProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserProfile.setBounds(10, 11, 200, 164);
		navigationPane.add(lblUserProfile);

		btnAdmissionAssistant = new JButton("Admission Assistant");
		btnAdmissionAssistant.setForeground(new Color(0, 0, 0));
		btnAdmissionAssistant.setFont(new Font("Arial", Font.BOLD, 16));
		btnAdmissionAssistant.setBorder(null);
		btnAdmissionAssistant.setBackground(new Color(255, 255, 255));
		btnAdmissionAssistant.setBounds(0, 301, 220, 60);
		navigationPane.add(btnAdmissionAssistant);

		btnDashboard = new JButton("Dashboard");
		btnDashboard.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				StudentDashboardOverview studentDashboardOverviewFrame = new StudentDashboardOverview();
				studentDashboardOverviewFrame.setVisible(true);
			}
		});
		btnDashboard.setForeground(new Color(255, 255, 255));
		btnDashboard.setFont(new Font("Arial", Font.BOLD, 16));
		btnDashboard.setBorder(null);
		btnDashboard.setBackground(new Color(0, 128, 192));
		btnDashboard.setBounds(0, 242, 220, 60);
		navigationPane.add(btnDashboard);

		lblDashboardStudentName = new JLabel("JUAN DELA CRUZ");
		lblDashboardStudentName.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboardStudentName.setForeground(Color.WHITE);
		lblDashboardStudentName.setFont(new Font("Arial", Font.BOLD, 10));
		lblDashboardStudentName.setBounds(10, 186, 200, 26);
		navigationPane.add(lblDashboardStudentName);

		lblDashboardStudentEmaill = new JLabel("juandelacruz@gmail.com");
		lblDashboardStudentEmaill.setHorizontalAlignment(SwingConstants.CENTER);
		lblDashboardStudentEmaill.setForeground(Color.WHITE);
		lblDashboardStudentEmaill.setFont(new Font("Arial", Font.BOLD, 10));
		lblDashboardStudentEmaill.setBounds(10, 208, 200, 26);
		navigationPane.add(lblDashboardStudentEmaill);

		btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(new Color(0, 128, 192));
		btnLogout.setFont(new Font("Arial", Font.PLAIN, 12));
		btnLogout.setBounds(64, 514, 89, 23);
		navigationPane.add(btnLogout);

		tabbedPaneAdmissionAssistant = new JTabbedPane(SwingConstants.TOP);
		tabbedPaneAdmissionAssistant.setBounds(230, 84, 851, 453);
		contentPane.add(tabbedPaneAdmissionAssistant);

		paneWelcome = new JPanel();
		paneWelcome.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Welcome", null, paneWelcome, null);
		paneWelcome.setLayout(null);

		paneDataPrivacyConsent = new JPanel();
		paneDataPrivacyConsent.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Data Privacy", null, paneDataPrivacyConsent, null);
		paneDataPrivacyConsent.setLayout(null);

		lblMessage8 = new JLabel(
				"for school-related procedures and research, ensuring that my identity remains confidential.");
		lblMessage8.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage8.setBounds(45, 187, 708, 14);
		paneDataPrivacyConsent.add(lblMessage8);

		lblMessage7 = new JLabel(
				"any personal and sensitive information I have supplied during the registration and enrollment at TESDA High School");
		lblMessage7.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage7.setBounds(45, 167, 708, 14);
		paneDataPrivacyConsent.add(lblMessage7);

		lblMessage6 = new JLabel(
				"3. Give consent to Tesda High School to gather, utilize, manage, and share, as stipulated by the Data Privacy Act of 2012");
		lblMessage6.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage6.setBounds(45, 147, 708, 14);
		paneDataPrivacyConsent.add(lblMessage6);

		lblMessage5 = new JLabel("information if I choose not to proceed with the application and admission process. ");
		lblMessage5.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage5.setBounds(45, 115, 698, 14);
		paneDataPrivacyConsent.add(lblMessage5);

		lblMessage4 = new JLabel(
				"2. Authorize the school to appropriately dispose of any forms and documents containing my child's personal and confidential");
		lblMessage4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage4.setBounds(45, 95, 708, 14);
		paneDataPrivacyConsent.add(lblMessage4);

		lblMessage3 = new JLabel(
				"1. Grant permission for the school to handle my child's private and confidential data submitted during enrollment and registration.");
		lblMessage3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage3.setBounds(45, 63, 728, 14);
		paneDataPrivacyConsent.add(lblMessage3);

		lblMessage2 = new JLabel(
				"By my child's application to Tesda High School, I am informed, and I give my consent to: ");
		lblMessage2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblMessage2.setBounds(23, 43, 479, 14);
		paneDataPrivacyConsent.add(lblMessage2);

		lblMessage1 = new JLabel("Data Privacy Consent");
		lblMessage1.setFont(new Font("Arial", Font.BOLD, 14));
		lblMessage1.setBounds(10, 11, 201, 14);
		paneDataPrivacyConsent.add(lblMessage1);

		JCheckBox chckbxDataPrivacyConsent = new JCheckBox(
				"please check the box if you agree to the above conditions.");
		chckbxDataPrivacyConsent.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// Check whether data privacy is checked
				if (chckbxDataPrivacyConsent.isSelected()) {
					btnNextDP.setEnabled(true);
				} else {
					for (int index = 2; index < 7; index++) {
						btnNextDP.setEnabled(false);
						tabbedPaneAdmissionAssistant.setEnabledAt(2, false);
					}
				}
			}
		});
		chckbxDataPrivacyConsent.setBackground(new Color(255, 255, 255));
		chckbxDataPrivacyConsent.setFont(new Font("Arial", Font.PLAIN, 12));
		chckbxDataPrivacyConsent.setBounds(23, 221, 451, 23);
		paneDataPrivacyConsent.add(chckbxDataPrivacyConsent);

		btnNextDP = new JButton("NEXT");
		btnNextDP.setEnabled(false);
		btnNextDP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(2, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(panePrimaryInformation);
			}
		});
		btnNextDP.setForeground(Color.BLACK);
		btnNextDP.setFont(new Font("Arial", Font.BOLD, 12));
		btnNextDP.setBackground(Color.YELLOW);
		btnNextDP.setBounds(747, 384, 89, 30);
		paneDataPrivacyConsent.add(btnNextDP);

		btnDataPrivacyBack = new JButton("BACK");
		btnDataPrivacyBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneWelcome);
			}
		});
		btnDataPrivacyBack.setForeground(Color.BLACK);
		btnDataPrivacyBack.setFont(new Font("Arial", Font.BOLD, 12));
		btnDataPrivacyBack.setBackground(Color.YELLOW);
		btnDataPrivacyBack.setBounds(630, 384, 89, 30);
		paneDataPrivacyConsent.add(btnDataPrivacyBack);

		panePrimaryInformation = new JPanel();
		panePrimaryInformation.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Primary Information", null, panePrimaryInformation, null);
		panePrimaryInformation.setLayout(null);

		paneContentPrimaryInformation = new JPanel();
		paneContentPrimaryInformation.setLayout(null);
		paneContentPrimaryInformation.setBackground(Color.WHITE);
		paneContentPrimaryInformation.setBounds(0, 0, 836, 414);
		panePrimaryInformation.add(paneContentPrimaryInformation);

		lblPrimaryInformation = new JLabel("Primary Information");
		lblPrimaryInformation.setFont(new Font("Arial", Font.BOLD, 14));
		lblPrimaryInformation.setBounds(10, 11, 229, 24);
		paneContentPrimaryInformation.add(lblPrimaryInformation);

		lblApplicationTypePI = new JLabel("Application Type");
		lblApplicationTypePI.setFont(new Font("Arial", Font.BOLD, 12));
		lblApplicationTypePI.setBounds(20, 46, 93, 14);
		paneContentPrimaryInformation.add(lblApplicationTypePI);

		ButtonGroup rdbtnGroupPI = new ButtonGroup();

		JRadioButton rdbtnRegularApplicantPI = new JRadioButton("Regular Applicant");
		rdbtnRegularApplicantPI.setSelected(true);
		rdbtnRegularApplicantPI.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnRegularApplicantPI.setBackground(Color.WHITE);
		rdbtnRegularApplicantPI.setBounds(119, 42, 130, 23);
		paneContentPrimaryInformation.add(rdbtnRegularApplicantPI);
		rdbtnGroupPI.add(rdbtnRegularApplicantPI);

		JRadioButton rdbtnInternationalPI = new JRadioButton("International: Different Nationality");
		rdbtnInternationalPI.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnInternationalPI.setBackground(Color.WHITE);
		rdbtnInternationalPI.setBounds(251, 42, 211, 23);
		paneContentPrimaryInformation.add(rdbtnInternationalPI);
		rdbtnGroupPI.add(rdbtnInternationalPI);

		JRadioButton rdbtnTransferPI = new JRadioButton("Transfer: Transferring from Different School");
		rdbtnTransferPI.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnTransferPI.setBackground(Color.WHITE);
		rdbtnTransferPI.setBounds(463, 42, 280, 23);
		paneContentPrimaryInformation.add(rdbtnTransferPI);
		rdbtnGroupPI.add(rdbtnTransferPI);

		lblMiddleNamePI = new JLabel("Middle Name");
		lblMiddleNamePI.setFont(new Font("Arial", Font.BOLD, 12));
		lblMiddleNamePI.setBounds(20, 105, 136, 14);
		paneContentPrimaryInformation.add(lblMiddleNamePI);

		textFieldMiddleNamePI = new JTextField();
		textFieldMiddleNamePI.setEditable(false);
		textFieldMiddleNamePI.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMiddleNamePI.setColumns(10);
		textFieldMiddleNamePI.setBounds(160, 102, 238, 20);
		paneContentPrimaryInformation.add(textFieldMiddleNamePI);

		lblPresentAgePI = new JLabel("Present Age");
		lblPresentAgePI.setFont(new Font("Arial", Font.BOLD, 12));
		lblPresentAgePI.setBounds(20, 198, 136, 14);
		paneContentPrimaryInformation.add(lblPresentAgePI);

		textFieldPresentPI = new JTextField();
		textFieldPresentPI.setEditable(false);
		textFieldPresentPI.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldPresentPI.setColumns(10);
		textFieldPresentPI.setBounds(160, 195, 238, 20);
		paneContentPrimaryInformation.add(textFieldPresentPI);

		lblLastNamePI = new JLabel("Last Name");
		lblLastNamePI.setFont(new Font("Arial", Font.BOLD, 12));
		lblLastNamePI.setBounds(20, 136, 136, 14);
		paneContentPrimaryInformation.add(lblLastNamePI);

		textFieldLastNamePI = new JTextField();
		textFieldLastNamePI.setEditable(false);
		textFieldLastNamePI.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldLastNamePI.setColumns(10);
		textFieldLastNamePI.setBounds(160, 133, 238, 20);
		paneContentPrimaryInformation.add(textFieldLastNamePI);

		lblBirthdayPI = new JLabel("Birthday");
		lblBirthdayPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblBirthdayPI.setBounds(20, 167, 136, 14);
		paneContentPrimaryInformation.add(lblBirthdayPI);

		lblFirstNamePI = new JLabel("First Name");
		lblFirstNamePI.setFont(new Font("Arial", Font.BOLD, 12));
		lblFirstNamePI.setBounds(20, 74, 136, 14);
		paneContentPrimaryInformation.add(lblFirstNamePI);

		textFieldFirstNamePI = new JTextField();
		textFieldFirstNamePI.setEditable(false);
		textFieldFirstNamePI.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFirstNamePI.setColumns(10);
		textFieldFirstNamePI.setBounds(160, 71, 238, 20);
		paneContentPrimaryInformation.add(textFieldFirstNamePI);

		lblGradingPeriodPI = new JLabel("Grading Period");
		lblGradingPeriodPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblGradingPeriodPI.setBounds(436, 105, 136, 14);
		paneContentPrimaryInformation.add(lblGradingPeriodPI);

		lblCampusPI = new JLabel("Campus");
		lblCampusPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblCampusPI.setBounds(436, 136, 136, 14);
		paneContentPrimaryInformation.add(lblCampusPI);

		lblYearLevelPI = new JLabel("Year Level");
		lblYearLevelPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblYearLevelPI.setBounds(436, 167, 136, 14);
		paneContentPrimaryInformation.add(lblYearLevelPI);

		lblIntendedAcademicYearPI = new JLabel("Intended Academic Year");
		lblIntendedAcademicYearPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblIntendedAcademicYearPI.setBounds(436, 74, 138, 14);
		paneContentPrimaryInformation.add(lblIntendedAcademicYearPI);

		comboBoxGradingPeriodPI = new JComboBox();
		comboBoxGradingPeriodPI
				.setModel(new DefaultComboBoxModel(new String[] { "Quarter 1 (SHS)", "Quarter 2 (SHS)" }));
		comboBoxGradingPeriodPI.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxGradingPeriodPI.setBounds(578, 102, 238, 20);
		paneContentPrimaryInformation.add(comboBoxGradingPeriodPI);

		comboBoxIntendedAcademicYearPI = new JComboBox();
		comboBoxIntendedAcademicYearPI.setModel(new DefaultComboBoxModel(new String[] { "2024-2025", "2025-2026" }));
		comboBoxIntendedAcademicYearPI.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxIntendedAcademicYearPI.setBounds(578, 71, 238, 20);
		paneContentPrimaryInformation.add(comboBoxIntendedAcademicYearPI);

		comboBoxCampusPI = new JComboBox();
		comboBoxCampusPI.setModel(
				new DefaultComboBoxModel(new String[] { "Makati - Tesda High School", "Manila - Tesda High School" }));
		comboBoxCampusPI.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxCampusPI.setBounds(578, 133, 238, 20);
		paneContentPrimaryInformation.add(comboBoxCampusPI);

		comboBoxYearLevelPI = new JComboBox();
		comboBoxYearLevelPI.setModel(new DefaultComboBoxModel(new String[] { "Grade 11", "Grade 12" }));
		comboBoxYearLevelPI.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBoxYearLevelPI.setBounds(578, 164, 238, 20);
		paneContentPrimaryInformation.add(comboBoxYearLevelPI);

		lblEmailAddressPI = new JLabel("Email Address");
		lblEmailAddressPI.setFont(new Font("Arial", Font.BOLD, 12));
		lblEmailAddressPI.setBounds(20, 229, 136, 14);
		paneContentPrimaryInformation.add(lblEmailAddressPI);

		textFieldEmailAddressPI = new JTextField();
		textFieldEmailAddressPI.setEditable(false);
		textFieldEmailAddressPI.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldEmailAddressPI.setColumns(10);
		textFieldEmailAddressPI.setBounds(160, 226, 238, 20);
		paneContentPrimaryInformation.add(textFieldEmailAddressPI);

		btnBackPI = new JButton("BACK");
		btnBackPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneDataPrivacyConsent);
				btnNextDP.setEnabled(true);
			}
		});
		btnBackPI.setForeground(Color.BLACK);
		btnBackPI.setFont(new Font("Arial", Font.BOLD, 12));
		btnBackPI.setBackground(Color.YELLOW);
		btnBackPI.setBounds(630, 384, 89, 30);
		paneContentPrimaryInformation.add(btnBackPI);

		btnNextPI = new JButton("NEXT");
		btnNextPI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(3, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(panePersonalDetails);
			}
		});
		btnNextPI.setForeground(Color.BLACK);
		btnNextPI.setFont(new Font("Arial", Font.BOLD, 12));
		btnNextPI.setBackground(Color.YELLOW);
		btnNextPI.setBounds(747, 384, 89, 30);
		paneContentPrimaryInformation.add(btnNextPI);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBounds(160, 164, 238, 20);
		paneContentPrimaryInformation.add(textField);

		lblWelcomeMessage3 = new JLabel(
				"However, we'd love for you to consider joining us - simply submit an application to get started!");
		lblWelcomeMessage3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWelcomeMessage3.setBounds(10, 81, 806, 24);
		paneWelcome.add(lblWelcomeMessage3);

		lblWelcomeMessage2 = new JLabel("We noticed that you're not yet a student at our school.");
		lblWelcomeMessage2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWelcomeMessage2.setBounds(10, 46, 621, 24);
		paneWelcome.add(lblWelcomeMessage2);

		lblWelcomeMessage1 = new JLabel("Warm greetings!");
		lblWelcomeMessage1.setFont(new Font("Arial", Font.PLAIN, 12));
		lblWelcomeMessage1.setBounds(10, 11, 229, 24);
		paneWelcome.add(lblWelcomeMessage1);

		btnWelcomeNext = new JButton("NEXT");
		btnWelcomeNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(1, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneDataPrivacyConsent);
			}
		});
		btnWelcomeNext.setForeground(Color.BLACK);
		btnWelcomeNext.setFont(new Font("Arial", Font.BOLD, 12));
		btnWelcomeNext.setBackground(Color.YELLOW);
		btnWelcomeNext.setBounds(747, 384, 89, 30);
		paneWelcome.add(btnWelcomeNext);

		panePersonalDetails = new JPanel();
		panePersonalDetails.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Personal Details", null, panePersonalDetails, null);
		panePersonalDetails.setLayout(null);

		lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Arial", Font.BOLD, 14));
		lblPersonalDetails.setBounds(10, 11, 502, 20);
		panePersonalDetails.add(lblPersonalDetails);

		lblSuffixPD = new JLabel("Suffix");
		lblSuffixPD.setBounds(20, 42, 70, 14);
		panePersonalDetails.add(lblSuffixPD);

		lblNickNamePD = new JLabel("Nickname");
		lblNickNamePD.setBounds(20, 67, 70, 14);
		panePersonalDetails.add(lblNickNamePD);

		lblPlaceOfBirthPD = new JLabel("Place of Birth");
		lblPlaceOfBirthPD.setBounds(20, 92, 70, 14);
		panePersonalDetails.add(lblPlaceOfBirthPD);

		lblCitizenshipPD = new JLabel("Citizenship");
		lblCitizenshipPD.setBounds(20, 117, 70, 14);
		panePersonalDetails.add(lblCitizenshipPD);

		textFieldNickNamePD = new JTextField();
		textFieldNickNamePD.setColumns(10);
		textFieldNickNamePD.setBounds(100, 67, 304, 20);
		panePersonalDetails.add(textFieldNickNamePD);

		textFieldPlaceOfBirthPD = new JTextField();
		textFieldPlaceOfBirthPD.setColumns(10);
		textFieldPlaceOfBirthPD.setBounds(100, 92, 304, 20);
		panePersonalDetails.add(textFieldPlaceOfBirthPD);

		textFieldCitizenshipPD = new JTextField();
		textFieldCitizenshipPD.setColumns(10);
		textFieldCitizenshipPD.setBounds(100, 117, 304, 20);
		panePersonalDetails.add(textFieldCitizenshipPD);

		lblSexPD = new JLabel("Sex");
		lblSexPD.setBounds(414, 45, 90, 14);
		panePersonalDetails.add(lblSexPD);

		lblReligionPD = new JLabel("Religion");
		lblReligionPD.setBounds(414, 76, 90, 14);
		panePersonalDetails.add(lblReligionPD);

		lblLRNHighSchoolPD = new JLabel("LRN High School");
		lblLRNHighSchoolPD.setBounds(414, 100, 90, 14);
		panePersonalDetails.add(lblLRNHighSchoolPD);

		textFieldLRNHighSchoolPD = new JTextField();
		textFieldLRNHighSchoolPD.setColumns(10);
		textFieldLRNHighSchoolPD.setBounds(514, 100, 166, 20);
		panePersonalDetails.add(textFieldLRNHighSchoolPD);

		textFieldReligionPD = new JTextField();
		textFieldReligionPD.setColumns(10);
		textFieldReligionPD.setBounds(514, 72, 166, 20);
		panePersonalDetails.add(textFieldReligionPD);

		comboBoxGenderPD = new JComboBox();
		comboBoxGenderPD.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		comboBoxGenderPD.setBounds(514, 40, 166, 22);
		panePersonalDetails.add(comboBoxGenderPD);

		lblEducationBackgroundPD = new JLabel("Education Background");
		lblEducationBackgroundPD.setFont(new Font("Arial", Font.BOLD, 14));
		lblEducationBackgroundPD.setBounds(10, 148, 502, 20);
		panePersonalDetails.add(lblEducationBackgroundPD);

		lblRecentSchoolAttendedPD = new JLabel("Recent School Attended");
		lblRecentSchoolAttendedPD.setBounds(20, 179, 129, 14);
		panePersonalDetails.add(lblRecentSchoolAttendedPD);

		textFieldRecentSchoolAttendedPD = new JTextField();
		textFieldRecentSchoolAttendedPD.setColumns(10);
		textFieldRecentSchoolAttendedPD.setBounds(154, 176, 248, 20);
		panePersonalDetails.add(textFieldRecentSchoolAttendedPD);

		lblSchoolTypePD = new JLabel("School Type");
		lblSchoolTypePD.setBounds(20, 204, 129, 14);
		panePersonalDetails.add(lblSchoolTypePD);

		textFieldSchoolAddressPD = new JTextField();
		textFieldSchoolAddressPD.setColumns(10);
		textFieldSchoolAddressPD.setBounds(514, 200, 166, 20);
		panePersonalDetails.add(textFieldSchoolAddressPD);

		textFieldLandlinePD = new JTextField();
		textFieldLandlinePD.setColumns(10);
		textFieldLandlinePD.setBounds(514, 176, 166, 20);
		panePersonalDetails.add(textFieldLandlinePD);

		lblLandlinePD = new JLabel("Landline No.");
		lblLandlinePD.setBounds(414, 179, 70, 14);
		panePersonalDetails.add(lblLandlinePD);

		lblSchoolAddressPD = new JLabel("Address of School");
		lblSchoolAddressPD.setBounds(412, 204, 100, 14);
		panePersonalDetails.add(lblSchoolAddressPD);

		lblStudentPresentAddressPD = new JLabel("Student Present Address");
		lblStudentPresentAddressPD.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentPresentAddressPD.setBounds(10, 235, 502, 20);
		panePersonalDetails.add(lblStudentPresentAddressPD);

		lblStudentAddressPD = new JLabel("House No. / Street Address");
		lblStudentAddressPD.setBounds(20, 266, 166, 14);
		panePersonalDetails.add(lblStudentAddressPD);

		lblStudentBarangayPD = new JLabel("Barangay");
		lblStudentBarangayPD.setBounds(20, 291, 70, 14);
		panePersonalDetails.add(lblStudentBarangayPD);

		lblStudentCityPD = new JLabel("City");
		lblStudentCityPD.setBounds(20, 316, 70, 14);
		panePersonalDetails.add(lblStudentCityPD);

		lblStudentCountryPD = new JLabel("Country");
		lblStudentCountryPD.setBounds(414, 319, 70, 14);
		panePersonalDetails.add(lblStudentCountryPD);

		textFieldsStudentCountryPD = new JTextField();
		textFieldsStudentCountryPD.setColumns(10);
		textFieldsStudentCountryPD.setBounds(515, 316, 165, 20);
		panePersonalDetails.add(textFieldsStudentCountryPD);

		textFieldStudentCityPD = new JTextField();
		textFieldStudentCityPD.setColumns(10);
		textFieldStudentCityPD.setBounds(196, 316, 208, 20);
		panePersonalDetails.add(textFieldStudentCityPD);

		textFieldStudentBarangayPD = new JTextField();
		textFieldStudentBarangayPD.setColumns(10);
		textFieldStudentBarangayPD.setBounds(196, 291, 208, 20);
		panePersonalDetails.add(textFieldStudentBarangayPD);

		textFieldStudentAddressPD = new JTextField();
		textFieldStudentAddressPD.setColumns(10);
		textFieldStudentAddressPD.setBounds(196, 266, 484, 20);
		panePersonalDetails.add(textFieldStudentAddressPD);

		comboBoxSchoolTypePD = new JComboBox();
		comboBoxSchoolTypePD.setModel(new DefaultComboBoxModel(new String[] { "Public", "Private" }));
		comboBoxSchoolTypePD.setBounds(154, 200, 248, 22);
		panePersonalDetails.add(comboBoxSchoolTypePD);

		btnNextPD = new JButton("NEXT");
		btnNextPD.setEnabled(false);
		btnNextPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(4, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneFamilyDetails);
			}
		});
		btnNextPD.setForeground(Color.BLACK);
		btnNextPD.setFont(new Font("Arial", Font.BOLD, 12));
		btnNextPD.setBackground(Color.YELLOW);
		btnNextPD.setBounds(747, 384, 89, 30);
		panePersonalDetails.add(btnNextPD);

		btnBackPD = new JButton("BACK");
		btnBackPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(panePrimaryInformation);
			}
		});
		btnBackPD.setForeground(Color.BLACK);
		btnBackPD.setFont(new Font("Arial", Font.BOLD, 12));
		btnBackPD.setBackground(Color.YELLOW);
		btnBackPD.setBounds(630, 384, 89, 30);
		panePersonalDetails.add(btnBackPD);

		JComboBox comboBoxSuffixPD = new JComboBox();
		comboBoxSuffixPD.setModel(new DefaultComboBoxModel(new String[] { "", "Jr.", "II", "III", "Sr." }));
		comboBoxSuffixPD.setBounds(100, 38, 304, 22);
		panePersonalDetails.add(comboBoxSuffixPD);

		lblStudentZipCodePD = new JLabel("Zip Code");
		lblStudentZipCodePD.setBounds(414, 294, 70, 14);
		panePersonalDetails.add(lblStudentZipCodePD);

		textFieldStudentZipCodePD = new JTextField();
		textFieldStudentZipCodePD.setColumns(10);
		textFieldStudentZipCodePD.setBounds(514, 291, 166, 20);
		panePersonalDetails.add(textFieldStudentZipCodePD);

		paneFamilyDetails = new JPanel();
		paneFamilyDetails.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Family Details", null, paneFamilyDetails, null);
		paneFamilyDetails.setLayout(null);

		JTabbedPane tabbedPaneContentFamilyDetails = new JTabbedPane(SwingConstants.LEFT);
		tabbedPaneContentFamilyDetails.setBounds(10, 11, 826, 362);
		paneFamilyDetails.add(tabbedPaneContentFamilyDetails);

		paneMotherFD = new JPanel();
		tabbedPaneContentFamilyDetails.addTab("Mother", null, paneMotherFD, null);
		paneMotherFD.setLayout(null);

		lblStudentsMotherInfomation = new JLabel("Student's Mother Infomation");
		lblStudentsMotherInfomation.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentsMotherInfomation.setBounds(10, 11, 376, 14);
		paneMotherFD.add(lblStudentsMotherInfomation);

		lblMotherFullnameFD = new JLabel("Full Name");
		lblMotherFullnameFD.setBounds(20, 39, 80, 14);
		paneMotherFD.add(lblMotherFullnameFD);

		textFieldMotherFullNameFD = new JTextField();
		textFieldMotherFullNameFD.setColumns(10);
		textFieldMotherFullNameFD.setBounds(127, 37, 259, 20);
		paneMotherFD.add(textFieldMotherFullNameFD);

		lblMotherAgeFD = new JLabel("Age");
		lblMotherAgeFD.setBounds(20, 67, 80, 15);
		paneMotherFD.add(lblMotherAgeFD);

		textFieldMotherAgeFD = new JTextField();
		textFieldMotherAgeFD.setColumns(10);
		textFieldMotherAgeFD.setBounds(127, 65, 259, 20);
		paneMotherFD.add(textFieldMotherAgeFD);

		lblMotherOccupationFD = new JLabel("Occupation");
		lblMotherOccupationFD.setBounds(20, 95, 80, 14);
		paneMotherFD.add(lblMotherOccupationFD);

		textFieldMotherOccupationFD = new JTextField();
		textFieldMotherOccupationFD.setColumns(10);
		textFieldMotherOccupationFD.setBounds(127, 93, 259, 20);
		paneMotherFD.add(textFieldMotherOccupationFD);

		lblMotherCitizenshipFD = new JLabel("Citizenship");
		lblMotherCitizenshipFD.setBounds(20, 123, 80, 14);
		paneMotherFD.add(lblMotherCitizenshipFD);

		textFieldMotherCitizenshipFD = new JTextField();
		textFieldMotherCitizenshipFD.setColumns(10);
		textFieldMotherCitizenshipFD.setBounds(127, 121, 259, 20);
		paneMotherFD.add(textFieldMotherCitizenshipFD);

		textFieldMotherContactNumberFD = new JTextField();
		textFieldMotherContactNumberFD.setColumns(10);
		textFieldMotherContactNumberFD.setBounds(127, 149, 259, 20);
		paneMotherFD.add(textFieldMotherContactNumberFD);

		lblMotherContactNumberFD = new JLabel("Contact Number");
		lblMotherContactNumberFD.setBounds(20, 151, 109, 14);
		paneMotherFD.add(lblMotherContactNumberFD);

		lblMotherStatusFD = new JLabel("Status");
		lblMotherStatusFD.setBounds(20, 179, 80, 14);
		paneMotherFD.add(lblMotherStatusFD);

		ButtonGroup btnGroupMotherStatus = new ButtonGroup();

		rdbtnMotherDeceased = new JRadioButton("Deceased");
		rdbtnMotherDeceased.setBackground(new Color(240, 240, 240));
		rdbtnMotherDeceased.setBounds(201, 176, 109, 23);
		paneMotherFD.add(rdbtnMotherDeceased);
		btnGroupMotherStatus.add(rdbtnMotherDeceased);

		rdbtnMotherLiving = new JRadioButton("Living");
		rdbtnMotherLiving.setSelected(true);
		rdbtnMotherLiving.setBackground(new Color(240, 240, 240));
		rdbtnMotherLiving.setBounds(127, 176, 72, 23);
		paneMotherFD.add(rdbtnMotherLiving);
		btnGroupMotherStatus.add(rdbtnMotherLiving);

		paneFatherFD = new JPanel();
		tabbedPaneContentFamilyDetails.addTab("Father", null, paneFatherFD, null);
		paneFatherFD.setLayout(null);

		lblStudentsFatherInfomation = new JLabel("Student's Father Infomation");
		lblStudentsFatherInfomation.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentsFatherInfomation.setBounds(10, 11, 376, 14);
		paneFatherFD.add(lblStudentsFatherInfomation);

		lblFatherFullnameFD = new JLabel("Full Name");
		lblFatherFullnameFD.setBounds(20, 39, 80, 14);
		paneFatherFD.add(lblFatherFullnameFD);

		textFieldFatherFullNameFD = new JTextField();
		textFieldFatherFullNameFD.setColumns(10);
		textFieldFatherFullNameFD.setBounds(127, 37, 259, 20);
		paneFatherFD.add(textFieldFatherFullNameFD);

		lblFatherAgeFD = new JLabel("Age");
		lblFatherAgeFD.setBounds(20, 67, 80, 15);
		paneFatherFD.add(lblFatherAgeFD);

		textFieldFatherAgeFD = new JTextField();
		textFieldFatherAgeFD.setColumns(10);
		textFieldFatherAgeFD.setBounds(127, 65, 259, 20);
		paneFatherFD.add(textFieldFatherAgeFD);

		lblFatherOccupationFD = new JLabel("Occupation");
		lblFatherOccupationFD.setBounds(20, 95, 80, 14);
		paneFatherFD.add(lblFatherOccupationFD);

		textFieldFatherOccupationFD = new JTextField();
		textFieldFatherOccupationFD.setColumns(10);
		textFieldFatherOccupationFD.setBounds(127, 93, 259, 20);
		paneFatherFD.add(textFieldFatherOccupationFD);

		lblFatherCitizenshipFD = new JLabel("Citizenship");
		lblFatherCitizenshipFD.setBounds(20, 123, 80, 14);
		paneFatherFD.add(lblFatherCitizenshipFD);

		textFieldFatherCitizenshipFD = new JTextField();
		textFieldFatherCitizenshipFD.setColumns(10);
		textFieldFatherCitizenshipFD.setBounds(127, 121, 259, 20);
		paneFatherFD.add(textFieldFatherCitizenshipFD);

		textFieldFatherContactNumberFD = new JTextField();
		textFieldFatherContactNumberFD.setColumns(10);
		textFieldFatherContactNumberFD.setBounds(127, 149, 259, 20);
		paneFatherFD.add(textFieldFatherContactNumberFD);

		lblFatherContactNumber = new JLabel("Contact Number");
		lblFatherContactNumber.setBounds(20, 151, 91, 14);
		paneFatherFD.add(lblFatherContactNumber);

		lblFatherStatusFD = new JLabel("Status");
		lblFatherStatusFD.setBounds(20, 179, 80, 14);
		paneFatherFD.add(lblFatherStatusFD);

		ButtonGroup btnGroupFatherStatus = new ButtonGroup();

		rdbtnFatherLiving = new JRadioButton("Living");
		rdbtnFatherLiving.setSelected(true);
		rdbtnFatherLiving.setBackground(new Color(240, 240, 240));
		rdbtnFatherLiving.setBounds(127, 176, 72, 23);
		paneFatherFD.add(rdbtnFatherLiving);
		btnGroupFatherStatus.add(rdbtnFatherLiving);

		rdbtnFatherDeceased = new JRadioButton("Deceased");
		rdbtnFatherDeceased.setBackground(new Color(240, 240, 240));
		rdbtnFatherDeceased.setBounds(201, 176, 109, 23);
		paneFatherFD.add(rdbtnFatherDeceased);
		btnGroupFatherStatus.add(rdbtnFatherDeceased);

		paneGuardianFD = new JPanel();
		tabbedPaneContentFamilyDetails.addTab("Guardian", null, paneGuardianFD, null);
		paneGuardianFD.setLayout(null);

		lblStudentGuardianInformationFD = new JLabel("Student's Guardian Infomation");
		lblStudentGuardianInformationFD.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentGuardianInformationFD.setBounds(10, 11, 376, 14);
		paneGuardianFD.add(lblStudentGuardianInformationFD);

		lblGuardianFullNameFD = new JLabel("Full Name");
		lblGuardianFullNameFD.setBounds(20, 39, 80, 14);
		paneGuardianFD.add(lblGuardianFullNameFD);

		textFieldGuardianFullNameFD = new JTextField();
		textFieldGuardianFullNameFD.setColumns(10);
		textFieldGuardianFullNameFD.setBounds(147, 36, 259, 20);
		paneGuardianFD.add(textFieldGuardianFullNameFD);

		lblGuardianRelationshipFD = new JLabel("Relationship to Student");
		lblGuardianRelationshipFD.setBounds(20, 67, 129, 15);
		paneGuardianFD.add(lblGuardianRelationshipFD);

		textFieldGuardianRelationshipFD = new JTextField();
		textFieldGuardianRelationshipFD.setColumns(10);
		textFieldGuardianRelationshipFD.setBounds(147, 64, 259, 20);
		paneGuardianFD.add(textFieldGuardianRelationshipFD);

		lblGuardianContactNumberFD = new JLabel("Contact Number");
		lblGuardianContactNumberFD.setBounds(20, 95, 117, 14);
		paneGuardianFD.add(lblGuardianContactNumberFD);

		textFieldGuardianContactNumberFD = new JTextField();
		textFieldGuardianContactNumberFD.setColumns(10);
		textFieldGuardianContactNumberFD.setBounds(147, 92, 259, 20);
		paneGuardianFD.add(textFieldGuardianContactNumberFD);

		paneEmergencyContactFD = new JPanel();
		tabbedPaneContentFamilyDetails.addTab("Emergency Contact", null, paneEmergencyContactFD, null);
		paneEmergencyContactFD.setLayout(null);

		lblStudentEmergencyInformationFD = new JLabel("Emergency Contact Infomation");
		lblStudentEmergencyInformationFD.setFont(new Font("Arial", Font.BOLD, 14));
		lblStudentEmergencyInformationFD.setBounds(10, 11, 376, 17);
		paneEmergencyContactFD.add(lblStudentEmergencyInformationFD);

		lblEmergencyFullNameFD = new JLabel("Full Name");
		lblEmergencyFullNameFD.setBounds(20, 39, 80, 14);
		paneEmergencyContactFD.add(lblEmergencyFullNameFD);

		textFieldEmergencyFullNameFD = new JTextField();
		textFieldEmergencyFullNameFD.setColumns(10);
		textFieldEmergencyFullNameFD.setBounds(147, 36, 259, 20);
		paneEmergencyContactFD.add(textFieldEmergencyFullNameFD);

		lblEmergencyRelationshipFD = new JLabel("Relationship to Student");
		lblEmergencyRelationshipFD.setBounds(20, 67, 129, 15);
		paneEmergencyContactFD.add(lblEmergencyRelationshipFD);

		textFieldEmergencyRelationshipFD = new JTextField();
		textFieldEmergencyRelationshipFD.setColumns(10);
		textFieldEmergencyRelationshipFD.setBounds(147, 64, 259, 20);
		paneEmergencyContactFD.add(textFieldEmergencyRelationshipFD);

		lblEmergencyContactNumberFD = new JLabel("Contact Number");
		lblEmergencyContactNumberFD.setBounds(20, 95, 117, 14);
		paneEmergencyContactFD.add(lblEmergencyContactNumberFD);

		textFieldEmergencyContactNumberFD = new JTextField();
		textFieldEmergencyContactNumberFD.setColumns(10);
		textFieldEmergencyContactNumberFD.setBounds(147, 92, 259, 20);
		paneEmergencyContactFD.add(textFieldEmergencyContactNumberFD);

		btnBackFD = new JButton("BACK");
		btnBackFD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(panePersonalDetails);
			}
		});
		btnBackFD.setForeground(Color.BLACK);
		btnBackFD.setFont(new Font("Arial", Font.BOLD, 12));
		btnBackFD.setBackground(Color.YELLOW);
		btnBackFD.setBounds(630, 384, 89, 30);
		paneFamilyDetails.add(btnBackFD);

		btnNextFD = new JButton("NEXT");
		btnNextFD.setEnabled(false);
		btnNextFD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(5, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneAcademicInformation);
			}
		});
		btnNextFD.setForeground(Color.BLACK);
		btnNextFD.setFont(new Font("Arial", Font.BOLD, 12));
		btnNextFD.setBackground(Color.YELLOW);
		btnNextFD.setBounds(747, 384, 89, 30);
		paneFamilyDetails.add(btnNextFD);

		paneAcademicInformation = new JPanel();
		paneAcademicInformation.setBackground(new Color(255, 255, 255));
		tabbedPaneAdmissionAssistant.addTab("Academic Information", null, paneAcademicInformation, null);
		paneAcademicInformation.setLayout(null);

		lblAcademicInformation = new JLabel("Academic Information (OPTIONAL)");
		lblAcademicInformation.setFont(new Font("Arial", Font.BOLD, 14));
		lblAcademicInformation.setBounds(10, 11, 502, 20);
		paneAcademicInformation.add(lblAcademicInformation);

		JPanel paneChooseFileAI = new JPanel();
		paneChooseFileAI.setBackground(new Color(240, 240, 240));
		paneChooseFileAI.setBounds(10, 293, 826, 45);
		paneAcademicInformation.add(paneChooseFileAI);
		paneChooseFileAI.setLayout(null);

		JLabel lblFileAI = new JLabel("No file chosen");
		lblFileAI.setBounds(134, 15, 682, 14);
		paneChooseFileAI.add(lblFileAI);

		JButton btnFileAI = new JButton("Choose File");
		btnFileAI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFileAI.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						JFileChooser fileChooser = new JFileChooser();
						fileChooser.setMultiSelectionEnabled(true);

						FileNameExtensionFilter textFilter = new FileNameExtensionFilter("Text Files", "txt");
						FileNameExtensionFilter imageFilter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg",
								"png", "gif");
						FileNameExtensionFilter documentFilter = new FileNameExtensionFilter("Document Files", "pdf",
								"doc", "docx");

						fileChooser.setFileFilter(textFilter);
						fileChooser.setFileFilter(imageFilter);
						fileChooser.setFileFilter(documentFilter);

						int returnValue = fileChooser.showOpenDialog(null);

						if (returnValue == JFileChooser.APPROVE_OPTION) {
							String selectedFiles = "";
							for (java.io.File file : fileChooser.getSelectedFiles()) {
								selectedFiles += "" + file.getName() + ", ";
							}
							lblFileAI.setText(selectedFiles);
						} else {
							lblFileAI.setText("No files selected.");
						}
					}
				});
			}
		});
		btnFileAI.setBounds(10, 11, 114, 23);
		paneChooseFileAI.add(btnFileAI);

		btnNextAI = new JButton("NEXT");
		btnNextAI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setEnabledAt(6, true);
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneSummary);
			}
		});
		btnNextAI.setForeground(Color.BLACK);
		btnNextAI.setFont(new Font("Arial", Font.BOLD, 12));
		btnNextAI.setBackground(Color.YELLOW);
		btnNextAI.setBounds(747, 384, 89, 30);
		paneAcademicInformation.add(btnNextAI);

		JButton btnBackAI = new JButton("BACK");
		btnBackAI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneFamilyDetails);
			}
		});
		btnBackAI.setForeground(Color.BLACK);
		btnBackAI.setFont(new Font("Arial", Font.BOLD, 12));
		btnBackAI.setBackground(Color.YELLOW);
		btnBackAI.setBounds(630, 384, 89, 30);
		paneAcademicInformation.add(btnBackAI);

		JPanel paneGuidelineAI = new JPanel();
		paneGuidelineAI.setBounds(10, 42, 826, 240);
		paneAcademicInformation.add(paneGuidelineAI);
		paneGuidelineAI.setLayout(null);

		lblRegularGuidelineAI = new JLabel("");
		lblRegularGuidelineAI
				.setIcon(new ImageIcon("..\\EnrollmentSystem\\img\\academic-information-admission-guidelines-1.png"));
		lblRegularGuidelineAI.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegularGuidelineAI.setBounds(10, 11, 252, 218);
		paneGuidelineAI.add(lblRegularGuidelineAI);

		lblForeignTransferAI = new JLabel("");
		lblForeignTransferAI
				.setIcon(new ImageIcon("..\\EnrollmentSystem\\img\\academic-information-admission-guidelines-3.png"));
		lblForeignTransferAI.setHorizontalAlignment(SwingConstants.CENTER);
		lblForeignTransferAI.setBounds(564, 11, 252, 218);
		paneGuidelineAI.add(lblForeignTransferAI);

		lblForeignGuidelineAI = new JLabel("");
		lblForeignGuidelineAI
				.setIcon(new ImageIcon("..\\EnrollmentSystem\\img\\academic-information-admission-guidelines-2.png"));
		lblForeignGuidelineAI.setHorizontalAlignment(SwingConstants.CENTER);
		lblForeignGuidelineAI.setBounds(290, 11, 252, 218);
		paneGuidelineAI.add(lblForeignGuidelineAI);

		paneSummary = new JScrollPane();
		paneSummary.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		paneSummary.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		tabbedPaneAdmissionAssistant.addTab("Summary", null, paneSummary, null);

		JPanel summaryGridBagPane = new JPanel();
		summaryGridBagPane.setBackground(new Color(255, 255, 255));
		paneSummary.setViewportView(summaryGridBagPane);
		GridBagLayout gbl_summaryGridBagPane = new GridBagLayout();
		gbl_summaryGridBagPane.columnWidths = new int[] { 0, 0, 150, 0, 0, 150, 0, 0 };
		gbl_summaryGridBagPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_summaryGridBagPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_summaryGridBagPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		summaryGridBagPane.setLayout(gbl_summaryGridBagPane);

		lblBlank1SM = new JLabel("BLANK");
		lblBlank1SM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBlank1SM.setForeground(new Color(255, 255, 255));
		GridBagConstraints gbc_lblBlank1SM = new GridBagConstraints();
		gbc_lblBlank1SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank1SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank1SM.gridx = 0;
		gbc_lblBlank1SM.gridy = 0;
		summaryGridBagPane.add(lblBlank1SM, gbc_lblBlank1SM);

		lblBlank2SM = new JLabel("BLANK");
		lblBlank2SM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBlank2SM.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblBlank2SM = new GridBagConstraints();
		gbc_lblBlank2SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank2SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank2SM.gridx = 3;
		gbc_lblBlank2SM.gridy = 0;
		summaryGridBagPane.add(lblBlank2SM, gbc_lblBlank2SM);

		lblBlank3SM = new JLabel("BLANK");
		lblBlank3SM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBlank3SM.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblBlank3SM = new GridBagConstraints();
		gbc_lblBlank3SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank3SM.insets = new Insets(0, 0, 5, 0);
		gbc_lblBlank3SM.gridx = 6;
		gbc_lblBlank3SM.gridy = 0;
		summaryGridBagPane.add(lblBlank3SM, gbc_lblBlank3SM);

		JLabel lblStudentPrimaryInfoSM = new JLabel("Primary Information");
		lblStudentPrimaryInfoSM.setForeground(new Color(0, 128, 255));
		lblStudentPrimaryInfoSM.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentPrimaryInfoSM = new GridBagConstraints();
		gbc_lblStudentPrimaryInfoSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentPrimaryInfoSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPrimaryInfoSM.gridx = 1;
		gbc_lblStudentPrimaryInfoSM.gridy = 1;
		summaryGridBagPane.add(lblStudentPrimaryInfoSM, gbc_lblStudentPrimaryInfoSM);

		lblStudentPersonalDetailsSM = new JLabel("Personal Details");
		lblStudentPersonalDetailsSM.setForeground(new Color(0, 128, 255));
		lblStudentPersonalDetailsSM.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentPersonalDetailsSM = new GridBagConstraints();
		gbc_lblStudentPersonalDetailsSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentPersonalDetailsSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPersonalDetailsSM.gridx = 4;
		gbc_lblStudentPersonalDetailsSM.gridy = 1;
		summaryGridBagPane.add(lblStudentPersonalDetailsSM, gbc_lblStudentPersonalDetailsSM);

		JLabel lblStudentApplicationTypeSM = new JLabel("Application Type");
		lblStudentApplicationTypeSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentApplicationTypeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentApplicationTypeSM = new GridBagConstraints();
		gbc_lblStudentApplicationTypeSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentApplicationTypeSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentApplicationTypeSM.gridx = 1;
		gbc_lblStudentApplicationTypeSM.gridy = 2;
		summaryGridBagPane.add(lblStudentApplicationTypeSM, gbc_lblStudentApplicationTypeSM);

		textFieldStudentApplicationTypeSM = new JTextField();
		textFieldStudentApplicationTypeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentApplicationTypeSM.setEditable(false);
		GridBagConstraints gbc_textFieldStudentApplicationTypeSM = new GridBagConstraints();
		gbc_textFieldStudentApplicationTypeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentApplicationTypeSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentApplicationTypeSM.gridx = 2;
		gbc_textFieldStudentApplicationTypeSM.gridy = 2;
		summaryGridBagPane.add(textFieldStudentApplicationTypeSM, gbc_textFieldStudentApplicationTypeSM);
		textFieldStudentApplicationTypeSM.setColumns(10);

		lblStudentSuffixSM = new JLabel("Suffix");
		lblStudentSuffixSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSuffixSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSuffixSM = new GridBagConstraints();
		gbc_lblStudentSuffixSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentSuffixSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSuffixSM.gridx = 4;
		gbc_lblStudentSuffixSM.gridy = 2;
		summaryGridBagPane.add(lblStudentSuffixSM, gbc_lblStudentSuffixSM);

		textFieldStudentSuffixSM = new JTextField();
		textFieldStudentSuffixSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentSuffixSM.setEditable(false);
		textFieldStudentSuffixSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentSuffixSM = new GridBagConstraints();
		gbc_textFieldStudentSuffixSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentSuffixSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentSuffixSM.gridx = 5;
		gbc_textFieldStudentSuffixSM.gridy = 2;
		summaryGridBagPane.add(textFieldStudentSuffixSM, gbc_textFieldStudentSuffixSM);

		JLabel lblStudentFirstNameSM = new JLabel("First Name");
		lblStudentFirstNameSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentFirstNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentFirstNameSM = new GridBagConstraints();
		gbc_lblStudentFirstNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentFirstNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentFirstNameSM.gridx = 1;
		gbc_lblStudentFirstNameSM.gridy = 3;
		summaryGridBagPane.add(lblStudentFirstNameSM, gbc_lblStudentFirstNameSM);

		textFieldStudentFirstNameSM = new JTextField();
		textFieldStudentFirstNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentFirstNameSM.setEditable(false);
		textFieldStudentFirstNameSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentFirstNameSM = new GridBagConstraints();
		gbc_textFieldStudentFirstNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentFirstNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentFirstNameSM.gridx = 2;
		gbc_textFieldStudentFirstNameSM.gridy = 3;
		summaryGridBagPane.add(textFieldStudentFirstNameSM, gbc_textFieldStudentFirstNameSM);

		lblStudentNickNameSM = new JLabel("NickName");
		lblStudentNickNameSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentNickNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentNickNameSM = new GridBagConstraints();
		gbc_lblStudentNickNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentNickNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentNickNameSM.gridx = 4;
		gbc_lblStudentNickNameSM.gridy = 3;
		summaryGridBagPane.add(lblStudentNickNameSM, gbc_lblStudentNickNameSM);

		textFieldStudentNickNameSM = new JTextField();
		textFieldStudentNickNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentNickNameSM.setEditable(false);
		textFieldStudentNickNameSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentNickNameSM = new GridBagConstraints();
		gbc_textFieldStudentNickNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentNickNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentNickNameSM.gridx = 5;
		gbc_textFieldStudentNickNameSM.gridy = 3;
		summaryGridBagPane.add(textFieldStudentNickNameSM, gbc_textFieldStudentNickNameSM);

		JLabel lblStudentMiddleNameSM = new JLabel("Middle Name");
		lblStudentMiddleNameSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentMiddleNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentMiddleNameSM = new GridBagConstraints();
		gbc_lblStudentMiddleNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentMiddleNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentMiddleNameSM.gridx = 1;
		gbc_lblStudentMiddleNameSM.gridy = 4;
		summaryGridBagPane.add(lblStudentMiddleNameSM, gbc_lblStudentMiddleNameSM);

		textFieldStudentMiddleNameSM = new JTextField();
		textFieldStudentMiddleNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentMiddleNameSM.setEditable(false);
		textFieldStudentMiddleNameSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentMiddleNameSM = new GridBagConstraints();
		gbc_textFieldStudentMiddleNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentMiddleNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentMiddleNameSM.gridx = 2;
		gbc_textFieldStudentMiddleNameSM.gridy = 4;
		summaryGridBagPane.add(textFieldStudentMiddleNameSM, gbc_textFieldStudentMiddleNameSM);

		lblStudentPlaceBirthSM = new JLabel("Place of Birth");
		lblStudentPlaceBirthSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPlaceBirthSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPlaceBirthSM = new GridBagConstraints();
		gbc_lblStudentPlaceBirthSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentPlaceBirthSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPlaceBirthSM.gridx = 4;
		gbc_lblStudentPlaceBirthSM.gridy = 4;
		summaryGridBagPane.add(lblStudentPlaceBirthSM, gbc_lblStudentPlaceBirthSM);

		textFieldStudentPlaceBirthSM = new JTextField();
		textFieldStudentPlaceBirthSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentPlaceBirthSM.setEditable(false);
		textFieldStudentPlaceBirthSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentPlaceBirthSM = new GridBagConstraints();
		gbc_textFieldStudentPlaceBirthSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentPlaceBirthSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentPlaceBirthSM.gridx = 5;
		gbc_textFieldStudentPlaceBirthSM.gridy = 4;
		summaryGridBagPane.add(textFieldStudentPlaceBirthSM, gbc_textFieldStudentPlaceBirthSM);

		JLabel lblStudentLastNameSM = new JLabel("Last Name");
		lblStudentLastNameSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentLastNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentLastNameSM = new GridBagConstraints();
		gbc_lblStudentLastNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentLastNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentLastNameSM.gridx = 1;
		gbc_lblStudentLastNameSM.gridy = 5;
		summaryGridBagPane.add(lblStudentLastNameSM, gbc_lblStudentLastNameSM);

		textStudentFieldLastNameSM = new JTextField();
		textStudentFieldLastNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textStudentFieldLastNameSM.setEditable(false);
		textStudentFieldLastNameSM.setColumns(10);
		GridBagConstraints gbc_textStudentFieldLastNameSM = new GridBagConstraints();
		gbc_textStudentFieldLastNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldLastNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldLastNameSM.gridx = 2;
		gbc_textStudentFieldLastNameSM.gridy = 5;
		summaryGridBagPane.add(textStudentFieldLastNameSM, gbc_textStudentFieldLastNameSM);

		lblStudentCitizenshipSM = new JLabel("Citizenship");
		lblStudentCitizenshipSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCitizenshipSM = new GridBagConstraints();
		gbc_lblStudentCitizenshipSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCitizenshipSM.gridx = 4;
		gbc_lblStudentCitizenshipSM.gridy = 5;
		summaryGridBagPane.add(lblStudentCitizenshipSM, gbc_lblStudentCitizenshipSM);

		textFieldStudentCitizenshipSM = new JTextField();
		textFieldStudentCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentCitizenshipSM.setEditable(false);
		textFieldStudentCitizenshipSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCitizenshipSM = new GridBagConstraints();
		gbc_textFieldStudentCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCitizenshipSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCitizenshipSM.gridx = 5;
		gbc_textFieldStudentCitizenshipSM.gridy = 5;
		summaryGridBagPane.add(textFieldStudentCitizenshipSM, gbc_textFieldStudentCitizenshipSM);

		JLabel lblStudentBirthdaySM = new JLabel("Birthday");
		lblStudentBirthdaySM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentBirthdaySM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentBirthdaySM = new GridBagConstraints();
		gbc_lblStudentBirthdaySM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentBirthdaySM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentBirthdaySM.gridx = 1;
		gbc_lblStudentBirthdaySM.gridy = 6;
		summaryGridBagPane.add(lblStudentBirthdaySM, gbc_lblStudentBirthdaySM);

		textFieldStudentBirthdaySM = new JTextField();
		textFieldStudentBirthdaySM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentBirthdaySM.setEditable(false);
		textFieldStudentBirthdaySM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentBirthdaySM = new GridBagConstraints();
		gbc_textFieldStudentBirthdaySM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentBirthdaySM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentBirthdaySM.gridx = 2;
		gbc_textFieldStudentBirthdaySM.gridy = 6;
		summaryGridBagPane.add(textFieldStudentBirthdaySM, gbc_textFieldStudentBirthdaySM);

		lblStudentSexSM = new JLabel("Sex");
		lblStudentSexSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentSexSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSexSM = new GridBagConstraints();
		gbc_lblStudentSexSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentSexSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSexSM.gridx = 4;
		gbc_lblStudentSexSM.gridy = 6;
		summaryGridBagPane.add(lblStudentSexSM, gbc_lblStudentSexSM);

		textFieldStudentSex = new JTextField();
		textFieldStudentSex.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentSex.setEditable(false);
		textFieldStudentSex.setColumns(10);
		GridBagConstraints gbc_textFieldStudentSex = new GridBagConstraints();
		gbc_textFieldStudentSex.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentSex.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentSex.gridx = 5;
		gbc_textFieldStudentSex.gridy = 6;
		summaryGridBagPane.add(textFieldStudentSex, gbc_textFieldStudentSex);

		JLabel lblStudentPresentAgeSM = new JLabel("Present Age");
		lblStudentPresentAgeSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentPresentAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAgeSM = new GridBagConstraints();
		gbc_lblStudentPresentAgeSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentPresentAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAgeSM.gridx = 1;
		gbc_lblStudentPresentAgeSM.gridy = 7;
		summaryGridBagPane.add(lblStudentPresentAgeSM, gbc_lblStudentPresentAgeSM);

		textFieldStudentPresentAgeSM = new JTextField();
		textFieldStudentPresentAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentPresentAgeSM.setEditable(false);
		textFieldStudentPresentAgeSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentPresentAgeSM = new GridBagConstraints();
		gbc_textFieldStudentPresentAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentPresentAgeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentPresentAgeSM.gridx = 2;
		gbc_textFieldStudentPresentAgeSM.gridy = 7;
		summaryGridBagPane.add(textFieldStudentPresentAgeSM, gbc_textFieldStudentPresentAgeSM);

		lblStudentReligionSM = new JLabel("Religion");
		lblStudentReligionSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentReligionSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentReligionSM = new GridBagConstraints();
		gbc_lblStudentReligionSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentReligionSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentReligionSM.gridx = 4;
		gbc_lblStudentReligionSM.gridy = 7;
		summaryGridBagPane.add(lblStudentReligionSM, gbc_lblStudentReligionSM);

		textFieldStudentReligionSM = new JTextField();
		textFieldStudentReligionSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentReligionSM.setEditable(false);
		textFieldStudentReligionSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentReligionSM = new GridBagConstraints();
		gbc_textFieldStudentReligionSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentReligionSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentReligionSM.gridx = 5;
		gbc_textFieldStudentReligionSM.gridy = 7;
		summaryGridBagPane.add(textFieldStudentReligionSM, gbc_textFieldStudentReligionSM);

		JLabel lblStudentEmailAddressSM = new JLabel("Email Address");
		lblStudentEmailAddressSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentEmailAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentEmailAddressSM = new GridBagConstraints();
		gbc_lblStudentEmailAddressSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentEmailAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentEmailAddressSM.gridx = 1;
		gbc_lblStudentEmailAddressSM.gridy = 8;
		summaryGridBagPane.add(lblStudentEmailAddressSM, gbc_lblStudentEmailAddressSM);

		textFieldStudentEmailAddressSM = new JTextField();
		textFieldStudentEmailAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentEmailAddressSM.setEditable(false);
		textFieldStudentEmailAddressSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentEmailAddressSM = new GridBagConstraints();
		gbc_textFieldStudentEmailAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentEmailAddressSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentEmailAddressSM.gridx = 2;
		gbc_textFieldStudentEmailAddressSM.gridy = 8;
		summaryGridBagPane.add(textFieldStudentEmailAddressSM, gbc_textFieldStudentEmailAddressSM);

		lblStudentLRNHighSchoolSM = new JLabel("LRN High School");
		lblStudentLRNHighSchoolSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentLRNHighSchoolSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentLRNHighSchoolSM = new GridBagConstraints();
		gbc_lblStudentLRNHighSchoolSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentLRNHighSchoolSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentLRNHighSchoolSM.gridx = 4;
		gbc_lblStudentLRNHighSchoolSM.gridy = 8;
		summaryGridBagPane.add(lblStudentLRNHighSchoolSM, gbc_lblStudentLRNHighSchoolSM);

		textFieldStudentLRNHighSchoolSM = new JTextField();
		textFieldStudentLRNHighSchoolSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentLRNHighSchoolSM.setEditable(false);
		textFieldStudentLRNHighSchoolSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentLRNHighSchoolSM = new GridBagConstraints();
		gbc_textFieldStudentLRNHighSchoolSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentLRNHighSchoolSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentLRNHighSchoolSM.gridx = 5;
		gbc_textFieldStudentLRNHighSchoolSM.gridy = 8;
		summaryGridBagPane.add(textFieldStudentLRNHighSchoolSM, gbc_textFieldStudentLRNHighSchoolSM);

		JLabel lblStudentIntendedAcademicYearSM = new JLabel("Intended Academic Year");
		lblStudentIntendedAcademicYearSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentIntendedAcademicYearSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentIntendedAcademicYearSM = new GridBagConstraints();
		gbc_lblStudentIntendedAcademicYearSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentIntendedAcademicYearSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentIntendedAcademicYearSM.gridx = 1;
		gbc_lblStudentIntendedAcademicYearSM.gridy = 9;
		summaryGridBagPane.add(lblStudentIntendedAcademicYearSM, gbc_lblStudentIntendedAcademicYearSM);

		textFieldStudentIntendedAcademicYearSM = new JTextField();
		textFieldStudentIntendedAcademicYearSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentIntendedAcademicYearSM.setEditable(false);
		textFieldStudentIntendedAcademicYearSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentIntendedAcademicYearSM = new GridBagConstraints();
		gbc_textFieldStudentIntendedAcademicYearSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentIntendedAcademicYearSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentIntendedAcademicYearSM.gridx = 2;
		gbc_textFieldStudentIntendedAcademicYearSM.gridy = 9;
		summaryGridBagPane.add(textFieldStudentIntendedAcademicYearSM, gbc_textFieldStudentIntendedAcademicYearSM);

		JLabel lblStudentGradingPeriodSM = new JLabel("Grading Period");
		lblStudentGradingPeriodSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentGradingPeriodSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentGradingPeriodSM = new GridBagConstraints();
		gbc_lblStudentGradingPeriodSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentGradingPeriodSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentGradingPeriodSM.gridx = 1;
		gbc_lblStudentGradingPeriodSM.gridy = 10;
		summaryGridBagPane.add(lblStudentGradingPeriodSM, gbc_lblStudentGradingPeriodSM);

		textFieldStudentGradingPeriodSM = new JTextField();
		textFieldStudentGradingPeriodSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentGradingPeriodSM.setEditable(false);
		textFieldStudentGradingPeriodSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentGradingPeriodSM = new GridBagConstraints();
		gbc_textFieldStudentGradingPeriodSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentGradingPeriodSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentGradingPeriodSM.gridx = 2;
		gbc_textFieldStudentGradingPeriodSM.gridy = 10;
		summaryGridBagPane.add(textFieldStudentGradingPeriodSM, gbc_textFieldStudentGradingPeriodSM);

		lblPresentAddress = new JLabel("Student Present Address");
		lblPresentAddress.setForeground(new Color(0, 128, 255));
		lblPresentAddress.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblPresentAddress = new GridBagConstraints();
		gbc_lblPresentAddress.anchor = GridBagConstraints.WEST;
		gbc_lblPresentAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblPresentAddress.gridx = 4;
		gbc_lblPresentAddress.gridy = 10;
		summaryGridBagPane.add(lblPresentAddress, gbc_lblPresentAddress);

		JLabel lblStudentCampusSM = new JLabel("Campus");
		lblStudentCampusSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentCampusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCampusSM = new GridBagConstraints();
		gbc_lblStudentCampusSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentCampusSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCampusSM.gridx = 1;
		gbc_lblStudentCampusSM.gridy = 11;
		summaryGridBagPane.add(lblStudentCampusSM, gbc_lblStudentCampusSM);

		textFieldStudentCampusSM = new JTextField();
		textFieldStudentCampusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentCampusSM.setEditable(false);
		textFieldStudentCampusSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCampusSM = new GridBagConstraints();
		gbc_textFieldStudentCampusSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCampusSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCampusSM.gridx = 2;
		gbc_textFieldStudentCampusSM.gridy = 11;
		summaryGridBagPane.add(textFieldStudentCampusSM, gbc_textFieldStudentCampusSM);

		lblStudentStreetAddressSM = new JLabel("House No. / Street Address");
		lblStudentStreetAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentStreetAddressSM = new GridBagConstraints();
		gbc_lblStudentStreetAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentStreetAddressSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentStreetAddressSM.gridx = 4;
		gbc_lblStudentStreetAddressSM.gridy = 11;
		summaryGridBagPane.add(lblStudentStreetAddressSM, gbc_lblStudentStreetAddressSM);

		textFieldStudentStreetAddressSM = new JTextField();
		textFieldStudentStreetAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentStreetAddressSM.setEditable(false);
		textFieldStudentStreetAddressSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentStreetAddressSM = new GridBagConstraints();
		gbc_textFieldStudentStreetAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentStreetAddressSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentStreetAddressSM.gridx = 5;
		gbc_textFieldStudentStreetAddressSM.gridy = 11;
		summaryGridBagPane.add(textFieldStudentStreetAddressSM, gbc_textFieldStudentStreetAddressSM);

		JLabel lblStudentYearSM = new JLabel("Year Level");
		lblStudentYearSM.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentYearSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentYearSM = new GridBagConstraints();
		gbc_lblStudentYearSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentYearSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentYearSM.gridx = 1;
		gbc_lblStudentYearSM.gridy = 12;
		summaryGridBagPane.add(lblStudentYearSM, gbc_lblStudentYearSM);

		textFieldStudentYearSM = new JTextField();
		textFieldStudentYearSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentYearSM.setEditable(false);
		textFieldStudentYearSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentYearSM = new GridBagConstraints();
		gbc_textFieldStudentYearSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentYearSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentYearSM.gridx = 2;
		gbc_textFieldStudentYearSM.gridy = 12;
		summaryGridBagPane.add(textFieldStudentYearSM, gbc_textFieldStudentYearSM);

		lblStudentBarangaySM = new JLabel("Barangay ");
		lblStudentBarangaySM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentBarangaySM = new GridBagConstraints();
		gbc_lblStudentBarangaySM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentBarangaySM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentBarangaySM.gridx = 4;
		gbc_lblStudentBarangaySM.gridy = 12;
		summaryGridBagPane.add(lblStudentBarangaySM, gbc_lblStudentBarangaySM);

		textFieldStudentBarangaySM = new JTextField();
		textFieldStudentBarangaySM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentBarangaySM.setEditable(false);
		textFieldStudentBarangaySM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentBarangaySM = new GridBagConstraints();
		gbc_textFieldStudentBarangaySM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentBarangaySM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentBarangaySM.gridx = 5;
		gbc_textFieldStudentBarangaySM.gridy = 12;
		summaryGridBagPane.add(textFieldStudentBarangaySM, gbc_textFieldStudentBarangaySM);

		JLabel lblBlank4SM = new JLabel("BLANK");
		lblBlank4SM.setFont(new Font("Arial", Font.PLAIN, 12));
		lblBlank4SM.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblBlank4SM = new GridBagConstraints();
		gbc_lblBlank4SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank4SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank4SM.gridx = 1;
		gbc_lblBlank4SM.gridy = 13;
		summaryGridBagPane.add(lblBlank4SM, gbc_lblBlank4SM);

		lblStudentCitySM = new JLabel("City ");
		lblStudentCitySM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCitySM = new GridBagConstraints();
		gbc_lblStudentCitySM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentCitySM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCitySM.gridx = 4;
		gbc_lblStudentCitySM.gridy = 13;
		summaryGridBagPane.add(lblStudentCitySM, gbc_lblStudentCitySM);

		textFieldStudentCitySM = new JTextField();
		textFieldStudentCitySM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentCitySM.setEditable(false);
		textFieldStudentCitySM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCitySM = new GridBagConstraints();
		gbc_textFieldStudentCitySM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCitySM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCitySM.gridx = 5;
		gbc_textFieldStudentCitySM.gridy = 13;
		summaryGridBagPane.add(textFieldStudentCitySM, gbc_textFieldStudentCitySM);

		lblEducationalBackground = new JLabel("Educational Background");
		lblEducationalBackground.setForeground(new Color(0, 128, 255));
		lblEducationalBackground.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblEducationalBackground = new GridBagConstraints();
		gbc_lblEducationalBackground.anchor = GridBagConstraints.WEST;
		gbc_lblEducationalBackground.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationalBackground.gridx = 1;
		gbc_lblEducationalBackground.gridy = 14;
		summaryGridBagPane.add(lblEducationalBackground, gbc_lblEducationalBackground);

		lblStudentProvinceSM = new JLabel("Province ");
		lblStudentProvinceSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentProvinceSM = new GridBagConstraints();
		gbc_lblStudentProvinceSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentProvinceSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentProvinceSM.gridx = 4;
		gbc_lblStudentProvinceSM.gridy = 14;
		summaryGridBagPane.add(lblStudentProvinceSM, gbc_lblStudentProvinceSM);

		textFieldStudentProvinceSM = new JTextField();
		textFieldStudentProvinceSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentProvinceSM.setEditable(false);
		textFieldStudentProvinceSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentProvinceSM = new GridBagConstraints();
		gbc_textFieldStudentProvinceSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentProvinceSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentProvinceSM.gridx = 5;
		gbc_textFieldStudentProvinceSM.gridy = 14;
		summaryGridBagPane.add(textFieldStudentProvinceSM, gbc_textFieldStudentProvinceSM);

		lblBlank5SM = new JLabel("BLANK");
		lblBlank5SM.setForeground(new Color(255, 255, 255));
		lblBlank5SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank5SM = new GridBagConstraints();
		gbc_lblBlank5SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank5SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank5SM.gridx = 0;
		gbc_lblBlank5SM.gridy = 15;
		summaryGridBagPane.add(lblBlank5SM, gbc_lblBlank5SM);

		lblStudentRecentSchoolAttendedSM = new JLabel("Recent School Attended");
		lblStudentRecentSchoolAttendedSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentRecentSchoolAttendedSM = new GridBagConstraints();
		gbc_lblStudentRecentSchoolAttendedSM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentRecentSchoolAttendedSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentRecentSchoolAttendedSM.gridx = 1;
		gbc_lblStudentRecentSchoolAttendedSM.gridy = 15;
		summaryGridBagPane.add(lblStudentRecentSchoolAttendedSM, gbc_lblStudentRecentSchoolAttendedSM);

		textFieldStudentRecentSchoolAttendedSM = new JTextField();
		textFieldStudentRecentSchoolAttendedSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentRecentSchoolAttendedSM.setEditable(false);
		textFieldStudentRecentSchoolAttendedSM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentRecentSchoolAttendedSM = new GridBagConstraints();
		gbc_textFieldStudentRecentSchoolAttendedSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentRecentSchoolAttendedSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentRecentSchoolAttendedSM.gridx = 2;
		gbc_textFieldStudentRecentSchoolAttendedSM.gridy = 15;
		summaryGridBagPane.add(textFieldStudentRecentSchoolAttendedSM, gbc_textFieldStudentRecentSchoolAttendedSM);

		lblStudentCountrySM = new JLabel("Country");
		lblStudentCountrySM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCountrySM = new GridBagConstraints();
		gbc_lblStudentCountrySM.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCountrySM.anchor = GridBagConstraints.WEST;
		gbc_lblStudentCountrySM.gridx = 4;
		gbc_lblStudentCountrySM.gridy = 15;
		summaryGridBagPane.add(lblStudentCountrySM, gbc_lblStudentCountrySM);

		textFieldStudentCountrySM = new JTextField();
		textFieldStudentCountrySM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldStudentCountrySM.setEditable(false);
		textFieldStudentCountrySM.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCountrySM = new GridBagConstraints();
		gbc_textFieldStudentCountrySM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCountrySM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCountrySM.gridx = 5;
		gbc_textFieldStudentCountrySM.gridy = 15;
		summaryGridBagPane.add(textFieldStudentCountrySM, gbc_textFieldStudentCountrySM);

		lblSchoolTypeSM = new JLabel("School Type");
		lblSchoolTypeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSchoolTypeSM = new GridBagConstraints();
		gbc_lblSchoolTypeSM.anchor = GridBagConstraints.WEST;
		gbc_lblSchoolTypeSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblSchoolTypeSM.gridx = 1;
		gbc_lblSchoolTypeSM.gridy = 16;
		summaryGridBagPane.add(lblSchoolTypeSM, gbc_lblSchoolTypeSM);

		textFieldSchoolTypeSM = new JTextField();
		textFieldSchoolTypeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldSchoolTypeSM.setEditable(false);
		textFieldSchoolTypeSM.setColumns(10);
		GridBagConstraints gbc_textFieldSchoolTypeSM = new GridBagConstraints();
		gbc_textFieldSchoolTypeSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldSchoolTypeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSchoolTypeSM.gridx = 2;
		gbc_textFieldSchoolTypeSM.gridy = 16;
		summaryGridBagPane.add(textFieldSchoolTypeSM, gbc_textFieldSchoolTypeSM);

		lblSchoolLandlineSM = new JLabel("Landline");
		lblSchoolLandlineSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSchoolLandlineSM = new GridBagConstraints();
		gbc_lblSchoolLandlineSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblSchoolLandlineSM.anchor = GridBagConstraints.WEST;
		gbc_lblSchoolLandlineSM.gridx = 1;
		gbc_lblSchoolLandlineSM.gridy = 17;
		summaryGridBagPane.add(lblSchoolLandlineSM, gbc_lblSchoolLandlineSM);

		textFieldSchoolLandlineSM = new JTextField();
		textFieldSchoolLandlineSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldSchoolLandlineSM.setEditable(false);
		textFieldSchoolLandlineSM.setColumns(10);
		GridBagConstraints gbc_textFieldSchoolLandlineSM = new GridBagConstraints();
		gbc_textFieldSchoolLandlineSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldSchoolLandlineSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldSchoolLandlineSM.gridx = 2;
		gbc_textFieldSchoolLandlineSM.gridy = 17;
		summaryGridBagPane.add(textFieldSchoolLandlineSM, gbc_textFieldSchoolLandlineSM);

		lblSchoolAddressSM = new JLabel("Address of the School");
		lblSchoolAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblSchoolAddressSM = new GridBagConstraints();
		gbc_lblSchoolAddressSM.anchor = GridBagConstraints.WEST;
		gbc_lblSchoolAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblSchoolAddressSM.gridx = 1;
		gbc_lblSchoolAddressSM.gridy = 18;
		summaryGridBagPane.add(lblSchoolAddressSM, gbc_lblSchoolAddressSM);

		textSchoolAddressSM = new JTextField();
		textSchoolAddressSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textSchoolAddressSM.setEditable(false);
		textSchoolAddressSM.setColumns(10);
		GridBagConstraints gbc_textSchoolAddressSM = new GridBagConstraints();
		gbc_textSchoolAddressSM.insets = new Insets(0, 0, 5, 5);
		gbc_textSchoolAddressSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textSchoolAddressSM.gridx = 2;
		gbc_textSchoolAddressSM.gridy = 18;
		summaryGridBagPane.add(textSchoolAddressSM, gbc_textSchoolAddressSM);

		lblBlank13SM = new JLabel("BLANK");
		lblBlank13SM.setForeground(Color.WHITE);
		lblBlank13SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank13SM = new GridBagConstraints();
		gbc_lblBlank13SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank13SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank13SM.gridx = 0;
		gbc_lblBlank13SM.gridy = 19;
		summaryGridBagPane.add(lblBlank13SM, gbc_lblBlank13SM);

		lblBlank12SM = new JLabel("BLANK");
		lblBlank12SM.setForeground(Color.WHITE);
		lblBlank12SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank12SM = new GridBagConstraints();
		gbc_lblBlank12SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank12SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank12SM.gridx = 0;
		gbc_lblBlank12SM.gridy = 20;
		summaryGridBagPane.add(lblBlank12SM, gbc_lblBlank12SM);

		lblFamilyDetails = new JLabel("Family Details");
		lblFamilyDetails.setForeground(new Color(0, 128, 255));
		lblFamilyDetails.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblFamilyDetails = new GridBagConstraints();
		gbc_lblFamilyDetails.anchor = GridBagConstraints.WEST;
		gbc_lblFamilyDetails.insets = new Insets(0, 0, 5, 5);
		gbc_lblFamilyDetails.gridx = 1;
		gbc_lblFamilyDetails.gridy = 21;
		summaryGridBagPane.add(lblFamilyDetails, gbc_lblFamilyDetails);

		lblBlank6SM = new JLabel("BLANK");
		lblBlank6SM.setForeground(Color.WHITE);
		lblBlank6SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank6SM = new GridBagConstraints();
		gbc_lblBlank6SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank6SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank6SM.gridx = 0;
		gbc_lblBlank6SM.gridy = 22;
		summaryGridBagPane.add(lblBlank6SM, gbc_lblBlank6SM);

		lblStudentMotherInformation = new JLabel("Student's Mother Information");
		lblStudentMotherInformation.setForeground(new Color(0, 128, 255));
		lblStudentMotherInformation.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentMotherInformation = new GridBagConstraints();
		gbc_lblStudentMotherInformation.anchor = GridBagConstraints.WEST;
		gbc_lblStudentMotherInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentMotherInformation.gridx = 1;
		gbc_lblStudentMotherInformation.gridy = 23;
		summaryGridBagPane.add(lblStudentMotherInformation, gbc_lblStudentMotherInformation);

		lblStudentFatherInformation = new JLabel("Student's Father Information");
		lblStudentFatherInformation.setForeground(new Color(0, 128, 255));
		lblStudentFatherInformation.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentFatherInformation = new GridBagConstraints();
		gbc_lblStudentFatherInformation.anchor = GridBagConstraints.WEST;
		gbc_lblStudentFatherInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentFatherInformation.gridx = 4;
		gbc_lblStudentFatherInformation.gridy = 23;
		summaryGridBagPane.add(lblStudentFatherInformation, gbc_lblStudentFatherInformation);

		lblMotherInformationSM = new JLabel("Full Name");
		lblMotherInformationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherInformationSM = new GridBagConstraints();
		gbc_lblMotherInformationSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherInformationSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherInformationSM.gridx = 1;
		gbc_lblMotherInformationSM.gridy = 24;
		summaryGridBagPane.add(lblMotherInformationSM, gbc_lblMotherInformationSM);

		textFieldMotherInformationSM = new JTextField();
		textFieldMotherInformationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherInformationSM.setEditable(false);
		textFieldMotherInformationSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherInformationSM = new GridBagConstraints();
		gbc_textFieldMotherInformationSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherInformationSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherInformationSM.gridx = 2;
		gbc_textFieldMotherInformationSM.gridy = 24;
		summaryGridBagPane.add(textFieldMotherInformationSM, gbc_textFieldMotherInformationSM);

		lblFatherInformationSM = new JLabel("Full Name");
		lblFatherInformationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherInformationSM = new GridBagConstraints();
		gbc_lblFatherInformationSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherInformationSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherInformationSM.gridx = 4;
		gbc_lblFatherInformationSM.gridy = 24;
		summaryGridBagPane.add(lblFatherInformationSM, gbc_lblFatherInformationSM);

		textFieldFatherInformationSM = new JTextField();
		textFieldFatherInformationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFatherInformationSM.setEditable(false);
		textFieldFatherInformationSM.setColumns(10);
		GridBagConstraints gbc_textFieldFatherInformationSM = new GridBagConstraints();
		gbc_textFieldFatherInformationSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherInformationSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherInformationSM.gridx = 5;
		gbc_textFieldFatherInformationSM.gridy = 24;
		summaryGridBagPane.add(textFieldFatherInformationSM, gbc_textFieldFatherInformationSM);

		lblMotherAgeSM = new JLabel("Age");
		lblMotherAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherAgeSM = new GridBagConstraints();
		gbc_lblMotherAgeSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherAgeSM.gridx = 1;
		gbc_lblMotherAgeSM.gridy = 25;
		summaryGridBagPane.add(lblMotherAgeSM, gbc_lblMotherAgeSM);

		textFieldMotherAgeSM = new JTextField();
		textFieldMotherAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherAgeSM.setEditable(false);
		textFieldMotherAgeSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherAgeSM = new GridBagConstraints();
		gbc_textFieldMotherAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherAgeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherAgeSM.gridx = 2;
		gbc_textFieldMotherAgeSM.gridy = 25;
		summaryGridBagPane.add(textFieldMotherAgeSM, gbc_textFieldMotherAgeSM);

		lblFatherAgeSM = new JLabel("Age");
		lblFatherAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherAgeSM = new GridBagConstraints();
		gbc_lblFatherAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherAgeSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherAgeSM.gridx = 4;
		gbc_lblFatherAgeSM.gridy = 25;
		summaryGridBagPane.add(lblFatherAgeSM, gbc_lblFatherAgeSM);

		textFieldFatherAgeSM = new JTextField();
		textFieldFatherAgeSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFatherAgeSM.setEditable(false);
		textFieldFatherAgeSM.setColumns(10);
		GridBagConstraints gbc_textFieldFatherAgeSM = new GridBagConstraints();
		gbc_textFieldFatherAgeSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherAgeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherAgeSM.gridx = 5;
		gbc_textFieldFatherAgeSM.gridy = 25;
		summaryGridBagPane.add(textFieldFatherAgeSM, gbc_textFieldFatherAgeSM);

		lblMotherOccupationSM = new JLabel("Occupation");
		lblMotherOccupationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherOccupationSM = new GridBagConstraints();
		gbc_lblMotherOccupationSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherOccupationSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherOccupationSM.gridx = 1;
		gbc_lblMotherOccupationSM.gridy = 26;
		summaryGridBagPane.add(lblMotherOccupationSM, gbc_lblMotherOccupationSM);

		textFieldMotherOccupationSM = new JTextField();
		textFieldMotherOccupationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherOccupationSM.setEditable(false);
		textFieldMotherOccupationSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherOccupationSM = new GridBagConstraints();
		gbc_textFieldMotherOccupationSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherOccupationSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherOccupationSM.gridx = 2;
		gbc_textFieldMotherOccupationSM.gridy = 26;
		summaryGridBagPane.add(textFieldMotherOccupationSM, gbc_textFieldMotherOccupationSM);

		lblFatherOccupationSM = new JLabel("Occupation");
		lblFatherOccupationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherOccupationSM = new GridBagConstraints();
		gbc_lblFatherOccupationSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherOccupationSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherOccupationSM.gridx = 4;
		gbc_lblFatherOccupationSM.gridy = 26;
		summaryGridBagPane.add(lblFatherOccupationSM, gbc_lblFatherOccupationSM);

		textFieldFatherOccupationSM = new JTextField();
		textFieldFatherOccupationSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFatherOccupationSM.setEditable(false);
		textFieldFatherOccupationSM.setColumns(10);
		GridBagConstraints gbc_textFieldFatherOccupationSM = new GridBagConstraints();
		gbc_textFieldFatherOccupationSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherOccupationSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherOccupationSM.gridx = 5;
		gbc_textFieldFatherOccupationSM.gridy = 26;
		summaryGridBagPane.add(textFieldFatherOccupationSM, gbc_textFieldFatherOccupationSM);

		lblBlank7SM = new JLabel("BLANK");
		lblBlank7SM.setForeground(new Color(255, 255, 255));
		lblBlank7SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank7SM = new GridBagConstraints();
		gbc_lblBlank7SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank7SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank7SM.gridx = 0;
		gbc_lblBlank7SM.gridy = 27;
		summaryGridBagPane.add(lblBlank7SM, gbc_lblBlank7SM);

		lblMotherCitizenshipSM = new JLabel("Citizenship");
		lblMotherCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherCitizenshipSM = new GridBagConstraints();
		gbc_lblMotherCitizenshipSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherCitizenshipSM.gridx = 1;
		gbc_lblMotherCitizenshipSM.gridy = 27;
		summaryGridBagPane.add(lblMotherCitizenshipSM, gbc_lblMotherCitizenshipSM);

		textFieldMotherCitizenshipSM = new JTextField();
		textFieldMotherCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherCitizenshipSM.setEditable(false);
		textFieldMotherCitizenshipSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherCitizenshipSM = new GridBagConstraints();
		gbc_textFieldMotherCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherCitizenshipSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherCitizenshipSM.gridx = 2;
		gbc_textFieldMotherCitizenshipSM.gridy = 27;
		summaryGridBagPane.add(textFieldMotherCitizenshipSM, gbc_textFieldMotherCitizenshipSM);

		lblFatherCitizenshipSM = new JLabel("Citizenship");
		lblFatherCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherCitizenshipSM = new GridBagConstraints();
		gbc_lblFatherCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherCitizenshipSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherCitizenshipSM.gridx = 4;
		gbc_lblFatherCitizenshipSM.gridy = 27;
		summaryGridBagPane.add(lblFatherCitizenshipSM, gbc_lblFatherCitizenshipSM);

		textFieldFatherCitizenshipSM = new JTextField();
		textFieldFatherCitizenshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFatherCitizenshipSM.setEditable(false);
		textFieldFatherCitizenshipSM.setColumns(10);
		GridBagConstraints gbc_textFieldFatherCitizenshipSM = new GridBagConstraints();
		gbc_textFieldFatherCitizenshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherCitizenshipSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherCitizenshipSM.gridx = 5;
		gbc_textFieldFatherCitizenshipSM.gridy = 27;
		summaryGridBagPane.add(textFieldFatherCitizenshipSM, gbc_textFieldFatherCitizenshipSM);

		lblMotherContactNumberSM = new JLabel("Contact Number");
		lblMotherContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherContactNumberSM = new GridBagConstraints();
		gbc_lblMotherContactNumberSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherContactNumberSM.gridx = 1;
		gbc_lblMotherContactNumberSM.gridy = 28;
		summaryGridBagPane.add(lblMotherContactNumberSM, gbc_lblMotherContactNumberSM);

		textFieldMotherContactNumberSM = new JTextField();
		textFieldMotherContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherContactNumberSM.setEditable(false);
		textFieldMotherContactNumberSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherContactNumberSM = new GridBagConstraints();
		gbc_textFieldMotherContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherContactNumberSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherContactNumberSM.gridx = 2;
		gbc_textFieldMotherContactNumberSM.gridy = 28;
		summaryGridBagPane.add(textFieldMotherContactNumberSM, gbc_textFieldMotherContactNumberSM);

		lblFatherContactNumberSM = new JLabel("Contact Number");
		lblFatherContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherContactNumberSM = new GridBagConstraints();
		gbc_lblFatherContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherContactNumberSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherContactNumberSM.gridx = 4;
		gbc_lblFatherContactNumberSM.gridy = 28;
		summaryGridBagPane.add(lblFatherContactNumberSM, gbc_lblFatherContactNumberSM);

		textFieldContactNumberSM = new JTextField();
		textFieldContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldContactNumberSM.setEditable(false);
		textFieldContactNumberSM.setColumns(10);
		GridBagConstraints gbc_textFieldContactNumberSM = new GridBagConstraints();
		gbc_textFieldContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldContactNumberSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldContactNumberSM.gridx = 5;
		gbc_textFieldContactNumberSM.gridy = 28;
		summaryGridBagPane.add(textFieldContactNumberSM, gbc_textFieldContactNumberSM);

		lblMotherStatusSM = new JLabel("Status");
		lblMotherStatusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherStatusSM = new GridBagConstraints();
		gbc_lblMotherStatusSM.anchor = GridBagConstraints.WEST;
		gbc_lblMotherStatusSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherStatusSM.gridx = 1;
		gbc_lblMotherStatusSM.gridy = 29;
		summaryGridBagPane.add(lblMotherStatusSM, gbc_lblMotherStatusSM);

		textFieldMotherStatusSM = new JTextField();
		textFieldMotherStatusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldMotherStatusSM.setEditable(false);
		textFieldMotherStatusSM.setColumns(10);
		GridBagConstraints gbc_textFieldMotherStatusSM = new GridBagConstraints();
		gbc_textFieldMotherStatusSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherStatusSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherStatusSM.gridx = 2;
		gbc_textFieldMotherStatusSM.gridy = 29;
		summaryGridBagPane.add(textFieldMotherStatusSM, gbc_textFieldMotherStatusSM);

		lblFatherStatusSM = new JLabel("Status");
		lblFatherStatusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherStatusSM = new GridBagConstraints();
		gbc_lblFatherStatusSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherStatusSM.anchor = GridBagConstraints.WEST;
		gbc_lblFatherStatusSM.gridx = 4;
		gbc_lblFatherStatusSM.gridy = 29;
		summaryGridBagPane.add(lblFatherStatusSM, gbc_lblFatherStatusSM);

		textFieldFatherStatusSM = new JTextField();
		textFieldFatherStatusSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldFatherStatusSM.setEditable(false);
		textFieldFatherStatusSM.setColumns(10);
		GridBagConstraints gbc_textFieldFatherStatusSM = new GridBagConstraints();
		gbc_textFieldFatherStatusSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherStatusSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherStatusSM.gridx = 5;
		gbc_textFieldFatherStatusSM.gridy = 29;
		summaryGridBagPane.add(textFieldFatherStatusSM, gbc_textFieldFatherStatusSM);

		lblBlank8SM = new JLabel("BLANK");
		lblBlank8SM.setForeground(Color.WHITE);
		lblBlank8SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank8SM = new GridBagConstraints();
		gbc_lblBlank8SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank8SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank8SM.gridx = 0;
		gbc_lblBlank8SM.gridy = 30;
		summaryGridBagPane.add(lblBlank8SM, gbc_lblBlank8SM);

		lblStudentGuardianInformation = new JLabel("Student's Guardian Information");
		lblStudentGuardianInformation.setForeground(new Color(0, 128, 255));
		lblStudentGuardianInformation.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentGuardianInformation = new GridBagConstraints();
		gbc_lblStudentGuardianInformation.anchor = GridBagConstraints.WEST;
		gbc_lblStudentGuardianInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentGuardianInformation.gridx = 1;
		gbc_lblStudentGuardianInformation.gridy = 31;
		summaryGridBagPane.add(lblStudentGuardianInformation, gbc_lblStudentGuardianInformation);

		lblStudentEmergencyInformation = new JLabel("Emeregency Contact Information");
		lblStudentEmergencyInformation.setForeground(new Color(0, 128, 255));
		lblStudentEmergencyInformation.setFont(new Font("Arial", Font.BOLD, 12));
		GridBagConstraints gbc_lblStudentEmergencyInformation = new GridBagConstraints();
		gbc_lblStudentEmergencyInformation.anchor = GridBagConstraints.WEST;
		gbc_lblStudentEmergencyInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentEmergencyInformation.gridx = 4;
		gbc_lblStudentEmergencyInformation.gridy = 31;
		summaryGridBagPane.add(lblStudentEmergencyInformation, gbc_lblStudentEmergencyInformation);

		lblGuardianFullNameSM = new JLabel("Full Name");
		lblGuardianFullNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianFullNameSM = new GridBagConstraints();
		gbc_lblGuardianFullNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblGuardianFullNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianFullNameSM.gridx = 1;
		gbc_lblGuardianFullNameSM.gridy = 32;
		summaryGridBagPane.add(lblGuardianFullNameSM, gbc_lblGuardianFullNameSM);

		textFieldGuardianFullNameSM = new JTextField();
		textFieldGuardianFullNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldGuardianFullNameSM.setEditable(false);
		textFieldGuardianFullNameSM.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianFullNameSM = new GridBagConstraints();
		gbc_textFieldGuardianFullNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianFullNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianFullNameSM.gridx = 2;
		gbc_textFieldGuardianFullNameSM.gridy = 32;
		summaryGridBagPane.add(textFieldGuardianFullNameSM, gbc_textFieldGuardianFullNameSM);

		lblEmergencyFullNameSM = new JLabel("Full Name");
		lblEmergencyFullNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyFullNameSM = new GridBagConstraints();
		gbc_lblEmergencyFullNameSM.anchor = GridBagConstraints.WEST;
		gbc_lblEmergencyFullNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyFullNameSM.gridx = 4;
		gbc_lblEmergencyFullNameSM.gridy = 32;
		summaryGridBagPane.add(lblEmergencyFullNameSM, gbc_lblEmergencyFullNameSM);

		textFieldEmergencyFullNameSM = new JTextField();
		textFieldEmergencyFullNameSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldEmergencyFullNameSM.setEditable(false);
		textFieldEmergencyFullNameSM.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyFullNameSM = new GridBagConstraints();
		gbc_textFieldEmergencyFullNameSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyFullNameSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyFullNameSM.gridx = 5;
		gbc_textFieldEmergencyFullNameSM.gridy = 32;
		summaryGridBagPane.add(textFieldEmergencyFullNameSM, gbc_textFieldEmergencyFullNameSM);

		lblGuardianRelationshipSM = new JLabel("Relationship to Student");
		lblGuardianRelationshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianRelationshipSM = new GridBagConstraints();
		gbc_lblGuardianRelationshipSM.anchor = GridBagConstraints.WEST;
		gbc_lblGuardianRelationshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianRelationshipSM.gridx = 1;
		gbc_lblGuardianRelationshipSM.gridy = 33;
		summaryGridBagPane.add(lblGuardianRelationshipSM, gbc_lblGuardianRelationshipSM);

		textFieldGuardianRelationshipSM = new JTextField();
		textFieldGuardianRelationshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldGuardianRelationshipSM.setEditable(false);
		textFieldGuardianRelationshipSM.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianRelationshipSM = new GridBagConstraints();
		gbc_textFieldGuardianRelationshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianRelationshipSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianRelationshipSM.gridx = 2;
		gbc_textFieldGuardianRelationshipSM.gridy = 33;
		summaryGridBagPane.add(textFieldGuardianRelationshipSM, gbc_textFieldGuardianRelationshipSM);

		lblEmergencyRelationshipSM = new JLabel("Relationship to Student");
		lblEmergencyRelationshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyRelationshipSM = new GridBagConstraints();
		gbc_lblEmergencyRelationshipSM.anchor = GridBagConstraints.WEST;
		gbc_lblEmergencyRelationshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyRelationshipSM.gridx = 4;
		gbc_lblEmergencyRelationshipSM.gridy = 33;
		summaryGridBagPane.add(lblEmergencyRelationshipSM, gbc_lblEmergencyRelationshipSM);

		textFieldEmergencyRelationshipSM = new JTextField();
		textFieldEmergencyRelationshipSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldEmergencyRelationshipSM.setEditable(false);
		textFieldEmergencyRelationshipSM.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyRelationshipSM = new GridBagConstraints();
		gbc_textFieldEmergencyRelationshipSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyRelationshipSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyRelationshipSM.gridx = 5;
		gbc_textFieldEmergencyRelationshipSM.gridy = 33;
		summaryGridBagPane.add(textFieldEmergencyRelationshipSM, gbc_textFieldEmergencyRelationshipSM);

		lblGuardianContactNumberSM = new JLabel("Contact Number");
		lblGuardianContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblGuardianContactNumberSM = new GridBagConstraints();
		gbc_lblGuardianContactNumberSM.anchor = GridBagConstraints.WEST;
		gbc_lblGuardianContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianContactNumberSM.gridx = 1;
		gbc_lblGuardianContactNumberSM.gridy = 34;
		summaryGridBagPane.add(lblGuardianContactNumberSM, gbc_lblGuardianContactNumberSM);

		textFieldGuardianContactNumberSM = new JTextField();
		textFieldGuardianContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldGuardianContactNumberSM.setEditable(false);
		textFieldGuardianContactNumberSM.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianContactNumberSM = new GridBagConstraints();
		gbc_textFieldGuardianContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianContactNumberSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianContactNumberSM.gridx = 2;
		gbc_textFieldGuardianContactNumberSM.gridy = 34;
		summaryGridBagPane.add(textFieldGuardianContactNumberSM, gbc_textFieldGuardianContactNumberSM);

		lblEmergencyContactNumberSM = new JLabel("Contact Number");
		lblEmergencyContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEmergencyContactNumberSM = new GridBagConstraints();
		gbc_lblEmergencyContactNumberSM.anchor = GridBagConstraints.WEST;
		gbc_lblEmergencyContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyContactNumberSM.gridx = 4;
		gbc_lblEmergencyContactNumberSM.gridy = 34;
		summaryGridBagPane.add(lblEmergencyContactNumberSM, gbc_lblEmergencyContactNumberSM);

		textFieldEmergencyContactNumberSM = new JTextField();
		textFieldEmergencyContactNumberSM.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldEmergencyContactNumberSM.setEditable(false);
		textFieldEmergencyContactNumberSM.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyContactNumberSM = new GridBagConstraints();
		gbc_textFieldEmergencyContactNumberSM.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyContactNumberSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyContactNumberSM.gridx = 5;
		gbc_textFieldEmergencyContactNumberSM.gridy = 34;
		summaryGridBagPane.add(textFieldEmergencyContactNumberSM, gbc_textFieldEmergencyContactNumberSM);

		lblBlank9SM = new JLabel("BLANK");
		lblBlank9SM.setForeground(Color.WHITE);
		lblBlank9SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank9SM = new GridBagConstraints();
		gbc_lblBlank9SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank9SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank9SM.gridx = 0;
		gbc_lblBlank9SM.gridy = 35;
		summaryGridBagPane.add(lblBlank9SM, gbc_lblBlank9SM);

		lblBlank10SM = new JLabel("BLANK");
		lblBlank10SM.setForeground(Color.WHITE);
		lblBlank10SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank10SM = new GridBagConstraints();
		gbc_lblBlank10SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank10SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank10SM.gridx = 0;
		gbc_lblBlank10SM.gridy = 36;
		summaryGridBagPane.add(lblBlank10SM, gbc_lblBlank10SM);

		lblBlank11SM = new JLabel("BLANK");
		lblBlank11SM.setForeground(Color.WHITE);
		lblBlank11SM.setFont(new Font("Arial", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBlank11SM = new GridBagConstraints();
		gbc_lblBlank11SM.anchor = GridBagConstraints.WEST;
		gbc_lblBlank11SM.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank11SM.gridx = 0;
		gbc_lblBlank11SM.gridy = 37;
		summaryGridBagPane.add(lblBlank11SM, gbc_lblBlank11SM);

		btnWelcomeSM = new JButton("SUBMIT");
		btnWelcomeSM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = "Thank you for submitting your admission application. We appreciate your interest in our institution. Your application is currently under review by the faculty members. Please allow us some time to evaluate your application. We will notify you as soon as a decision has been made. Thank you for your patience.";
				JOptionPane.showMessageDialog(null, message, "Admission Application Status",
						JOptionPane.INFORMATION_MESSAGE);
				for (int index = 1; index < 7; index++) {
					tabbedPaneAdmissionAssistant.setEnabledAt(index, false);
				}
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneWelcome);
				btnWelcomeNext.setEnabled(false);
			}
		});
		btnWelcomeSM.setForeground(Color.BLACK);
		btnWelcomeSM.setFont(new Font("Arial", Font.BOLD, 12));
		btnWelcomeSM.setBackground(Color.YELLOW);
		GridBagConstraints gbc_btnWelcomeSM = new GridBagConstraints();
		gbc_btnWelcomeSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnWelcomeSM.insets = new Insets(0, 0, 5, 5);
		gbc_btnWelcomeSM.gridx = 5;
		gbc_btnWelcomeSM.gridy = 38;
		summaryGridBagPane.add(btnWelcomeSM, gbc_btnWelcomeSM);

		btnBackSM = new JButton("BACK");
		btnBackSM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPaneAdmissionAssistant.setSelectedComponent(paneAcademicInformation);
			}
		});
		btnBackSM.setForeground(Color.BLACK);
		btnBackSM.setFont(new Font("Arial", Font.BOLD, 12));
		btnBackSM.setBackground(Color.YELLOW);
		GridBagConstraints gbc_btnBackSM = new GridBagConstraints();
		gbc_btnBackSM.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBackSM.insets = new Insets(0, 0, 5, 5);
		gbc_btnBackSM.gridx = 5;
		gbc_btnBackSM.gridy = 40;
		summaryGridBagPane.add(btnBackSM, gbc_btnBackSM);

		lblAdmissionAssistantHeader = new JLabel("Admission Assistant");
		lblAdmissionAssistantHeader.setFont(new Font("Arial", Font.BOLD, 18));
		lblAdmissionAssistantHeader.setBounds(240, 26, 362, 36);
		contentPane.add(lblAdmissionAssistantHeader);

		lblDashboardStudentNumber = new JLabel("Student Number:");
		lblDashboardStudentNumber.setFont(new Font("Arial", Font.BOLD, 12));
		lblDashboardStudentNumber.setBounds(672, 33, 102, 26);
		contentPane.add(lblDashboardStudentNumber);

		lblDashboardStudentStatus = new JLabel("Student Status:");
		lblDashboardStudentStatus.setFont(new Font("Arial", Font.BOLD, 12));
		lblDashboardStudentStatus.setBounds(859, 33, 89, 26);
		contentPane.add(lblDashboardStudentStatus);

		textFieldDashboardStudentNumber = new JTextField();
		textFieldDashboardStudentNumber.setEditable(false);
		textFieldDashboardStudentNumber.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDashboardStudentNumber.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldDashboardStudentNumber.setText("3-12-023");
		textFieldDashboardStudentNumber.setBounds(773, 33, 76, 26);
		contentPane.add(textFieldDashboardStudentNumber);
		textFieldDashboardStudentNumber.setColumns(10);

		textFieldDashboardStudentStatus = new JTextField();
		textFieldDashboardStudentStatus.setEditable(false);
		textFieldDashboardStudentStatus.setForeground(new Color(255, 0, 0));
		textFieldDashboardStudentStatus.setText("NOT ENROLLED");
		textFieldDashboardStudentStatus.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDashboardStudentStatus.setFont(new Font("Arial", Font.PLAIN, 12));
		textFieldDashboardStudentStatus.setColumns(10);
		textFieldDashboardStudentStatus.setBounds(958, 33, 114, 26);
		contentPane.add(textFieldDashboardStudentStatus);

		// Disable all panes except the "Welcome" pane initially
		for (int index = 1; index < 7; index++) {
			tabbedPaneAdmissionAssistant.setEnabledAt(index, false);
		}

		// If "textFields" has been populated then proceed to the next step

		JTextField[] textFieldsFD = { textFieldMotherFullNameFD, textFieldMotherAgeFD, textFieldMotherOccupationFD,
				textFieldMotherCitizenshipFD, textFieldMotherContactNumberFD, textFieldFatherFullNameFD,
				textFieldFatherAgeFD, textFieldFatherOccupationFD, textFieldFatherCitizenshipFD,
				textFieldFatherContactNumberFD, textFieldGuardianFullNameFD, textFieldGuardianContactNumberFD,
				textFieldEmergencyFullNameFD, textFieldEmergencyContactNumberFD };

		JTextField[] textFieldsPD = { textFieldNickNamePD, textFieldPlaceOfBirthPD, textFieldCitizenshipPD,
				textFieldReligionPD, textFieldLRNHighSchoolPD, textFieldRecentSchoolAttendedPD, textFieldLandlinePD,
				textFieldSchoolAddressPD, textFieldStudentAddressPD, textFieldStudentBarangayPD, textFieldStudentCityPD,
				textFieldsStudentCountryPD, textFieldStudentZipCodePD };

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
				boolean isFilledPD = true;
				boolean isFilledFD = true;

				for (JTextField textField : textFieldsPD) {
					if (textField.getText().isEmpty()) {
						isFilledPD = false;
						break;
					}
				}

				if (!isFilledPD) {
					btnNextPD.setEnabled(isFilledPD);
					for (int index = 3; index < 7; index++) {
						btnNextDP.setEnabled(isFilledPD);
						tabbedPaneAdmissionAssistant.setEnabledAt(4, isFilledPD);
					}
				} else {
					for (JTextField textField : textFieldsFD) {
						if (textField.getText().isEmpty()) {
							isFilledFD = false;
							break;
						}
					}

					if (!isFilledFD) {
						btnNextPD.setEnabled(isFilledFD);
						for (int index = 4; index < 7; index++) {
							btnNextDP.setEnabled(isFilledFD);
							tabbedPaneAdmissionAssistant.setEnabledAt(5, isFilledFD);
						}
					}

					btnNextFD.setEnabled(isFilledFD);

				}

				btnNextPD.setEnabled(isFilledPD);
			}
		};

		for (JTextField textField : textFieldsPD) {
			textField.getDocument().addDocumentListener(documentListener);
		}

		for (JTextField textField : textFieldsFD) {
			textField.getDocument().addDocumentListener(documentListener);

		}
	}
}
