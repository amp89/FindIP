/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-07-24 01:22:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manageUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/views/../JSPIncludes/headAndNav.jsp", Long.valueOf(1469079522000L));
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
      out.write("DEBUG: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
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
      out.write('\n');
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
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
    // /views/../JSPIncludes/headAndNav.jsp(23,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
    // /views/../JSPIncludes/headAndNav.jsp(25,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /views/manageUsers.jsp(2,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty(user) && user.userType.accessLevel > 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("IM A MANAGE STUFF PAGE\n");
        out.write("\n");
        out.write("<div ng-app=\"usersApp\" ng-controller=\"userData\">\n");
        out.write("\t<form name=\"userSearchForm\" ng-submit=\"searchForUsers()\">\n");
        out.write("\t\tSearch for all or part of a user's email<br>\n");
        out.write("\t\tLeave blank to return all users (may have a long load time)<br>\n");
        out.write("\t\t<input name=\"ipAddress\" ng-model=\"emailSearched\"/><br>\n");
        out.write("\t\t<button type=\"submit\">Search Users</button>\n");
        out.write("\t</form>\n");
        out.write("\n");
        out.write("\n");
        out.write("\t<div ng-show=\"searchMessage\">\n");
        out.write("\t{{searchMessage}}\n");
        out.write("\t</div>\n");
        out.write("\t\n");
        out.write("\t<div ng-show=\"searchCompleteFlag\">\n");
        out.write("\tResults Go Here\n");
        out.write("\t\n");
        out.write("\t<ul>\n");
        out.write("\t\t<li ng-repeat=\"userFound in userList\">{{userFound}}\n");
        out.write("\t\t<form name=\"userFoundForm\" action=\"editUserPage.do\">\n");
        out.write("\t\t\t<input type=\"hidden\" name=\"userToEditId\" value=\"userFound.id\" />\n");
        out.write("\t\t\t<input type=\"hidden\" name=\"accessToken\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("\t\t\t<button type=\"submit\">Edit</button>\t\n");
        out.write("\t\t</form>\n");
        out.write("\t\t</li>\n");
        out.write("\t</ul>\n");
        out.write("\t\n");
        out.write("\t</div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\n");
        out.write("</div>\n");
        out.write("\n");
        out.write("<script>\n");
        out.write("\tvar app = angular.module('usersApp',[]);\n");
        out.write("\t\n");
        out.write("\tapp.controller('userData', function($scope,$http){\n");
        out.write("\t\t$scope.searchCompleteFlag = false;\n");
        out.write("\t\t$scope.userList = [];\n");
        out.write("\t\t$scope.searchMessage = \"\";\n");
        out.write("\t\t$scope.emailSearched = \"\";\n");
        out.write("\t\tconsole.log(\"loaded\");//TODO remove\n");
        out.write("\t\t\n");
        out.write("\t\t//Error is here,, .then is not a function\n");
        out.write("\t\t\n");
        out.write("\t\t$scope.searchForUsers = function(){\n");
        out.write("\t\t\tconsole.log(\"searching\"); //TODO remove\n");
        out.write("\t\t\tconsole.log(\"email query: \" + $scope.emailSearched); //TODO remove\n");
        out.write("\t\t\tvar getUrl = \"\";\n");
        out.write("\t\t\tif($scope.emailSearched.length > 0){\n");
        out.write("\t\t\t\tgetUrl = \"rest/searchUsers/\" + $scope.emailSearched + \"/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\";\n");
        out.write("\t\t\t}else{\n");
        out.write("\t\t\t\tgetUrl = \"rest/searchUsers/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\";\n");
        out.write("\t\t\t}\n");
        out.write("\t\t\tconsole.log(\"HTTP request: \" + getUrl); //TODO remove\n");
        out.write("\t\t\t$http({\n");
        out.write("\t\t\t\tmethod:\"GET\",\n");
        out.write("\t\t\t\turl: getUrl,\n");
        out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\" : \"application/json\"}\n");
        out.write("\t\t\t}).then(function success(response){\n");
        out.write("\t\t\t\tconsole.log(\"Search success :)\"); //TODO remove\n");
        out.write("\t\t\t\t$scope.searchCompleteFlag = true;\n");
        out.write("\t\t\t\t$scope.userList = response.data;\n");
        out.write("\t\t\t\t$scope.searchMessage = response.data.length  + \" results found.\"\n");
        out.write("\t\t\t\tconsole.log($scope.userList);\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t},function error(response){\n");
        out.write("\t\t\t\tconsole.log(\"Search success :)\"); //TODO remove\n");
        out.write("\t\t\t\t$scope.searchCompleteFlag = false;\n");
        out.write("\t\t\t\t$scope.searchMessage = \"Search failed.\";\n");
        out.write("\t\n");
        out.write("\t\t\t}); //http\n");
        out.write("\t\t\t\n");
        out.write("\t\t};//searchUsers()\n");
        out.write("\t\t\n");
        out.write("\t\t$scope.editUser = function(){\n");
        out.write("\t\t\t$scope.editReturnMsg = \"\";\n");
        out.write("\t\t\t$http({\n");
        out.write("\t\t\t\tmethod:\"POST\",\n");
        out.write("\t\t\t\turl:\"rest/editUser\",\n");
        out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\" : \"application/json\"}\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t}).then(function success(response){\n");
        out.write("\t\t\t\tconsole.log(\"Edit Success :)\");// TODO remove\n");
        out.write("\t\t\t\t$scope.editReturnMsg = \"EDIT SUBMITTED.\"\n");
        out.write("\t\t\t},function error(response){\n");
        out.write("\t\t\t\tconsole.log(\"FAILURE.\");\n");
        out.write("\t\t\t});//http\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t\tconsole.log(\"editUser\");\n");
        out.write("\t\t}//editUser\n");
        out.write("\t\t\n");
        out.write("\t\t$scope.deleteUser = function(){\n");
        out.write("\t\t\tconsole.log(\"deleteUser\");\n");
        out.write("\t\t\t\n");
        out.write("\t\t}\n");
        out.write("\t\t\n");
        out.write("\t});\n");
        out.write("\n");
        out.write("</script>\n");
        out.write("\n");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }
}
