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

        
        for (int i = 1; i < tam; i++) {
            Movie actual = movies[i]; 
            int j = i - 1;

            while (j >= 0 && movies[j].getTitle().compareTo(actual.getTitle()) > 0) {
                movies[j + 1] = movies[j]; 
                j--;
            }
            movies[j + 1] = actual;
        }  
    

 
        
    }



    public void printMovies(Movie[] movies) {
        int tam = movies.length;
        for(int i=0; i<tam; i++) {
            System.out.println(i+1 + ". " +movies[i].getTitle() + " " + "(" +  movies[i].getYear() + ")");
        }
    }

}
