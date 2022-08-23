package es.manuvikn.utiles.patrones.factory.producto;

public class PizzaNewYorkVegetariana extends PizzaProducto{

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "Salsa tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Berengenas");
        ingredientes.add("Espinacas");
    }


    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25min. a 150 grados centígrados");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
