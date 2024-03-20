package Implements;

import interfaces.InventoryObserver;

public class ConcreteInventoryObserver implements InventoryObserver {
    @Override
    public void update(String notification) {
        System.out.println("Actualizando el inventario: " + notification);
        // Implementar la lógica para actualizar el inventario
        updateInventory();
    }

    public void updateInventory() {
        System.out.println("Inventario actualizado");
    }
}