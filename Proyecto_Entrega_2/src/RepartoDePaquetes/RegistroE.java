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
public class RegistroE extends RegistroP{
    
    private int FechaVisita;
    private int HoraVisita;
    private Repartidores repartidores;
    private String EstadoPaquete;

    public RegistroE() {
    }

    public RegistroE(int FechaVisita, int HoraVisita, Repartidores repartidores, String EstadoPaquete) {
        this.FechaVisita = FechaVisita;
        this.HoraVisita = HoraVisita;
        this.repartidores = repartidores;
        this.EstadoPaquete = EstadoPaquete;
    }

    public RegistroE(int FechaVisita, int HoraVisita, Repartidores repartidores, String EstadoPaquete, int Nopaquetes, int FechaIngreso, DatosDelDestinatario datosDeDestinatario, DatosDelPaquete datosDelPaquete, DatosDelRemitente datosDelRemitente, ObervacionesAdicionales observacionesAdicionales) {
        super(Nopaquetes, FechaIngreso, datosDeDestinatario, datosDelPaquete, datosDelRemitente, observacionesAdicionales);
        this.FechaVisita = FechaVisita;
        this.HoraVisita = HoraVisita;
        this.repartidores = repartidores;
        this.EstadoPaquete = EstadoPaquete;
    }

    /**
     * @return the FechaVisita
     */
    public int getFechaVisita() {
        return FechaVisita;
    }

    /**
     * @param FechaVisita the FechaVisita to set
     */
    public void setFechaVisita(int FechaVisita) {
        this.FechaVisita = FechaVisita;
    }

    /**
     * @return the HoraVisita
     */
    public int getHoraVisita() {
        return HoraVisita;
    }

    /**
     * @param HoraVisita the HoraVisita to set
     */
    public void setHoraVisita(int HoraVisita) {
        this.HoraVisita = HoraVisita;
    }

    /**
     * @return the repartidores
     */
    public Repartidores getRepartidores() {
        return repartidores;
    }

    /**
     * @param repartidores the repartidores to set
     */
    public void setRepartidores(Repartidores repartidores) {
        this.repartidores = repartidores;
    }

    /**
     * @return the EstadoPaquete
     */
    public String getEstadoPaquete() {
        return EstadoPaquete;
    }

    /**
     * @param EstadoPaquete the EstadoPaquete to set
     */
    public void setEstadoPaquete(String EstadoPaquete) {
        this.EstadoPaquete = EstadoPaquete;
    }
    
    
    
    
}
