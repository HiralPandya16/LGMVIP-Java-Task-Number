package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Currency Converter</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\">\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Amiri&family=Lobster&family=Pacifico&display=swap\"\n");
      out.write("              rel=\"stylesheet\">\n");
      out.write("        <!-- linking style.css file-->\n");
      out.write("        <link href=\"Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <form method=\"get\" action=\"MyConveter\">\n");
      out.write("            <h1 class=\"heading text-center display-2\">\n");
      out.write("                Currency Converter\n");
      out.write("            </h1>\n");
      out.write("            <hr>\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"oamount\">\n");
      out.write("                            Amount to Convert :\n");
      out.write("                        </label>\n");
      out.write("                        <input type=\"text\" class=\"form-control searchBox\" placeholder=\"0.00\" name=\"getamt\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\">From</span>\n");
      out.write("                                </div>\n");
      out.write("                                <select class=\"form-control from\" name=\"first_country\">\n");
      out.write("                                    <option value=\"\">Select One …</option>\n");
      out.write("                                    <option value=\"USA\">USA</option>\n");
      out.write("                                    <option value=\"Nigeria\">Nigeria</option>\n");
      out.write("                                    <option value=\"Brazil\">Brazil</option>\n");
      out.write("                                    <option value=\"Canada\">Canada</option>\n");
      out.write("                                    <option value=\"Kenyan\">Kenyan</option>\n");
      out.write("                                    <option value=\"Indonesia\">Indonesia</option>\n");
      out.write("                                    <option value=\"India\">India</option>\n");
      out.write("                                    <option value=\"Philippine\">Philippine</option>\n");
      out.write("                                    <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <div class=\"input-group mb-3\">\n");
      out.write("                                <div class=\"input-group-prepend\">\n");
      out.write("                                    <span class=\"input-group-text\">To</span>\n");
      out.write("                                </div>\n");
      out.write("                                <select class=\"form-control to\" name=\"second_country\">\n");
      out.write("                                    <option value=\"\">Select One …</option>\n");
      out.write("                                    <option value=\"USA\">USA</option>\n");
      out.write("                                    <option value=\"Nigeria\">Nigeria</option>\n");
      out.write("                                    <option value=\"Brazil\">Brazil</option>\n");
      out.write("                                    <option value=\"Canada\">Canada</option>\n");
      out.write("                                    <option value=\"Kenyan\">Kenyan</option>\n");
      out.write("                                    <option value=\"Indonesia\">Indonesia</option>\n");
      out.write("                                    <option value=\"India\">India</option>\n");
      out.write("                                    <option value=\"Philippine\">Philippine</option>\n");
      out.write("                                    <option value=\"Pakistan\">Pakistan</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div name=\"finalAmount\" class=\"text-center\">\n");
      out.write("\n");
      out.write("                        <!-- Display the converted amount -->\n");
      out.write("                        <h2>Converted Amount : \n");
      out.write("                            <lable class=\"finalValue\" style=\"color:white;\" id=\"setamt\" >\n");
      out.write("                                ");
      out.print(request.getParameter("val"));
      out.write("\n");
      out.write("                                </label>\n");
      out.write("                        </h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"text-center\">\n");
      out.write("\n");
      out.write("                        <!-- convert button -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary convert m-2\" value=\"Convert\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- reset button -->\n");
      out.write("\n");
      out.write("                        <input type=\"reset\" class=\"btn btn-primary m-2\" value=\"Reset\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("        </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
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
