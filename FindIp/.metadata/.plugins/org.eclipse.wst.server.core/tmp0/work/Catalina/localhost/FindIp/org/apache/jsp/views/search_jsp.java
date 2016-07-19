/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-07-19 00:20:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>IP FIND | Search</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t<script src=\"js/test.js\"></script>\n");
      out.write("\t\t<script src=\"angular/angular.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body ng-app=\"searchApp\">\n");
      out.write("\t<div ng-controller=\"searchForm\">\n");
      out.write("\t\t<form ng-submit=\"getIpInfo()\">\n");
      out.write("\t\t\t<input ng-maxlength=\"3\" placeholder=\"Enter IP\" name=\"first\" ng-model=\"ipSearchData.first\" required/>.\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Enter IP\" name=\"second\"  ng-model=\"ipSearchData.second\" required/>.\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Enter IP\" name=\"third\"  ng-model=\"ipSearchData.third\" required/>.\n");
      out.write("\t\t\t<input type=\"text\" placeholder=\"Enter IP\" name=\"fourth\"  ng-model=\"ipSearchData.fourth\" required/>\n");
      out.write("\t\t\t<button type=\"submit\">SEARCH</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t\tTO Search: <span ng-show=\"ipSearchData.first\">{{ipSearchData.first}}</span><span ng-show=\"ipSearchData.second\">.{{ipSearchData.second}}</span><span ng-show=\"ipSearchData.third\">.{{ipSearchData.third}}</span><span ng-show=\"ipSearchData.fourth\">.{{ipSearchData.fourth}}</span>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end test angular -->\n");
      out.write("\t\n");
      out.write("\t<!-- test rest call -->\n");
      out.write("\t<script>\n");
      out.write("\t/* old way\t\t\n");
      out.write("\t$.ajax({\n");
      out.write("\t\ttype : \"GET\",\n");
      out.write("\t\t url:\"rest/getLoggedInUserData\", \n");
      out.write("\t\theaders : {\n");
      out.write("\t\t\t\"Accept\" : \"application/json\",\n");
      out.write("\t\t\t\"Content-Type\" : \"applicatoin/json\"\n");
      out.write("\t\t}\n");
      out.write("\t}).done(function(data) {\n");
      out.write("\t\tconsole.log(data);\n");
      out.write("\t\t$scope.userObject = data;\n");
      out.write("\t}).fail(function() {\n");
      out.write("\t\tconsole.log(\"failed\");\n");
      out.write("\t}); */\n");
      out.write("\t\n");
      out.write("\tvar app = angular.module('searchApp',[]);\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\tapp.controller('searchForm',function($scope,$http){\n");
      out.write("\t\t//request her/*  */e TODO\n");
      out.write("\t\t$scope.ipSearchData = {};\n");
      out.write("\t\t\n");
      out.write("\t\t$scope.ipSearchData.accessToken=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\n");
      out.write("\t\t//$scope.ipSearchData.accessToken = 'testjlskjfdlsdkfj';\n");
      out.write("\t\t$scope.getIpInfo = function(){\n");
      out.write("\t\t\tconsole.log(\"IP: \" + $scope.ipSearchData);\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$http({\n");
      out.write("\t\t\t\tmethod:\"POST\",\n");
      out.write("\t\t\t\turl:\"rest/getIpData\",\n");
      out.write("\t\t\t\tdata:$scope.ipSearchData,\n");
      out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\" : \"application/json\"}\n");
      out.write("\t\t\t}).then(function success(response){\n");
      out.write("\t\t\t\tconsole.log(\"Post Ip search :)\");\n");
      out.write("\t\t\t}, function error(response){\n");
      out.write("\t\t\t\tconsole.log(\"No post search :(\");\n");
      out.write("\t\t\t});//end http\n");
      out.write("\t\t\t\n");
      out.write("\t\t};//end get info\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t</script>\n");
      out.write("\t<!-- end test rest call -->\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("</body>\n");
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
