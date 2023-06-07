<%@taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm'%>
<jsp:useBean id='messageBean' scope='request' class='com.thinking.machines.hr.beans.MessageBean'/>
<jsp:include page='/MasterPageTopSection.jsp'/>

<h3>${messageBean.heading}</h3><br>
${messageBean.message}

<tm:If condition='${messageBean.generateOneButton}'>
<form action='/styletwo/${messageBean.buttonOneAction}'>
<button>${messageBean.buttonOneText}</button>
</form>
<tm:If condition='${messageBean.generateTwoButton}'>
<form action='/styletwo/${messageBean.buttonTwoAction}'>
<button>${messageBean.buttonTwoText}</button>
</form>
</tm:If>
</tm:If>
<jsp:include page='/MasterPageBottomSection.jsp'/>