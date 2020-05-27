<%
String message = (String) session.getAttribute("message");
if (message!=null){
	

%>

<div class="alert alert-success alert-dismissible fade show col-11 offset-md-1" role="alert">
  <p class="mb-0"><%= message %>></p>
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
  
    <span aria-hidden="true">&times;</span>
  </button>
</div>


<%
session.removeAttribute("message");
}

%>
