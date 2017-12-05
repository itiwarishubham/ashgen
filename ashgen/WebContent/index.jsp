<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0">
  <title>Ashgen Enterprise Registration form </title>
  <!-- CORE CSS-->
  
  <link rel="stylesheet" href="materialize.min.css">

<style type="text/css">
html,
body {
    height: 100%;
}
html {
    display: table;
    margin: auto;
}
body {
    display: table-cell;
    vertical-align: middle;
}
</style>
  
</head>

<body class="blue">


  <div id="login-page" class="row">
    <div class="col s12 z-depth-6 card-panel">
      <form class="login-form" action="RegServlet" method="post">
        <div class="row">
          <div class="input-field col s12 center">
           <h3>ASHGEN ENTERPRISE</h3>

          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-social-person-outline prefix"></i>
            <input name="username" type="text" class="validate" placeholder="Username">
            
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-communication-email prefix"></i>
            <input name="email" type="email" class="validate" placeholder="Email">
           
          </div>
        </div>
		 <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-communication-phone prefix"></i>
            <input name="phoneno" type="number" class="validate" placeholder="Mobile No">
            
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-action-lock-outline prefix"></i>
            <input name="password" type="password" class="validate" placeholder="Password">
           
          </div>
        </div>
        <div class="row margin">
          <div class="input-field col s12">
            <i class="mdi-action-lock-outline prefix"></i>
            <input id="password-again" type="password" placeholder="Confirm Password">
            
          </div>
        </div>
        <div class="row">
          <div class="input-field col s12">
            <input class="btn waves-effect waves-light col s12" type="submit" value="Register Now"/>
            <%
					String msg = (String)request.getAttribute("msg");
					if(msg==null){}
					else{
				%><h2><%=msg%></h2><%}%>
          </div>
          <div class="input-field col s12">
            
          </div>
        </div>
      </form>
    </div>
  </div>


 

  

   <footer class="page-footer">
         
            <div class="container center">
            © 2017 SHUBHAM TIWARI
            
            </div>
         
  </footer>
</body>

</html>