import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class AddItemdbc 
{
		
		
	public static void save(String itemid,String itemname,String itemcolor, int itemqty)
	{
		int status=0;
		try
		{
			Connection con=DB.getConnection();
			

				PreparedStatement ps=con.prepareStatement("insert into items values(?,?,?,?)");
				ps.setString(1,itemid);
				
				ps.setString(2,itemname);
				ps.setString(3,itemcolor);
				ps.setInt(4,itemqty);
				
				status=ps.executeUpdate();
				System.out.println(status);

			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static int updateitem(String itemid)
	{
		int status=0;
		int itemqty=0;
		try
		{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select itemid,itemname from items where itemid=?");
			ps.setString(1,itemid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				itemqty=rs.getInt("itemqty");
			}
			
			if(itemqty>0)
			{
				PreparedStatement ps2=con.prepareStatement("update itemid set itemqty=? where itemid=?");
				ps2.setInt(1,itemqty-1);
				
				status=ps2.executeUpdate();
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}
