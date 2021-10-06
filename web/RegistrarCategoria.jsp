

<%@page import="model.Categorias"%>
<%@page import="dao.DaoCategoria"%>
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
        <h1 class="display-4 text-muted bg-warning text-center" >REGISTRAR CATEGORIA</h1>
        <div class="container-fluid">
            <form  action="CategoriaControl" method="POST" class="border p-3 form">
            <div class="form-group">
            <label for="codigo">CODIGO CATEGORIA:</label>
            <input type="num" class="form-control" placeholder="INGRESAR CODIGO CATEGORIA " name="txtCodCate">
            </div>    
            <div class="form-group">
            <label for="categoria">NOMBRE CATEGORIA:</label>
            <input type="text" class="form-control" placeholder="INGRESAR NOMBRE CATEGORIA DE LIBROS" name="txtNomCate">
            </div>
            
            <div class="form-group">
                <button type="submit" name="accion" value="Registrar" class="btn btn-success">REGISTRAR</button>
                <button type="submit" name="accion" value="Actualizar" class="btn btn-success">ACTUALIZAR</button>
                <button type="submit" name="accion" value="Eliminar" class="btn btn-success">ELIMINAR</button>
               
            </div>  
                
                <div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Modal Header</h4>
      </div>
      <div class="modal-body">
        <p>Some text in the modal.</p>
      </div>
      <div class="modal-footer">
        <button type="submit" name="accion" value="Actualizar" class="btn btn-warning">ACTUALIZAR</button>  
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

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
                <th>CODIGO</th>
                <th>NOMBRE</th>
                <th>ACCIONES</th>
                
                </tr>
                </thead>
                <tbody>
                       <% for(Categorias ca :DaoCategoria.listar()){ %>
            
           
        <tr>
        <td> <%=ca.getCodCategoria()%></td>
        <td><%=ca.getNombreCategoria() %></td>
       
      
         
        <% } %> 
      </tr>
          
                </tbody> 
            </table>
           
    </div>
  </div>
</div>
      
      
            
        </div>
    </body>
</html>
