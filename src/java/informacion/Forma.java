/*
 * Proyecto Desarrollo de Aplicaciones Web
 * José González Ayerdi A01036121
 * Pedro Mauricio Esparza García A01280126
 * Martha Lisett Benavides Martínez A01280115
 * Adrián Martínez Quiroga A01280252
 * 21 Noviembre 2016
 */
package informacion;

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

    /**
     * Forma
     *
     * Método constructor para crear el objeto Forma usando todos sus datos
     *
     * @param id es el <code>id</code> del objeto.
     * @param fecha es la <code>fecha</code> del objeto.
     * @param vale es el <code>identificador</code> del objeto.
     * @param usuario es el <code>usuario</code> del objeto.
     * @param correo es el <code>correo</code> del objeto.
     * @param claveLab es la <code>clave del laboratorio</code> del objeto.
     * @param profe es el <code>profesor</code> del objeto.
     * @param desc es la <code>descripcion</code> del objeto.
     * @param cap es la <code>capacidad</code> del objeto.
     * @param marca es la <code>marca</code> del objeto.
     * @param cant es la <code>cantidad</code> del objeto.
     * @param status es el <code>status</code> del objeto.
     * @param obs es la <code>observaciones</code> del objeto.
     * @param local es la <code>localizacion</code> del objeto.
     *
     */
    public Forma(String id, String fecha, String vale, String usuario,
            String correo, String claveLab, String profe, String desc,
            String cap, String marca, String cant, String status, String obs,
            String local) {
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

    /**
     * getFecha
     *
     * Método que obtiene la fecha del objeto Forma
     *
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * getVale
     *
     * Método que obtiene el vale del objeto Forma
     *
     */
    public String getVale() {
        return vale;
    }

    /**
     * getUsuario
     *
     * Método que obtiene el usuario del objeto Forma
     *
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * getCorreo
     *
     * Método que obtiene el correo del objeto Forma
     *
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * getClaveLab
     *
     * Método que obtiene la clave del laboratorio del objeto Forma
     *
     */
    public String getClaveLab() {
        return claveLab;
    }

    /**
     * getProfe
     *
     * Método que obtiene el profesor del objeto Forma
     *
     */
    public String getProfe() {
        return profe;
    }

    /**
     * getFecha
     *
     * Método que obtiene la descripcion del objeto Forma
     *
     */
    public String getDesc() {
        return desc;
    }

    /**
     * getCapacidad
     *
     * Método que obtiene la capacidad del objeto Forma
     *
     */
    public String getCap() {
        return cap;
    }

    /**
     * getMarca
     *
     * Método que obtiene la marca del objeto Forma
     *
     */
    public String getMarca() {
        return marca;
    }

    /**
     * getCantidad
     *
     * Método que obtiene la cantidad del objeto Forma
     *
     */
    public String getCant() {
        return cant;
    }

    /**
     * getStatus
     *
     * Método que obtiene lel status del objeto Forma
     *
     */
    public String getStatus() {
        return status;
    }

    /**
     * getObs
     *
     * Método que obtiene las observaciones del objeto Forma
     *
     */
    public String getObs() {
        return obs;
    }

    /**
     * getLocal
     *
     * Método que obtiene la localizacion del objeto Forma
     *
     */
    public String getLocal() {
        return local;
    }

    /**
     * getId
     *
     * Método que obtiene el id del objeto Forma
     *
     */
    public String getId() {
        return id;
    }

    /**
     * setFecha
     *
     * Método usado para asignar la fecha del objeto Forma
     *
     * @param fecha es la <code>fecha</code> del objeto.
     *
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * setVale
     *
     * Método usado para asignar el vale del objeto Forma
     *
     * @param vale es el<code>vale</code> del objeto.
     *
     */
    public void setVale(String vale) {
        this.vale = vale;
    }

    /**
     * setUsuario
     *
     * Método usado para asignar el usuario del objeto Forma
     *
     * @param usuario es el <code>usuario</code> del objeto.
     *
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * setCorreo
     *
     * Método usado para asignar lel correo del objeto Forma
     *
     * @param correo es el <code>correo</code> del objeto.
     *
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * setClaveLab
     *
     * Método usado para asignar la clave de laboratorio del objeto Forma
     *
     * @param claveLab es la <code>clave del laboratorio</code> del objeto.
     *
     */
    public void setClaveLab(String claveLab) {
        this.claveLab = claveLab;
    }

    /**
     * setProfe
     *
     * Método usado para asignar el profesor del objeto Forma
     *
     * @param profe es el <code>profesor</code> del objeto.
     *
     */
    public void setProfe(String profe) {
        this.profe = profe;
    }

    /**
     * setFecha
     *
     * Método usado para asignar la descripcion del objeto Forma
     *
     * @param desc es la <code>descripcion</code> del objeto.
     *
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * setCap
     *
     * Método usado para asignar la capacidad del objeto Forma
     *
     * @param cap es la <code>capacidad</code> del objeto.
     *
     */
    public void setCap(String cap) {
        this.cap = cap;
    }

    /**
     * setMarca
     *
     * Método usado para asignar la marca del objeto Forma
     *
     * @param marca es la <code>marca</code> del objeto.
     *
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * setCant
     *
     * Método usado para asignar la cantidad del objeto Forma
     *
     * @param cant es la <code>cantidad</code> del objeto.
     *
     */
    public void setCant(String cant) {
        this.cant = cant;
    }

    /**
     * setStatus
     *
     * Método usado para asignar el status del objeto Forma
     *
     * @param status es el <code>status</code> del objeto.
     *
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * setObs
     *
     * Método usado para asignar las observaciones del objeto Forma
     *
     * @param obs son las <code>observaciones</code> del objeto.
     *
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * setLocal
     *
     * Método usado para asignar la localizacion del objeto Forma
     *
     * @param local es la <code>localizacion</code> del objeto.
     *
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * setId
     *
     * Método usado para asignar el id del objeto Forma
     *
     * @param id es el <code>id</code> del objeto.
     *
     */
    public void setId(String id) {
        this.id = id;
    }
}
