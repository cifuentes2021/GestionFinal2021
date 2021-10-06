

<%@page import="dao.DaoEditoriales"%>
<%@page import="model.Editoriales"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="css/estilo.css"/>
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
 <h1 class="display-4 text-muted bg-warning text-center" >REGISTRAR EDITORIAL</h1>
        <div class="container-fluid">
            <form action="EditorialControl" method="POST" class="col-4 col-m-6 col-lg-8 border p-3 form">
            <div class="form-group">
            <label for="niteditorial">NIT EDITORIAL:</label>
            <input type="number" class="form-control" placeholder="INGRESAR NIT DE LA EDITORIAL" name="txtnitEditorial">
            </div>
            <div class="form-group">
                <label for="NombreEditorial">NOMBRE EDITORIAL:</label>
                <input type="text" class="form-control" placeholder="INGRESAR NOMBRE EDITORIAL" name="txtNombreEditorial">                
            </div>
               <div class="form-group">
                <label for="TelEditorial">TELEFONO EDITORIAL:</label>
                <input type="number" class="form-control" placeholder="INGRESAR TELEFONO EDITORIAL" name="txtTelEditorial">                
            </div>
             <div class="form-group">
                <label for="DirEditorial">DIRECCION EDITORIAL:</label>
                <input type="text" class="form-control" placeholder="INGRESAR DIRECCION EDITORIAL" name="txtDirEditorial">                
            </div>
           <div class="form-group">
                <label for="EmailEditorial">EMAIL EDITORIAL:</label>
                <input type="email" class="form-control" placeholder="INGRESAR EMAIL EDITORIAL" name="txtemailEditorial">                
            </div>
           <div class="form-group">
                <label for="Sitioweb">SITIO WEB:</label>
                <input type="text" class="form-control" placeholder="INGRESAR SITIO WEB EDITORIAL" name="txtSitioWeb">                
            </div>
           
            
            <div class="form-group">
               <div class="form-group">
                <button type="submit" name="accion" value="Registrar" class="btn btn-success">REGISTRAR</button>
               
                <button type="submit" name="accion" value="Eliminar" class="btn btn-success">ELIMINAR</button>
                <button type="submit" name="accion" value="Actualizar" class="btn btn-success">ACTUALIZAR</button>
            </div>  
            </div>
             
                <div class="alert-success"> 
                    <%=(request.getAttribute("mensaje")!=null?request.getAttribute("mensaje"):"") %> 
                
                </div>  
        </form>
                     <div class="container-fluid">
         
            <table class="table table-striped">
                <thead class="thead-dark">
                <tr>
                <th>NIT</th>
                <th>NOMBRE</th>
                 <th>TELEFONO</th>
                  <th>DIRECCION</th>
                   <th>EMAIL</th>
                    <th>SITIO WEB</th>
                    <th>ACCIONES</th>
              
                
                </tr>
                </thead>
                <tbody>
                       <% for(Editoriales ca :DaoEditoriales.listarEditoriales()){ %>
            
           
        <tr >
        <td> <%=ca.getCodEditorial()%></td>
        <td><%=ca.getNombreEditorial() %></td>
        <td><%=ca.getTelefonoEditorial() %></td>
        <td><%=ca.getDireccionEditorial() %></td>
        <td><%=ca.getEmailEditorial() %></td>
        <td><%=ca.getSitioweb() %></td>
        <td><button> <a  type="submit" name="accion" value="Actualizar" class="btn btn-success" href="EditarEditorial.jsp?NitEdit=<%=ca.getCodEditorial()%>"></a></button>  </td>
         
        <td> </td>
         
        <% } %> 
      </tr>
          
                </tbody> 
            </table>
    </body>
</html>
