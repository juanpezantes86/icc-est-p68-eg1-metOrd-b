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
        boolean intercambio;

        for(int i = 0; i < tam - 1; i++) {
            intercambio = false;
            for(int j = 0; j < tam - 1; j++) {
                if(movies[j].getTitle().compareTo(movies[j+1].getTitle()) > 0) {
                   Movie temp = movies[j];
                   movies[j] = movies[j+1];
                   movies[j+1] = temp;
                    
                    intercambio = true;
                }

            }

            if(!intercambio) {
                break;
            }
        }




    }

    public void printMovies(Movie[] movies) {
        int tam = movies.length;
        for(int i=0; i<tam; i++) {
            System.out.println(movies[i].getTitle() + " " + "(" + movies[i].getYear() + ")");
        }
    }

}
