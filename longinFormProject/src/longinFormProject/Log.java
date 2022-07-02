package longinFormProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.ImageIcon;

public class Log extends JFrame {

	private JPanel contentPane;
	private JPanel panel;
	private JLabel lblNewLabel_1;
	private JLabel login;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnCancel;
	private JLabel lblNewLabel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	public Log() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(47, 79, 79));
		panel_1.setBounds(0, 66, 450, 309);
		contentPane.add(panel_1);
		
		lblNewLabel_2 = new JLabel("Username:");
		lblNewLabel_2.setBounds(43, 42, 255, 29);
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		lblNewLabel_3 = new JLabel("Password:");
		lblNewLabel_3.setBounds(43, 101, 255, 27);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setBounds(142, 48, 156, 23);
		textField.setForeground(new Color(250, 240, 230));
		textField.setBackground(new Color(128, 128, 128));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_2);
		panel_1.add(lblNewLabel_3);
		panel_1.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(142, 101, 156, 27);
		passwordField.setForeground(new Color(250, 240, 230));
		passwordField.setBackground(new Color(128, 128, 128));
		panel_1.add(passwordField);
		
		JCheckBox chk = new JCheckBox("Show Password");
		chk.setBounds(313, 107, 103, 21);
		chk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(chk.isSelected()) {
				passwordField.setEchoChar((char)0);
			
			} else { passwordField.setEchoChar('*');
			}
			}
		});
		chk.setForeground(new Color(255, 255, 255));
		chk.setOpaque(false);
		chk.setRequestFocusEnabled(false);
		chk.setFont(new Font("Tahoma", Font.BOLD, 9));
		panel_1.add(chk);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(239, 160, 80, 33);
		btnNewButton.setRequestFocusEnabled(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(51, 153, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnNewButton);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancel.setBounds(134, 159, 82, 33);
		btnCancel.setRequestFocusEnabled(false);
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBackground(new Color(255, 51, 0));
		panel_1.add(btnCancel);
		
		lblNewLabel_4 = new JLabel("new user? click here to create an account");
		lblNewLabel_4.setBounds(99, 207, 232, 15);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				sign si = new sign();
				si.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				si.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\imaage.jpg"));
		lblNewLabel_5.setBounds(2, -1, 448, 309);
		panel_1.add(lblNewLabel_5);
		
		panel = new JPanel();
		panel.setPreferredSize(new Dimension(436, 59));
		panel.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 0, 450, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblNewLabel.setBounds(416, 11, 24, 40);
		panel.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(384, 11, 30, 40);
		panel.add(lblNewLabel_1);
		
		login = new JLabel("Login Form");
		
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Arial Black", Font.PLAIN, 21));
		login.setBounds(9, 17, 142, 40);
		
		panel.add(login);
	}
}
