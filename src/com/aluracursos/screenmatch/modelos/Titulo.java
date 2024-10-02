package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionDeMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;


    // constructor
  
    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
    


    // Getter and Setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return this.fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionDeMinutos() {
        return this.duracionDeMinutos;
    }

    public void setDuracionDeMinutos(int duracionDeMinutos) {
        this.duracionDeMinutos = duracionDeMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return this.incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getSumaDeLasEvaluaciones() {
        return this.sumaDeLasEvaluaciones;
    }

    public void setSumaDeLasEvaluaciones(double sumaDeLasEvaluaciones) {
        this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones;
    }

    public int getTotalDeLasEvaluaciones() {
        return this.totalDeLasEvaluaciones;
    }

    public void setTotalDeLasEvaluaciones(int totalDeLasEvaluaciones) {
        this.totalDeLasEvaluaciones = totalDeLasEvaluaciones;
    }

    public void mostrarFichaTecnica(){
        System.out.println("EL nombre de la pelicula u serie: "+ nombre);
        System.out.println("Fecha de Lanzamiento: "+ fechaDeLanzamiento);
        System.out.println("Duracion de la pelicula en minutos: "+ getDuracionDeMinutos());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }



    @Override
    public int compareTo(Titulo otroTitulo) {
       return this.getNombre().compareTo(otroTitulo.getNombre());
    }

}
