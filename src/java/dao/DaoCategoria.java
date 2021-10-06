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
import model.Categorias;

/**
 *
 * @author Usuario
 */
public class DaoCategoria {
    
    public static boolean registrar(Categorias Ca)
    {
        try {
            String sql = "INSERT INTO Categorias values (?,?);";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setInt(1, Ca.getCodCategoria());
            st.setString(2,Ca.getNombreCategoria());
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("Usuario ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
      public static ArrayList<Categorias> listar()
    {
        try {
            String sql = "select * from Categorias;";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
           ArrayList<Categorias> lista=new ArrayList<Categorias>();
           Categorias cate;
           while(resultado.next())
           {
               cate= new Categorias();
               cate.setCodCategoria(resultado.getInt("CodCate"));
               cate.setNombreCategoria(resultado.getString("NombreCate"));
               lista.add(cate);
           }
           return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
       public static boolean actualizarcategorias(Categorias Ca)
    {
        try {
      String sql = "UPDATE Categorias SET NombreCate=? where CodCate=?;";
      Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
             st.setString(1, Ca.getNombreCategoria());
             st.setInt(2, Ca.getCodCategoria());
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("Usuario ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
        public static boolean eliminarcategorias(Categorias Ca)
    {
        try {
      String sql = "DELETE FROM Categorias  where CodCate=?;";
      Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setInt(1, Ca.getCodCategoria());
            if(st.executeUpdate()>0)
            {
               // System.out.println("Registro ok");
                return true;
            }else
            {
              //System.out.println("Usuario ya registrado");
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
}
