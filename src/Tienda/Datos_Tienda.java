package Tienda;

public class Datos_Tienda {
    public static void main(String[] args) {
        // Crear una instancia de la clase Proveedores
        Proveedores proveedor = new Proveedores();

        // Establecer valores para los atributos del proveedor
        proveedor.Codigo_proveedor = "001";
        proveedor.Nombre_proveedor = "Proveedor 1";
        proveedor.Codigo_ciudad = "Ciudad 1";
        proveedor.Direccion = "Dirección 1";
        proveedor.Telefono = "123456789";
        proveedor.Nombre_Contacto = "Contacto 1";

        // Imprimir los detalles del proveedor
        System.out.println("Detalles del Proveedor:");
        System.out.println("Código de Proveedor: " + proveedor.Codigo_proveedor);
        System.out.println("Nombre de Proveedor: " + proveedor.Nombre_proveedor);
        System.out.println("Código de Ciudad: " + proveedor.Codigo_ciudad);
        System.out.println("Dirección: " + proveedor.Direccion);
        System.out.println("Teléfono: " + proveedor.Telefono);
        System.out.println("Nombre de Contacto: " + proveedor.Nombre_Contacto);
    }
}

