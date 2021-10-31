/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegiistroPaquetes;

/**
 *
 * @author JULIO
 */
public class ObervacionesAdicionales {
    
    private int FechaLimiteEntrega;
    private String OservR;

    public ObervacionesAdicionales() {
    }

    public ObervacionesAdicionales(int FechaLimiteEntrega, String OservR) {
        this.FechaLimiteEntrega = FechaLimiteEntrega;
        this.OservR = OservR;
    }

    /**
     * @return the FechaLimiteEntrega
     */
    public int getFechaLimiteEntrega() {
        return FechaLimiteEntrega;
    }

    /**
     * @param FechaLimiteEntrega the FechaLimiteEntrega to set
     */
    public void setFechaLimiteEntrega(int FechaLimiteEntrega) {
        this.FechaLimiteEntrega = FechaLimiteEntrega;
    }

    /**
     * @return the OservR
     */
    public String getOservR() {
        return OservR;
    }

    /**
     * @param OservR the OservR to set
     */
    public void setOservR(String OservR) {
        this.OservR = OservR;
    }
    
    
}
