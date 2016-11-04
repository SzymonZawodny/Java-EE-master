package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getScenaData_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<title>Dodaj Scene</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style rel=\"stylesheet\" type=\"text/css\">\n");
      out.write(" body {    background-color: #ffcc66; }\n");
      out.write(" .contentbox {\n");
      out.write("    margin-top: 120px;\n");
      out.write("     margin-left: 550px;\n");
      out.write("    width: auto;\n");
      out.write("    height: 100%;\n");
      out.write("    background-color: #ffcc66;\n");
      out.write("    border-color: #A0A0A0;\n");
      out.write("    overflow: auto;\n");
      out.write("    font-family: Arial;\n");
      out.write("    font-size: 24px;\n");
      out.write("           }\n");
      out.write("    .tak {color:black;  font-weight: bold; }\n");
      out.write("\t.sumbit { text-align: center;}\n");
      out.write("       .tak3 {color:black;  font-weight: bold; text-align: center;}\n");
      out.write("       .stronka { font-weight: bold;  margin-left: 600px; color: black}\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t");
      main.java.com.zawodny.domain.Scena scena = null;
      synchronized (session) {
        scena = (main.java.com.zawodny.domain.Scena) _jspx_page_context.getAttribute("scena", PageContext.SESSION_SCOPE);
        if (scena == null){
          scena = new main.java.com.zawodny.domain.Scena();
          _jspx_page_context.setAttribute("scena", scena, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("scena"), request);
      out.write('\n');
      out.write('	');
      main.java.com.zawodny.service.ScenaManager scenamanager = null;
      synchronized (application) {
        scenamanager = (main.java.com.zawodny.service.ScenaManager) _jspx_page_context.getAttribute("scenamanager", PageContext.APPLICATION_SCOPE);
        if (scenamanager == null){
          scenamanager = new main.java.com.zawodny.service.ScenaManager();
          _jspx_page_context.setAttribute("scenamanager", scenamanager, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div class=\"contentbox\">\n");
      out.write("            <form action=\"addScena.jsp\">\n");
      out.write("            <table class=\"operationtable\">\n");
      out.write("                <tr class='tableheader'>\n");
      out.write("                    <td class = tak3 colspan='2'>Dodaj Scene</td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak> Nazwa:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"nazwa\" pattern=\"[A-Za-z]*\" title=\"Nazwa ma sie składać tylko z liter\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak>Wielkość:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"wielkosc\" pattern=\"[A-Za-z]*\" title=\"Wielkość ma sie składać tylko z liter\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td class = tak>Numer:</td>\n");
      out.write("                    <td ><input type=\"text\" name=\"numer\" pattern=\"[0-9]*\" title=\"Tylko liczby\" value=\"\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td  class = sumbit colspan=\"2\"><input type=\"submit\" value=\" DODAJ \" align=\"right\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <center> <a  class=\"btn btn-default\" href=\"http://localhost:8080/teatr/\"><b><font color=\"black\">Powrót do strony głównej</a></center>\n");
      out.write("\n");
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
