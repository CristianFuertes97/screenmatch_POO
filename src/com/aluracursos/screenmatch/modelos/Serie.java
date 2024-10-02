package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
    int numeroDeTemporadas;
    int episodiosTemporadas;
    int minutosPorEpisodio;

    
    // constructor
    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
        
    }
    

    
    @Override
    public int getDuracionDeMinutos(){
        return numeroDeTemporadas * episodiosTemporadas * minutosPorEpisodio;
    }

    public int getNumeroDeTemporadas() {
        return this.numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getEpisodiosTemporadas() {
        return this.episodiosTemporadas;
    }

    public void setEpisodiosTemporadas(int episodiosTemporadas) {
        this.episodiosTemporadas = episodiosTemporadas;
    }

    public int getMinutosPorEpisodio() {
        return this.minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    

    @Override
    public String toString() {
        return "Serie: "+this.getNombre()+"("+this.getFechaDeLanzamiento()+")";
    }


}
