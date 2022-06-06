<h1> Welcome to JSP Page</h1>
<hr>
<h3>
   <%! 
      int a = 10;
      int b = 20;
      int count = 0;
   %>
   
   <%
      int  c = a+b;
   %>
   
   The value of a is : <%= a %><br>
   The value of b is : <%= b %><br><br>
   
   The sum of <%= a%> and <%=b%> is : <%= c %><br><br>
   
   You have visited this page <%= ++count %> times.
 </h3>