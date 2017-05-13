/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author bruiz9
 */
public class Persona {

    private int codigo;
    private String primernomb;
    private String segundonomb;
    private String primerape;
    private String segundoape;
    private String direccion;
    private String email;
    private String fnacimiento;
    private String sexo;
    private String carrera;
    private String semestre;
    private int niveling;
    private String horario;
    private boolean activo;

    public Persona(int codigo, String primernomb, String segundonomb, String primerape, String segundoape, String direccion, String email, String fnacimiento, String sexo, String carrera, String semestre, int niveling, String horario) {
        this.codigo = codigo;
        this.primernomb = primernomb;
        this.segundonomb = segundonomb;
        this.primerape = primerape;
        this.segundoape = segundoape;
        this.direccion = direccion;
        this.email = email;
        this.fnacimiento = fnacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
        this.semestre = semestre;
        this.niveling = niveling;
        this.horario = horario;
    }
    
    public Persona(int codigo, String primernomb, String segundonomb, String primerape, String segundoape, String direccion, String email, String fnacimiento, String sexo, String carrera, String semestre, int niveling, String horario,boolean activo) {
        this.codigo = codigo;
        this.primernomb = primernomb;
        this.segundonomb = segundonomb;
        this.primerape = primerape;
        this.segundoape = segundoape;
        this.direccion = direccion;
        this.email = email;
        this.fnacimiento = fnacimiento;
        this.sexo = sexo;
        this.carrera = carrera;
        this.semestre = semestre;
        this.niveling = niveling;
        this.horario = horario;
        this.activo = activo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrimernomb() {
        return primernomb;
    }

    public void setPrimernomb(String primernomb) {
        this.primernomb = primernomb;
    }

    public String getSegundonomb() {
        return segundonomb;
    }

    public void setSegundonomb(String segundonomb) {
        this.segundonomb = segundonomb;
    }

    public String getPrimerape() {
        return primerape;
    }

    public void setPrimerape(String primerape) {
        this.primerape = primerape;
    }

    public String getSegundoape() {
        return segundoape;
    }

    public void setSegundoape(String segundoape) {
        this.segundoape = segundoape;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public int getNiveling() {
        return niveling;
    }

    public void setNiveling(int niveling) {
        this.niveling = niveling;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    

    @Override
    public String toString() {
        return "Codigo: " + codigo
                + "\nPrimer Nombre: " + primernomb
                + "\nSegundo nombre " + segundonomb
                + "\nPrimer Apellido: " + primerape
                + "\nSegundo Apellido: " + segundoape
                + "\nDirección " + direccion
                + "\nEmail: " + email
                + "\nFecha de Nacimiento: " + fnacimiento
                + "\nSexo: " + sexo
                + "\nCarrera: " + carrera
                + "\nSemestre: " + semestre
                + "\nNivel de Ingles: " + niveling
                + "\nHorario Deseado: " + horario;
    }
    
    public int getTamaño() {
        return getPrimernomb().length()*2 + 2 + 4 + 1;
    }
    
}
