package Implements;

import interfaces.UserObserver;

public class ConcreteUserObserver implements UserObserver {
    private Cart cart;

    public ConcreteUserObserver(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void update(String notification) {
        System.out.println("Notificando al usuario sobre la compra: " + notification);
        // Implementar la lógica para actualizar el carrito del usuario
        clearCart();
    }

    @Override
    public void clearCart() {
        System.out.println("Borrando el carrito del usuario");
        cart.clear();
    }
}

