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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateItem extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static UpdateItem frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new UpdateItem();
					frame.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public UpdateItem() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1000, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);

		setContentPane(contentPane);
		
		JLabel lblupd = new JLabel("Update Item");
		lblupd.setForeground(Color.WHITE);
		lblupd.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JLabel lblItemId = new JLabel("Enter the id of item to be updated:");
		lblItemId.setForeground(Color.WHITE);
		lblItemId.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JLabel lblqty = new JLabel("Enter the new quantity:");
		lblqty.setForeground(Color.WHITE);
		lblqty.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnupd = new JButton("Update");
		btnupd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String id=textField.getText();
				int qty=Integer.parseInt(textField_1.getText());
				int i=UpdateItemdbc.update(id, qty);
				if(i>0)
				{
					JOptionPane.showMessageDialog(UpdateItem.this,"Item updated successfully!");
					LoginSuccessful.main(new String[]{});
					frame.dispose();
					
				}
				else
				{
					JOptionPane.showMessageDialog(UpdateItem.this,"Sorry, item with this id does not exist!");
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
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lblupd)
						.addComponent(lblItemId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblqty, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(139, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(btnupd, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(500))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					
					.addGap(187))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					
					.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(500))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblupd)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblItemId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblqty)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(btnupd, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(btnBack)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					
					.addGap(72))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
