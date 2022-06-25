import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateItemdbc 
{
	public static int update(String id,int qty)
	{
		int status=0;
		try
		{
			Connection con=DB.getConnection();
			
			status=updatebook(id,qty);//updating quantity and issue
			
			if(qty==0)
			{
			PreparedStatement ps=con.prepareStatement("delete from items where itemid=? and itemqty=?");
			ps.setString(1,id);
			ps.setInt(2,0);
			
			}
			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int updatebook(String id, int qty)
	{
		int status=0;
		
		try
		{
			Connection con=DB.getConnection();
			
			PreparedStatement ps=con.prepareStatement("update items set itemqty=? where itemid=?");
			ps.setInt(1,qty);
			ps.setString(2, id);
			int rs=ps.executeUpdate();
			status=rs;
			
//			
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
}
