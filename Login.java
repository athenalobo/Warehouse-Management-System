//If user wants to make any changes to the database, he has to Login first

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Login frame;
	private JPanel cp;
	private JTextField tf;
	private JPasswordField pf;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new Login();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	//Creating the frame
	public Login() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(150, 100, 1000, 450);
		cp = new JPanel();
		setContentPane(cp);
		cp.setBackground(Color.BLACK);
		
		JLabel sp= new JLabel(" ");
		sp.setForeground(Color.WHITE);
		sp.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel lblAdminLoginForm = new JLabel("                  To make changes to the Database, you have to Login!");
		lblAdminLoginForm.setForeground(Color.WHITE);
		lblAdminLoginForm.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JLabel lblEnterName = new JLabel("Enter Username:");
		lblEnterName.setForeground(Color.WHITE);
		lblEnterName.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		JLabel lblEnterPassword = new JLabel("Enter Password:");
		lblEnterPassword.setForeground(Color.WHITE);
		lblEnterPassword.setFont(new Font("Calibri", Font.PLAIN, 25));
		
		tf= new JTextField();
		tf.setColumns(20);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 25));
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name=tf.getText();
				String password=String.valueOf(pf.getPassword());
				if(name.equals("Athena")&&password.equals("180601")|| name.equals("Dhrithi")&&password.equals("000000"))
				{
					LoginSuccessful.main(new String[]{});
					frame.dispose();//current window is disposed and new window opens if details are correct
				}
				else
				{
					JOptionPane.showMessageDialog(Login.this, "Error","Try Again", JOptionPane.ERROR_MESSAGE);
					//Resetting both fields
					tf.setText("");
					pf.setText("");
				}
			}
			
		});
		
		pf = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(cp);//GroupLayout groups its components and places them in a container hierarchially
		gl_contentPane.setHorizontalGroup
		(
			gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane.createSequentialGroup()
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane.createSequentialGroup().addGap(100)
					.addComponent(sp).addGap(1000))
						
			.addComponent(lblAdminLoginForm)
			.addGroup(gl_contentPane.createSequentialGroup().addGap(19)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGap(250)
			.addComponent(lblEnterName)
			.addComponent(lblEnterPassword)).addGap(47)
			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
			.addComponent(pf)
			.addComponent(tf, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
			.addContainerGap(107, Short.MAX_VALUE))
			.addGroup(gl_contentPane.createSequentialGroup()
			.addContainerGap(187, Short.MAX_VALUE)
			.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE).addGap(900))
		);
		gl_contentPane.setVerticalGroup
		(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					
						.addComponent(sp)
						.addGap(30)
						
						.addComponent(lblAdminLoginForm)
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterName)
						.addComponent(tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEnterPassword)
						.addComponent(pf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		cp.setLayout(gl_contentPane);
	}
}
