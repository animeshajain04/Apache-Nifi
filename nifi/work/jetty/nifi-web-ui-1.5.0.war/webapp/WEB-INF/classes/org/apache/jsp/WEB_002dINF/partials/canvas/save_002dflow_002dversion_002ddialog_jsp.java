/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JspC/ApacheTomcat8
 * Generated at: 2018-01-09 09:08:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.partials.canvas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class save_002dflow_002dversion_002ddialog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n\n<div id=\"save-flow-version-dialog\" layout=\"column\" class=\"hidden large-dialog\">\n    <div class=\"dialog-content\">\n        <div class=\"setting\">\n            <div class=\"setting-name\">Registry</div>\n            <div class=\"setting-field\">\n                <div id=\"save-flow-version-registry-combo\" class=\"hidden\"></div>\n                <div id=\"save-flow-version-registry\" class=\"hidden\"></div>\n            </div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">Bucket</div>\n            <div class=\"setting-field\">\n                <div id=\"save-flow-version-bucket-combo\" class=\"hidden\"></div>\n                <div id=\"save-flow-version-bucket\" class=\"hidden\"></div>\n            </div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">Flow Name</div>\n            <div id=\"save-flow-version-registry-container\" class=\"setting-field\">\n                <span id=\"save-flow-version-process-group-id\" class=\"hidden\"></span>\n                <input type=\"text\" id=\"save-flow-version-name-field\" class=\"setting-input hidden\"/>\n");
      out.write("                <div id=\"save-flow-version-name\" class=\"hidden\"></div>\n                <div id=\"save-flow-version-label\"></div>\n            </div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">Flow Description</div>\n            <div class=\"setting-field\">\n                <textarea id=\"save-flow-version-description-field\" class=\"setting-input hidden\"></textarea>\n                <div id=\"save-flow-version-description\" class=\"hidden\"></div>\n            </div>\n        </div>\n        <div class=\"setting\">\n            <div class=\"setting-name\">Version Comments</div>\n            <div class=\"setting-field\">\n                <textarea id=\"save-flow-version-change-comments\" class=\"setting-input\"></textarea>\n            </div>\n        </div>\n    </div>\n</div>");
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
