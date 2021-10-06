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
import model.Editoriales;

/**
 *
 * @author Usuario
 */
public class DaoEditoriales {
    
 public static boolean registrarEditorial(Editoriales Ed)
    {
        try {
            String sql = "INSERT INTO Editoriales(NitEdit,NombreEdit,TelefonoEdit,DireccionEdit,EmailEdit,SitiowebEdit) VALUES (?,?,?,?,?,?);";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, Ed.getCodEditorial());
            st.setString(2, Ed.getNombreEditorial());
            st.setString(3, Ed.getTelefonoEditorial());
            st.setString(4, Ed.getDireccionEditorial());
            st.setString(5, Ed.getEmailEditorial());
            st.setString(6, Ed.getSitioweb());
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
    
      public static ArrayList<Editoriales> listarEditoriales()
    {
        try {
            String sql = "select * from Editoriales;";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
           ArrayList<Editoriales> lista=new ArrayList<Editoriales>(); 
        ;
           Editoriales Edit;
           while(resultado.next())
           {
               Edit= new Editoriales();
               Edit.setCodEditorial(resultado.getString("NitEdit"));
               Edit.setNombreEditorial(resultado.getString("NombreEdit"));
               Edit.setTelefonoEditorial(resultado.getString("TelefonoEdit"));
               Edit.setDireccionEditorial(resultado.getString("DireccionEdit"));
               Edit.setEmailEditorial(resultado.getString("EmailEdit"));
               Edit.setSitioweb(resultado.getString("SitiowebEdit"));
               lista.add(Edit);
           }
           return lista;
        } catch (SQLException ex) {
            return null;
        }
    }
       public static boolean actualizareditoriales(Editoriales ed)
    {
        try {
      String sql = "UPDATE Editoriales SET NombreEdit=? TelefonoEdit=? DireccionEdit=? EmailEdit=? SitioWebEdit=? where NitEdit=?;";
      Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, ed.getNombreEditorial());
            st.setString(2, ed.getTelefonoEditorial());
            st.setString(3, ed.getDireccionEditorial());
            st.setString(4, ed.getEmailEditorial());
            st.setString(5, ed.getSitioweb());
            st.setString(6, ed.getCodEditorial());
            if(st.executeUpdate()>0)
            {
                return true;
            }else
            {
              
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
        public static boolean eliminareditorial(Editoriales ed)
    {
        try {
      String sql = "DELETE FROM Editoriales  where NitEdit=?;";
      Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            st.setString(1, ed.getCodEditorial());
            if(st.executeUpdate()>0)
            {
               
                return true;
            }else
            {
              
              return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
        
        public static ArrayList<Editoriales> consultarEditar()
    {
        try {
            String sql = "select * from Editoriales ;";
            Connection co = Conexion.conectar();
            PreparedStatement st = co.prepareStatement(sql);
            ResultSet resultado = st.executeQuery();
           ArrayList<Editoriales> lista=new ArrayList<Editoriales>(); 
        ;
           Editoriales Edit;
           while(resultado.next())
           {
               Edit= new Editoriales();
               Edit.setCodEditorial(resultado.getString("NitEdit"));
               Edit.setNombreEditorial(resultado.getString("NombreEdit"));
               Edit.setTelefonoEditorial(resultado.getString("TelefonoEdit"));
               Edit.setDireccionEditorial(resultado.getString("DireccionEdit"));
               Edit.setEmailEditorial(resultado.getString("EmailEdit"));
               Edit.setSitioweb(resultado.getString("SitiowebEdit"));
               lista.add(Edit);
           }
           return lista;
        } catch (SQLException ex) {
            return null;
        }
        
    }}

