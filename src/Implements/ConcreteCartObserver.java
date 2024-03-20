package Implements;

import interfaces.CartObserver;

public class ConcreteCartObserver implements CartObserver {
    private Cart cart;

    public ConcreteCartObserver(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void updateCart() {
        System.out.println("Notificando al usuario sobre el cambio en el carrito");
        // Implementar la lógica para actualizar el carrito del usuario
    }

    @Override
    public void clearCart() {
        System.out.println("Borrando el carrito del usuario");
        cart.clear();
    }
}