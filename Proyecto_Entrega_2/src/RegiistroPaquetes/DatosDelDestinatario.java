/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RegiistroPaquetes;

/**
 *
 * @author JULIO
 */
public class DatosDelDestinatario {
    
    
    private String NombreD;
    private String Direccion;
    private String CalleYCarrera;
    private String NoDeVivienda;
    private int CodigoPostal;
    private int Telefono;

    public DatosDelDestinatario() {
    }

    public DatosDelDestinatario(String NombreD, String Direccion, String CalleYCarrera, String NoDeVivienda, int CodigoPostal, int Telefono) {
        this.NombreD = NombreD;
        this.Direccion = Direccion;
        this.CalleYCarrera = CalleYCarrera;
        this.NoDeVivienda = NoDeVivienda;
        this.CodigoPostal = CodigoPostal;
        this.Telefono = Telefono;
    }

    /**
     * @return the NombreD
     */
    public String getNombreD() {
        return NombreD;
    }

    /**
     * @param NombreD the NombreD to set
     */
    public void setNombreD(String NombreD) {
        this.NombreD = NombreD;
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
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
        
}
