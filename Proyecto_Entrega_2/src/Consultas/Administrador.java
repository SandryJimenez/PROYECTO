/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

/**
 *
 * @author JULIO
 */
public class Administrador {
    private String Usuario;
    private Boolean Contraseña; 

    public Administrador() {
    }

    public Administrador(String Usuario, Boolean Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public Boolean getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(Boolean Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
    
}
