package Main;

import Implements.*;
import interfaces.*;

public class Main {
    public static void main(String[] args) {
        // Crear el carrito de compras y el inventario
        Cart cart = new Cart();
        Inventory inventory = new Inventory();

        // Agregar algunos productos al carrito y al inventario
        cart.addProduct(new Product("Producto 1", 100));
        cart.addProduct(new Product("Producto 2", 200));
        inventory.addProduct(new Product("Producto 1", 100));
        inventory.addProduct(new Product("Producto 2", 200));

        // Crear los observadores
        UserObserver userObserver = new ConcreteUserObserver(cart);
        InventoryObserver inventoryObserver = new ConcreteInventoryObserver();

        // Crear el sujeto y agregar los observadores
        ConcreteSubject subject = new ConcreteSubject();
        subject.addObserver(userObserver);
        subject.addObserver(inventoryObserver);

        // Realizar la compra y notificar a los observadores
        subject.setNotification("La compra ha sido realizada");
    }
}