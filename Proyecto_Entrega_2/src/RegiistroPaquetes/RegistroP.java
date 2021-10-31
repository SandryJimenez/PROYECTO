/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegiistroPaquetes;

/**
 *
 * @author JULIO
 */
public class RegistroP {
    
private int Nopaquetes;
private int FechaIngreso;
private DatosDelDestinatario datosDeDestinatario;
private DatosDelPaquete datosDelPaquete;
private DatosDelRemitente datosDelRemitente;
private ObervacionesAdicionales observacionesAdicionales;


    public RegistroP() {
    }

    public RegistroP(int Nopaquetes, int FechaIngreso, DatosDelDestinatario datosDeDestinatario, DatosDelPaquete datosDelPaquete, DatosDelRemitente datosDelRemitente, ObervacionesAdicionales observacionesAdicionales) {
        this.Nopaquetes = Nopaquetes;
        this.FechaIngreso = FechaIngreso;
        this.datosDeDestinatario = datosDeDestinatario;
        this.datosDelPaquete = datosDelPaquete;
        this.datosDelRemitente = datosDelRemitente;
        this.observacionesAdicionales = observacionesAdicionales;
    }


    /**
     * @return the Nopaquetes
     */
    public int getNopaquetes() {
        return Nopaquetes;
    }

    /**
     * @param Nopaquetes the Nopaquetes to set
     */
    public void setNopaquetes(int Nopaquetes) {
        this.Nopaquetes = Nopaquetes;
    }

    /**
     * @return the FechaIngreso
     */
    public int getFechaIngreso() {
        return FechaIngreso;
    }

    /**
     * @param FechaIngreso the FechaIngreso to set
     */
    public void setFechaIngreso(int FechaIngreso) {
        this.FechaIngreso = FechaIngreso;
    }

    /**
     * @return the datosDeDestinatario
     */
    public DatosDelDestinatario getDatosDeDestinatario() {
        return datosDeDestinatario;
    }

    /**
     * @param datosDeDestinatario the datosDeDestinatario to set
     */
    public void setDatosDeDestinatario(DatosDelDestinatario datosDeDestinatario) {
        this.datosDeDestinatario = datosDeDestinatario;
    }

    /**
     * @return the datosDelPaquete
     */
    public DatosDelPaquete getDatosDelPaquete() {
        return datosDelPaquete;
    }

    /**
     * @param datosDelPaquete the datosDelPaquete to set
     */
    public void setDatosDelPaquete(DatosDelPaquete datosDelPaquete) {
        this.datosDelPaquete = datosDelPaquete;
    }

    /**
     * @return the datosDelRemitente
     */
    public DatosDelRemitente getDatosDelRemitente() {
        return datosDelRemitente;
    }

    /**
     * @param datosDelRemitente the datosDelRemitente to set
     */
    public void setDatosDelRemitente(DatosDelRemitente datosDelRemitente) {
        this.datosDelRemitente = datosDelRemitente;
    }

    /**
     * @return the observacionesAdicionales
     */
    public ObervacionesAdicionales getObservacionesAdicionales() {
        return observacionesAdicionales;
    }

    /**
     * @param observacionesAdicionales the observacionesAdicionales to set
     */
    public void setObservacionesAdicionales(ObervacionesAdicionales observacionesAdicionales) {
        this.observacionesAdicionales = observacionesAdicionales;
    }
    
    
    public String RegistroInfoPaquetes(){


        return null;

    }

}
