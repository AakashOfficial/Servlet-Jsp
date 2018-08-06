<%
   String name = request.getParameter( "username" );
   session.setAttribute( "theName", name );
%>
<HTML>
<BODY>
<A HREF="next.jsp">Continue</A>
</BODY>
</HTML>