# Mantenedor de Usuarios - Java JDBC

Este repositorio contiene una aplicación de consola desarrollada en Java enfocada en la gestión de persistencia de datos mediante **JDBC (Java Database Connectivity)**. El proyecto implementa un sistema CRUD (Create, Read, Update, Delete) robusto para la administración de usuarios en una base de datos relacional.

## Propósito del Proyecto
El objetivo principal es demostrar la integración de aplicaciones Java con sistemas de gestión de bases de datos (RDBMS) sin el uso de frameworks de persistencia pesados (ORM), priorizando el control total sobre las consultas SQL y la gestión de conexiones. Este proyecto sirve como base técnica para entender el ciclo de vida de una conexión, el manejo de transacciones y el mapeo de objetos a tablas.

## Stack Tecnológico
* **Lenguaje:** Java (JDK 17 o superior)
* **Persistencia:** JDBC API
* **Base de Datos:** MySQL / MariaDB
* **Gestor de Dependencias:** Maven (opcional/según estructura)
* **Driver:** MySQL Connector/J

## Arquitectura y Patrones de Diseño
Para garantizar un código limpio, escalable y fácil de mantener, el proyecto sigue el patrón de diseño **DAO (Data Access Object)**:
* **Modelo (Entity):** Clase `Usuario` que representa la estructura de los datos.
* **Interfaz DAO:** Define los métodos de abstracción para las operaciones de la base de datos.
* **Implementación DAO:** Contiene la lógica específica de JDBC y las sentencias SQL (PreparedStatements) para interactuar con la DB.
* **Utilidades de Conexión:** Clase dedicada a la gestión del Singleton o pool de conexiones para optimizar el acceso al servidor.

## Funcionalidades Clave
* **Operaciones CRUD Completas:** * Registro de nuevos usuarios con validación de datos.
    * Listado dinámico de todos los registros existentes.
    * Búsqueda específica por identificador único (ID).
    * Actualización modular de campos de usuario.
    * Eliminación segura de registros.
* **Seguridad en Consultas:** Implementación de `PreparedStatement` para prevenir ataques de **Inyección SQL**.
* **Manejo de Excepciones:** Gestión detallada de `SQLException` para asegurar la estabilidad de la aplicación ante errores de red o sintaxis.

## Configuración del Entorno
1. **Base de Datos:** Es necesario contar con un servidor MySQL activo. Se debe ejecutar el script de creación de tabla incluido en el proyecto (o crear una tabla `usuarios` con campos: `id`, `username`, `password`, `email`).
2. **Variables de Conexión:** Configurar las credenciales de acceso (`URL`, `USER`, `PASSWORD`) en la clase de utilidad de conexión.
3. **Driver JDBC:** Asegurarse de que el conector de MySQL esté agregado al Classpath del proyecto.

## Aprendizajes Clave
* Gestión eficiente de recursos (uso de `try-with-resources` para cerrar conexiones y statements).
* Mapeo manual de `ResultSet` a objetos de dominio Java.
* Estructuración de proyectos siguiendo principios de responsabilidad única.
