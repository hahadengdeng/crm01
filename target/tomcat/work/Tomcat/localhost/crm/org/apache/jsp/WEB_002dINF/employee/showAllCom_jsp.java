/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-25 00:28:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showAllCom_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("    .error {\r\n");
      out.write("        color: red;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<table class=\"table table-striped\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>专员id</td>\r\n");
      out.write("        <td>专员登录名</td>\r\n");
      out.write("        <td>专员密码</td>\r\n");
      out.write("        <td>专员电话</td>\r\n");
      out.write("        <td>专员姓名</td>\r\n");
      out.write("        <td>专员邮箱</td>\r\n");
      out.write("        <td>专员职位</td>\r\n");
      out.write("        <td>操作</td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\">\r\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("        <div class=\"modal-content\">\r\n");
      out.write("            <form id=\"form\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/modifyCom.action\">\r\n");
      out.write("                <input type=\"text\" id=\"empid\" name=\"empid\" hidden>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span class=\"input-group-addon\">请在此处修改</span>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon1\">登录名</span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"username\" aria-describedby=\"sizing-addon1\"\r\n");
      out.write("                           id=\"username\" name=\"username\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon2\">登录密码</span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"password\" aria-describedby=\"sizing-addon2\"\r\n");
      out.write("                           id=\"password\" name=\"password\" readonly>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon3\">联系电话</span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"tel\" aria-describedby=\"sizing-addon3\" id=\"tel\"\r\n");
      out.write("                           name=\"tel\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon4\">用户姓名</span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"name\" aria-describedby=\"sizing-addon3\"\r\n");
      out.write("                           id=\"name\" name=\"name\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"input-group input-group-sm\">\r\n");
      out.write("                    <span class=\"input-group-addon\" id=\"sizing-addon5\">电子邮箱</span>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"email\" aria-describedby=\"sizing-addon3\"\r\n");
      out.write("                           id=\"email\" name=\"email\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <span class=\"input-group-addon\">请选择职位:</span>\r\n");
      out.write("                    <select id=\"deptid\" name=\"dept.deptid\" style=\"width: 100%\">\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("            <div class=\"modal-footer\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary\" id=\"primary\">确认修改</button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"javascript/jQuery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"javascript/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"javascript/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"javascript/messages_zh.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findAllDept.action\",\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            success: function (msg) {\r\n");
      out.write("                for (var i = 0; i < msg.length; i++) {\r\n");
      out.write("                    var deptname = msg[i].deptname;\r\n");
      out.write("                    var deptid = msg[i].deptid;\r\n");
      out.write("                    $(\"#deptid\").append(\"<option selected value='\" + deptid + \"'>\" + deptname + \"</option>\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function readyUpdate(obj) {\r\n");
      out.write("        var id = obj.parentElement.parentElement.firstElementChild.innerHTML;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findEmpById.action\",\r\n");
      out.write("            data: {empid: id},\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("                $(\"#empid\").val(result.empid);\r\n");
      out.write("                $(\"#username\").val(result.username);\r\n");
      out.write("                $(\"#password\").val(result.password);\r\n");
      out.write("                $(\"#tel\").val(result.tel);\r\n");
      out.write("                $(\"#name\").val(result.name);\r\n");
      out.write("                $(\"#email\").val(result.email);\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    /*表单验证提交*/\r\n");
      out.write("\r\n");
      out.write("    $(\"#primary\").click(function () {\r\n");
      out.write("        if ($(\"#form\").valid() == true) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",\r\n");
      out.write("                url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/modifyCom.action\",\r\n");
      out.write("                data: $('#form').serialize(),\r\n");
      out.write("                success: function (result) {\r\n");
      out.write("                    if (result != null) {\r\n");
      out.write("                        alert(\"成功\");\r\n");
      out.write("                        window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/gotoShowCom.action\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        alert(\"失败\");\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    $.validator.setDefaults({\r\n");
      out.write("        submitHandler: function (form) {\r\n");
      out.write("            form.submit();\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    $().ready(function () {\r\n");
      out.write("        $(\"#form\").validate({\r\n");
      out.write("            debug: true,\r\n");
      out.write("            rules: {\r\n");
      out.write("                username: {\r\n");
      out.write("                    required: true,\r\n");
      out.write("                    remote: {\r\n");
      out.write("                        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findModify.action\",\r\n");
      out.write("                        type: \"get\",\r\n");
      out.write("                        data: {\r\n");
      out.write("                            username: function () {\r\n");
      out.write("                                return $(\"#username\").val();\r\n");
      out.write("                            },\r\n");
      out.write("                            empid: function () {\r\n");
      out.write("                                return $(\"#empid\").val();\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                },\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: true,\r\n");
      out.write("                    tel: true\r\n");
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
      out.write("                    required: \"请注册您的登录名\",\r\n");
      out.write("                    remote: \"用户名已存在\"\r\n");
      out.write("                },\r\n");
      out.write("                password: {\r\n");
      out.write("                    required: \"请输入密码\",\r\n");
      out.write("                },\r\n");
      out.write("                password2: {\r\n");
      out.write("                    required: \"请输入密码\",\r\n");
      out.write("                    equalTo: \"两次密码输入不一致\"\r\n");
      out.write("                },\r\n");
      out.write("                tel: {\r\n");
      out.write("                    required: \"请输入电话号码\",\r\n");
      out.write("                    tel: \"电话号码格式不正确\"\r\n");
      out.write("                },\r\n");
      out.write("                name: {\r\n");
      out.write("                    required: \"请输入您的真实姓名\",\r\n");
      out.write("                    minlength: \"名字的长度必须大于2\"\r\n");
      out.write("                },\r\n");
      out.write("                email: {\r\n");
      out.write("                    email: \"请输入正确的邮箱\"\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("    function checkShare(obj) {\r\n");
      out.write("        var empid = obj.parentElement.parentElement.firstElementChild.innerHTML;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkDeleteEmp.action\",\r\n");
      out.write("            data: {empid: empid},\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("\r\n");
      out.write("                if (result.length == 0) {\r\n");
      out.write("                    checkVisit(empid);\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"存在客户,请重试\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function checkVisit(obj) {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/checkDeleteEmpCV.action\",\r\n");
      out.write("            data: {empid: obj},\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("                if (result.length == 0) {\r\n");
      out.write("                    $.ajax({\r\n");
      out.write("                        type: \"get\",\r\n");
      out.write("                        url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deleteCom.action\",\r\n");
      out.write("                        data: {empid: obj},\r\n");
      out.write("                        contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("                        success: function (req) {\r\n");
      out.write("                            if (req != null) {\r\n");
      out.write("                                alert(\"删除成功\");\r\n");
      out.write("                                window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/gotoShowCom.action\";\r\n");
      out.write("                            } else {\r\n");
      out.write("                                alert(\"删除失败\");\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    });\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"存在访客信息,请重试\");\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/employee/showAllCom.jsp(32,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/employee/showAllCom.jsp(32,4) '${list}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${list}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/employee/showAllCom.jsp(32,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("c");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("        <tr>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.empid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.dept.deptname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("            <td>\r\n");
          out.write("                <a type=\"button\" class=\"btn btn-default\" data-toggle=\"modal\" data-target=\"#myModal\"\r\n");
          out.write("                   onclick=\"readyUpdate(this)\">修改</a>\r\n");
          out.write("                <a class=\"btn btn-default\" onclick=\"checkShare(this)\">删除</a>\r\n");
          out.write("            </td>\r\n");
          out.write("        </tr>\r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
