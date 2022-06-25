import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddItem extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	static AddItem frame;
	
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new AddItem();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public AddItem() 
	{
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1000, 450);
		JPanel cp = new JPanel();
		setContentPane(cp);
		cp.setBackground(Color.BLACK);
		
		
		JLabel lblNewLabel = new JLabel("         Add item ");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.WHITE);
		
		JLabel lblItemId = new JLabel("Item Id:");
		lblItemId.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblItemId.setForeground(Color.WHITE);
		
		JLabel lblItemName = new JLabel("Item Name:");
		lblItemName.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblItemName.setForeground(Color.WHITE);
		
		JLabel lblItemColor = new JLabel("Item Color:");
		lblItemColor.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblItemColor.setForeground(Color.WHITE);
		
		JLabel lblQty = new JLabel("Quantity:");
		lblQty.setFont(new Font("Calibri", Font.PLAIN, 30));
		lblQty.setForeground(Color.WHITE);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		
		JButton btnAddItem = new JButton("Add Item");
		
		btnAddItem.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				String itemid=textField_1.getText();
				if(itemid.equals(null))
				{
					JOptionPane.showMessageDialog(AddItem.this,"Item id cannot be blank!");
					LoginSuccessful.main(new String[]{});
					frame.dispose();
					System.exit(0);
				}
				
				String itemname=textField_2.getText();
				
				String itemcolor=textField_3.getText();
				
				int itemqty=Integer.parseInt(textField_4.getText());
				try 
				{
					
						
					AddItemdbc.save(itemid, itemname, itemcolor, itemqty);
					
						JOptionPane.showMessageDialog(AddItem.this,"Item Added successfully!");
						LoginSuccessful.main(new String[]{});
						frame.dispose();
				}catch(Exception error) {
					error.printStackTrace();
				}
		
					
				}
				
			
			
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				LoginSuccessful.main(new String[]{});
				frame.dispose();
			}
		});
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(cp);
		gl_contentPane.setHorizontalGroup
		(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(10, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblItemId)
								.addComponent(lblItemName)
								.addComponent(lblItemColor)
								.addComponent(lblQty))
							.addGap(100)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
							.addGap(500))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnAddItem, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGap(100))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(146)
					.addComponent(lblNewLabel)
					.addContainerGap(235, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(37)
					.addComponent(lblNewLabel)
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemId)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemName)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemColor)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblQty)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddItem, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBack))
					
					
					.addGap(25))
		);
		cp.setLayout(gl_contentPane);
	}
}
