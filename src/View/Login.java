package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javafx.scene.image.Image;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import sun.security.util.Password;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 420);
		setLocation(550, 200);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setForeground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		panel.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0110\u0102NG NH\u1EACP T\u00C0I KHO\u1EA2N");
		lblNewLabel.setBounds(181, 14, 293, 90);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		textField.setBounds(234, 120, 220, 42);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("NAME :");
		lblName.setIcon(new ImageIcon("D:\\SourceCode\\JavaSwingApplet\\user1.png"));
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblName.setBounds(45, 122, 174, 42);
		panel.add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setIcon(new ImageIcon("D:\\SourceCode\\JavaSwingApplet\\pass.png"));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblPassword.setBounds(45, 208, 161, 31);
		panel.add(lblPassword);
		
		JButton btnNewButton = new JButton("\u0110\u0103ng nh\u1EADp");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnNewButton.setBounds(245, 281, 115, 29);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(234, 203, 220, 42);
		panel.add(passwordField);
	}
}
