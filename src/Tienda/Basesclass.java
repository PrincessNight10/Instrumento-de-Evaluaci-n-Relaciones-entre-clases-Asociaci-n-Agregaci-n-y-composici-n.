package  Tienda;
import java.util.ArrayList;
import java.util.List;

// Clase base que implementa la interfaz OperacionesCRUD
// Interfaz con los métodos comunes
interface OperacionesCRUD {
    void Adicionar();
    void Consultar();
    void Modificar();
    void Eliminar();
}

class BaseClass implements OperacionesCRUD {
    @Override
    public void Adicionar() {
        // Lógica para añadir un registro
    }

    @Override
    public void Consultar() {
        // Lógica para consultar un registro
    }

    @Override
    public void Modificar() {
        // Lógica para modificar un registro
    }

    @Override
    public void Eliminar() {
        // Lógica para eliminar un registro
    }
}

// Clase Proveedores hereda de BaseClass
class Proveedores extends BaseClass {
    String Codigo_proveedor;
    String Nombre_proveedor;
    String Codigo_ciudad;
    String Direccion;
    String Telefono;
    String Nombre_Contacto;
}

// Clase Entrada_Almacen hereda de BaseClass
class Entrada_Almacen extends BaseClass {
    int Id;
    String Fecha_entrada;
    String Codigo_Componente;
    int Cantidad_Comprada;
    String Codigo_proveedor;
}

// Clase Info_Componentes hereda de BaseClass
class Info_Componentes extends BaseClass {
    int Id;
    String Codigo_Componente;
    String Tipo_componente;
    String Caracteristicas;
    String Descripcion;
    double Vlr_Unitario_Compra;
    String Codigo_proveedor;
}

// Clase Detalle_Factura hereda de BaseClass
class Detalle_Factura extends BaseClass {
    int Id_Detalle;
    int Id_Factura;
    String Codigo_Componente;
    int Cantidad_Vendida;
}

// Clase Detalle_Pedido hereda de BaseClass
class Detalle_Pedido extends BaseClass {
    int Id_Detalle;
    int Id_Pedido;
    String Codigo_Componente;
    int Cantidad_Solicitada;
}

// Clase Inventario hereda de BaseClass
class Inventario extends BaseClass {
    String Codigo_Compra;
    String Componente;
    double Vlr_Unitario_Venta;
}

// Clase Pedidos hereda de BaseClass
class Pedidos extends BaseClass {
    int Id_Pedido;
    String Fecha_Pedido;
    String Nit_Cliente;
    String Estado_Pedido;
    int Id_Empleado;
}

// Clase Clientes hereda de BaseClass
class Clientes extends BaseClass {
    String Nit_Cliente;
    String Nombre;
    String Apellidos;
    String Codigo_ciudad;
    String Direccion;
    String Telefono;
}

// Clase Ciudades hereda de BaseClass
class Ciudades extends BaseClass {
    String Codigo_ciudad;
    String Nombre;
    String Departamento;
}

// Clase Facturas hereda de BaseClass
class Facturas extends BaseClass {
    int Id_Factura;
    String Fecha_Factura;
    String Nit_Cliente;
    String Estado_Factura;
    int Id_Empleado;
}

// Clase Empleados hereda de BaseClass
class Empleados extends BaseClass {
    int Id_Empleado;
    String Nombre;
    String Apellidos;
    String Direccion;
    String Telefono;
    int Codigo_Cargo;
}

// Clase Cargos hereda de BaseClass
class Cargos extends BaseClass {
    int Codigo_Cargo;
    String Nombre_Cargo;
    double Salario;
}

;






