/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoEditoriales;
import dao.DaoLibros;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Editoriales;
import model.Libros;

/**
 *
 * @author Usuario
 */
public class LibroControl extends HttpServlet {

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
            out.println("<title>Servlet LibroControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LibroControl at " + request.getContextPath() + "</h1>");
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
        String CodLibro = request.getParameter("txtCodLibro");
        String TituloLibro = request.getParameter("txtTituloLibro");
        String Descripcion = request.getParameter("txtDescripcion");
        String AutorLibro = request.getParameter("txtAutorLibro");
        String PublicacionLibro = request.getParameter("txtPublicacion");
        int CodCate = Integer.parseInt(request.getParameter("Ccategoria"));
        String CodEdit = request.getParameter("CEditorial");
        String accion = request.getParameter("accion").toLowerCase();
        Libros li = new Libros();
        li.setCodLibro(CodLibro);
        li.setTituloLibro(TituloLibro);
        li.setDescripcion(Descripcion);
        li.setAutorLibro(AutorLibro);
        li.setPublicacionLi(PublicacionLibro);
        li.setCodCate(CodCate);
        li.setCodEdi(CodEdit);
        
        if(DaoLibros.registrarLibros(li))
            {
                request.setAttribute("mensaje","La Editorial fue registrada");
            }else
            {
                request.setAttribute("mensaje","La Editorial no fue registrada");
            }
            request.getRequestDispatcher("RegistrarLibro.jsp").forward(request, response);
        /*if(accion.equals("registrar"))
            {
                if(DaoLibros.registrarLibros(li)){
                request.setAttribute("mensaje","El libro fue registrado");
            }else
            {
                request.setAttribute("mensaje","El libro no fue registrada");
            }
           // request.getRequestDispatcher("RegistrarLibros.jsp").forward(request, response);
            }else if(accion.equals("actualizar")){
                if(DaoLibros.actualizarlibros(li)){
                request.setAttribute("mensaje","El libro fue actualizado");

            }else
            {
                request.setAttribute("mensaje","El libro no fue actualizado");
            }
            }else if(accion.equals("eliminar")){
                if(DaoLibros.eliminarlibros(li)){
                request.setAttribute("mensaje","El libro fue eliminado");

            }else
            {
                request.setAttribute("mensaje","El libro no fue eliminado");
            }
            }else
            {
                request.setAttribute("mensaje","accion desconocida");
            }
        request.getRequestDispatcher("RegistrarLibro.jsp").forward(request, response);*/
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
