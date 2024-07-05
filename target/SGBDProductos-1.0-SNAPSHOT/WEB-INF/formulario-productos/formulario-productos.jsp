<%-- 
    Document   : formulario-productos
    Created on : 4/07/2024, 15:53:05
    Author     : informatica
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "jar.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Formulario De Productos</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
        <div class="offcanvas-header">
          <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Menu</h5>
          <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
        </div>
        <div class="offcanvas-body">
          <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
            <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="../index.html">Inicio</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="form-productos.html">Formulario Productos</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
        <%String mensaje = (String)request.getAttribute("mensaje");%>
        <%if(mensaje != null){%>
        <h1><%=mensaje%></h1>
        <%ArrayList<String> datosProducto = (ArrayList)request.getAttribute("datosProducto");%>
        <%if(datosProducto != null){%>
            <%for(String producto:datosProducto){%>
            <ul>
                <li><%=producto%></li>
            </ul>
        <%}%>
  <div class="container position-relative mt-5">
      <%%>
      <form action="/SGBDProductos/producto-servlet"method="post" enctype="multipart/form-data">
        <div class="mb-3">
          <label for="exampleInputEmail1" class="form-label">Producto Id</label>
          <input type="email" class="form-control" id="ProductoId" aria-describedby="emailHelp">
        </div>
        <div class="mb-3">
          <label for="nombreProducto" class="form-label">Nombre Producto</label>
          <input type="password" class="form-control" id="exampleInputPassword1">
        </div>
        <div class="mb-3">
            <label for="marcaProducto" class="form-label">Marca</label>
            <input type="email" class="form-control" id="marca" aria-describedby="emailHelp">
        </div>
        <div class="input-group mb-3">
            <span class="input-group-text">Q</span>
            <input type="text" class="form-control" aria-label="Amount (to the nearest dollar)">
            <span class="input-group-text">.00</span>
        </div>       
        <div class="form-floating">
            <textarea class="form-control" placeholder="Leave a comment here" id="descripcionProducto"
                style="height: 100px"></textarea>
            <label for="descripcionProducto">Descripción del producto</label>
        </div>
        <div>
            <input type="submit" class="btn btn-outline-success mt-5">
        </div>
    </div>
    </form>
    </body>
</html>
