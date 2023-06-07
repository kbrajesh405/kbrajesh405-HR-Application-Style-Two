package com.thinking.machines.hr.beans;

public class MessageBean
{
private String message;
private String heading;
private boolean generateOneButton;
private boolean generateTwoButton;
private String buttonOneText;
private String buttonTwoText;
private String buttonOneAction;
private String buttonTwoAction;

public MessageBean()
{
this.message="";
this.heading="";
this.generateOneButton=false;
this.generateTwoButton=false;
this.buttonOneText="";
this.buttonTwoText="";
this.buttonOneAction="";
this.buttonTwoAction="";
}

public void setMessage(String m)
{
this.message=m;
}
public String getMessage()
{
return this.message;
}

public void setHeading(String h)
{
this.heading=h;
}
public String getHeading()
{
return this.heading;
}

public void setGenerateOneButton(boolean g)
{
this.generateOneButton=g;
}
public boolean getGenerateOneButton()
{
return this.generateOneButton;
}

public void setGenerateTwoButton(boolean g)
{
this.generateTwoButton=g;
}
public boolean getGenerateTwoButton()
{
return this.generateTwoButton;
}

public void setButtonOneText(String g)
{
this.buttonOneText=g;
}
public String getButtonOneText()
{
return this.buttonOneText;
}

public void setButtonTwoText(String g)
{
this.buttonTwoText=g;
}
public String getButtonTwoText()
{
return this.buttonTwoText;
}

public void setButtonOneAction(String g)
{
this.buttonOneAction=g;
}
public String getButtonOneAction()
{
return this.buttonOneAction;
}

public void setButtonTwoAction(String g)
{
this.buttonTwoAction=g;
}
public String getButtonTwoAction()
{
return this.buttonTwoAction;
}
}