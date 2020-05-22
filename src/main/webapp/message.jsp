<%
String message = (String) session.getAttribute("message");
if (message!=null && message.contains("success")){
	


%>

<div class="alert alert-success alert-dismissible fade show" role="alert">
  <strong>You are now part of our family!</strong> 
  <hr>
  <p class="mb-0">Your profile has been created successfully</p>
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
  
    <span aria-hidden="true">&times;</span>
  </button>
</div>


<%
session.removeAttribute("message");
}else if (message.equals("e")){

%>



<div class="alert alert-warning alert-dismissible fade show" role="alert">
  <strong>You are now part of our family!</strong> 
  <hr>
  <p class="mb-0">Your profile has been created successfully</p>
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
  
    <span aria-hidden="true">&times;</span>
  </button>
</div>
<% }%>