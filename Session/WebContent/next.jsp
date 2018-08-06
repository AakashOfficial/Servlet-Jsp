<HTML>
<BODY>
<% String var = (String)session.getAttribute( "theName" ); %>
<%-- Hello, <%= session.getAttribute( "theName" ) %> --%>
Hello <%= var %>
</BODY>
</HTML>