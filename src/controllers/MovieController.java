package controllers;

import static org.junit.Assume.assumeNoException;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        int tam = movies.length;
        
        for(int i=0; i<tam - 1; i++) {
            int indiceMenor = i;
            for(int j=i+1; j<tam; j++) {
                if(movies[j].getTitle().compareTo(movies[indiceMenor].getTitle())<0) {
                    indiceMenor = j;
                }
            }
            if(indiceMenor != i) {
                Movie temp = movies[i];
                movies[i] = movies[indiceMenor];
                movies[indiceMenor] = temp;
            }
        }

    }

    public void printMovies(Movie[] movies) {
        int tam = movies.length;
        for(int i=0; i<tam; i++) {
            System.out.println(i+1 + ". " +movies[i].getTitle() + " " + "(" +  movies[i].getYear() + ")");
        }
    }

}
