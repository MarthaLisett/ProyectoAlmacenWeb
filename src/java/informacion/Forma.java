/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

/**
 *
 * @author Pedro
 */
public class Forma {
    String id;
    String fecha;
    String vale;
    String usuario;
    String correo;
    String claveLab;
    String profe;
    String desc;
    String cap;
    String marca;
    String cant;
    String status;
    String obs;
    String local;

    public Forma(String id, String fecha, String vale, String usuario, String correo, String claveLab, String profe, String desc, String cap, String marca, String cant, String status, String obs, String local) {
        this.id = id;
        this.fecha = fecha;
        this.vale = vale;
        this.usuario = usuario;
        this.correo = correo;
        this.claveLab = claveLab;
        this.profe = profe;
        this.desc = desc;
        this.cap = cap;
        this.marca = marca;
        this.cant = cant;
        this.status = status;
        this.obs = obs;
        this.local = local;
    }

    public String getFecha() {
        return fecha;
    }

    public String getVale() {
        return vale;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getClaveLab() {
        return claveLab;
    }

    public String getProfe() {
        return profe;
    }

    public String getDesc() {
        return desc;
    }

    public String getCap() {
        return cap;
    }

    public String getMarca() {
        return marca;
    }

    public String getCant() {
        return cant;
    }

    public String getStatus() {
        return status;
    }

    public String getObs() {
        return obs;
    }

    public String getLocal() {
        return local;
    }
    
    public String getId() {
        return id;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setVale(String vale) {
        this.vale = vale;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setClaveLab(String claveLab) {
        this.claveLab = claveLab;
    }

    public void setProfe(String profe) {
        this.profe = profe;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setId(String id) {
        this.id = id;
    }

}
        