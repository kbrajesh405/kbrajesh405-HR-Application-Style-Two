package com.thinking.machines.hr.tags;

import java.util.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import com.thinking.machines.hr.beans.*;
import com.thinking.machines.hr.dl.*;

public class DesignationsTagHandler extends BodyTagSupport
{
private List<DesignationBean> db;
private int index;

public DesignationsTagHandler()
{
reset();
}

private void reset()
{
index=0;
if(db != null)
{
db.clear();
db=null;
}
}

public int doStartTag()
{
List<DesignationDTO> dto=null;
try
{
dto = (new DesignationDAO()).getAll();
}catch(DAOException daoException)
{
System.out.println(daoException);
return super.SKIP_PAGE;
}
if(dto.size()==0) return super.SKIP_BODY;

db=new ArrayList<>();
DesignationBean designationBean;

for(DesignationDTO ddto : dto)
{
designationBean = new DesignationBean();
designationBean.setCode(ddto.getCode());
designationBean.setTitle(ddto.getTitle());
db.add(designationBean);
}
index=0;
designationBean = db.get(index);

pageContext.setAttribute("designationBean", designationBean, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("serialNumber", index+1);

return super.EVAL_BODY_INCLUDE;
}
public int doAfterBody()
{
index++;
if(db.size()==index) return super.SKIP_BODY;
DesignationBean designationBean = db.get(index);

pageContext.setAttribute("designationBean", designationBean, PageContext.REQUEST_SCOPE);
pageContext.setAttribute("serialNumber",index+1);

return super.EVAL_BODY_AGAIN;
}
public int doEndTag()
{
reset();
return super.EVAL_PAGE;
}

}