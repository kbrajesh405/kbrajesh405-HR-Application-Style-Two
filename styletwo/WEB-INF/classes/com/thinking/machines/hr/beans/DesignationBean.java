package com.thinking.machines.hr.beans;

public class DesignationBean
{
private int code;
private String title;
public DesignationBean()
{
this.code=0;
this.title="";
}

public void setCode(int c)
{
this.code=c;
}
public int getCode()
{
return this.code;
}

public void setTitle(String title)
{
this.title=title;
}
public String getTitle()
{
return this.title;
}
}