/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-07-21 05:24:50 UTC
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

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1459978111000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1450338450000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar", Long.valueOf(1460410336000L));
    _jspx_dependants.put("/views/../JSPIncludes/headAndNav.jsp", Long.valueOf(1469078668000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("/views/../JSPIncludes/../JSPIncludes/tags.jsp", Long.valueOf(1468857876000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153406682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- nav here -->\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"index.do\">Home</a> \n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write("\n");
      out.write("\t\n");
      out.write("\t<div ng-app=\"searchApp\" ng-controller=\"searchForm\">\n");
      out.write("\t<div ng-submit=\"getIpInfo()\">\n");
      out.write("\t\tEnter a valid ip address, <!-- <br>&nbsp;&nbsp;&nbsp;ex: x.x.x.x, xxx.xx.xx.xxx, xxx.xxx.xxx.xxx, and so on. -->\n");
      out.write("\t\t<form  name=\"ipSearchForm\">\n");
      out.write("\t\t\t<input name=\"ipAddress\" type=\"text\" ng-pattern=\"regex\" ng-minlength=\"7\" ng-maxlength=\"15\" ng-model=ipSearchData.ipAddress required/>\n");
      out.write("\t\t\t<button type=\"submit\" ng-disabled=\"ipSearchForm.$invalid\">SEARCH</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<span ng-hide=\"ipSearchForm.$invalid\">Ip To Lookup: {{ipSearchData.ipAddress}}</span>\n");
      out.write("\t\t<span ng-show=\"ipSearchForm.$invalid\">Please use this format: 255.255.255.255</span>\n");
      out.write("\t</div>\n");
      out.write("\t<!-- end test angular -->\n");
      out.write("\t\n");
      out.write("\t<div ng-show=\"searchCompleteFlag\">\n");
      out.write("\t\t<h2>IP: {{ipResponseData.startIp}} to {{ipResponseData.endIp}}</h2>\n");
      out.write("\t\t<h2>Location:</h2>\n");
      out.write("\t\t<h3>{{ipResponseData.region}}, {{ipResponseData.city}}, {{ipResponseData.countryName}}</h3>\n");
      out.write("\t\t<h3>Lat: {{ipResponseData.latitude}} Lon: {{ipResponseData.longitude}}</h3>\n");
      out.write("\t\t\n");
      out.write("\t\t\t<form name=\"ipSaveForm\" ng-submit=\"saveIp()\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\tPublic Comment (Optional):<br>\n");
      out.write("\t\t\t\t<textarea rows=\"5\" cols=\"50\" ng-maxlength=\"10000\" name=\"publicComment\" ng-model=\"ipSaveData.publicComment\"></textarea><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tPrivate Comment (Optional):<br>\n");
      out.write("\t\t\t\t<textarea rows=\"5\" cols=\"50\" ng-maxlength=\"10000\"  name=\"privateComment\" ng-model=\"ipSaveData.privateComment\"></textarea><br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<button type=\"submit\" ng-disabled=\"ipSaveForm.$invalid\">Save!</button>\n");
      out.write("\t\t\t\t<span ng-show=\"ipSaveForm.$invalid\">Please keep comment under 10000 characters.</span>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div> <!-- //app -->\n");
      out.write("\t<!-- test rest call -->\n");
      out.write("\t<script>\n");
      out.write("/* \t old way\t\t\n");
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
      out.write("\t\t\n");
      out.write("\t\t$scope.regex = \"^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$\"\n");
      out.write("\t\t\n");
      out.write("\t\t//request her/*  */e TODO\n");
      out.write("\t\t$scope.ipSearchData = {};\n");
      out.write("\t\t$scope.ipResponseData = {};\n");
      out.write("\t\t$scope.ipSaveData = {};\n");
      out.write("\t\t$scope.saveMessage = \"\";\n");
      out.write("\t\t\n");
      out.write("\t\t$scope.searchCompleteFlag = false;\n");
      out.write("\t\t\n");
      out.write("\t\t$scope.ipSearchData.accessToken=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("\t\t\n");
      out.write("\t\t//$scope.ipSearchData.accessToken = 'testjlskjfdlsdkfj';\n");
      out.write("\t\t$scope.getIpInfo = function(){\n");
      out.write("\t\t\tconsole.log(\"IP: \" + $scope.ipSearchData); //TODO remove\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$http({\n");
      out.write("\t\t\t\tmethod:\"POST\",\n");
      out.write("\t\t\t\turl:\"rest/getIpData\",\n");
      out.write("\t\t\t\tdata:$scope.ipSearchData,\n");
      out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\" : \"application/json\"}\n");
      out.write("\t\t\t}).then(function success(response){\n");
      out.write("\t\t\t\tconsole.log(\"Post Ip search :)\"); //TODO remove\n");
      out.write("\t\t\t\tconsole.log(response.data); //TODO remove\n");
      out.write("\t\t\t\t$scope.searchCompleteFlag = true;\n");
      out.write("\t\t\t\t$scope.ipResponseData = response.data;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}, function error(response){\n");
      out.write("\t\t\t\tconsole.log(\"No post search :(\"); //TODO remove\n");
      out.write("\t\t\t});//end http\n");
      out.write("\t\t\t\n");
      out.write("\t\t};//end get info\n");
      out.write("\t\t\n");
      out.write("\t\t$scope.saveIp = function(){\n");
      out.write("\t\t\tconsole.log(\"save: \" + $scope.ipSaveData)\n");
      out.write("\t\t\t$scope.ipSaveData.userId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\t\t\t$scope.ipSaveData.ipId = $scope.ipResponseData.id;\n");
      out.write("\t\t\t$scope.ipSaveData.accessToken = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t$http({\n");
      out.write("\t\t\t\tmethod:\"POST\",\n");
      out.write("\t\t\t\turl:\"rest/saveIp\",\n");
      out.write("\t\t\t\tdata:$scope.ipSaveData,\n");
      out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\":\"application/json\"}\n");
      out.write("\t\t\t}).then(function success(response){\n");
      out.write("\t\t\t\tconsole.log(\"SUCCESS POST :)\")\n");
      out.write("\t\t\t\tconsole.log(response.data);\n");
      out.write("\t\t\t\t//save message TODO \n");
      out.write("\t\t\t},function error(response){\n");
      out.write("\t\t\t\tconsole.log(\"NO SUCCESS POST :(\")\n");
      out.write("\t\t\t\t//save message TODO \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t};//end saveIp()\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /views/../JSPIncludes/headAndNav.jsp(22,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty(user) && user.userType.accessLevel > 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<a href=\"search.do\">Search</a>\n");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("<a href=\"userDashboard.do\">Dashboard</a>\n");
        out.write("<a href=\"logout.do\">Logout</a>\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /views/../JSPIncludes/headAndNav.jsp(24,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userType.accessLevel >= 2}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("<a href=\"manageUsers.do\">Manage Users</a> <!-- might take this out and put on dashboard - admin only -->\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
