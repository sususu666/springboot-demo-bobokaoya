/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-05-06 09:54:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>尚学堂-百战程序员</title>\r\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/easyui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"/easyui/demo.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/easyui/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/easyui/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div align=\"center\" style=\"margin-top: 200px;\">\r\n");
      out.write("\t\t<div class=\"easyui-panel\" title=\"用户登录\"\r\n");
      out.write("\t\t\tstyle=\"width: 400px; max-width: 400px; padding: 30px 60px;\">\r\n");
      out.write("\t\t\t<form id=\"ff\" method=\"post\">\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom: 20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"username\" style=\"width: 100%\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"label:'账号:',required:true\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div style=\"margin-bottom: 20px\">\r\n");
      out.write("\t\t\t\t\t<input class=\"easyui-textbox\" name=\"password\" type=\"password\" style=\"width: 100%\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"label:'密码:',required:true\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<div style=\"text-align: center; padding: 5px 0\">\r\n");
      out.write("\t\t\t\t<a href=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\tonclick=\"submitForm()\" style=\"width: 80px\">登录</a> <a\r\n");
      out.write("\t\t\t\t\thref=\"javascript:void(0)\" class=\"easyui-linkbutton\"\r\n");
      out.write("\t\t\t\t\tonclick=\"clearForm()\" style=\"width: 80px\">清空</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction submitForm(){\r\n");
      out.write("\t\t/* \t$('#ff').form('submit', {\r\n");
      out.write("\t\t\t    url:\"login.do\",\r\n");
      out.write("\t\t\t    success:function(data){\r\n");
      out.write("\t\t\t\t\tif(data.status==200){\r\n");
      out.write("\t\t\t\t\t\t// 表示登录成功,跳转到home页面\r\n");
      out.write("\t\t\t\t\t\tlocation.href=\"home\";\r\n");
      out.write("\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t// 表示登录失败，给出错误提示\r\n");
      out.write("\t\t\t\t\t\t$.messager.alert('登录失败','账号或者密码错误:'+data.message);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t}); */\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({ \r\n");
      out.write("\t\t\t\t\ttype: \"post\"\r\n");
      out.write("\t\t\t\t\t, timeout: 10000\r\n");
      out.write("\t\t\t\t\t, // 超时时间 10 秒 \r\n");
      out.write("\t\t\t\t\theaders: { 'X-Requested-With':'XMLHttpRequest' }\r\n");
      out.write("\t\t\t\t\t, url: \"login.do\"\r\n");
      out.write("\t\t\t\t\t, data: $(\"#ff\").serialize()\r\n");
      out.write("\t\t\t\t\t, success: function(data) { \r\n");
      out.write("\t\t\t\t\t\tif(JSON.parse(data).status==200){\r\n");
      out.write("\t\t\t\t\t\t\t// 表示登录成功,跳转到home页面\r\n");
      out.write("\t\t\t\t\t\t\tlocation.href=\"home\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$.messager.alert('登录失败',JSON.parse(data).message);\t\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tfunction clearForm(){\r\n");
      out.write("\t\t\t$('#ff').form('clear');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
