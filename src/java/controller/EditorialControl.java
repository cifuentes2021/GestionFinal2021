/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DaoCategoria;
import dao.DaoEditoriales;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Editoriales;

/**
 *
 * @author Usuario
 */
public class EditorialControl extends HttpServlet {

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
            out.println("<title>Servlet EditorialControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EditorialControl at " + request.getContextPath() + "</h1>");
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
        String CodEditorial = request.getParameter("txtnitEditorial");
        String NombreEditorial = request.getParameter("txtNombreEditorial");
        String TelefonoEditorial = request.getParameter("txtTelEditorial");
        String DireccionEditorial = request.getParameter("txtDirEditorial");
        String EmailEditorial = request.getParameter("txtemailEditorial");
        String Sitioweb = request.getParameter("txtSitioWeb");
        Editoriales ed = new Editoriales();
        ed.setCodEditorial(CodEditorial);
        ed.setNombreEditorial(NombreEditorial);
        ed.setTelefonoEditorial(TelefonoEditorial);
        ed.setDireccionEditorial(DireccionEditorial);
        ed.setEmailEditorial(EmailEditorial);
        ed.setSitioweb(Sitioweb);
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("Registrar")){
        if(DaoEditoriales.registrarEditorial(ed))
            {
                request.setAttribute("mensaje","La Editorial fue registrada");
            }else
            {
                request.setAttribute("mensaje","La Editorial no fue registrada");
            }
            request.getRequestDispatcher("RegistrarEditorial.jsp").forward(request, response);
    }else if(action.equalsIgnoreCase("Actualizar")){
        
    
            if(DaoEditoriales.actualizareditoriales(ed))
            {
                request.setAttribute("mensaje","La editorial fue actualizada");
            }else
            {
                request.setAttribute("mensaje","La editorial no se puede actualizar");
            }
            request.getRequestDispatcher("RegistrarEditorial.jsp").forward(request, response);
       
    
    }
        else if(action.equalsIgnoreCase("Eliminar")){
     
            if(DaoEditoriales.eliminareditorial(ed))
            {
                request.setAttribute("mensaje","La editorial fue eliminada");
            }else
            {
                request.setAttribute("mensaje","La editorial no se puede eliminar");
            }
            request.getRequestDispatcher("RegistrarEditorial.jsp").forward(request, response);
       
    
    }
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
