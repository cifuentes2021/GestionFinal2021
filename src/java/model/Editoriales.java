
package model;

import java.io.Serializable;


public class Editoriales implements Serializable 

{
    private String CodEditorial;
    private String NombreEditorial;
    private String TelefonoEditorial;
    private String DireccionEditorial;
    private String EmailEditorial;
    private String Sitioweb;

    public Editoriales() 
    {
        this.CodEditorial="";
        this.NombreEditorial="";
        this.TelefonoEditorial="";
        this.DireccionEditorial="";
        this.EmailEditorial="";
        this.Sitioweb="";
    }

    public Editoriales(String CodEditorial, String NombreEditorial, String TelefonoEditorial, String DireccionEditorial, String EmailEditorial, String Sitioweb) {
        this.CodEditorial = CodEditorial;
        this.NombreEditorial = NombreEditorial;
        this.TelefonoEditorial = TelefonoEditorial;
        this.DireccionEditorial = DireccionEditorial;
        this.EmailEditorial = EmailEditorial;
        this.Sitioweb = Sitioweb;
    }

    public String getCodEditorial() {
        return CodEditorial;
    }

    public void setCodEditorial(String CodEditorial) {
        this.CodEditorial = CodEditorial;
    }

    public String getNombreEditorial() {
        return NombreEditorial;
    }

    public void setNombreEditorial(String NombreEditorial) {
        this.NombreEditorial = NombreEditorial;
    }

    public String getTelefonoEditorial() {
        return TelefonoEditorial;
    }

    public void setTelefonoEditorial(String TelefonoEditorial) {
        this.TelefonoEditorial = TelefonoEditorial;
    }

    public String getDireccionEditorial() {
        return DireccionEditorial;
    }

    public void setDireccionEditorial(String DireccionEditorial) {
        this.DireccionEditorial = DireccionEditorial;
    }

    public String getEmailEditorial() {
        return EmailEditorial;
    }

    public void setEmailEditorial(String EmailEditorial) {
        this.EmailEditorial = EmailEditorial;
    }

    public String getSitioweb() {
        return Sitioweb;
    }

    public void setSitioweb(String Sitioweb) {
        this.Sitioweb = Sitioweb;
    }
    
    
    
    
}
