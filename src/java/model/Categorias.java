
package model;

import java.io.Serializable;


public class Categorias implements Serializable
{
    private int CodCategoria;
    private String NombreCategoria;

    public Categorias() 
    
    {
        this.CodCategoria=0;
        this.NombreCategoria="";
    }

    public Categorias(int CodCategoria, String NombreCategoria) {
        this.CodCategoria = CodCategoria;
        this.NombreCategoria = NombreCategoria;
    }

    public int getCodCategoria() {
        return CodCategoria;
    }

    public void setCodCategoria(int CodCategoria) {
        this.CodCategoria = CodCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
    
    
    
    
    
}
