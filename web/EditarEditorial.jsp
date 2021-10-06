<%-- 
    Document   : EditarEditorial
    Created on : 25/09/2021, 5:16:33 p. m.
    Author     : Usuario
--%>

<%@page import="dao.DaoEditoriales"%>
<%@page import="model.Editoriales"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <%
          <% for(Editoriales ed:DaoEditoriales.()){%>
        
        
      
          
        <div class="container">
            <h1>Modificar Registro</h1>
            <hr>
            <form action="" method="post" class="form-control" style="width: 500px; height: 400px">
                Nit:
                <input type="text" readonly="" class="form-control" value="<%=ed.getCodEditorial()%>" name="txtcod" readonly="readonly"/>
                 Nombres Editorial:
                <input type="text" name="txtNom" value="<%=ed.getNombreEditorial()%>" class="form-control" name="txtname"/><br>
              
                Telefono Editorial:
                <input type="text" name="txtDNI" class="form-control" value="<%=ed.getTelefonoEditorial()%>" name="txttelefono"/>
                Direccion Editorial:
                <input type="text" readonly="" class="form-control" value="<%=ed.getDireccionEditorial()%>" name="txtdireccion"/> 
                Email Editorial:
                <input type="text" readonly="" class="form-control" value="<%=ed.getEmailEditorial()%>" name="txtemail"/>
                Sitio Web:
                <input type="text" readonly="" class="form-control" value="<%=ed.getSitioweb()%>" name="txtweb"/>
                <br>
                <input type="submit" value="Actualizar" class="btn btn-primary btn-lg"/>
                
                <a href="RegistrarEditorial.jsp">Regresar</a>
            </form>
              <% } %>
           
        </div>
    

