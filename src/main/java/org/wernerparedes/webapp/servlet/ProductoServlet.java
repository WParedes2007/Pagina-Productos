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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       List<String>datosProducto = new ArrayList<>();
        String mensaje = "";
        String nombreProducto = req.getParameter("nombreProducto");
        String marcaProducto = req.getParameter("marcaProducto");
        String descripcionProducto = req.getParameter("descripcionProducto");
        String precioProducto = req.getParameter("precioProducto");
       
        datosProducto.add("Nombre : " + nombreProducto);
        datosProducto.add("Marca : " +marcaProducto);
        datosProducto.add("Descripcion : " +descripcionProducto);
        datosProducto.add("Precio: " + "Q." + precioProducto);

        if(nombreProducto.isEmpty()){
            System.out.println(mensaje = "No Se Encuentra El Nombre Del Producto =(");
        }else if(marcaProducto.isEmpty()){
            System.out.println(mensaje = "No Se Encuentra La Marca Del Producto =(");
        }else if(descripcionProducto.isEmpty()){
            System.out.println(mensaje = "No Se Encuentra La Descripcion Del Producto =(");
        }else if(precioProducto.isEmpty()){
            System.out.println(mensaje = "No Se Encuentra El Precio Del Producto =(");
        }  
        
        req.setAttribute("mensaje", mensaje);
        req.setAttribute("datosProducto", datosProducto);
        
        
        getServletContext().getRequestDispatcher("/formulario-productos/formulario-productos.jsp").forward(req,resp);
    }
    
}
