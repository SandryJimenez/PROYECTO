/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RepartoDePaquetes;

import RegiistroPaquetes.DatosDelDestinatario;
import RegiistroPaquetes.DatosDelPaquete;
import RegiistroPaquetes.DatosDelRemitente;
import RegiistroPaquetes.ObervacionesAdicionales;
import RegiistroPaquetes.RegistroP;

/**
 *
 * @author JULIO
 */
public class Repartidores extends AsignacionDePaquetes {
    
    private  int NoDumento;
    private String Nombre;
    private String Apellido;
    private int  ZonasDeEntregasAsignadas;
    private String Categoria;
    private String Usuario;
    private String Contraseña;

    public Repartidores() {
    }

    public Repartidores(int NoDumento, String Nombre, String Apellido, int ZonasDeEntregasAsignadas, String Categoria, String Usuario, String Contraseña) {
        this.NoDumento = NoDumento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ZonasDeEntregasAsignadas = ZonasDeEntregasAsignadas;
        this.Categoria = Categoria;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public Repartidores(int NoDumento, String Nombre, String Apellido, int ZonasDeEntregasAsignadas, String Categoria, String Usuario, String Contraseña, RegistroP registroPaquetes, Repartidores RgRepartidor) {
        super(registroPaquetes, RgRepartidor);
        this.NoDumento = NoDumento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ZonasDeEntregasAsignadas = ZonasDeEntregasAsignadas;
        this.Categoria = Categoria;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    public Repartidores(int NoDumento, String Nombre, String Apellido, int ZonasDeEntregasAsignadas, String Categoria, String Usuario, String Contraseña, RegistroP registroPaquetes, Repartidores RgRepartidor, int Nopaquetes, int FechaIngreso, DatosDelDestinatario datosDeDestinatario, DatosDelPaquete datosDelPaquete, DatosDelRemitente datosDelRemitente, ObervacionesAdicionales observacionesAdicionales) {
        super(registroPaquetes, RgRepartidor, Nopaquetes, FechaIngreso, datosDeDestinatario, datosDelPaquete, datosDelRemitente, observacionesAdicionales);
        this.NoDumento = NoDumento;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.ZonasDeEntregasAsignadas = ZonasDeEntregasAsignadas;
        this.Categoria = Categoria;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }

    /**
     * @return the NoDumento
     */
    public int getNoDumento() {
        return NoDumento;
    }

    /**
     * @param NoDumento the NoDumento to set
     */
    public void setNoDumento(int NoDumento) {
        this.NoDumento = NoDumento;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the ZonasDeEntregasAsignadas
     */
    public int getZonasDeEntregasAsignadas() {
        return ZonasDeEntregasAsignadas;
    }

    /**
     * @param ZonasDeEntregasAsignadas the ZonasDeEntregasAsignadas to set
     */
    public void setZonasDeEntregasAsignadas(int ZonasDeEntregasAsignadas) {
        this.ZonasDeEntregasAsignadas = ZonasDeEntregasAsignadas;
    }

    /**
     * @return the Categoria
     */
    public String getCategoria() {
        return Categoria;
    }

    /**
     * @param Categoria the Categoria to set
     */
    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
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
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }


}
