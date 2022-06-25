import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteItemdbc 
{
	public static int delete(String id)
	{
		int status=0;
		try
		{
			Connection con=DB.getConnection();
			
			status=updatebook(id);//updating quantity and issue
			
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	
	
	public static int updatebook(String id)
	{
		int status=0;
		
		try
		{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("delete from items where itemid=?");
			ps.setString(1,id);
			int rs=ps.executeUpdate();
			status=rs;
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
		
		
	}
}
