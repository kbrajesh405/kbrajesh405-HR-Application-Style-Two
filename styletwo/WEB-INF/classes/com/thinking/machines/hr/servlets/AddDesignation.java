package com.thinking.machines.hr.servlets;

import com.thinking.machines.hr.beans.*;
import com.thinking.machines.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddDesignation extends HttpServlet
{
public void doPost(HttpServletRequest rq, HttpServletResponse rs)
{
try
{
DesignationBean db;
db=(DesignationBean)rq.getAttribute("designationBean");
String title;
title=db.getTitle();

DesignationDTO dto=new DesignationDTO();
dto.setTitle(title);

DesignationDAO dao=new DesignationDAO();
try
{
dao.add(dto);
db.setCode(dto.getCode());
MessageBean mb=new MessageBean();
mb.setHeading("Designation (Add Module)");
mb.setMessage("Desgnation added, add more?");
mb.setGenerateOneButton(true);
mb.setGenerateTwoButton(true);
mb.setButtonOneText("Yes");
mb.setButtonTwoText("No");
mb.setButtonOneAction("DesignationAddForm.jsp");
mb.setButtonTwoAction("Designations.jsp");
rq.setAttribute("messageBean",mb);

RequestDispatcher rd = rq.getRequestDispatcher("/Notification.jsp");
rd.forward(rq,rs);
}catch(DAOException daoe)
{
ErrorBean errorBean=new ErrorBean();
errorBean.setError("daoe.getMessage()");
rq.setAttribute("errorBean",errorBean);
RequestDispatcher rd=rq.getRequestDispatcher("/DesignationAddForm.jsp");
//done done
}
}catch(Exception e)
{
//RequestDispatcher rd=rq.getRequestDispatcher("/ErrorPage.jsp");
//try
//{
//rd.forward(rq,rs);
//}catch(Exception e1)
//{
//System.out.println(e1);
//}
System.out.println(e);
}
}
}