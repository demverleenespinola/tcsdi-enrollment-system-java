package com.enrollment.system.app;

import java.awt.EventQueue;

import com.enrollment.system.frame.view.Login;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlatLightLaf.setup();
					Login loginFrame = new Login();
					loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
