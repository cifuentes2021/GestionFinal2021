/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoCategoria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categorias;

/**
 *
 * @author Usuario
 */
public class CategoriaControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CategoriaControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CategoriaControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("accion");
        
        int codigo = Integer.parseInt(request.getParameter("txtCodCate"));
        String nombre=request.getParameter("txtNomCate");
        Categorias c = new Categorias();
            c.setCodCategoria(codigo);
            c.setNombreCategoria(nombre);
        if(action.equalsIgnoreCase("Registrar")){
       // int codigo = Integer.parseInt(request.getParameter("txtCodCate"));
       // String nombre=request.getParameter("txtNomCate");
            
            if(DaoCategoria.registrar(c))
            {
                request.setAttribute("mensaje","La categoria fue registrada");
            }else
            {
                request.setAttribute("mensaje","La categoria no fue registrada");
            }
            request.getRequestDispatcher("RegistrarCategoria.jsp").forward(request, response);
    }else if(action.equalsIgnoreCase("Actualizar")){
  
            if(DaoCategoria.actualizarcategorias(c))
            {
                request.setAttribute("mensaje","La categoria fue actualizada");
            }else
            {
                request.setAttribute("mensaje","La categoria no se puede actualizar");
            }
            request.getRequestDispatcher("RegistrarCategoria.jsp").forward(request, response);
       
    
    }
        else if(action.equalsIgnoreCase("Eliminar")){
     
            if(DaoCategoria.eliminarcategorias(c))
            {
                request.setAttribute("mensaje","La categoria fue eliminada");
            }else
            {
                request.setAttribute("mensaje","La categoria no se puede eliminar");
            }
            request.getRequestDispatcher("RegistrarCategoria.jsp").forward(request, response);
       
    
    }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
