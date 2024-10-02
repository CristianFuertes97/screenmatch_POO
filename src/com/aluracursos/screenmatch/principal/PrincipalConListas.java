package com.aluracursos.screenmatch.principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {
        
        var pelicula1 = new Pelicula("Soul",2016);
        pelicula1.evalua(9);
        var pelicula2 = new Pelicula("Avatar",2023);
        pelicula2.evalua(6);
        var peliculaBruno = new Pelicula("El señor de los anillos",2001);
        peliculaBruno.evalua(3);
        Serie serie1 = new Serie("Lupin",2016);

        List<Titulo> lista = new ArrayList<>();
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(peliculaBruno);
        lista.add(serie1);

        for (Titulo item : lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula peli && peli.getClasificacion() > 2){
                System.out.println(peli.getClasificacion());
            }
        }

        // lista.forEach(nombre -> System.out.println(nombre));

        List<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        
        System.out.println("Lista de artistas no ordenada: "+listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada: "+listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de peliculas ordenadas: "+lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("LIsta ordenada por fecha: "+lista);
    
}
