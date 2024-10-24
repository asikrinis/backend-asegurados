# Asegurados API

Este es el backend del proyecto **Asegurados API**, desarrollado con **Spring Boot**. Proporciona endpoints REST para gestionar asegurados, incluyendo la consulta de información sobre pólizas, asegurados y sus direcciones.

## Tecnologías utilizadas

- Java 17
- Spring Boot 3.3.5
- Maven
- Lombok

## Requisitos

- Java 17 o superior
- Maven 3.8 o superior
- MySQL (opcional si se integra una base de datos)
  
## Configuración del proyecto

1. Clonar el repositorio:

    ```bash
    git clone https://github.com/asikrinis/backend-asegurados.git
    ```

2. Navegar a la carpeta del proyecto:

    ```bash
    cd asegurados-api
    ```

3. Instalar dependencias:

    ```bash
    mvn clean install
    ```

4. Ejecutar la aplicación:

    ```bash
    mvn spring-boot:run
    ```

5. La API estará disponible en: `http://localhost:8080`

## Endpoints disponibles

- **GET** `/asegurados`: Devuelve una lista de asegurados.

## Estructura del proyecto

```bash
src/
 └── main/
      ├── java/com/example/asegurados_api
      │     ├── controller
      │     ├── model
      │     └── services
      └── resources/
            └── application.properties
