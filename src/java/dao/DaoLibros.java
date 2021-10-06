/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Editoriales;
import model.Libros;

/**
 *
 * @author Usuario
 */
public class DaoLibros {
    public static boolean registrarLibros(Libros li)
    {
        try {
            String sql = "INSERT INTO Libros VALUES(?,?,?,?,?,?,?);";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, li.getCodLibro());
            st.setString(2, li.getTituloLibro());
            st.setString(3, li.getDescripcion());
            st.setString(4, li.getAutorLibro());
            st.setString(5, li.getPublicacionLi());
            st.setInt(6, li.getCodCate());
            st.setString(7, li.getCodEdi());
            
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("libro ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
      public static ArrayList<Libros> listarlibros()
    {
        try {
            String sql = "select * from Libros;";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
           ArrayList<Libros> lista=new ArrayList<Libros>(); 
        ;
           Libros lib;
           while(resultado.next())
           {
               lib= new Libros();
               lib.setCodLibro(resultado.getString("CodLibro"));
               lib.setTituloLibro(resultado.getString("TituloLi"));
               
               lista.add(lib);
           }
           return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
      
      public static boolean actualizarlibros(Libros li)
    {
        try {
            String sql = "UPDATE Libros SET TituloLi=?,Descripcion=?,NombreAutor=?,CodC=?,NitEd=? WHERE CodLibro=?";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, li.getTituloLibro());
            st.setString(2, li.getDescripcion());
            st.setString(3, li.getAutorLibro());
            st.setInt(4, li.getCodCate());
            st.setString(5, li.getCodEdi());
            st.setString(6, li.getCodLibro());
            
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("libro ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
      
      public static boolean eliminarlibros(Libros li)
    {
        try {
            String sql = "DELETE Libros  WHERE CodLibro=?";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, li.getCodLibro());
            
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("libro ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
      
      
}
