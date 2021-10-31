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
public class AsignacionDePaquetes extends RegistroP{
    private RegistroP registroPaquetes;
    private Repartidores  RgRepartidor;

    public AsignacionDePaquetes() {
    }

    public AsignacionDePaquetes(RegistroP registroPaquetes, Repartidores RgRepartidor) {
        this.registroPaquetes = registroPaquetes;
        this.RgRepartidor = RgRepartidor;
    }

    public AsignacionDePaquetes(RegistroP registroPaquetes, Repartidores RgRepartidor, int Nopaquetes, int FechaIngreso, DatosDelDestinatario datosDeDestinatario, DatosDelPaquete datosDelPaquete, DatosDelRemitente datosDelRemitente, ObervacionesAdicionales observacionesAdicionales) {
        super(Nopaquetes, FechaIngreso, datosDeDestinatario, datosDelPaquete, datosDelRemitente, observacionesAdicionales);
        this.registroPaquetes = registroPaquetes;
        this.RgRepartidor = RgRepartidor;
    }

    /**
     * @return the registroPaquetes
     */
    public RegistroP getRegistroPaquetes() {
        return registroPaquetes;
    }

    /**
     * @param registroPaquetes the registroPaquetes to set
     */
    public void setRegistroPaquetes(RegistroP registroPaquetes) {
        this.registroPaquetes = registroPaquetes;
    }

    /**
     * @return the RgRepartidor
     */
    public Repartidores getRgRepartidor() {
        return RgRepartidor;
    }

    /**
     * @param RgRepartidor the RgRepartidor to set
     */
    public void setRgRepartidor(Repartidores RgRepartidor) {
        this.RgRepartidor = RgRepartidor;
    }
    
    
}
