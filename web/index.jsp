<%-- 
    Document   : index
    Created on : 14/09/2021, 2:44:39 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
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
        
      </div>
        <div class="container-fluid">
            
            <table class="table table-striped">
                <thead>
                <tr>
                <th>ISBN</th>
                <th>TITULO</th>
                <th>AUTOR</th>
                <th>FECHA</th>
                <th>EDITORIAL</th>
                <th>CATEGORIA</th>
                </tr>
                </thead>
                <tbody>
        <tr>
        <td>123456</td>
        <td>CIEN AÑOS DE SOLEDAD</td>
        <td>GABRIEL GARCIA MARQUEZ</td>
        <<td>2021-08-06</td>
        <td>NORMA</td>
        <td>LITERATURA COLOMBIA</td>
      </tr>
      <tr>
        <td>123456</td>
        <td>CIEN AÑOS DE SOLEDAD</td>
        <td>GABRIEL GARCIA MARQUEZ</td>
        <<td>2021-08-06</td>
        <td>NORMA</td>
        <td>LITERATURA COLOMBIA</td>
      </tr>
      <tr>
        <td>123456</td>
        <td>CIEN AÑOS DE SOLEDAD</td>
        <td>GABRIEL GARCIA MARQUEZ</td>
        <<td>2021-08-06</td>
        <td>NORMA</td>
        <td>LITERATURA COLOMBIA</td>
      </tr>
                </tbody> 
            </table>
            
        </div> 
        
    </body>
</html>
