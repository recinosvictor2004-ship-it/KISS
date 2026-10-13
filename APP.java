import java.util.List;

// Representa un ítem dentro de un pedido
class OrderItem {
    private final String name;
    private final int quantity;
    private final double price;

    public OrderItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}

// Servicio simple que calcula el total de un pedido (aplicando KISS)
class SimplePricingService {

    public double calculateTotal(List<OrderItem> items) {
        double total = 0.0;

        // Recorremos cada ítem y sumamos cantidad * precio
        for (OrderItem item : items) {
            total += item.getQuantity() * item.getPrice();
        }

        // Cambio de requisitos: si el total supera 50, aplicamos 10% de descuento
        if (total > 50) {
            total *= 0.9;
        }

        return total;
    }
}

// Punto de entrada del programa
public class App {
    public static void main(String[] args) {
        List<OrderItem> items = List.of(
                new OrderItem("Laptop Stand", 1, 35.0),
                new OrderItem("Mouse", 1, 25.0)
        );

        SimplePricingService pricing = new SimplePricingService();
        double total = pricing.calculateTotal(items);

        System.out.println("Total del pedido: " + total);
    }
}
