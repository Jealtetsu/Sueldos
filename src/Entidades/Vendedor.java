/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Vendedor {
  private String nombre;
  private Integer dni;
  private double SueldoBasico;
  private double Sueldomensual;
  private double Comisiones;
  private Date FechaDeInicio;
   

  public Vendedor (){

}

    public Vendedor(String nombre, Integer dni, double SueldoBasico, double Sueldomensual, double Comisiones, Date FechaDeInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.SueldoBasico = SueldoBasico;
        this.Sueldomensual = Sueldomensual;
        this.Comisiones = Comisiones;
        this.FechaDeInicio = FechaDeInicio;
    }

    public double getSueldomensual() {
        return Sueldomensual;
    }

    public void setSueldomensual(double Sueldomensual) {
        this.Sueldomensual = Sueldomensual;
    }

 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public double getComisiones() {
        return Comisiones;
    }

    public void setComisiones(double Comisiones) {
        this.Comisiones = Comisiones;
    }

    public Date getFechaDeInicio() {
        return FechaDeInicio;
    }

    public void setFechaDeInicio(Date FechaDeInicio) {
        this.FechaDeInicio = FechaDeInicio;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "nombre=" + nombre + ", dni=" + dni + ", SueldoBasico=" + SueldoBasico + ", Sueldomensual=" + Sueldomensual + ", Comisiones=" + Comisiones + ", FechaDeInicio=" + FechaDeInicio + '}';
    }

    

    
}


