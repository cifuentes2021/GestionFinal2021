
package model;

import java.io.Serializable;


public class Libros implements Serializable
{
    private String CodLibro;
    private String TituloLibro;
    private String Descripcion;
    private String AutorLibro;
    private String PublicacionLi;
    private int CodCate;
    private String CodEdi;

    public Libros() 
    {
        
        this.CodLibro="";
        this.TituloLibro="";
        this.Descripcion="";
        this.AutorLibro="";
        this.CodCate=0;
        this.CodEdi="";
    }

    public String getCodLibro() {
        return CodLibro;
    }

    public String getTituloLibro() {
        return TituloLibro;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getAutorLibro() {
        return AutorLibro;
    }

    public String getPublicacionLi() {
        return PublicacionLi;
    }

    public int getCodCate() {
        return CodCate;
    }

    public String getCodEdi() {
        return CodEdi;
    }

    public void setCodLibro(String CodLibro) {
        this.CodLibro = CodLibro;
    }

    public void setTituloLibro(String TituloLibro) {
        this.TituloLibro = TituloLibro;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setAutorLibro(String AutorLibro) {
        this.AutorLibro = AutorLibro;
    }

    public void setPublicacionLi(String PublicacionLi) {
        this.PublicacionLi = PublicacionLi;
    }

    public void setCodCate(int CodCate) {
        this.CodCate = CodCate;
    }

    public void setCodEdi(String CodEdi) {
        this.CodEdi = CodEdi;
    }
    
    
    
    
    
    
    
    
}
