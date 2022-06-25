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

public class LoginSuccessful extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static LoginSuccessful frame;
	private JPanel cp;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				
				try 
				{
					frame= new LoginSuccessful();
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
	public LoginSuccessful() throws IOException 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1000, 450);
		cp = new JPanel();
		setContentPane(cp);
		cp.setBackground(Color.BLACK);
		
		//The setContentPane() method allows you to replace the content panel of the JFrame
		
		JLabel lblLoginSuccessfulManagement = new JLabel("Warehouse Management Portal");
		lblLoginSuccessfulManagement.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblLoginSuccessfulManagement.setForeground(Color.WHITE);
		
		
		JLabel imgLabel = new JLabel(new ImageIcon("\"C:\\Users\\CAREENA\\Downloads\\The-Role-of-Warehousing-In-Supply-Chain-Management (1).jpeg\""));
		
		add(imgLabel);
		
		JButton btnAddItem = new JButton("Add Item");
		btnAddItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AddItem.main(new String[]{});
				frame.dispose();
			}
		});
		btnAddItem.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JButton btnDeleteItem = new JButton("Delete Item");
		btnDeleteItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				DeleteItem.main(new String[]{});
				frame.dispose();				
			}
		});
		btnDeleteItem.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JButton btnUpdateItem = new JButton("Update Item");
		btnUpdateItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg1) 
			{
				UpdateItem.main(new String[]{});
				frame.dispose();	
			}
		});
		btnUpdateItem.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JButton btnViewItems = new JButton("View Items");
		btnViewItems.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg2) 
			{
				ViewItems.main(new String[]{});
				frame.dispose();	
			}
		});
		btnViewItems.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		GroupLayout gl = new GroupLayout(cp);
		//GroupLayout is a LayoutManager that hierarchically groups components in order to position them in a Container 
		gl.setHorizontalGroup
		(
			gl.createParallelGroup(Alignment.LEADING).addGroup(gl.createSequentialGroup().addGap(300).addComponent(lblLoginSuccessfulManagement))
			.addGroup(gl.createSequentialGroup().addGap(400).addGroup(gl.createParallelGroup(Alignment.TRAILING, false)
			.addComponent(btnDeleteItem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
			.addComponent(btnAddItem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
			.addComponent(btnUpdateItem, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
			
			.addComponent(btnViewItems, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
			.addContainerGap(95, Short.MAX_VALUE))
		);
		gl.setVerticalGroup
		(
			gl.createParallelGroup(Alignment.LEADING).addGroup(gl.createSequentialGroup().addContainerGap().addComponent(lblLoginSuccessfulManagement)
			.addGap(32)
			.addComponent(btnAddItem, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(ComponentPlacement.UNRELATED)
			.addComponent(btnDeleteItem, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(ComponentPlacement.UNRELATED)
			.addComponent(btnUpdateItem, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
			.addPreferredGap(ComponentPlacement.UNRELATED)
			.addComponent(btnViewItems, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
			.addContainerGap(70, Short.MAX_VALUE))
		);
		cp.setLayout(gl);
	}
}
