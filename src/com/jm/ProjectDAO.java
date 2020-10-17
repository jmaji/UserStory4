package com.jm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProjectDAO {

	Connection con;
	
	public boolean insertProject(Project p) throws ClassNotFoundException
	{
		try {
			con=DBConnector.getConnection();
			PreparedStatement pst=con.prepareStatement("Insert into Project Values(?,?,?,?)");
			pst.setInt(1, p.getId());
			pst.setString(2, p.getTitle());
			pst.setString(3, p.getDescr());
			pst.setString(4, p.getDomain());
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
