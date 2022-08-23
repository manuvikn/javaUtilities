package es.manuvikn.utiles.Stream.tareaUniversidad;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String nacionalidad;
    private List<User> seguidores;

    public User(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        this.seguidores = new ArrayList<>();
    }


    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<User> getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(List<User> seguidores) {
        this.seguidores = seguidores;
    }
}
