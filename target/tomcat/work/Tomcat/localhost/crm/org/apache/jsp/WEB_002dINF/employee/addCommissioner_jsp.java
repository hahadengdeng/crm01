/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-25 00:28:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCommissioner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .error{\r\n");
      out.write("            color:red;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"form\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/addCommissioner.action\" method=\"post\" id=\"form\">\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"username\">Username</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"username\" placeholder=\"username\" name=\"username\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"password\">Password</label>\r\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"password\" placeholder=\"password\" name=\"password\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"tel\">Tel</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"tel\" placeholder=\"tel\" name=\"tel\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"name\">Name</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"name\" name=\"name\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\">\r\n");
      out.write("        <label for=\"email\">Email</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"email\" name=\"email\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"form-group\" hidden>\r\n");
      out.write("        <label for=\"deptid\">Dept</label>\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" id=\"deptid\" placeholder=\"deptid\" value=\"2\" name=\"dept.deptid\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <button type=\"submit\" class=\"btn btn-default\">Submit</button>\r\n");
      out.write("</form>\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jQuery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/messages_zh.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $.validator.setDefaults({\r\n");
      out.write("        submitHandler: function(form) {\r\n");
      out.write("            form.submit();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $().ready(function() {\r\n");
      out.write("        $(\"#form\").validate({\r\n");
      out.write("            rules: {\r\n");
      out.write("                username: {\r\n");
      out.write("                    required:true,\r\n");
      out.write("                    remote:{\r\n");
      out.write("                        url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkLoginName.action\",\r\n");
      out.write("                        type:\"post\",\r\n");
      out.write("                        data:{\r\n");
      out.write("                            username:function () {\r\n");
      out.write("                                return $(\"#username\").val();\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                password: \"required\",\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: true,\r\n");
      out.write("                    tel:true\r\n");
      out.write("                },\r\n");
      out.write("                name: {\r\n");
      out.write("                    required: true,\r\n");
      out.write("                    minlength: 2,\r\n");
      out.write("                },\r\n");
      out.write("                email: {\r\n");
      out.write("                    email: true\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            messages: {\r\n");
      out.write("                username: {\r\n");
      out.write("                    required:\"请注册您的登录名\",\r\n");
      out.write("                    remote:\"用户名已存在\"\r\n");
      out.write("                },\r\n");
      out.write("                password: {\r\n");
      out.write("                    required: \"请输入密码\",\r\n");
      out.write("                },\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: \"请输入电话号码\",\r\n");
      out.write("                    tel: \"电话号码格式不正确\"\r\n");
      out.write("                },\r\n");
      out.write("                name:{\r\n");
      out.write("                    required:\"请输入您的真实姓名\",\r\n");
      out.write("                    minlength:\"名字的长度必须大于2\"\r\n");
      out.write("                },\r\n");
      out.write("                email:{\r\n");
      out.write("                    email:\"请输入正确的邮箱\"\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
