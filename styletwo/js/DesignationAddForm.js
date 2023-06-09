function employeeForormValidation(frm)
{
var valid=true;
var firstInvalidComponent=null;
var name=frm.name.value.trim();
var nameErrorSection=document.getElementById('nameErrorSection');
nameErrorSection.innerHTML="";
if(name.length==0)
{
nameErrorSection.innerHTML='Name required';
valid=false;
firstInvalidComponent=frm.name;
}

var designation=frm.designationCode.value.trim();
var designationCodeErrorSection=document.getElementById('designationCodeErrorSection');
designationCodeErrorSection.innerHTML="";
if(designation==-1)
{
designationCodeErrorSection.innerHTML='Select Designation';
valid=false;
if(firstInvalidComponent==null) firstInvalidComponent=frm.designationCode;
}

var dateOfBirth=frm.dateOfBirth.value.trim();
var dateOfBirthErrorSection=document.getElementById('dateOfBirthErrorSection');
dateOfBirthErrorSection.innerHTML="";
if(dateOfBirth.length==0)
{
dateOfBirthErrorSection.innerHTML='Date of Birth required';
valid=false;
if(firstInvalidComponent=null) firstInvalidComponent=frm.dateOfBirth;
}


var genderErrorSection=document.getElementById('genderErrorSection');
genderErrorSection.innerHTML="";
if(frm.gender[0].checked==false && frm.gender[1].checked==false)
{
genderErrorSection.innerHTML='Select Gender';
valid=false;
}

var basicSalary=frm.basicSalary.value.trim();
var basicSalaryErrorSection=document.getElementById('basicSalaryErrorSection');
basicSalaryErrorSection.innerHTML="";
if(basicSalary.length==0)
{
basicSalaryErrorSection.innerHTML='Basic Salary required';
valid=false;
if(firstInvalidComponent==null)firstInvalidComponent=frm.basicSalary;
}
else
{
var bb='0123456789.';
var e=0;
var i;
var isBasicSalaryValid=true;
while(e<basicSalary.length)
{
if(bb.indexOf(basicSalary.charAt(e))==-1)
{
basicSalaryErrorSection.innerHTML='Invalid Basic Salary';
valid=false;
if(firstInvalidComponent==null)firstInvalidComponent=frm.basicSalary;
}
e++;
}
if(isBasicSalaryValid)
{
var dot=basicSalary.indexOf(".");
if(dot!=-1)
{
var numberOfFractions=basicSalary.length-(dot+1);
if(numberOfFractions>2)
{
basicSalaryErrorSection.innerHTML='Invalid Basic Salary';
valid=false;
if(firstInvalidComponent==null)firstInvalidComponent=frm.basicSalary;
}
}
}
}

var panCardNumber=frm.panCardNumber.value.trim();
var panCardNumberErrorSection=document.getElementById('panCardNumberErrorSection');
panCardNumberErrorSection.innerHTML="";
if(panCardNumber.length==0)
{
panCardNumberErrorSection.innerHTML='PANN card number required';
valid=false;
firstInvalidComponent=frm.panCardNumber;
}

var aadharCardNumber=frm.aadharCardNumber.value.trim();
var aadharCardNumberErrorSection=document.getElementById('aadharCardNumberErrorSection');
aadharCardNumberErrorSection.innerHTML="";
if(aadharCardNumber.length==0)
{
aadharCardNumberErrorSection.innerHTML='Aadhar card number required';
valid=false;
firstInvalidComponent=frm.aadharCardNumber;
}
if(!valid) firstInvalidComponent.focus();
return valid;
}


function designationFormValidation(frm)
{
var title=frm.title.value.trim();
var titleErrorSection=document.getElementById('titleErrorSection');
titleErrorSection.innerHTML='';
if(title.length==0)
{
titleErrorSection.innerHTML='required';
frm.title.focus();
return false;
}

return true;
}

function cancelAddition()
{
document.getElementById('cancelAdditionForm').submit();
}

