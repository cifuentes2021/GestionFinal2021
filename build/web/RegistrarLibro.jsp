<%-- 
    Document   : RegistrarLibro
    Created on : 17/09/2021, 11:49:23 a. m.
    Author     : Usuario
--%>

<%@page import="model.Libros"%>
<%@page import="dao.DaoEditoriales"%>
<%@page import="model.Editoriales"%>
<%@page import="dao.DaoCategoria"%>
<%@page import="model.Categorias"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container-fluid">
          <nav class="navbar navbar-expand-sm bg-success navbar-light">
              <img src="img/biblioteca.png" alt="Logo" style="width:60px;">
  <ul class="navbar-nav ml-auto">
    <li class="nav-item active">
       <a class="nav-link" href="RegistrarLibro.jsp">REGISTRAR LIBRO</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="RegistrarEditorial.jsp">REGISTRAR EDITORIAL</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="RegistrarCategoria.jsp">REGISTRAR CATEGORIA</a>
    </li>
    
  </ul>
</nav>
        <h1 class="display-4 text-muted bg-warning text-center" >REGISTRAR LIBRO</h1>
        <div class="container-fluid">
         <form action="LibroControl" method="POST"  class="col-11 col-m-6 col-lg-5 border p-3 form">

            <div class="form-group" >
            <label for="CodLibro">CODIGO LIBRO:</label>
            <input type="number" class="form-control" placeholder="INGRESAR CODIGO DEL LIBRO" name="txtCodLibro">
            </div>
            <div class="form-group">
                <label for="TituloLibro">TITULO DEL LIBRO:</label>
                <input type="text" class="form-control" placeholder="INGRESAR TITULO DEL LIBRO" name="txtTituloLibro">                
            </div>
            <div class="form-group">
                <label for="Descripcion">DESCRIPCION:</label>
                <input type="text" class="form-control" placeholder="INGRESAR DESCRIPCION DEL LIBRO" name="txtDescripcion">                
            </div>
                <div class="form-group">
                <label for="Autor">AUTOR DEL LIBRO:</label>
                <input type="text" class="form-control" placeholder="INGRESAR AUTOR DEL LIBRO" name="txtAutorLibro">                
            </div>
             <div class="form-group">
                <label for="publicacion">AÑO PUBLICACION LIBRO:</label>
                <input type="text" class="form-control" placeholder="INGRESAR AÑO DE PUBLICACION" name="txtPublicacion">                
            </div>
           <div class="form-group">
                <label for="CodCateg">SELECCIONA UNA CATEGORIA:</label>
                <select name="Ccategoria" class="custom-select">
                    <option value="0"></option> 
                     <% for(Categorias ca:DaoCategoria.listar()){%>
                     <option value="<%=ca.getCodCategoria()%>"><%=ca.getNombreCategoria()%></option> 
                   <% } %>
                </select>               
            </div>
           <div class="form-group ">
                <label for="CodEdit">SELECCIONA EDITORIAL:</label>
                <select name="CEditorial" class="custom-select">
                    <option value="0"></option> 
                     <% for(Editoriales ed:DaoEditoriales.listarEditoriales()){%>
                     <option value="<%=ed.getCodEditorial()%>"><%=ed.getNombreEditorial()%></option> 
                   <% } %>
                </select>               
            </div>
           
            
            <div class="form-group">
                <button name="accion" type="submit" class="btn btn-success">Registrar</button>
            
                <button name="accion" type="submit" class="btn btn-success">Actualizar</button>
            
                <button name="accion" type="submit" class="btn btn-success">Eliminar</button>
            </div> 
              
                <div class="alert-success"> 
                    <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"") %> 
                
                </div>  

        </form>
                    <table class="table table-striped">
                <thead class="thead-dark">
                <tr>
                <th>CODIGO</th>
                <th>TITULO</th>
                 <th>DESCRIPCION</th>
                  <th>AUTOR</th>
                   <th>PUBLICACION</th>
                    <th>CATEGORIA</th>
                    <th>CATEGORIA</th>
              
                
                </tr>
                </thead>
                <tbody>
                   
      </tr>
          
                </tbody> 
            </table>
    </body>
</html>
