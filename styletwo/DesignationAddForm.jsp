<%@ taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm' %>
<tm:Module name='DESIGNATION' />


<jsp:useBean id='designationBean' scope='request' class='com.thinking.machines.hr.beans.DesignationBean'/>
<jsp:include page='/MasterPageTopSection.jsp'/>
<jsp:useBean id='errorBean' scope='request' class='com.thinking.machines.hr.beans.ErrorBean'/>

<h3>Add Designation Module</h3><br>
<span class='error'>
<jsp:getProperty name='errorBean' property='error'/>
</span>
<form method='post' action='/styletwo/AddDesignation.jsp' onsubmit='return designationFormValidation(this)'>
<tm:FormID/>
Designation
<input type='text' id='title' name='title' maxlength='35' value='${designationBean.title}'>
<span id='titleErrorSection' class='error'></span><br>
<button type='submit'>Save</button>
<button type='button' onclick='cancelAddition()'>cancel</button>
</form>

<jsp:include page='/MasterPageBottomSection.jsp'/>