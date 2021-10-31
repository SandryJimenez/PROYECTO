/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegiistroPaquetes;

/**
 *
 * @author JULIO
 */
public class DatosDelRemitente {
    
    private String NombreR;
    private String Direccion;  
    private String CalleYCarrera;
    private String NoDeVivienda;
    private int CodigoPostal;
    private String Pais;
    private String Ciudad;
    private int TelefonoR;

    public DatosDelRemitente() {
    }

    public DatosDelRemitente(String NombreR, String Direccion, String CalleYCarrera, String NoDeVivienda, int CodigoPostal, String Pais, String Ciudad, int TelefonoR) {
        this.NombreR = NombreR;
        this.Direccion = Direccion;
        this.CalleYCarrera = CalleYCarrera;
        this.NoDeVivienda = NoDeVivienda;
        this.CodigoPostal = CodigoPostal;
        this.Pais = Pais;
        this.Ciudad = Ciudad;
        this.TelefonoR = TelefonoR;
    }

    /**
     * @return the NombreR
     */
    public String getNombreR() {
        return NombreR;
    }

    /**
     * @param NombreR the NombreR to set
     */
    public void setNombreR(String NombreR) {
        this.NombreR = NombreR;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the CalleYCarrera
     */
    public String getCalleYCarrera() {
        return CalleYCarrera;
    }

    /**
     * @param CalleYCarrera the CalleYCarrera to set
     */
    public void setCalleYCarrera(String CalleYCarrera) {
        this.CalleYCarrera = CalleYCarrera;
    }

    /**
     * @return the NoDeVivienda
     */
    public String getNoDeVivienda() {
        return NoDeVivienda;
    }

    /**
     * @param NoDeVivienda the NoDeVivienda to set
     */
    public void setNoDeVivienda(String NoDeVivienda) {
        this.NoDeVivienda = NoDeVivienda;
    }

    /**
     * @return the CodigoPostal
     */
    public int getCodigoPostal() {
        return CodigoPostal;
    }

    /**
     * @param CodigoPostal the CodigoPostal to set
     */
    public void setCodigoPostal(int CodigoPostal) {
        this.CodigoPostal = CodigoPostal;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    /**
     * @return the Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the TelefonoR
     */
    public int getTelefonoR() {
        return TelefonoR;
    }

    /**
     * @param TelefonoR the TelefonoR to set
     */
    public void setTelefonoR(int TelefonoR) {
        this.TelefonoR = TelefonoR;
    }
    
    
    
    
}
