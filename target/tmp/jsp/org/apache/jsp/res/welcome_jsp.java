/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-12-28 09:20:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.res;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta charset=\"utf-8\" />\r\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t\t<title></title>\r\n");
      out.write("\t\t<style type=\"text/css\">\r\n");
      out.write("\t\t\thtml,body{height: 100%}\r\n");
      out.write("\t\t\ttable{font-family: \"微软雅黑\";font-size: 1.6vw; margin: auto auto; width: 75%; font-weight: bold;}\r\n");
      out.write("\t\t\timg{border: none;}\r\n");
      out.write("\t\t\ta{text-decoration:none;color:#666666;}\r\n");
      out.write("\t\t\ta:HOVER{color: red;}\r\n");
      out.write("\t\t\ta:HOVER .img-tb{width:35%; padding: 0}\r\n");
      out.write("\t\t\t.img-tb{width:30%;padding: 2.5%;}\r\n");
      out.write("\t\t\t.img-tb:HOVER{width:35%; padding: 0;}\r\n");
      out.write("\t\t\t.img-jt{width: 55%;}\r\n");
      out.write("\t\t\t.img-jt2{width: 14%;}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table border=\"0\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td width=\"10%\" class=\"img-td cus\" >\r\n");
      out.write("\t\t\t\t\t<a href=\"#\" style=\"border:none\"><div align=\"center\"><img src=\"images/welcome/vipReg1.png\" class=\"img-tb\" style=\"border:none\"/></div>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">会员登记</div></a></td>\r\n");
      out.write("\t\t\t\t<td width=\"5%\" class=\"img-td\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t  \r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t\t<td width=\"10%\" class=\"img-td\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><div align=\"center\"><img src=\"images/welcome/vipReg.png\" class=\"img-tb\" /></div>\t\t\t  \r\n");
      out.write("\t\t\t\t\t<div align=\"center\">会员充值</div></a></td>\r\n");
      out.write("\t\t\t\t<td width=\"5%\" class=\"img-td\">\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t  \r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t\t<td width=\"10%\" class=\"img-td\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><div align=\"center\"><img src=\"images/welcome/rygl.png\" class=\"img-tb\" /></div>\t\t\t  \r\n");
      out.write("\t\t\t  \t\t<div align=\"center\">刷卡消费</div></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow9.jpg\" class=\"img-jt\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow8.jpg\"class=\"img-jt2\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow12.jpg\"class=\"img-jt\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t   <a href=\"#\"> <div align=\"center\"><img src=\"images/welcome/dzgbba.jpg\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t      <div align=\"center\">预留模块</div></a></td>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t  <div align=\"center\"><img src=\"images/welcome/arrow7.jpg\" class=\"img-jt\"/></div>\r\n");
      out.write("\t\t\t  <div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t    <a href=\"#\"><div align=\"center\"><img src=\"images/welcome/bzgf.png\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t      <div align=\"center\">站点管理</div></a></td>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t  <div align=\"center\"><img src=\"images/welcome/arrow5.jpg\" class=\"img-jt\"/></div>\r\n");
      out.write("\t\t\t  <div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t    <a href=\"#\"><div align=\"center\"><img src=\"images/welcome/spgl.png\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t      <div align=\"center\">投诉管理</div></a></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow11.jpg\"class=\"img-jt\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow0.jpg\"class=\"img-jt2\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"><img src=\"images/welcome/arrow10.jpg\"class=\"img-jt\" /></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><div align=\"center\"><img src=\"images/welcome/lmgl.png\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">站点预览</div></a></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><div align=\"center\"><img src=\"images/welcome/gzxx.jpg\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">预留模块</div></a></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\"></div></td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\"><div align=\"center\"><img src=\"images/welcome/recycle.png\" class=\"img-tb\" /></div>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div align=\"center\">回收站</div></a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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