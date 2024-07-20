# Ejercicios POO en java Segunda parte

## Ejercicio 1: Sistema de Control de Inventarios
Objetivo: Crear un sistema para manejar el inventario de un almacén, aplicando
encapsulamiento y herencia, y utilizando ArrayList para almacenar los productos.

### Principios de POO aplicados: Encapsulamiento, Herencia.

### Requisitos:

Clase Producto: Base para todos los productos, con propiedades como id, nombre, y
precio. Implementa getters y setters para aplicar el encapsulamiento.
Clase ProductoEspecifico: Hereda de Producto y añade propiedades específicas, como
categoria o marca.
Clase Inventario: Utiliza un ArrayList de objetos Producto para gestionar el inventario.
Implementa métodos para añadir, eliminar, y listar productos, además de buscar productos
por nombre o categoría.

## Ejercicio 2: Sistema de Registro de Empleados
Objetivo: Desarrollar un sistema para manejar los empleados de una empresa, aplicando
encapsulamiento, herencia y polimorfismo, y utilizando ArrayList para almacenar los
empleados.

### Principios de POO aplicados: Encapsulamiento, Herencia, Polimorfismo.

### Requisitos:

Clase Persona: Con propiedades básicas como nombre y edad.
Clase Empleado: Hereda de Persona y añade propiedades como idEmpleado y salario. Usa
encapsulamiento adecuadamente.
Clase EmpleadoTemporal y Clase EmpleadoPermanente: Heredan de Empleado y
representan diferentes tipos de empleados.
Clase GestionEmpleados: Utiliza un ArrayList para gestionar objetos del tipo Empleado.
Implementa métodos para añadir, eliminar y mostrar empleados. Utiliza polimorfismo para
manejar diferentes tipos de empleados.

## Ejercicio 3: Sistema de Gestión de Cursos
Objetivo: Implementar un sistema para gestionar cursos y estudiantes, aplicando
abstracción y polimorfismo, y utilizando ArrayList para manejar las inscripciones.

### Principios de POO aplicados: Abstracción, Polimorfismo.

### Requisitos:

Clase Curso: Con propiedades como codigo, nombre, y listaEstudiantes, donde
listaEstudiantes es un ArrayList de objetos Estudiante.
Clase Estudiante: Con propiedades como id, nombre, y email.

Clase GestionCursos: Encargada de administrar los cursos, incluyendo métodos para
agregar cursos, inscribir estudiantes en cursos y listar estudiantes inscritos en un curso
específico.
