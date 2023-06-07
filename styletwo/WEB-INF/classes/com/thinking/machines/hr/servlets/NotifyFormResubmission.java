package com.thinking.machines.hr.servlets;

import com.thinking.machines.hr.beans.*;
import com.thinking.machines.hr.dl.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class NotifyFormResubmission extends HttpServlet
{
public void doPost(HttpServletRequest rq, HttpServletResponse rs)
{
try
{
MessageBean mb=new MessageBean();
mb.setHeading("Notification");
mb.setMessage("Form should not be submitted more than one times.");
mb.setGenerateOneButton(true);
mb.setButtonOneText("Yes");
mb.setButtonOneAction("index.jsp");
rq.setAttribute("messageBean",mb);
RequestDispatcher rd = rq.getRequestDispatcher("/Notification.jsp");
rd.forward(rq,rs);
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