public class Main {
    public static void main(String[] args) {

        // Crear algunos items de ejemplo
        OrderItem item1 = new OrderItem("Manzanas", 3, 2.50);
        OrderItem item2 = new OrderItem("Pan", 1, 1.75);

        // Mostrar datos
        System.out.println("Item 1: " + item1.getName() + " - Cantidad: " + item1.getQuantity() + " - Precio: " + item1.getPrice());
        System.out.println("Item 2: " + item2.getName() + " - Cantidad: " + item2.getQuantity() + " - Precio: " + item2.getPrice());
    }
}
