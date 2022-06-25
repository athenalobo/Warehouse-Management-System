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

public class DeleteItem extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static DeleteItem frame;
	private JPanel contentPane;
	private JTextField textField;
	
	
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					frame = new DeleteItem();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public DeleteItem() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 100, 1000, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		setContentPane(contentPane);
		
		JLabel lbld = new JLabel("                    Delete Item");
		lbld.setForeground(Color.WHITE);
		lbld.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		JLabel lblid = new JLabel("Item id:");
		lblid.setForeground(Color.WHITE);
		lblid.setFont(new Font("Calibri", Font.PLAIN, 30));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		
		JButton btnd = new JButton("Delete");
		btnd.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String id=textField.getText();
				
				int i=DeleteItemdbc.delete(id);
				if(i>0) 
				{
					JOptionPane.showMessageDialog(DeleteItem.this,"Item Deleted successfully!");
					LoginSuccessful.main(new String[]{});
					frame.dispose();
					
				}else
				{
					JOptionPane.showMessageDialog(DeleteItem.this,"This item does not exist!");
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
					.addGap(306)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(lbld)
						.addComponent(lblid, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						)
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
						)
					.addContainerGap(19, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(btnd, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(450))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(205, Short.MAX_VALUE)
					
					.addGap(187))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					
					.addContainerGap(294, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addGap(450))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lbld)
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblid)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(29)
					.addComponent(btnd, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(btnBack)
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					
					.addGap(72))
		);
		contentPane.setLayout(gl_contentPane);
	
	}

}
