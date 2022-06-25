import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Warehouse extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static Warehouse frame;
	private JPanel cp;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				
				try 
				{
					frame= new Warehouse();
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
	public Warehouse()throws IOException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1000, 450);
		cp = new JPanel();
		setContentPane(cp);
		cp.setBackground(Color.BLACK);
		//The setContentPane() method allows you to replace the content panel of the JFrame
		
		JLabel lblWarehouseManagement = new JLabel("Warehouse Management Portal");
		lblWarehouseManagement.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblWarehouseManagement.setForeground(Color.WHITE);
		
		JLabel lblWarehouseManagemen = new JLabel(" ");
		lblWarehouseManagement.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblWarehouseManagement.setForeground(Color.WHITE);
		
		
		JLabel imgLabel = new JLabel(new ImageIcon("\"C:\\Users\\CAREENA\\Downloads\\The-Role-of-Warehousing-In-Supply-Chain-Management (1).jpeg\""));
		
		add(imgLabel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 30));
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Login.main(new String[]{});//change to LoginPage
				frame.dispose();
			}
		});
		btnLogin.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		
		
		GroupLayout gl = new GroupLayout(cp);
		//GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container 
		gl.setHorizontalGroup
		(
			gl.createParallelGroup(Alignment.LEADING).addGroup(gl.createSequentialGroup().addGap(280).addComponent(lblWarehouseManagemen))
			.addGroup(gl.createSequentialGroup().addGap(280).addGroup(gl.createParallelGroup(Alignment.TRAILING, false)
					.addComponent(lblWarehouseManagement, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					
					.addComponent(btnLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			))
		);
		gl.setVerticalGroup
		(
			gl.createParallelGroup(Alignment.LEADING).addGroup(gl.createSequentialGroup().addContainerGap().addComponent(lblWarehouseManagemen)
			.addGap(100)
			.addComponent(lblWarehouseManagement, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
			.addGap(80)
			.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(ComponentPlacement.UNRELATED)
			.addContainerGap(270, Short.MAX_VALUE))
		);
		cp.setLayout(gl);
	}
}
