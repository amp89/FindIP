/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-07-28 08:10:23 UTC
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
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(10);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1459978111000L));
    _jspx_dependants.put("/views/../angular/apps/searchApp.jsp", Long.valueOf(1469689288000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1450338450000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.2.4.RELEASE.jar", Long.valueOf(1460410336000L));
    _jspx_dependants.put("/views/../JSPIncludes/headAndNav.jsp", Long.valueOf(1469686959000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("jar:file:/Users/alex/Synced/IpLookUp/FindIp/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/FindIp/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153406682000L));
    _jspx_dependants.put("/views/../JSPIncludes/../JSPIncludes/tags.jsp", Long.valueOf(1468857876000L));
    _jspx_dependants.put("/views/../JSPIncludes/footer.jsp", Long.valueOf(1469688763000L));
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
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- TODO add favicon -->\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>FindIP | IP LOOKUP TOOL</title>\n");
      out.write("\n");
      out.write("    <link src=\"css/reset.css\" />\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"bootstrapfiles/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <link href=\"bootstrapfiles/assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"bootstrapfiles/assets/css/navbar-fixed-top.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- ************************************************************\n");
      out.write("check if jquery script be omitted b/c of load later in page.\n");
      out.write("************************************************************ -->\n");
      out.write("\t\t<script src=\"js/jquery.js\"></script>\n");
      out.write("\t\t<script src=\"angular/angular.min.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<link href=\"css/custom.css\" rel=\"stylesheet\"></link>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Fixed navbar -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"index.do\">FindIP</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav\">\n");
      out.write("                      \t<li class=\"dropdown\">\n");
      out.write("              <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\" aria-expanded=\"false\">About <span class=\"caret\"></span></a>\n");
      out.write("              <ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\" href=\"http://www.alexmpeterson.com\">My Webiste</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\" href=\"http://www.alexmpeterson.com/projects.php\">More of my projects</a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li role=\"separator\" class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t\t<li><a target=\"_blank\" href=\"http://www.alexmpeterson.com/findip.php\">FindIP Project information Page</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("              </ul>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </div><!--/.nav-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t");
      out.write("\t<script>\n");
      out.write("\n");
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
      out.write("\t\t$scope.publicComments = {};\n");
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
      out.write("\t\t\t\t$scope.getComments();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}, function error(response){\n");
      out.write("\t\t\t\tconsole.log(\"No post search :(\"); //TODO remove\n");
      out.write("\t\t\t});//end http\n");
      out.write("\t\t\t\n");
      out.write("\t\t};//end get info\n");
      out.write("\t\t\n");
      out.write("\t\t$scope.getComments = function(){\n");
      out.write("\t\t\t$http({\n");
      out.write("\t\t\t\tmethod:\"GET\",\n");
      out.write("\t\t\t\turl:\"rest/getPublicComments/\"+$scope.ipResponseData.id+\"/\"+\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${accessToken}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\",\n");
      out.write("\t\t\t\tparams : {\"content-type\":\"application/json\",\"Accept\" : \"application/json\"}\n");
      out.write("\t\t\t}).then(function success(response){\n");
      out.write("\t\t\t\tconsole.log(\"get comments :)\"); //TODO remove\n");
      out.write("\t\t\t\tconsole.log(response.data); //TODO remove\n");
      out.write("\t\t\t\t$scope.publicComments = response.data; \n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}, function error(response){\n");
      out.write("\t\t\t\tconsole.log(\"No get comments :(\"); //TODO remove\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t\t};\n");
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
      out.write("\t\t\t\tconsole.log(\"SUCCESS POST :)\")  //TODO remove\n");
      out.write("\t\t\t\tconsole.log(response.data);\n");
      out.write("\t\t\t\t$scope.ipSaveData.publicComment = \"\";\n");
      out.write("\t\t\t\t$scope.ipSaveData.privateComment = \"\";\n");
      out.write("\t\t\t\t//$scope.saveMessage = response.data.message;\n");
      out.write("\t\t\t\t$scope.saveMessage = \"Save successful!\";\n");
      out.write("\t\t\t\t$scope.getComments();\n");
      out.write("\t\t\t\t//save message TODO \n");
      out.write("\t\t\t},function error(response){\n");
      out.write("\t\t\t\t$scope.saveMessage = \"Save Successful\";\n");
      out.write("\t\t\t\tconsole.log(\"NO SUCCESS POST :(\")  //TODO remove\n");
      out.write("\t\t\t\t$scope.saveMessage = \"Save Error!\";\n");
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
      out.write("\t</script>");
      out.write('\n');
      out.write("\t<script src=\"js/changeNav.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <!-- <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script> -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"bootstrapfiles/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"bootstrapfiles/assets/js/assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("  </body>\n");
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
    // /views/../JSPIncludes/headAndNav.jsp(67,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty(user) || user.userType == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li><a class=\"active\" href=\"index.do\">Login<span class=\"sr-only\">(current)</span></a></li>\n");
        out.write("            ");
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

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /views/../JSPIncludes/headAndNav.jsp(70,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty(user) && user.userType.accessLevel > 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <li><a href=\"search.do\">Search <span class=\"sr-only\">(current)</span></a></li>\n");
        out.write("            <li><a href=\"manageUsers.do\">Manage Users<span class=\"sr-only\">(current)</span></a></li>\n");
        out.write("            <li><a href=\"userDashboard.do\">My Stuff<span class=\"sr-only\">(current)</span></a></li>\n");
        out.write("            <li><a href=\"logout.do\">Logout<span class=\"sr-only\">(current)</span></a></li>\n");
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
    // /views/search.jsp(2,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty(user) && user.userType.accessLevel > 0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<script>\n");
        out.write("\t$(document).ready(function(){\n");
        out.write("\t\t$(\"title\").text(\"IpFind | Search\");\n");
        out.write("\t});\n");
        out.write("\t</script>\n");
        out.write("<div class=\"container\">\n");
        out.write("\t<div class=\"col-xs-12 col-md-offset-2 col-md-8 col-lg-offset-2 col-lg-8\">\n");
        out.write("\t<div id=\"pageTitle\" class=\"text-center\">Search</div>\n");
        out.write("\t\n");
        out.write("\t\t<div ng-app=\"searchApp\" ng-controller=\"searchForm\">\n");
        out.write("\t\t<div ng-submit=\"getIpInfo()\">\n");
        out.write("\t\t\t<form  name=\"ipSearchForm\">\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<div class=\"col-xs-12 text-center\">\n");
        out.write("\t\t\tEnter an IP address and then press SEARCH.\n");
        out.write("\t\t\t<br><br>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<div class=\"col-xs-12 col-md-8 \">\n");
        out.write("\t\t\t\t<input class=\"fill_div\" name=\"ipAddress\" type=\"text\" ng-pattern=\"regex\" ng-minlength=\"7\" ng-maxlength=\"15\" ng-model=ipSearchData.ipAddress required/>\t\t\t\t\t\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"col-xs-12 col-md-4 center-block\">\n");
        out.write("\n");
        out.write("\t\t\t\t<button class=\"fill_div\" type=\"submit\" ng-disabled=\"ipSearchForm.$invalid\">SEARCH {{ipSearchData.ipAddress}}</button>\t\t\t\t\t\t\t\t\n");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div class=\"col-xs-12 text-center\">\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t\t<span ng-hide=\"ipSearchForm.$invalid\">You have entered a valid IP address. Press search to continue.<br></span>\n");
        out.write("\t\t\t\t<span ng-show=\"ipSearchForm.$invalid\">Please use this format: 255.255.255.255<br></span>\t\t\t\n");
        out.write("\t\t\t</div>\n");
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t</form>\n");
        out.write("\t\t\t<br>\n");
        out.write("\t\t</div>\n");
        out.write("\t\t<!-- end test angular -->\n");
        out.write("\t\t\n");
        out.write("\t\t<div ng-show=\"searchCompleteFlag\" class=\"col-xs-12 col-md-offset-1 col-md-10 col-lg-offset-3 col-lg-6\">\n");
        out.write("\t\t\t<br>\n");
        out.write("\t\t\t<div ng-hide=\"ipResponseData\">Not Found.</div>\n");
        out.write("\t\t\t<div ng-show=\"ipResponseData\">\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t<h2>IP: {{ipResponseData.startIp}} to {{ipResponseData.endIp}}</h2>\n");
        out.write("\t\t\t<h2>Location:</h2>\n");
        out.write("\t\t\t<h3>{{ipResponseData.city}}, {{ipResponseData.region}}, {{ipResponseData.countryName}}</h3>\n");
        out.write("\t\t\t<h3>Lat: {{ipResponseData.latitude}} Lon: {{ipResponseData.longitude}}</h3>\n");
        out.write("\t\t\t<!-- to add: maybe logged in user's comments ?? maybe just leave that on the dashboard? -->\n");
        out.write("\t\t\t<div ng-show=\"publicComments\">\n");
        out.write("\t\t\t\t<h3>Public Comments</h3>\n");
        out.write("\t\t\t\t<ul>\n");
        out.write("\t\t\t\t\t<li ng-repeat=\"(i,c) in publicComments\" ng-show=\"c.comment\"><h4>{{c.comment}}</h4></li>\n");
        out.write("\t\t\t\t</ul>\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t<form name=\"ipSaveForm\" ng-submit=\"saveIp()\">\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t\t\tPublic Comment (Optional):<br>\n");
        out.write("\t\t\t\t\t<textarea class=\"fill_div\" rows=\"5\" cols=\"50\" ng-maxlength=\"10000\" name=\"publicComment\" ng-model=\"ipSaveData.publicComment\"></textarea><br>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t\tPrivate Comment (Optional):<br>\n");
        out.write("\t\t\t\t\t<textarea class=\"fill_div\" rows=\"5\" cols=\"50\" ng-maxlength=\"10000\"  name=\"privateComment\" ng-model=\"ipSaveData.privateComment\"></textarea><br>\n");
        out.write("\t\t\t\t\n");
        out.write("\t\t\t\t\t<button class=\"fill_div\" type=\"submit\" ng-disabled=\"ipSaveForm.$invalid\">Save this Ip</button>\n");
        out.write("\t\t\t\t\t\n");
        out.write("\t\t\t\t\t<span ng-show=\"ipSaveForm.$invalid\">Please keep comment under 10000 characters.</span>\n");
        out.write("\t\t\t\t\t<span ng-show=\"saveMessage\">{{saveMessage}}</span>\n");
        out.write("\t\t\t\t</form>\n");
        out.write("\t\t\t\n");
        out.write("\t\t\t</div>\n");
        out.write("\t\t\t<div col=\"xs-col-12 credit text-center\">All IP data from <a href=\"http://www.ip2location.com\"> IP2LOCATION </a></div>\n");
        out.write("\t\t\t</div><!-- result -->\n");
        out.write("\t\t</div> <!-- end app -->\n");
        out.write("\t\n");
        out.write("\t</div>\n");
        out.write("\n");
        out.write("\n");
        out.write("</div>\n");
        out.write("\t\n");
        out.write("\n");
        out.write("\t\t\n");
        out.write("\t");
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
