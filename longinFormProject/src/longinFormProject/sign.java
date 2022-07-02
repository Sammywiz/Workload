package longinFormProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sign extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass1;
	private JTextField text1;
	private JTextField text3;
	private JPasswordField pass3;
	private JTextField text2_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sign frame = new sign();
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
	public sign() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 592);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 56, 527, 535);
		panel_1.setBackground(new Color(47, 79, 79));
		contentPane.add(panel_1);
		
		pass1 = new JPasswordField();
		pass1.setBounds(123, 149, 301, 25);
		pass1.setForeground(new Color(250, 240, 230));
		pass1.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_3 = new JLabel("Last Name:");
		lblNewLabel_3.setBounds(19, 76, 78, 25);
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(19, 40, 79, 28);
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		text1 = new JTextField();
		text1.setBounds(123, 40, 301, 25);
		text1.setForeground(new Color(250, 240, 230));
		text1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		text1.setColumns(10);
		text1.setBackground(Color.GRAY);
		
		JButton canbtn = new JButton("Cancel");
		canbtn.setBounds(136, 420, 80, 33);
		canbtn.setRequestFocusEnabled(false);
		canbtn.setForeground(Color.WHITE);
		canbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		canbtn.setBackground(new Color(255, 51, 0));
		
		JButton crtbtn = new JButton("Create ");
		crtbtn.setBounds(276, 420, 80, 33);
		crtbtn.setRequestFocusEnabled(false);
		crtbtn.setForeground(Color.WHITE);
		crtbtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		crtbtn.setBackground(new Color(51, 153, 255));
		
		text3 = new JTextField();
		text3.setBounds(123, 113, 301, 25);
		text3.setForeground(new Color(250, 240, 230));
		text3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		text3.setColumns(10);
		text3.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_2_1 = new JLabel("Username:");
		lblNewLabel_2_1.setBounds(19, 113, 74, 17);
		lblNewLabel_2_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_1 = new JLabel("Password:");
		lblNewLabel_3_1.setBounds(19, 149, 72, 17);
		lblNewLabel_3_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		pass3 = new JPasswordField();
		pass3.setBounds(123, 184, 301, 25);
		pass3.setForeground(new Color(250, 240, 230));
		pass3.setBackground(Color.GRAY);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Retype Pass:");
		lblNewLabel_3_1_1.setBounds(19, 184, 89, 17);
		lblNewLabel_3_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel Pic = new JLabel("");
		Pic.setBounds(123, 242, 232, 161);
		Pic.setOpaque(true);
		Pic.setBackground(Color.GRAY);
		Pic.setVerticalAlignment(SwingConstants.CENTER);
		Pic.setVerticalTextPosition(SwingConstants.CENTER);
		Pic.setFont(new Font("Arial", Font.BOLD, 14));
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Picture:");
		lblNewLabel_3_1_1_1.setBounds(46, 242, 53, 17);
		lblNewLabel_3_1_1_1.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton butn1 = new JButton("Browse");
		
		
		butn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fl = new JFileChooser();
				fl.setCurrentDirectory(new File(System.getProperty("user.home")));
				
				// file extention 
				FileNameExtensionFilter fll = new FileNameExtensionFilter ("*.image", "jpg", "gif");
				fl.addChoosableFileFilter(fll);
				
				int fileState = fl.showSaveDialog(null);
				
				// if the user select a file 
				if(fileState== JFileChooser.APPROVE_OPTION) {
					File select = fl.getSelectedFile();
					String pa = select.getAbsolutePath();
					
					// display the image in the JLabel
					Pic.setIcon(new ImageIcon(pa));
				}
				else if (fileState == JFileChooser.CANCEL_OPTION) {
					System.out.println("No Image Selected");
					
				}}
		});
		butn1.setBounds(365, 240, 79, 23);
		butn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		butn1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_4_1 = new JLabel("already have an account? click here to login");
		lblNewLabel_4_1.setBounds(126, 467, 239, 15);
		lblNewLabel_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Log sim = new Log();
				sim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sim.setVisible(true);
				dispose();				
				
				
			}
		});
		lblNewLabel_4_1.setForeground(Color.WHITE);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		text2_1 = new JTextField();
		text2_1.setBounds(123, 76, 301, 25);
		text2_1.setForeground(new Color(250, 240, 230));
		text2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		text2_1.setColumns(10);
		text2_1.setBackground(Color.GRAY);
		panel_1.setLayout(null);
		panel_1.add(lblNewLabel_2);
		panel_1.add(text1);
		panel_1.add(lblNewLabel_3);
		panel_1.add(text2_1);
		panel_1.add(lblNewLabel_2_1);
		panel_1.add(text3);
		panel_1.add(lblNewLabel_3_1);
		panel_1.add(pass1);
		panel_1.add(lblNewLabel_3_1_1);
		panel_1.add(pass3);
		panel_1.add(lblNewLabel_3_1_1_1);
		panel_1.add(lblNewLabel_4_1);
		panel_1.add(Pic);
		panel_1.add(butn1);
		panel_1.add(canbtn);
		panel_1.add(crtbtn);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 527, 59);
		panel.setPreferredSize(new Dimension(436, 59));
		panel.setBackground(new Color(50, 205, 50));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 21));
		
		JLabel lblNewLabel_1 = new JLabel("-");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}
		});
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.PLAIN, 21));
		
		JLabel login = new JLabel("Create New Account");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(Color.WHITE);
		login.setFont(new Font("Arial Black", Font.BOLD, 21));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
					.addGap(179)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(8, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(login, GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
