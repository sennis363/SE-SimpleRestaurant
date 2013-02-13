package main;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import main.RestaurantFunctions;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Michael
 */
public class MainServlet extends HttpServlet {

    private static final String OUTPUT_PAGE = "outputForm.jsp";
    private static double price;
    private static double tax;
    private static double tip;
    private static double finalPrice;

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        RestaurantFunctions rf = new RestaurantFunctions();
        DecimalFormat df = new DecimalFormat("#.##");
        String value = request.getParameter("food");

        price = rf.displayPrice(value);
        tax = rf.addTax(price);
        tip = rf.suggestedTip(value);
        finalPrice = rf.finalPrice(value);

        List result = new ArrayList();
        result.add(price);
        result.add(df.format(tax));
        result.add(tip);
        result.add(finalPrice);

        request.setAttribute("result", result);
        request.setAttribute("fruit", value);

//        if (value.equals("apple")) {
//
//            price = rf.displayPrice("apple");
//            tax = rf.addTax(price);
//            tip = rf.suggestedTip("apple");
//            finalPrice = rf.finalPrice("apple");
//
//            List result1 = new ArrayList();
//            result1.add(price);
//            result1.add(df.format(tax));
//            result1.add(tip);
//            result1.add(finalPrice);
//
//            request.setAttribute("result1", result1);
//
//        }
//
//        if (value.equals("banana")) {
//
//            price = rf.displayPrice("banana");
//            tax = rf.addTax(price);
//            tip = rf.suggestedTip("banana");
//            finalPrice = rf.finalPrice("banana");
//
//            List result2 = new ArrayList();
//            result2.add(price);
//            result2.add(df.format(tax));
//            result2.add(tip);
//            result2.add(finalPrice);
//
//            request.setAttribute("result2", result2);
//
//        }
//
//        if (value.equals("coconut")) {
//
//            price = rf.displayPrice(value);
//            tax = rf.addTax(price);
//            tip = rf.suggestedTip(value);
//            finalPrice = rf.finalPrice(value);
//
//            List result3 = new ArrayList();
//            result3.add(price);
//            result3.add(df.format(tax));
//            result3.add(tip);
//            result3.add(finalPrice);
//
//            request.setAttribute("result3", result3);
//
//        }
//
//        if (value.equals("date")) {
//
//            price = rf.displayPrice(value);
//            tax = rf.addTax(price);
//            tip = rf.suggestedTip(value);
//            finalPrice = rf.finalPrice(value);
//
//            List result4 = new ArrayList();
//            result4.add(price);
//            result4.add(df.format(tax));
//            result4.add(tip);
//            result4.add(finalPrice);
//
//            request.setAttribute("result4", result4);
//
//        }

        RequestDispatcher view =
                request.getRequestDispatcher(OUTPUT_PAGE);
        view.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
