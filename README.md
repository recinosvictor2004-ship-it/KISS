# Principio KISS (Keep It Simple, Stupid)
### Autor: **Victor Manuel Recinos Gómez**

## 📌 Descripción
Este repositorio contiene un ejemplo práctico del principio **KISS**, el cual establece que los sistemas deben mantenerse tan simples como sea posible, evitando complejidad innecesaria.

El código demuestra cómo aplicar KISS en un caso realista usando Java 17, manteniendo el diseño claro, directo y fácil de modificar.

---

## 💻 Código principal

El proyecto implementa un sistema simple de cálculo de total de pedido, aplicando el principio KISS:

- Sin capas innecesarias  
- Sin patrones complejos  
- Sin sobreingeniería  
- Cambio de requisitos fácil  

### Código:

```java
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
```
---
## 🚀 Cómo ejecutar el proyecto
Requisitos
Java 17 o superior

Ejecución

Compilar:
javac App.java

Ejecutar:
java App

---
## 📄 Licencia
Este proyecto está bajo la licencia MIT.