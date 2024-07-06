/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.wernerparedes.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/producto-servlet")
@MultipartConfig
public class ProductoServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> datosProducto = new ArrayList<>();
        String nombreProducto = req.getParameter("nombreProducto");
        String marcaProducto = req.getParameter("marcaProducto");
        String descripcionProducto = req.getParameter("descripcionProducto");
        String precioProducto = req.getParameter("precioProducto");

        datosProducto.add("Nombre : " + nombreProducto);
        datosProducto.add("Marca : " + marcaProducto);
        datosProducto.add("Descripcion : " + descripcionProducto);
        datosProducto.add("Precio: " + "Q." + precioProducto);

        String msj = null;

        if (nombreProducto.isEmpty()) {
            msj = " El Campo De Nombre Del Producto Necesita Llenarse =(!";
        } else if (marcaProducto.isEmpty()) {
            msj = "El Campo De Marca Del Producto Necesita Llenarse =(";
        } else if (descripcionProducto.isEmpty()) {
            msj = "El Campo De Descripcion Del Producto Necesita Llenarse=(";
        } else if (precioProducto.isEmpty()) {
            msj = "El Campo De Precio Del Producto Necesita Llenarse =(";
        }

        req.setAttribute("mensaje", msj);
        req.setAttribute("datosProducto", datosProducto);

        getServletContext().getRequestDispatcher("/formulario-productos/formulario-productos.jsp").forward(req, resp);

    }



}
