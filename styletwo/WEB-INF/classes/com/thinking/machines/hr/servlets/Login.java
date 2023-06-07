package com.thinking.machines.hr.servlets;

import com.thinking.machines.hr.beans.*;
import com.thinking.machines.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet
{
public void doPost(HttpServletRequest request, HttpServletResponse response)
{

try
{
AdministratorBean ab;
ab = (AdministratorBean)request.getAttribute("administratorBean");
System.out.println(ab.getUsername());
System.out.println(ab.getPassword());

if(ab==null)
{
RequestDispatcher rd;
rd=request.getRequestDispatcher("/LoginForm.jsp");
try
{
rd.forward(request,response);
}catch(Exception e1)
{
// do Nothing
}
return;
}

String username = ab.getUsername();
String password = ab.getPassword();

AdministratorDAO adao=new AdministratorDAO();

AdministratorDTO adto = adao.getByUsername(username);
if(password.equals(adto.getPassword())==false)
{
ErrorBean errorBean;
errorBean = new ErrorBean();
errorBean.setError("Invalid Username/Password");
RequestDispatcher rd;
rd=request.getRequestDispatcher("/LoginForm.jsp");
try
{
rd.forward(request,response);
}catch(Exception e1)
{
// do Nothing
}
return;
}
HttpSession session = request.getSession();
session.setAttribute("username",username);
return;

}catch(DAOException dao)
{
ErrorBean errorBean;
errorBean = new ErrorBean();
errorBean.setError("Invalid Username/Password");
RequestDispatcher rd;
rd=request.getRequestDispatcher("/LoginForm.jsp");
try
{
rd.forward(request,response);
}catch(Exception e1)
{
// do Nothing
}



}


}
}