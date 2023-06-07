package com.thinking.machines.hr.dl;

import java.util.*;
import java.sql.*;

public class AdministratorDAO 
{
public AdministratorDTO getByUsername(String username) throws DAOException
{
AdministratorDTO adto = new AdministratorDTO();
try
{
Connection connection = DAOConnection.getConnection();
PreparedStatement preparedStatement;
preparedStatement=connection.prepareStatement("select * from Administrator where username = ?");
preparedStatement.setString(1, username);
ResultSet rs;
rs=preparedStatement.executeQuery();
if(rs.next()==false)
{
rs.close();
preparedStatement.close();
connection.close();
throw new DAOException("Invalid Username/Password");
}
adto.setUsername(username);
adto.setPassword(rs.getString("password").trim());

rs.close();
preparedStatement.close();
connection.close();

}catch(SQLException sql)
{
throw new DAOException(sql.getMessage());
}
catch(Exception e)
{
throw new DAOException(e.getMessage());
}
return adto;
}
}

