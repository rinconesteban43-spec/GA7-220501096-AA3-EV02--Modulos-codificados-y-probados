A continuación se muestra un archivo READ ME que le permitirá probar y replicar los resultados obtenidos en el desarrollo del proyecto, al igual que un link al repositorio de github en el que encontrará los archivos necesarios para llevarlo a cabo:

CRUD de Clientes con Hibernate y Maven

Este es un proyecto Java que demuestra las operaciones básicas de persistencia (CRUD: Crear, Leer, Actualizar, Borrar) utilizando el framework Hibernate ORM y gestionado con Maven. 

Requisitos del Sistema
 
Java Development Kit (JDK) 21 o superior: Es necesario para compilar y ejecutar el proyecto. Maven: El proyecto utiliza Maven como herramienta de construcción y gestión de dependencias. Servidor de Base de Datos MySQL El proyecto está configurado para conectarse a una base de datos MySQL local. 

Configuración del Proyecto 

1. Clonar el repositorio o descargar el proyecto. 

2. Configurar la Base de Datos: 
-Abre tu cliente de MySQL (por ejemplo, MySQL Workbench).
- Crea una base de datos llamada `tallerxpert`.
- Crea la tabla `cliente` con las siguientes columnas: 
- `id_usuario` (INT, PRIMARY KEY, AUTO_INCREMENT) 
- `nombre` (VARCHAR(45)) 
- `apellido` (VARCHAR(45)) 
- `email` (VARCHAR(45)) 
- `telefono` (VARCHAR(45)) 
- `direccion` (VARCHAR(100)) 
- `contrasena` (VARCHAR(225)) 

3. Actualizar el archivo de configuración:
- Abre el archivo `hibernate.cfg.xml` en `src/main/resources`. 
- Asegúrate de que la URL de la base de datos, el usuario y la contraseña sean correctos para tu entorno. 

4. Ejecutar el proyecto: 
- Desde tu IDE (NetBeans), puedes ejecutar las clases individuales para probar cada operación CRUD. 
- Ejecuta `CrearCliente.java` para insertar un nuevo registro. 
- Ejecuta `LeerCliente.java` para leer un registro por su ID. 
- Ejecuta `ActualizarCliente.java` para modificar un registro existente. 
- Ejecuta `EliminarCliente.java` para borrar un registro de la base de datos. 
- Ejecuta `ListarClientes.java` para ver todos los registros en la tabla. 

Estructura del Proyecto 
- `pom.xml`: Define las dependencias de Hibernate, MySQL y el plugin de ejecución de Maven. - `src/main/java/`: Contiene el código fuente de las clases Java. 
- `Cliente.java`: Clase de entidad que representa la tabla `cliente`. 
- `ClienteDao.java`: Clase DAO (Data Access Object) que encapsula la lógica para las operaciones CRUD. 
- `HibernateUtil.java`: Clase utilitaria para gestionar la `SessionFactory` de Hibernate. 
-`CrearCliente.java`, `LeerCliente.java`, `ActualizarCliente.java`, `EliminarCliente.java`, `ListarClientes.java`: Clases principales para probar cada operación CRUD. 
- `src/main/resources/`: Contiene los recursos del proyecto. 
- `hibernate.cfg.xml`: Archivo de configuración principal de Hibernate. 

### Dependencias Principales - 
**Hibernate Core** (Implementación de JPA) - **MySQL Connector/J** (Conector JDBC) - **Jakarta Persistence API** (API de Persistencia) - **SLF4J** (API de Logging)
