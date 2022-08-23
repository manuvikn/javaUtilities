package es.manuvikn.utiles.Stream.tareaUniversidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UserMain {

    public static void main(String[] args) {


        User u = new User("españa");
        User ua = new User("francia");
        User ub = new User("portugal");
        User uc = new User("españa");
        User ud = new User("españa");
        User ue = new User("francia");
        User uf = new User("portugal");
        User ug = new User("españa");
        User uh = new User("españa");

        List<User> lSeguidores = new ArrayList<>();

        lSeguidores.add(ua);
        lSeguidores.add(ub);
        lSeguidores.add(uc);
        lSeguidores.add(ud);
        lSeguidores.add(ue);
        lSeguidores.add(uf);
        lSeguidores.add(ug);
        lSeguidores.add(uh);

        u.setSeguidores(lSeguidores);

        Map<String, Long> m = new HashMap<>();

        lSeguidores.stream().forEach(user -> {

            if (m.get(user.getNacionalidad()) == null) {
                m.put(user.getNacionalidad(), 1L);
            } else {
                m.replace(user.getNacionalidad(), m.get(user.getNacionalidad()) + 1);
            }

        });

        System.out.println(m);

        System.out.println();
        u.getSeguidores().stream().map(User::getNacionalidad).forEach(System.out::println);


        Map<String, Long> ocurrencias = u.getSeguidores().stream().collect(Collectors.groupingBy(User::getNacionalidad, Collectors.counting()));
        System.out.println();
        System.out.println(ocurrencias);

    }
}
