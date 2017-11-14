package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Running extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Running frame = new Running();
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
	public Running() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 879, 659);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		setLocation(500, 200);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(208, 27, 445, 507);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Lb_Sentences = new JLabel("Part 1");
		Lb_Sentences.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Lb_Sentences.setBounds(181, 48, 98, 36);
		panel.add(Lb_Sentences);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		buttonGroup.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		chckbxNewCheckBox.setBounds(72, 132, 301, 45);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("New check box");
		buttonGroup.add(checkBox);
		checkBox.setBackground(Color.WHITE);
		checkBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		checkBox.setBounds(72, 225, 301, 45);
		panel.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("New check box");
		buttonGroup.add(checkBox_1);
		checkBox_1.setBackground(Color.WHITE);
		checkBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		checkBox_1.setBounds(72, 318, 301, 45);
		panel.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("New check box");
		buttonGroup.add(checkBox_2);
		checkBox_2.setBackground(Color.WHITE);
		checkBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		checkBox_2.setBounds(72, 411, 301, 45);
		panel.add(checkBox_2);
		
		JButton btnNewButton = new JButton("NEXT >>");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setSelectedIcon(null);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(238, 232, 170));
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(712, 27, 131, 67);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("<< BACK");
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setForeground(Color.BLACK);
		button.setBackground(new Color(238, 232, 170));
		button.setBounds(712, 120, 131, 67);
		contentPane.add(button);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setBackground(new Color(238, 232, 170));
		btnSubmit.setBounds(712, 216, 131, 67);
		contentPane.add(btnSubmit);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("clock.png"));
		lblNewLabel_1.setBounds(72, 120, 70, 67);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("00");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(25, 203, 64, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBounds(123, 203, 70, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_1 = new JLabel(":");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		label_1.setBounds(94, 203, 21, 50);
		contentPane.add(label_1);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 873, 619);
		contentPane.add(label);
		label.setIcon(new ImageIcon("A2.jpg"));
		
		
		
	}
}
