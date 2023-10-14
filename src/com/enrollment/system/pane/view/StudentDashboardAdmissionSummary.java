package com.enrollment.system.pane.view;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import com.enrollment.system.frame.view.StudentDashboard;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentDashboardAdmissionSummary extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblStudentApplicationType;
	private JLabel lblStudentBirthDate;
	private JLabel lblStudentCampus;
	private JLabel lblStudentEmailAddress_1;
	private JLabel lblEmergencyContactNumber;
	private JLabel lblEmergencyFullName;
	private JLabel lblEmergencyRelationshipToStudent;
	private JLabel lblFatherAge;
	private JLabel lblFatherCitizenship;
	private JLabel lblFatherContactNumber;
	private JLabel lblFatherFullName;
	private JLabel lblFatherInformation;
	private JLabel lblFatherOccupation;
	private JLabel lblFatherStatus;
	private JLabel lblStudentGradingPeriod;
	private JLabel lblGuardianContactNumber;
	private JLabel lblGuardianFullName;
	private JLabel lblGuardianRelationshipToStudent;
	private JLabel lblStudentIntendedAcademicYear;
	private JLabel lblEducationBackgroundLandlineNo;
	private JLabel lblStudentLastName;
	private JLabel lblStudentLrnNo;
	private JLabel lblStudentMiddleName;
	private JLabel lblMotherAge;
	private JLabel lblMotherCitizenship;
	private JLabel lblMotherContactNumber;
	private JLabel lblMotherFullName;
	private JLabel lblMotherOccupation;
	private JLabel lblMotherStatus;
	private JLabel lblStudentNickName;
	private JLabel lblStudentPlaceOfBirth;
	private JLabel lblStudentPresentAge;
	private JLabel lblEducationBackgroundRecentSchoolAttended;
	private JLabel lblStudentReligion;
	private JLabel lblEducationBackgroundSchoolAddress;
	private JLabel lblEducationBackgroundSchoolType;
	private JLabel lblStudentSex;
	private JLabel lblStudentBarangay;
	private JLabel lblStudentCity;
	private JLabel lblStudentEmailAddress;
	private JLabel lblStudentFirstName;
	private JLabel lblStudentStreetAddress;
	private JLabel lblStudentStudentProvince;
	private JLabel lblStudentZipCode;
	private JLabel lblStudentSuffix;
	private JLabel lblStudentYearLevel;
	private JTextField textFieldStudentBirthDate;
	private JTextField textFieldStudentCampus;
	private JTextField textFieldStudentEmailAddress_1;
	private JTextField textFieldEmergencyContactNumber;
	private JTextField textFieldEmergencyFullName;
	private JTextField textFieldEmergencyRelationshipToStudent;
	private JTextField textFieldFatherAge;
	private JTextField textFieldFatherCitizenship;
	private JTextField textFieldFatherContactNumber;
	private JTextField textFieldFatherFullName;
	private JTextField textFieldFatherOccupation;
	private JTextField textFieldFatherStatus;
	private JTextField textFieldFilesUpload;
	private JTextField textFieldStudentGradingPeriod;
	private JTextField textFieldGuardianContactNumber;
	private JTextField textFieldGuardianFullName;
	private JTextField textFieldGuardianRelationshipToStudent;
	private JTextField textFieldStudentIntendedAcademicYear;
	private JTextField textFieldEducationBackgroundLandlineNo;
	private JTextField textFieldStudentLastName;
	private JTextField textStudentFieldLrnNo;
	private JTextField textFieldStudentMiddleName;
	private JTextField textFieldMotherAge;
	private JTextField textFieldMotherCitizenship;
	private JTextField textFieldMotherContactNumber;
	private JTextField textFieldMotherFullName;
	private JTextField textFieldMotherOccupation;
	private JTextField textFieldMotherStatus;
	private JTextField textStudentFieldNickName;
	private JTextField textStudentFieldPlaceOfBirth;
	private JTextField textFieldStudentPresentAge;
	private JTextField textFieldEducationBackgroundRecentSchoolAttended;
	private JTextField textStudentFieldReligion;
	private JTextField textFieldEducationBackgroundSchoolAddress;
	private JTextField textFieldEducationBackgroundSchoolType;
	private JTextField textStudentFieldSex;
	private JTextField textFieldStudentBarangay;
	private JTextField textFieldStudentCity;
	private JTextField textStudentFieldStudentEmailAddress;
	private JTextField textFieldStudentFirstName;
	private JTextField textFieldStudentStreetAddress;
	private JTextField textFieldStudentStudentProvince;
	private JTextField textFieldStudentZipCode;
	private JTextField textStudentFieldSuffix;
	private JTextField textFieldStudentYearLevel;
	private JTextField textFieldStudentApplicationType;

	/**
	 * Create the panel.
	 */
	public StudentDashboardAdmissionSummary() {
		setPreferredSize(new Dimension(818, 1000));
		setBackground(new Color(240, 240, 240));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblBLOCK1 = new JLabel("BLOCK");
		lblBLOCK1.setForeground(new Color(240, 240, 240));
		lblBLOCK1.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBLOCK1 = new GridBagConstraints();
		gbc_lblBLOCK1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBLOCK1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBLOCK1.gridx = 0;
		gbc_lblBLOCK1.gridy = 0;
		add(lblBLOCK1, gbc_lblBLOCK1);
		
		JLabel lblBLOCK2 = new JLabel("BLOCK");
		lblBLOCK2.setForeground(new Color(240, 240, 240));
		lblBLOCK2.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBLOCK2 = new GridBagConstraints();
		gbc_lblBLOCK2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBLOCK2.insets = new Insets(0, 0, 5, 5);
		gbc_lblBLOCK2.gridx = 3;
		gbc_lblBLOCK2.gridy = 0;
		add(lblBLOCK2, gbc_lblBLOCK2);
		
		JLabel lblBLOCK3 = new JLabel("BLOCK");
		lblBLOCK3.setForeground(new Color(240, 240, 240));
		lblBLOCK3.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBLOCK3 = new GridBagConstraints();
		gbc_lblBLOCK3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBLOCK3.insets = new Insets(0, 0, 5, 0);
		gbc_lblBLOCK3.gridx = 6;
		gbc_lblBLOCK3.gridy = 0;
		add(lblBLOCK3, gbc_lblBLOCK3);
		
		JLabel lblSummaryHeading = new JLabel("Summary");
		lblSummaryHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblSummaryHeading = new GridBagConstraints();
		gbc_lblSummaryHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblSummaryHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblSummaryHeading.gridx = 1;
		gbc_lblSummaryHeading.gridy = 1;
		add(lblSummaryHeading, gbc_lblSummaryHeading);
		
		JLabel lblBLOCK4 = new JLabel("BLOCK");
		lblBLOCK4.setForeground(new Color(240, 240, 240));
		lblBLOCK4.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBLOCK4 = new GridBagConstraints();
		gbc_lblBLOCK4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblBLOCK4.insets = new Insets(0, 0, 5, 5);
		gbc_lblBLOCK4.gridx = 0;
		gbc_lblBLOCK4.gridy = 2;
		add(lblBLOCK4, gbc_lblBLOCK4);
		
		JLabel lblPrimaryInformationHeading = new JLabel("Primary Information");
		lblPrimaryInformationHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblPrimaryInformationHeading = new GridBagConstraints();
		gbc_lblPrimaryInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPrimaryInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrimaryInformationHeading.gridx = 1;
		gbc_lblPrimaryInformationHeading.gridy = 3;
		add(lblPrimaryInformationHeading, gbc_lblPrimaryInformationHeading);
		
		lblStudentApplicationType = new JLabel("Select Your Application Type");
		lblStudentApplicationType.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentApplicationType = new GridBagConstraints();
		gbc_lblStudentApplicationType.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentApplicationType.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentApplicationType.gridx = 1;
		gbc_lblStudentApplicationType.gridy = 4;
		add(lblStudentApplicationType, gbc_lblStudentApplicationType);
		
		textFieldStudentApplicationType = new JTextField();
		textFieldStudentApplicationType.setEditable(false);
		GridBagConstraints gbc_textFieldStudentApplicationType = new GridBagConstraints();
		gbc_textFieldStudentApplicationType.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentApplicationType.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentApplicationType.gridx = 2;
		gbc_textFieldStudentApplicationType.gridy = 4;
		add(textFieldStudentApplicationType, gbc_textFieldStudentApplicationType);
		textFieldStudentApplicationType.setColumns(10);
		
		lblStudentIntendedAcademicYear = new JLabel("Intended Academic Year");
		lblStudentIntendedAcademicYear.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentIntendedAcademicYear = new GridBagConstraints();
		gbc_lblStudentIntendedAcademicYear.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentIntendedAcademicYear.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentIntendedAcademicYear.gridx = 4;
		gbc_lblStudentIntendedAcademicYear.gridy = 4;
		add(lblStudentIntendedAcademicYear, gbc_lblStudentIntendedAcademicYear);
		
		textFieldStudentIntendedAcademicYear = new JTextField();
		textFieldStudentIntendedAcademicYear.setEditable(false);
		textFieldStudentIntendedAcademicYear.setColumns(10);
		GridBagConstraints gbc_textFieldStudentIntendedAcademicYear = new GridBagConstraints();
		gbc_textFieldStudentIntendedAcademicYear.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentIntendedAcademicYear.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentIntendedAcademicYear.gridx = 5;
		gbc_textFieldStudentIntendedAcademicYear.gridy = 4;
		add(textFieldStudentIntendedAcademicYear, gbc_textFieldStudentIntendedAcademicYear);
		
		lblStudentFirstName = new JLabel("First Name");
		lblStudentFirstName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentFirstName = new GridBagConstraints();
		gbc_lblStudentFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentFirstName.gridx = 1;
		gbc_lblStudentFirstName.gridy = 5;
		add(lblStudentFirstName, gbc_lblStudentFirstName);
		
		textFieldStudentFirstName = new JTextField();
		textFieldStudentFirstName.setEditable(false);
		textFieldStudentFirstName.setColumns(10);
		GridBagConstraints gbc_textFieldStudentFirstName = new GridBagConstraints();
		gbc_textFieldStudentFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentFirstName.gridx = 2;
		gbc_textFieldStudentFirstName.gridy = 5;
		add(textFieldStudentFirstName, gbc_textFieldStudentFirstName);
		
		lblStudentGradingPeriod = new JLabel("Grading Period");
		lblStudentGradingPeriod.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentGradingPeriod = new GridBagConstraints();
		gbc_lblStudentGradingPeriod.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentGradingPeriod.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentGradingPeriod.gridx = 4;
		gbc_lblStudentGradingPeriod.gridy = 5;
		add(lblStudentGradingPeriod, gbc_lblStudentGradingPeriod);
		
		textFieldStudentGradingPeriod = new JTextField();
		textFieldStudentGradingPeriod.setEditable(false);
		textFieldStudentGradingPeriod.setColumns(10);
		GridBagConstraints gbc_textFieldStudentGradingPeriod = new GridBagConstraints();
		gbc_textFieldStudentGradingPeriod.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentGradingPeriod.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentGradingPeriod.gridx = 5;
		gbc_textFieldStudentGradingPeriod.gridy = 5;
		add(textFieldStudentGradingPeriod, gbc_textFieldStudentGradingPeriod);
		
		lblStudentMiddleName = new JLabel("Middle Name");
		lblStudentMiddleName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentMiddleName = new GridBagConstraints();
		gbc_lblStudentMiddleName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentMiddleName.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentMiddleName.gridx = 1;
		gbc_lblStudentMiddleName.gridy = 6;
		add(lblStudentMiddleName, gbc_lblStudentMiddleName);
		
		textFieldStudentMiddleName = new JTextField();
		textFieldStudentMiddleName.setEditable(false);
		textFieldStudentMiddleName.setColumns(10);
		GridBagConstraints gbc_textFieldStudentMiddleName = new GridBagConstraints();
		gbc_textFieldStudentMiddleName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentMiddleName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentMiddleName.gridx = 2;
		gbc_textFieldStudentMiddleName.gridy = 6;
		add(textFieldStudentMiddleName, gbc_textFieldStudentMiddleName);
		
		lblStudentCampus = new JLabel("Campus");
		lblStudentCampus.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentCampus = new GridBagConstraints();
		gbc_lblStudentCampus.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentCampus.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCampus.gridx = 4;
		gbc_lblStudentCampus.gridy = 6;
		add(lblStudentCampus, gbc_lblStudentCampus);
		
		textFieldStudentCampus = new JTextField();
		textFieldStudentCampus.setEditable(false);
		textFieldStudentCampus.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCampus = new GridBagConstraints();
		gbc_textFieldStudentCampus.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCampus.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCampus.gridx = 5;
		gbc_textFieldStudentCampus.gridy = 6;
		add(textFieldStudentCampus, gbc_textFieldStudentCampus);
		
		lblStudentLastName = new JLabel("Last Name");
		lblStudentLastName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentLastName = new GridBagConstraints();
		gbc_lblStudentLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentLastName.gridx = 1;
		gbc_lblStudentLastName.gridy = 7;
		add(lblStudentLastName, gbc_lblStudentLastName);
		
		textFieldStudentLastName = new JTextField();
		textFieldStudentLastName.setEditable(false);
		textFieldStudentLastName.setColumns(10);
		GridBagConstraints gbc_textFieldStudentLastName = new GridBagConstraints();
		gbc_textFieldStudentLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentLastName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentLastName.gridx = 2;
		gbc_textFieldStudentLastName.gridy = 7;
		add(textFieldStudentLastName, gbc_textFieldStudentLastName);
		
		lblStudentYearLevel = new JLabel("Year Level");
		lblStudentYearLevel.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentYearLevel = new GridBagConstraints();
		gbc_lblStudentYearLevel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentYearLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentYearLevel.gridx = 4;
		gbc_lblStudentYearLevel.gridy = 7;
		add(lblStudentYearLevel, gbc_lblStudentYearLevel);
		
		textFieldStudentYearLevel = new JTextField();
		textFieldStudentYearLevel.setEditable(false);
		textFieldStudentYearLevel.setColumns(10);
		GridBagConstraints gbc_textFieldStudentYearLevel = new GridBagConstraints();
		gbc_textFieldStudentYearLevel.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentYearLevel.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentYearLevel.gridx = 5;
		gbc_textFieldStudentYearLevel.gridy = 7;
		add(textFieldStudentYearLevel, gbc_textFieldStudentYearLevel);
		
		lblStudentBirthDate = new JLabel("Birth Date");
		lblStudentBirthDate.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentBirthDate = new GridBagConstraints();
		gbc_lblStudentBirthDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentBirthDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentBirthDate.gridx = 1;
		gbc_lblStudentBirthDate.gridy = 8;
		add(lblStudentBirthDate, gbc_lblStudentBirthDate);
		
		textFieldStudentBirthDate = new JTextField();
		textFieldStudentBirthDate.setEditable(false);
		textFieldStudentBirthDate.setColumns(10);
		GridBagConstraints gbc_textFieldStudentBirthDate = new GridBagConstraints();
		gbc_textFieldStudentBirthDate.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentBirthDate.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentBirthDate.gridx = 2;
		gbc_textFieldStudentBirthDate.gridy = 8;
		add(textFieldStudentBirthDate, gbc_textFieldStudentBirthDate);
		
		lblStudentEmailAddress_1 = new JLabel("Email Address ");
		lblStudentEmailAddress_1.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentEmailAddress_1 = new GridBagConstraints();
		gbc_lblStudentEmailAddress_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentEmailAddress_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentEmailAddress_1.gridx = 4;
		gbc_lblStudentEmailAddress_1.gridy = 8;
		add(lblStudentEmailAddress_1, gbc_lblStudentEmailAddress_1);
		
		textFieldStudentEmailAddress_1 = new JTextField();
		textFieldStudentEmailAddress_1.setEditable(false);
		textFieldStudentEmailAddress_1.setColumns(10);
		GridBagConstraints gbc_textFieldStudentEmailAddress_1 = new GridBagConstraints();
		gbc_textFieldStudentEmailAddress_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentEmailAddress_1.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentEmailAddress_1.gridx = 5;
		gbc_textFieldStudentEmailAddress_1.gridy = 8;
		add(textFieldStudentEmailAddress_1, gbc_textFieldStudentEmailAddress_1);
		
		lblStudentPresentAge = new JLabel("Present Age");
		lblStudentPresentAge.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPresentAge = new GridBagConstraints();
		gbc_lblStudentPresentAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAge.gridx = 1;
		gbc_lblStudentPresentAge.gridy = 9;
		add(lblStudentPresentAge, gbc_lblStudentPresentAge);
		
		textFieldStudentPresentAge = new JTextField();
		textFieldStudentPresentAge.setEditable(false);
		textFieldStudentPresentAge.setColumns(10);
		GridBagConstraints gbc_textFieldStudentPresentAge = new GridBagConstraints();
		gbc_textFieldStudentPresentAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentPresentAge.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentPresentAge.gridx = 2;
		gbc_textFieldStudentPresentAge.gridy = 9;
		add(textFieldStudentPresentAge, gbc_textFieldStudentPresentAge);
		
		JLabel lblPersonalDetailsHeading = new JLabel("Personal Details");
		lblPersonalDetailsHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblPersonalDetailsHeading = new GridBagConstraints();
		gbc_lblPersonalDetailsHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPersonalDetailsHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersonalDetailsHeading.gridx = 1;
		gbc_lblPersonalDetailsHeading.gridy = 10;
		add(lblPersonalDetailsHeading, gbc_lblPersonalDetailsHeading);
		
		lblStudentSuffix = new JLabel("Suffix ");
		lblStudentSuffix.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSuffix = new GridBagConstraints();
		gbc_lblStudentSuffix.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentSuffix.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSuffix.gridx = 1;
		gbc_lblStudentSuffix.gridy = 11;
		add(lblStudentSuffix, gbc_lblStudentSuffix);
		
		textStudentFieldSuffix = new JTextField();
		textStudentFieldSuffix.setEditable(false);
		textStudentFieldSuffix.setColumns(10);
		GridBagConstraints gbc_textStudentFieldSuffix = new GridBagConstraints();
		gbc_textStudentFieldSuffix.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldSuffix.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldSuffix.gridx = 2;
		gbc_textStudentFieldSuffix.gridy = 11;
		add(textStudentFieldSuffix, gbc_textStudentFieldSuffix);
		
		lblStudentSex = new JLabel("Sex ");
		lblStudentSex.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentSex = new GridBagConstraints();
		gbc_lblStudentSex.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentSex.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentSex.gridx = 4;
		gbc_lblStudentSex.gridy = 11;
		add(lblStudentSex, gbc_lblStudentSex);
		
		textStudentFieldSex = new JTextField();
		textStudentFieldSex.setEditable(false);
		textStudentFieldSex.setColumns(10);
		GridBagConstraints gbc_textStudentFieldSex = new GridBagConstraints();
		gbc_textStudentFieldSex.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldSex.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldSex.gridx = 5;
		gbc_textStudentFieldSex.gridy = 11;
		add(textStudentFieldSex, gbc_textStudentFieldSex);
		
		lblStudentNickName = new JLabel("Nick Name ");
		lblStudentNickName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentNickName = new GridBagConstraints();
		gbc_lblStudentNickName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentNickName.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentNickName.gridx = 1;
		gbc_lblStudentNickName.gridy = 12;
		add(lblStudentNickName, gbc_lblStudentNickName);
		
		textStudentFieldNickName = new JTextField();
		textStudentFieldNickName.setEditable(false);
		textStudentFieldNickName.setColumns(10);
		GridBagConstraints gbc_textStudentFieldNickName = new GridBagConstraints();
		gbc_textStudentFieldNickName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldNickName.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldNickName.gridx = 2;
		gbc_textStudentFieldNickName.gridy = 12;
		add(textStudentFieldNickName, gbc_textStudentFieldNickName);
		
		lblStudentReligion = new JLabel("Religion ");
		lblStudentReligion.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentReligion = new GridBagConstraints();
		gbc_lblStudentReligion.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentReligion.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentReligion.gridx = 4;
		gbc_lblStudentReligion.gridy = 12;
		add(lblStudentReligion, gbc_lblStudentReligion);
		
		textStudentFieldReligion = new JTextField();
		textStudentFieldReligion.setEditable(false);
		textStudentFieldReligion.setColumns(10);
		GridBagConstraints gbc_textStudentFieldReligion = new GridBagConstraints();
		gbc_textStudentFieldReligion.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldReligion.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldReligion.gridx = 5;
		gbc_textStudentFieldReligion.gridy = 12;
		add(textStudentFieldReligion, gbc_textStudentFieldReligion);
		
		lblStudentPlaceOfBirth = new JLabel("Place of Birth ");
		lblStudentPlaceOfBirth.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentPlaceOfBirth = new GridBagConstraints();
		gbc_lblStudentPlaceOfBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPlaceOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPlaceOfBirth.gridx = 1;
		gbc_lblStudentPlaceOfBirth.gridy = 13;
		add(lblStudentPlaceOfBirth, gbc_lblStudentPlaceOfBirth);
		
		textStudentFieldPlaceOfBirth = new JTextField();
		textStudentFieldPlaceOfBirth.setEditable(false);
		textStudentFieldPlaceOfBirth.setColumns(10);
		GridBagConstraints gbc_textStudentFieldPlaceOfBirth = new GridBagConstraints();
		gbc_textStudentFieldPlaceOfBirth.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldPlaceOfBirth.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldPlaceOfBirth.gridx = 2;
		gbc_textStudentFieldPlaceOfBirth.gridy = 13;
		add(textStudentFieldPlaceOfBirth, gbc_textStudentFieldPlaceOfBirth);
		
		lblStudentLrnNo = new JLabel("LRN No. ");
		lblStudentLrnNo.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentLrnNo = new GridBagConstraints();
		gbc_lblStudentLrnNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentLrnNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentLrnNo.gridx = 4;
		gbc_lblStudentLrnNo.gridy = 13;
		add(lblStudentLrnNo, gbc_lblStudentLrnNo);
		
		textStudentFieldLrnNo = new JTextField();
		textStudentFieldLrnNo.setEditable(false);
		textStudentFieldLrnNo.setColumns(10);
		GridBagConstraints gbc_textStudentFieldLrnNo = new GridBagConstraints();
		gbc_textStudentFieldLrnNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldLrnNo.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldLrnNo.gridx = 5;
		gbc_textStudentFieldLrnNo.gridy = 13;
		add(textStudentFieldLrnNo, gbc_textStudentFieldLrnNo);
		
		lblStudentEmailAddress = new JLabel("Email Address");
		lblStudentEmailAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblStudentEmailAddress = new GridBagConstraints();
		gbc_lblStudentEmailAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentEmailAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentEmailAddress.gridx = 1;
		gbc_lblStudentEmailAddress.gridy = 14;
		add(lblStudentEmailAddress, gbc_lblStudentEmailAddress);
		
		textStudentFieldStudentEmailAddress = new JTextField();
		textStudentFieldStudentEmailAddress.setEditable(false);
		textStudentFieldStudentEmailAddress.setColumns(10);
		GridBagConstraints gbc_textStudentFieldStudentEmailAddress = new GridBagConstraints();
		gbc_textStudentFieldStudentEmailAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textStudentFieldStudentEmailAddress.insets = new Insets(0, 0, 5, 5);
		gbc_textStudentFieldStudentEmailAddress.gridx = 2;
		gbc_textStudentFieldStudentEmailAddress.gridy = 14;
		add(textStudentFieldStudentEmailAddress, gbc_textStudentFieldStudentEmailAddress);
		
		JLabel lblEducationBackgroundHeading = new JLabel("Education Background ");
		lblEducationBackgroundHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblEducationBackgroundHeading = new GridBagConstraints();
		gbc_lblEducationBackgroundHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEducationBackgroundHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundHeading.gridx = 1;
		gbc_lblEducationBackgroundHeading.gridy = 15;
		add(lblEducationBackgroundHeading, gbc_lblEducationBackgroundHeading);
		
		lblEducationBackgroundRecentSchoolAttended = new JLabel("Recent School Attended ");
		lblEducationBackgroundRecentSchoolAttended.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundRecentSchoolAttended = new GridBagConstraints();
		gbc_lblEducationBackgroundRecentSchoolAttended.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEducationBackgroundRecentSchoolAttended.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundRecentSchoolAttended.gridx = 1;
		gbc_lblEducationBackgroundRecentSchoolAttended.gridy = 16;
		add(lblEducationBackgroundRecentSchoolAttended, gbc_lblEducationBackgroundRecentSchoolAttended);
		
		textFieldEducationBackgroundRecentSchoolAttended = new JTextField();
		textFieldEducationBackgroundRecentSchoolAttended.setEditable(false);
		textFieldEducationBackgroundRecentSchoolAttended.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundRecentSchoolAttended = new GridBagConstraints();
		gbc_textFieldEducationBackgroundRecentSchoolAttended.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundRecentSchoolAttended.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundRecentSchoolAttended.gridx = 2;
		gbc_textFieldEducationBackgroundRecentSchoolAttended.gridy = 16;
		add(textFieldEducationBackgroundRecentSchoolAttended, gbc_textFieldEducationBackgroundRecentSchoolAttended);
		
		lblEducationBackgroundLandlineNo = new JLabel("Landline No. ");
		lblEducationBackgroundLandlineNo.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundLandlineNo = new GridBagConstraints();
		gbc_lblEducationBackgroundLandlineNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEducationBackgroundLandlineNo.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundLandlineNo.gridx = 4;
		gbc_lblEducationBackgroundLandlineNo.gridy = 16;
		add(lblEducationBackgroundLandlineNo, gbc_lblEducationBackgroundLandlineNo);
		
		textFieldEducationBackgroundLandlineNo = new JTextField();
		textFieldEducationBackgroundLandlineNo.setEditable(false);
		textFieldEducationBackgroundLandlineNo.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundLandlineNo = new GridBagConstraints();
		gbc_textFieldEducationBackgroundLandlineNo.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundLandlineNo.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundLandlineNo.gridx = 5;
		gbc_textFieldEducationBackgroundLandlineNo.gridy = 16;
		add(textFieldEducationBackgroundLandlineNo, gbc_textFieldEducationBackgroundLandlineNo);
		
		lblEducationBackgroundSchoolType = new JLabel("School Type ");
		lblEducationBackgroundSchoolType.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundSchoolType = new GridBagConstraints();
		gbc_lblEducationBackgroundSchoolType.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEducationBackgroundSchoolType.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundSchoolType.gridx = 1;
		gbc_lblEducationBackgroundSchoolType.gridy = 17;
		add(lblEducationBackgroundSchoolType, gbc_lblEducationBackgroundSchoolType);
		
		textFieldEducationBackgroundSchoolType = new JTextField();
		textFieldEducationBackgroundSchoolType.setEditable(false);
		textFieldEducationBackgroundSchoolType.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundSchoolType = new GridBagConstraints();
		gbc_textFieldEducationBackgroundSchoolType.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundSchoolType.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundSchoolType.gridx = 2;
		gbc_textFieldEducationBackgroundSchoolType.gridy = 17;
		add(textFieldEducationBackgroundSchoolType, gbc_textFieldEducationBackgroundSchoolType);
		
		lblEducationBackgroundSchoolAddress = new JLabel("Address of the School");
		lblEducationBackgroundSchoolAddress.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblEducationBackgroundSchoolAddress = new GridBagConstraints();
		gbc_lblEducationBackgroundSchoolAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEducationBackgroundSchoolAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblEducationBackgroundSchoolAddress.gridx = 4;
		gbc_lblEducationBackgroundSchoolAddress.gridy = 17;
		add(lblEducationBackgroundSchoolAddress, gbc_lblEducationBackgroundSchoolAddress);
		
		textFieldEducationBackgroundSchoolAddress = new JTextField();
		textFieldEducationBackgroundSchoolAddress.setEditable(false);
		textFieldEducationBackgroundSchoolAddress.setColumns(10);
		GridBagConstraints gbc_textFieldEducationBackgroundSchoolAddress = new GridBagConstraints();
		gbc_textFieldEducationBackgroundSchoolAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEducationBackgroundSchoolAddress.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEducationBackgroundSchoolAddress.gridx = 5;
		gbc_textFieldEducationBackgroundSchoolAddress.gridy = 17;
		add(textFieldEducationBackgroundSchoolAddress, gbc_textFieldEducationBackgroundSchoolAddress);
		
		JLabel lblStudentPresentAddressHeading = new JLabel("Student Present Address");
		lblStudentPresentAddressHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblStudentPresentAddressHeading = new GridBagConstraints();
		gbc_lblStudentPresentAddressHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentPresentAddressHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentPresentAddressHeading.gridx = 1;
		gbc_lblStudentPresentAddressHeading.gridy = 18;
		add(lblStudentPresentAddressHeading, gbc_lblStudentPresentAddressHeading);
		
		lblStudentStreetAddress = new JLabel("House No. / Street Address");
		GridBagConstraints gbc_lblStudentStreetAddress = new GridBagConstraints();
		gbc_lblStudentStreetAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentStreetAddress.gridx = 1;
		gbc_lblStudentStreetAddress.gridy = 19;
		add(lblStudentStreetAddress, gbc_lblStudentStreetAddress);
		
		textFieldStudentStreetAddress = new JTextField();
		textFieldStudentStreetAddress.setEditable(false);
		textFieldStudentStreetAddress.setColumns(10);
		GridBagConstraints gbc_textFieldStudentStreetAddress = new GridBagConstraints();
		gbc_textFieldStudentStreetAddress.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentStreetAddress.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentStreetAddress.gridx = 2;
		gbc_textFieldStudentStreetAddress.gridy = 19;
		add(textFieldStudentStreetAddress, gbc_textFieldStudentStreetAddress);
		
		lblStudentStudentProvince = new JLabel("Province ");
		GridBagConstraints gbc_lblStudentStudentProvince = new GridBagConstraints();
		gbc_lblStudentStudentProvince.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentStudentProvince.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentStudentProvince.gridx = 4;
		gbc_lblStudentStudentProvince.gridy = 19;
		add(lblStudentStudentProvince, gbc_lblStudentStudentProvince);
		
		textFieldStudentStudentProvince = new JTextField();
		textFieldStudentStudentProvince.setEditable(false);
		textFieldStudentStudentProvince.setColumns(10);
		GridBagConstraints gbc_textFieldStudentStudentProvince = new GridBagConstraints();
		gbc_textFieldStudentStudentProvince.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentStudentProvince.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentStudentProvince.gridx = 5;
		gbc_textFieldStudentStudentProvince.gridy = 19;
		add(textFieldStudentStudentProvince, gbc_textFieldStudentStudentProvince);
		
		lblStudentBarangay = new JLabel("Barangay");
		GridBagConstraints gbc_lblStudentBarangay = new GridBagConstraints();
		gbc_lblStudentBarangay.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentBarangay.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentBarangay.gridx = 1;
		gbc_lblStudentBarangay.gridy = 20;
		add(lblStudentBarangay, gbc_lblStudentBarangay);
		
		textFieldStudentBarangay = new JTextField();
		textFieldStudentBarangay.setEditable(false);
		textFieldStudentBarangay.setColumns(10);
		GridBagConstraints gbc_textFieldStudentBarangay = new GridBagConstraints();
		gbc_textFieldStudentBarangay.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentBarangay.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentBarangay.gridx = 2;
		gbc_textFieldStudentBarangay.gridy = 20;
		add(textFieldStudentBarangay, gbc_textFieldStudentBarangay);
		
		lblStudentZipCode = new JLabel("Zip Code ");
		GridBagConstraints gbc_lblStudentZipCode = new GridBagConstraints();
		gbc_lblStudentZipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentZipCode.gridx = 4;
		gbc_lblStudentZipCode.gridy = 20;
		add(lblStudentZipCode, gbc_lblStudentZipCode);
		
		textFieldStudentZipCode = new JTextField();
		textFieldStudentZipCode.setEditable(false);
		textFieldStudentZipCode.setColumns(10);
		GridBagConstraints gbc_textFieldStudentZipCode = new GridBagConstraints();
		gbc_textFieldStudentZipCode.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentZipCode.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentZipCode.gridx = 5;
		gbc_textFieldStudentZipCode.gridy = 20;
		add(textFieldStudentZipCode, gbc_textFieldStudentZipCode);
		
		lblStudentCity = new JLabel("City");
		GridBagConstraints gbc_lblStudentCity = new GridBagConstraints();
		gbc_lblStudentCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblStudentCity.insets = new Insets(0, 0, 5, 5);
		gbc_lblStudentCity.gridx = 1;
		gbc_lblStudentCity.gridy = 21;
		add(lblStudentCity, gbc_lblStudentCity);
		
		textFieldStudentCity = new JTextField();
		textFieldStudentCity.setEditable(false);
		textFieldStudentCity.setColumns(10);
		GridBagConstraints gbc_textFieldStudentCity = new GridBagConstraints();
		gbc_textFieldStudentCity.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldStudentCity.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldStudentCity.gridx = 2;
		gbc_textFieldStudentCity.gridy = 21;
		add(textFieldStudentCity, gbc_textFieldStudentCity);
		
		JLabel lblMotherInformationHeading = new JLabel("Mother Information");
		lblMotherInformationHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblMotherInformationHeading = new GridBagConstraints();
		gbc_lblMotherInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherInformationHeading.gridx = 1;
		gbc_lblMotherInformationHeading.gridy = 22;
		add(lblMotherInformationHeading, gbc_lblMotherInformationHeading);
		
		lblMotherFullName = new JLabel("Full Name");
		lblMotherFullName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherFullName = new GridBagConstraints();
		gbc_lblMotherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherFullName.gridx = 1;
		gbc_lblMotherFullName.gridy = 23;
		add(lblMotherFullName, gbc_lblMotherFullName);
		
		textFieldMotherFullName = new JTextField();
		textFieldMotherFullName.setEditable(false);
		textFieldMotherFullName.setColumns(10);
		GridBagConstraints gbc_textFieldMotherFullName = new GridBagConstraints();
		gbc_textFieldMotherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherFullName.gridx = 2;
		gbc_textFieldMotherFullName.gridy = 23;
		add(textFieldMotherFullName, gbc_textFieldMotherFullName);
		
		lblMotherCitizenship = new JLabel("Citizenship ");
		lblMotherCitizenship.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherCitizenship = new GridBagConstraints();
		gbc_lblMotherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherCitizenship.gridx = 4;
		gbc_lblMotherCitizenship.gridy = 23;
		add(lblMotherCitizenship, gbc_lblMotherCitizenship);
		
		textFieldMotherCitizenship = new JTextField();
		textFieldMotherCitizenship.setEditable(false);
		textFieldMotherCitizenship.setColumns(10);
		GridBagConstraints gbc_textFieldMotherCitizenship = new GridBagConstraints();
		gbc_textFieldMotherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherCitizenship.gridx = 5;
		gbc_textFieldMotherCitizenship.gridy = 23;
		add(textFieldMotherCitizenship, gbc_textFieldMotherCitizenship);
		
		lblMotherAge = new JLabel("Age");
		lblMotherAge.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherAge = new GridBagConstraints();
		gbc_lblMotherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherAge.gridx = 1;
		gbc_lblMotherAge.gridy = 24;
		add(lblMotherAge, gbc_lblMotherAge);
		
		textFieldMotherAge = new JTextField();
		textFieldMotherAge.setEditable(false);
		textFieldMotherAge.setColumns(10);
		GridBagConstraints gbc_textFieldMotherAge = new GridBagConstraints();
		gbc_textFieldMotherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherAge.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherAge.gridx = 2;
		gbc_textFieldMotherAge.gridy = 24;
		add(textFieldMotherAge, gbc_textFieldMotherAge);
		
		lblMotherContactNumber = new JLabel("Contact Number ");
		lblMotherContactNumber.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherContactNumber = new GridBagConstraints();
		gbc_lblMotherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherContactNumber.gridx = 4;
		gbc_lblMotherContactNumber.gridy = 24;
		add(lblMotherContactNumber, gbc_lblMotherContactNumber);
		
		textFieldMotherContactNumber = new JTextField();
		textFieldMotherContactNumber.setEditable(false);
		textFieldMotherContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldMotherContactNumber = new GridBagConstraints();
		gbc_textFieldMotherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherContactNumber.gridx = 5;
		gbc_textFieldMotherContactNumber.gridy = 24;
		add(textFieldMotherContactNumber, gbc_textFieldMotherContactNumber);
		
		lblMotherOccupation = new JLabel("Occupation ");
		lblMotherOccupation.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherOccupation = new GridBagConstraints();
		gbc_lblMotherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherOccupation.gridx = 1;
		gbc_lblMotherOccupation.gridy = 25;
		add(lblMotherOccupation, gbc_lblMotherOccupation);
		
		textFieldMotherOccupation = new JTextField();
		textFieldMotherOccupation.setEditable(false);
		textFieldMotherOccupation.setColumns(10);
		GridBagConstraints gbc_textFieldMotherOccupation = new GridBagConstraints();
		gbc_textFieldMotherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherOccupation.gridx = 2;
		gbc_textFieldMotherOccupation.gridy = 25;
		add(textFieldMotherOccupation, gbc_textFieldMotherOccupation);
		
		lblMotherStatus = new JLabel("Status ");
		lblMotherStatus.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblMotherStatus = new GridBagConstraints();
		gbc_lblMotherStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblMotherStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblMotherStatus.gridx = 4;
		gbc_lblMotherStatus.gridy = 25;
		add(lblMotherStatus, gbc_lblMotherStatus);
		
		textFieldMotherStatus = new JTextField();
		textFieldMotherStatus.setEditable(false);
		textFieldMotherStatus.setColumns(10);
		GridBagConstraints gbc_textFieldMotherStatus = new GridBagConstraints();
		gbc_textFieldMotherStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldMotherStatus.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldMotherStatus.gridx = 5;
		gbc_textFieldMotherStatus.gridy = 25;
		add(textFieldMotherStatus, gbc_textFieldMotherStatus);
		
		lblFatherInformation = new JLabel("Father Information");
		lblFatherInformation.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblFatherInformation = new GridBagConstraints();
		gbc_lblFatherInformation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherInformation.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherInformation.gridx = 1;
		gbc_lblFatherInformation.gridy = 26;
		add(lblFatherInformation, gbc_lblFatherInformation);
		
		lblFatherFullName = new JLabel("Full Name ");
		lblFatherFullName.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherFullName = new GridBagConstraints();
		gbc_lblFatherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherFullName.gridx = 1;
		gbc_lblFatherFullName.gridy = 27;
		add(lblFatherFullName, gbc_lblFatherFullName);
		
		textFieldFatherFullName = new JTextField();
		textFieldFatherFullName.setEditable(false);
		textFieldFatherFullName.setColumns(10);
		GridBagConstraints gbc_textFieldFatherFullName = new GridBagConstraints();
		gbc_textFieldFatherFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherFullName.gridx = 2;
		gbc_textFieldFatherFullName.gridy = 27;
		add(textFieldFatherFullName, gbc_textFieldFatherFullName);
		
		lblFatherCitizenship = new JLabel("Citizenship ");
		lblFatherCitizenship.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherCitizenship = new GridBagConstraints();
		gbc_lblFatherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherCitizenship.gridx = 4;
		gbc_lblFatherCitizenship.gridy = 27;
		add(lblFatherCitizenship, gbc_lblFatherCitizenship);
		
		textFieldFatherCitizenship = new JTextField();
		textFieldFatherCitizenship.setEditable(false);
		textFieldFatherCitizenship.setColumns(10);
		GridBagConstraints gbc_textFieldFatherCitizenship = new GridBagConstraints();
		gbc_textFieldFatherCitizenship.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherCitizenship.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherCitizenship.gridx = 5;
		gbc_textFieldFatherCitizenship.gridy = 27;
		add(textFieldFatherCitizenship, gbc_textFieldFatherCitizenship);
		
		lblFatherAge = new JLabel("Age ");
		lblFatherAge.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherAge = new GridBagConstraints();
		gbc_lblFatherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherAge.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherAge.gridx = 1;
		gbc_lblFatherAge.gridy = 28;
		add(lblFatherAge, gbc_lblFatherAge);
		
		textFieldFatherAge = new JTextField();
		textFieldFatherAge.setEditable(false);
		textFieldFatherAge.setColumns(10);
		GridBagConstraints gbc_textFieldFatherAge = new GridBagConstraints();
		gbc_textFieldFatherAge.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherAge.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherAge.gridx = 2;
		gbc_textFieldFatherAge.gridy = 28;
		add(textFieldFatherAge, gbc_textFieldFatherAge);
		
		lblFatherContactNumber = new JLabel("Contact Number  ");
		lblFatherContactNumber.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherContactNumber = new GridBagConstraints();
		gbc_lblFatherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherContactNumber.gridx = 4;
		gbc_lblFatherContactNumber.gridy = 28;
		add(lblFatherContactNumber, gbc_lblFatherContactNumber);
		
		textFieldFatherContactNumber = new JTextField();
		textFieldFatherContactNumber.setEditable(false);
		textFieldFatherContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldFatherContactNumber = new GridBagConstraints();
		gbc_textFieldFatherContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherContactNumber.gridx = 5;
		gbc_textFieldFatherContactNumber.gridy = 28;
		add(textFieldFatherContactNumber, gbc_textFieldFatherContactNumber);
		
		lblFatherOccupation = new JLabel("Occupation ");
		lblFatherOccupation.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherOccupation = new GridBagConstraints();
		gbc_lblFatherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherOccupation.gridx = 1;
		gbc_lblFatherOccupation.gridy = 29;
		add(lblFatherOccupation, gbc_lblFatherOccupation);
		
		textFieldFatherOccupation = new JTextField();
		textFieldFatherOccupation.setEditable(false);
		textFieldFatherOccupation.setColumns(10);
		GridBagConstraints gbc_textFieldFatherOccupation = new GridBagConstraints();
		gbc_textFieldFatherOccupation.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherOccupation.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherOccupation.gridx = 2;
		gbc_textFieldFatherOccupation.gridy = 29;
		add(textFieldFatherOccupation, gbc_textFieldFatherOccupation);
		
		lblFatherStatus = new JLabel("Status");
		lblFatherStatus.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblFatherStatus = new GridBagConstraints();
		gbc_lblFatherStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFatherStatus.insets = new Insets(0, 0, 5, 5);
		gbc_lblFatherStatus.gridx = 4;
		gbc_lblFatherStatus.gridy = 29;
		add(lblFatherStatus, gbc_lblFatherStatus);
		
		textFieldFatherStatus = new JTextField();
		textFieldFatherStatus.setEditable(false);
		textFieldFatherStatus.setColumns(10);
		GridBagConstraints gbc_textFieldFatherStatus = new GridBagConstraints();
		gbc_textFieldFatherStatus.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFatherStatus.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFatherStatus.gridx = 5;
		gbc_textFieldFatherStatus.gridy = 29;
		add(textFieldFatherStatus, gbc_textFieldFatherStatus);
		
		JLabel lblGuardianInformationHeading = new JLabel("Guardian Information ");
		lblGuardianInformationHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblGuardianInformationHeading = new GridBagConstraints();
		gbc_lblGuardianInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianInformationHeading.gridx = 1;
		gbc_lblGuardianInformationHeading.gridy = 30;
		add(lblGuardianInformationHeading, gbc_lblGuardianInformationHeading);
		
		JLabel lblEmergencyContactHeading = new JLabel("Emergency Contact ");
		lblEmergencyContactHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblEmergencyContactHeading = new GridBagConstraints();
		gbc_lblEmergencyContactHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyContactHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyContactHeading.gridx = 4;
		gbc_lblEmergencyContactHeading.gridy = 30;
		add(lblEmergencyContactHeading, gbc_lblEmergencyContactHeading);
		
		lblGuardianFullName = new JLabel("Full Name ");
		GridBagConstraints gbc_lblGuardianFullName = new GridBagConstraints();
		gbc_lblGuardianFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianFullName.gridx = 1;
		gbc_lblGuardianFullName.gridy = 31;
		add(lblGuardianFullName, gbc_lblGuardianFullName);
		
		textFieldGuardianFullName = new JTextField();
		textFieldGuardianFullName.setEditable(false);
		textFieldGuardianFullName.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianFullName = new GridBagConstraints();
		gbc_textFieldGuardianFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianFullName.gridx = 2;
		gbc_textFieldGuardianFullName.gridy = 31;
		add(textFieldGuardianFullName, gbc_textFieldGuardianFullName);
		
		lblEmergencyFullName = new JLabel("Full Name ");
		GridBagConstraints gbc_lblEmergencyFullName = new GridBagConstraints();
		gbc_lblEmergencyFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyFullName.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyFullName.gridx = 4;
		gbc_lblEmergencyFullName.gridy = 31;
		add(lblEmergencyFullName, gbc_lblEmergencyFullName);
		
		textFieldEmergencyFullName = new JTextField();
		textFieldEmergencyFullName.setEditable(false);
		textFieldEmergencyFullName.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyFullName = new GridBagConstraints();
		gbc_textFieldEmergencyFullName.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyFullName.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyFullName.gridx = 5;
		gbc_textFieldEmergencyFullName.gridy = 31;
		add(textFieldEmergencyFullName, gbc_textFieldEmergencyFullName);
		
		lblGuardianRelationshipToStudent = new JLabel("Relationship to Student ");
		GridBagConstraints gbc_lblGuardianRelationshipToStudent = new GridBagConstraints();
		gbc_lblGuardianRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianRelationshipToStudent.gridx = 1;
		gbc_lblGuardianRelationshipToStudent.gridy = 32;
		add(lblGuardianRelationshipToStudent, gbc_lblGuardianRelationshipToStudent);
		
		textFieldGuardianRelationshipToStudent = new JTextField();
		textFieldGuardianRelationshipToStudent.setEditable(false);
		textFieldGuardianRelationshipToStudent.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianRelationshipToStudent = new GridBagConstraints();
		gbc_textFieldGuardianRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianRelationshipToStudent.gridx = 2;
		gbc_textFieldGuardianRelationshipToStudent.gridy = 32;
		add(textFieldGuardianRelationshipToStudent, gbc_textFieldGuardianRelationshipToStudent);
		
		lblEmergencyRelationshipToStudent = new JLabel("Relationship to Student ");
		GridBagConstraints gbc_lblEmergencyRelationshipToStudent = new GridBagConstraints();
		gbc_lblEmergencyRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyRelationshipToStudent.gridx = 4;
		gbc_lblEmergencyRelationshipToStudent.gridy = 32;
		add(lblEmergencyRelationshipToStudent, gbc_lblEmergencyRelationshipToStudent);
		
		textFieldEmergencyRelationshipToStudent = new JTextField();
		textFieldEmergencyRelationshipToStudent.setEditable(false);
		textFieldEmergencyRelationshipToStudent.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyRelationshipToStudent = new GridBagConstraints();
		gbc_textFieldEmergencyRelationshipToStudent.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyRelationshipToStudent.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyRelationshipToStudent.gridx = 5;
		gbc_textFieldEmergencyRelationshipToStudent.gridy = 32;
		add(textFieldEmergencyRelationshipToStudent, gbc_textFieldEmergencyRelationshipToStudent);
		
		lblGuardianContactNumber = new JLabel("Contact Number");
		GridBagConstraints gbc_lblGuardianContactNumber = new GridBagConstraints();
		gbc_lblGuardianContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblGuardianContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblGuardianContactNumber.gridx = 1;
		gbc_lblGuardianContactNumber.gridy = 33;
		add(lblGuardianContactNumber, gbc_lblGuardianContactNumber);
		
		textFieldGuardianContactNumber = new JTextField();
		textFieldGuardianContactNumber.setEditable(false);
		textFieldGuardianContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldGuardianContactNumber = new GridBagConstraints();
		gbc_textFieldGuardianContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldGuardianContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldGuardianContactNumber.gridx = 2;
		gbc_textFieldGuardianContactNumber.gridy = 33;
		add(textFieldGuardianContactNumber, gbc_textFieldGuardianContactNumber);
		
		lblEmergencyContactNumber = new JLabel("Contact Number");
		GridBagConstraints gbc_lblEmergencyContactNumber = new GridBagConstraints();
		gbc_lblEmergencyContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblEmergencyContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmergencyContactNumber.gridx = 4;
		gbc_lblEmergencyContactNumber.gridy = 33;
		add(lblEmergencyContactNumber, gbc_lblEmergencyContactNumber);
		
		textFieldEmergencyContactNumber = new JTextField();
		textFieldEmergencyContactNumber.setEditable(false);
		textFieldEmergencyContactNumber.setColumns(10);
		GridBagConstraints gbc_textFieldEmergencyContactNumber = new GridBagConstraints();
		gbc_textFieldEmergencyContactNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldEmergencyContactNumber.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldEmergencyContactNumber.gridx = 5;
		gbc_textFieldEmergencyContactNumber.gridy = 33;
		add(textFieldEmergencyContactNumber, gbc_textFieldEmergencyContactNumber);
		
		JLabel lblAcademicInformationHeading = new JLabel("Academic Information ");
		lblAcademicInformationHeading.setFont(new Font("Dialog", Font.BOLD, 14));
		GridBagConstraints gbc_lblAcademicInformationHeading = new GridBagConstraints();
		gbc_lblAcademicInformationHeading.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAcademicInformationHeading.insets = new Insets(0, 0, 5, 5);
		gbc_lblAcademicInformationHeading.gridx = 1;
		gbc_lblAcademicInformationHeading.gridy = 34;
		add(lblAcademicInformationHeading, gbc_lblAcademicInformationHeading);
		
		JLabel lblFilesUpload = new JLabel("Files upload ");
		GridBagConstraints gbc_lblFilesUpload = new GridBagConstraints();
		gbc_lblFilesUpload.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFilesUpload.insets = new Insets(0, 0, 5, 5);
		gbc_lblFilesUpload.gridx = 1;
		gbc_lblFilesUpload.gridy = 35;
		add(lblFilesUpload, gbc_lblFilesUpload);
		
		textFieldFilesUpload = new JTextField();
		textFieldFilesUpload.setEditable(false);
		textFieldFilesUpload.setText("Yes");
		textFieldFilesUpload.setColumns(10);
		GridBagConstraints gbc_textFieldFilesUpload = new GridBagConstraints();
		gbc_textFieldFilesUpload.fill = GridBagConstraints.HORIZONTAL;
		gbc_textFieldFilesUpload.insets = new Insets(0, 0, 5, 5);
		gbc_textFieldFilesUpload.gridx = 2;
		gbc_textFieldFilesUpload.gridy = 35;
		add(textFieldFilesUpload, gbc_textFieldFilesUpload);
		
		JButton btnSummarySubmit = new JButton("Submit");
		btnSummarySubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(StudentDashboardAdmissionSummary.this);
                if (parentFrame != null) {
                    parentFrame.dispose();
                    StudentDashboard studentDashboardFrame = new StudentDashboard();
                    studentDashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    studentDashboardFrame.setVisible(true);
                }
			}
		});
		btnSummarySubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSummarySubmit.setFocusable(false);
		btnSummarySubmit.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnSummarySubmit.setBackground(Color.YELLOW);
		GridBagConstraints gbc_btnSummarySubmit = new GridBagConstraints();
		gbc_btnSummarySubmit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSummarySubmit.insets = new Insets(0, 0, 5, 5);
		gbc_btnSummarySubmit.gridx = 5;
		gbc_btnSummarySubmit.gridy = 36;
		add(btnSummarySubmit, gbc_btnSummarySubmit);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	               JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(StudentDashboardAdmissionSummary.this);
	                if (parentFrame != null) {
	                    parentFrame.dispose();
	                    StudentDashboard studentDashboardFrame = new StudentDashboard();
	                    studentDashboardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	                    studentDashboardFrame.setVisible(true);
	                }			}
		});
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnClose.setFocusable(false);
		btnClose.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnClose.setBackground(new Color(255, 255, 0));
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClose.insets = new Insets(0, 0, 5, 5);
		gbc_btnClose.gridx = 5;
		gbc_btnClose.gridy = 37;
		add(btnClose, gbc_btnClose);
		
		JLabel lblBLOCK5 = new JLabel("BLOCK");
		lblBLOCK5.setForeground(UIManager.getColor("Button.background"));
		lblBLOCK5.setFont(new Font("Dialog", Font.PLAIN, 12));
		GridBagConstraints gbc_lblBLOCK5 = new GridBagConstraints();
		gbc_lblBLOCK5.insets = new Insets(0, 0, 0, 5);
		gbc_lblBLOCK5.gridx = 0;
		gbc_lblBLOCK5.gridy = 38;
		add(lblBLOCK5, gbc_lblBLOCK5);
	}
	

}
