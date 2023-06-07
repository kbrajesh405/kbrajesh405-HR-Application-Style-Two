package com.thinking.machines.hr.tags;

import javax.servlet.jsp.tagext.*;
import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import java.lang.reflect.*;
import java.io.*;

public class EntityListTagHandler extends BodyTagSupport
{
private int index;
private List list;
private String name;
private String populatorClass;
private String populatorMethod;

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return this.name;
}

public void setPopulatorClass(String populatorClass)
{
this.populatorClass=populatorClass;
}
public String getPopulatorClass()
{
return this.populatorClass;
}

public void setPopulatorMethod(String populatorMethod)
{
this.populatorMethod=populatorMethod;
}
public String getPopulatorMethod()
{
return this.populatorMethod;
}
public EntityListTagHandler()
{
reset();
}

public void reset()
{
this.index=0;
this.list=null;
this.name="";
this.populatorClass="";
this.populatorMethod="";
}

public int doStartTag()
{
try
{
if(name==null || name.trim().length()==0) return super.SKIP_BODY;
Class c = Class.forName(populatorClass);
Object obj = c.newInstance();
Class parameters[]=new Class[0];
Method method = c.getMethod(populatorMethod, parameters);
list = (List)method.invoke(obj);
if(list.size()==0) return super.SKIP_BODY;
if(list==null) return super.SKIP_BODY;
Object bean = list.get(index);
pageContext.setAttribute(name, bean, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("SerialNumber", index+1, PageContext.REQUEST_SCOPE);
index++;
}catch(Throwable t)
{
return super.SKIP_BODY;
}
return super.EVAL_BODY_INCLUDE;
}
public int doAfterBody()
{
if(list.size()==index) return super.SKIP_BODY;
Object bean = list.get(index);
pageContext.setAttribute(name, bean, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("SerialNumber",index+1, PageContext.REQUEST_SCOPE);
index++;
return super.EVAL_BODY_AGAIN;
}
public int doEndTag()
{
this.reset();
return super.EVAL_PAGE;
}
}