import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        
        // Creamos una instancia de un titulo (pelicula)
        Pelicula pelicula1 = new Pelicula();
        pelicula1.setNombre("soul");
        pelicula1.setFechaDeLanzamiento(2016);
        pelicula1.setDuracionDeMinutos(115);
        pelicula1.setIncluidoEnElPlan(true);

        // evaluaciones de la pelicula
        pelicula1.evalua(9.8);
        pelicula1.evalua(9.1);
        pelicula1.evalua(9.0);
        pelicula1.mostrarFichaTecnica();

        System.out.println("La media de la pelicula: " + (float)pelicula1.calculaMedia());

        // Creamos una instancia de una serie
        Serie serie1 = new Serie();
        serie1.setNombre("Lupin");
        serie1.setFechaDeLanzamiento(2016);
        serie1.setNumeroDeTemporadas(3);
        serie1.setMinutosPorEpisodio(60);
        serie1.setEpisodiosTemporadas(9);

        serie1.mostrarFichaTecnica();

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(serie1);
        calculadora.incluye(pelicula1);

        System.out.println("El tiempo total para ver tus peliculas agregadas es de: "+calculadora.getTiempoTotal()+" min");

        FiltroRecomendaciones filtro = new FiltroRecomendaciones();
        filtro.filtra(pelicula1);
        
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Quien es Lupin");
        episodio.setSerie(serie1);
        episodio.setTotalVisualizaciones(0);

        filtro.filtra(episodio);

    }
    
}
