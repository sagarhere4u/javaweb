// Reflecting the directory structure where the file lives
package org.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException
    {
        // Very simple - just return some plain text
        //PrintWriter writer = response.getWriter();
        //writer.print("Hello World");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html lang='en'><head><title>Sample Java App</title><link href='https://fonts.googleapis.com/css?family=Neuton|Roboto' rel='stylesheet'>
                  <style>.holder{width: 480px;
                         text-align: center;
                         margin: 0 auto;
padding-top: 120px;
}
.holder h1 {
font-family: 'loveloblack', sans-serif;
font-size:5em;
color:#2d2d2d;
text-shadow: 3px 3px 0 #e3e3e3;
line-height: 27px;
margin-top: 12px;
margin-bottom: 10px;
}
.holder h1 span.tbl{
font-family: Dosis,Tahoma,sans-serif;
font-size:35px;
color:#2d2d2d;
line-height:1em;
font-weight: bold;
letter-spacing: -1px;
line-height: 1;
text-shadow: -1px 1px 1px rgba(0, 0, 0, 0.3);
}
.holder h1 span {
font-family: Dosis,Tahoma,sans-serif;
font-size:1em;
color:#3d9df8;
line-height:1em;
font-weight: bold;
letter-spacing: -1px;
line-height: 1;
text-shadow: -1px 1px 1px rgba(0, 0, 0, 0.3);
}
p{
font-size: 18px;
font-weight: 600;
color: #13447E;
font-family: 'Neuton', serif;
}
</style>
</head>
<body>
<div class="holder">
<img src="Coming-Soon-Icon.png" style="width:250px;" />
<h1><span class="tbl">Our Website is Coming Soon.</span></h1>

<p><span class="tbl">We'll be back shortly.</span></p><br>
<br />
</div>
</body>
</html>");
    }
}
