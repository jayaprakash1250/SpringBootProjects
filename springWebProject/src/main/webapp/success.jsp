<h1> Welcome ! <%= request.getParameter("user") %> </h1>
<h1> Welcome ! <%= session.getAttribute("uname") %> </h1>
<h1> Welcome ! <%= application.getAttribute("username") %> </h1>
<h3> You have successfully Logged In </h3>