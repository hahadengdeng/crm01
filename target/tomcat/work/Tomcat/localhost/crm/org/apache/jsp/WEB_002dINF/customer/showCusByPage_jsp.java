/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-09-25 00:35:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class showCusByPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("</head>\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("    .error{\r\n");
      out.write("        color:red;\r\n");
      out.write("    }\r\n");
      out.write("    .fixed-table-body{\r\n");
      out.write("         height: auto;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table  id=\"tab1\">\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script src=\"javascript/jQuery-1.12.4.js\"></script>\r\n");
      out.write("<script src=\"javascript/bootstrap.js\"></script>\r\n");
      out.write("<script src=\"javascript/jquery.validate.js\"></script>\r\n");
      out.write("<script src=\"javascript/messages_zh.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/table/bootstrap-table.js\"></script>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/table/bootstrap-table.css\" rel=\"stylesheet\"/>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/javascript/table/locale/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    $(function () {\r\n");
      out.write("        var t=new TableInit();\r\n");
      out.write("        t.Init();\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("    var TableInit = function () {\r\n");
      out.write("        var oTableInit = new Object();\r\n");
      out.write("        //初始化Table\r\n");
      out.write("        oTableInit.Init = function () {\r\n");
      out.write("            $(\"#tab1\").bootstrapTable({\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findCustomerByPage.action\",\r\n");
      out.write("                method:\"get\",\r\n");
      out.write("                queryParams: oTableInit.queryParams,\r\n");
      out.write("                striped: true,\r\n");
      out.write("\r\n");
      out.write("                pagination: true,\r\n");
      out.write("                sidePagination: \"server\",\r\n");
      out.write("                pageNumber:1,                       //初始化加载第一页，默认第一页\r\n");
      out.write("                pageSize:2 ,                       //每页的记录行数（*）\r\n");
      out.write("                pageList: [1, 2, 4],        //可供选择的每页的行数（*）\r\n");
      out.write("                columns: [{\r\n");
      out.write("                    checkbox: true\r\n");
      out.write("                }, {\r\n");
      out.write("                    field: 'cid',\r\n");
      out.write("                    title: '客户ID'\r\n");
      out.write("                }, {\r\n");
      out.write("                    field: 'cusname',\r\n");
      out.write("                    title: '客户姓名'\r\n");
      out.write("                }, {\r\n");
      out.write("                    field: 'address',\r\n");
      out.write("                    title: '客户地址'\r\n");
      out.write("                }, {\r\n");
      out.write("                    field: 'contact',\r\n");
      out.write("                    title: '联系人'\r\n");
      out.write("                },{\r\n");
      out.write("                    field: 'tel',\r\n");
      out.write("                    title: '联系电话'\r\n");
      out.write("                },{\r\n");
      out.write("                    field: 'email',\r\n");
      out.write("                    title: '电子邮箱'\r\n");
      out.write("                },{\r\n");
      out.write("                    field: 'cid',\r\n");
      out.write("                    title: '操作',\r\n");
      out.write("                    formatter:actionFormatter\r\n");
      out.write("                }]\r\n");
      out.write("            });\r\n");
      out.write("        };\r\n");
      out.write("        oTableInit.queryParams = function (params) {\r\n");
      out.write("            var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的\r\n");
      out.write("                limit: params.limit,   //页面大小\r\n");
      out.write("                offset: params.offset  //页码\r\n");
      out.write("            };\r\n");
      out.write("            return temp;\r\n");
      out.write("        };\r\n");
      out.write("        return oTableInit;\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function actionFormatter(val,row,index) {\r\n");
      out.write("        return \"<a><input type='button' class='btn btn-default' value='删除' onclick='deleteCus(\"+val+\")'/></a>\" +\r\n");
      out.write("            \"<a class='btn btn-default'  href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/findCusByCid.action?cid=\"+val+\"'>修改</a>\"\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    function deleteCus(obj) {\r\n");
      out.write("        var cid = obj;\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            type: \"get\",\r\n");
      out.write("            url: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/deleteCustomer.action\",\r\n");
      out.write("            data: {\r\n");
      out.write("                cid: cid\r\n");
      out.write("            },\r\n");
      out.write("            contentType: \"application/json;charset=utf-8\",\r\n");
      out.write("            success: function (result) {\r\n");
      out.write("                if (result == true) {\r\n");
      out.write("                    alert(\"删除成功\");\r\n");
      out.write("                    window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toShow.action\";\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"删除失败\");\r\n");
      out.write("                    window.location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/toShow.action\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
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
