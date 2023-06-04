/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Active
 */
public class MyConveter extends HttpServlet {

    double US_Dollar = 1.25;
    double Nigerian_Naira = 577.00;
    double Brazil_Real = 6.29;
    double Canadian_Dollar = 1.69;
    double Kenyan_Shilling = 169.16;
    double Indonesian_Rupiah = 18533.78;
    double India_Rupee = 102.25;
    double Philippine_Pisco = 69.26;
    double Pakistani_Rupee = 353.60;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            if(request.getParameter("first_country")==null || request.getParameter("second_country")==null || request.getParameter("getamt").isEmpty())
            {
                    out.print("you have select both country or input the amount");
            }
            
           
            double amountInChange = Double.parseDouble(request.getParameter("getamt"));
           
            double amountInPound = 0.0;
            double amountChanged = 0.0;

            switch (request.getParameter("first_country")) {
                case "USA":
                    amountInPound = amountInChange / US_Dollar;
                    break;
                case "Nigeria":
                    amountInPound = amountInChange / Nigerian_Naira;
                    break;
                case "Brazil":
                    amountInPound = amountInChange / Brazil_Real;
                    break;
                case "Canada":
                    amountInPound = amountInChange / Canadian_Dollar;
                    break;
                case "Kenyan":
                    amountInPound = amountInChange / Kenyan_Shilling;
                    break;
                case "Indonesia":
                    amountInPound = amountInChange / Indonesian_Rupiah;
                    break;
                case "India":
                    amountInPound = amountInChange / India_Rupee;
                    break;
                case "Philippine":
                    amountInPound = amountInChange / Philippine_Pisco;
                    break;
                case "Pakistan":
                    amountInPound = amountInChange / Pakistani_Rupee;
                    break;
            }
            switch (request.getParameter("second_country")) {
                case "USA":
                    amountChanged = amountInPound * US_Dollar;
                    break;
                case "Nigeria":
                    amountChanged = amountInPound * Nigerian_Naira;
                    break;
                case "Brazil":
                    amountChanged = amountInPound * Brazil_Real;
                    break;
                case "Canada":
                    amountChanged = amountInPound * Canadian_Dollar;
                    break;
                case "Kenyan":
                    amountChanged = amountInPound * Kenyan_Shilling;
                    break;
                case "Indonesia":
                    amountChanged = amountInPound * Indonesian_Rupiah;
                    break;
                case "India":
                    amountChanged = amountInPound * India_Rupee;
                    break;
                case "Philippine":
                    amountChanged = amountInPound * Philippine_Pisco;
                    break;
                case "Pakistan":
                    amountChanged = amountInPound * Pakistani_Rupee;
                    break;
            }
            String value=String.format("%.2f", amountChanged);
            
           
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp?val='"+value+"'");
            rd.include(request, response);
             
        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
