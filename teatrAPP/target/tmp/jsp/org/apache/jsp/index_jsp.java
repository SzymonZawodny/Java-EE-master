package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Baza Teatru</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    </head>\n");
      out.write("    <body class = index>\n");
      out.write("<h1> Aplikacja zarzadzania teatrem </h1>\n");
      out.write("\n");
      out.write("     <div class=\"body-content\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <a class=\"btn btn-default\" href=\"getPrzedstawienieData.jsp\"><b><font color=\"black\">Dodaj przedstawienie</font></b></a><br><br>\n");
      out.write("\t\t\t   <a class=\"btn btn-default\" href=\"showAllPrzedstawienie.jsp\"><b><font color=\"black\">Zobacz wszystkie przedstawienia</font></b></a>\n");
      out.write("\t\t\t  <br><br>\n");
      out.write("\t\t\t\t <a class=\"btn btn-default\" href=\"getScenaData.jsp\"><b><font color=\"black\">Dodaj scene</font></b></a><br><br>\n");
      out.write("\t\t\t   <a class=\"btn btn-default\" href=\"showAllSceny.jsp\"><b><font color=\"black\">Zobacz wszystkie sceny</font></b></a>\n");
      out.write("<br><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
