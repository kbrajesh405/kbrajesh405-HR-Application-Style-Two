<%@ taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm'%>
<tm:Module name='DESIGNATION' />

<%@taglib uri='/WEB-INF/mytags/tmtags.tld' prefix='tm'%>
<jsp:include page='/MasterPageTopSection.jsp'/>

<h3>Designations</h3><br>

<table border='1'>
<thead>
<tr>
<th colspan='4' style='text-align:right; padding:5px;'>
<a href='/styletwo/DesignationAddForm.jsp'>Add new designations</a>
</th>
</tr>
<tr>
<th style='width:60px; text-align:center'>S.No</th>
<th style='width:200px; text-align:center'>Designations</th>
<th style='width:200px; text-align:center'>Edit</th>
<th style='width:200px; text-align:center'>Delete</th>
</tr>
</thead>
<tbody>
<tm:EntityList populatorClass='com.thinking.machines.bl.DesignationBL' populatorMethod='getAll' name='dBean'>
<tr>
<td style='text-align:right'>${SerialNumber}.</td>
<td style='text-align:right'>${dBean.title}</td>
<td style='text-align:center'><a href='/styletwo/editDesignation?code={dBean.code}'>edit</a></td>

<td style='text-align:center'><a href='/styletwo/deleteDesignation?code={dBean.code}'>delete</a></td>
</tr>
</tm:EntityList>
</tbody>
</table>

<jsp:include page='/MasterPageBottomSection.jsp'/>
