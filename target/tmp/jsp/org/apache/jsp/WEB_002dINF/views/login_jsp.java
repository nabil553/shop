/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2017-02-15 04:21:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

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

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("\t\t<title>后台管理系统</title>\r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t\t<!-- basic styles -->\r\n");
      out.write("\t\t<link href=\"");
      out.print(path );
      out.write("/res/assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/res/assets/css/font-awesome.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/res/assets/css/ace.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/res/assets/css/ace-rtl.min.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.print(path );
      out.write("/res/assets/css/login.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\t<body class=\"login-layout\">\t\t\r\n");
      out.write("\t <div class=\"login-container\">\r\n");
      out.write("\t \r\n");
      out.write("\t\t\t<div class=\"center\">\r\n");
      out.write("\t\t\t\t<h1><i class=\"icon-coffee  blue\"></i>&nbsp;<span class=\"red\">XX</span><span class=\"white\">后台管理系统</span></h1>\r\n");
      out.write("\t\t\t\t<h4 class=\"blue\">&copy; SaiJie&nbsp;InfoCo., Ltd.</h4>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div id=\"login-box\" class=\"login-box visible widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"header blue lighter bigger\"><i class=\"icon-coffee\"></i>请输入您的用户名和密码</h4>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"space-6\"></div>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"login\" method=\"post\" >\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"adminName\" class=\"form-control\" placeholder=\"用户名\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"adminPwd\" class=\"form-control\" placeholder=\"密码\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"space\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"width-30 pull-right btn btn-sm btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-key\"></i>登录\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"social-or-login center\"> <span class=\"bigger-110\">欢迎您的登录</span> </div>\r\n");
      out.write("\t\t\t\t\t<!-- <div class=\"social-login center\">\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-primary\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-facebook\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-info\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-twitter\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"btn btn-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-google-plus\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div> -->\t\r\n");
      out.write("\t\t\t\t\t</div><!-- /widget-main -->\r\n");
      out.write("\t\t\t<!-- -->\r\n");
      out.write("\t\t\t\t\t<div class=\"toolbar clearfix\">\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('forgot-box'); return false;\" class=\"forgot-password-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"icon-arrow-left\"></i> 忘记密码？\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('signup-box'); return false;\" class=\"user-signup-link\">\r\n");
      out.write("\t\t\t\t\t\t\t\t注册用户<i class=\"icon-arrow-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- /login-box -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!--**************************************注册用户*********************************************** -->\r\n");
      out.write("\t\t\t<div id=\"signup-box\" class=\"signup-box widget-box no-border\">\r\n");
      out.write("\t\t\t\t<div class=\"widget-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"header green lighter bigger\"><i class=\"icon-group blue\"></i>新用户注册</h4>\r\n");
      out.write("\t\t\t\t\t\t<p> 请输入您的注册邮箱: </p>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"addSys_User\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" class=\"form-control\" placeholder=\"Email\" /><i class=\"icon-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"adminName\" class=\"form-control\" placeholder=\"用户名\" /><i class=\"icon-user\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"adminPwd\" class=\"form-control\" placeholder=\"密码\" /><i class=\"icon-lock\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"reset\" class=\"width-30 pull-left btn btn-sm\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-refresh\"></i>重置\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"width-65 pull-right btn btn-sm btn-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t提交<i class=\"icon-arrow-right icon-on-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"toolbar center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('login-box'); return false;\" class=\"back-to-login-link\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-arrow-left\"></i>返回登录\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- /signup-box -->\r\n");
      out.write("\t\t\t<!--**************************************密码找回*********************************************** -->\r\n");
      out.write("\t\t\t<div id=\"forgot-box\" class=\"forgot-box widget-box no-border\">\r\n");
      out.write("\t\t\t\t\t<div class=\"widget-main\">\r\n");
      out.write("\t\t\t\t\t\t<h4 class=\"header red lighter bigger\"><i class=\"icon-key\"></i> 密码找回</h4>\r\n");
      out.write("\t\t\t\t\t\t<p>请输入您的注册邮箱/手机号</p>\r\n");
      out.write("\t\t\t\t\t\t<form>\r\n");
      out.write("\t\t\t\t\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"block clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"block input-icon input-icon-right\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"email\" class=\"form-control\" placeholder=\"Email\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-envelope\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"width-35 pull-right btn btn-sm btn-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<i class=\"icon-lightbulb\"></i>获得!\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</fieldset>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div><!-- /widget-main -->\r\n");
      out.write("\t\t\t\t\t<div class=\"toolbar center\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"show_box('login-box'); return false;\" class=\"back-to-login-link\">\r\n");
      out.write("\t\t\t\t\t\t\t返回登录<i class=\"icon-arrow-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div><!-- /forgot-box -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t<!-- basic scripts -->\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\twindow.jQuery || document.write(\"<script src='res/assets/js/jquery-2.0.3.min.js'>\"+\"<\"+\"/script>\");\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tfunction show_box(id) {\r\n");
      out.write("\t\t\t jQuery('.widget-box.visible').removeClass('visible');\r\n");
      out.write("\t\t\t jQuery('#'+id).addClass('visible');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
