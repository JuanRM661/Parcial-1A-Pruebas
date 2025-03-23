# 📌 Evaluación de Automatización de Pruebas

## 1️⃣ Configuración del Entorno
- Se utilizó **Java JDK 17**, **Spring Boot 3**, **Maven**, **JUnit 5** y **VS Code**.
- Se creó un proyecto con **Spring Boot** y se configuró **JUnit 5** agregando la dependencia en `pom.xml`.

## 2️⃣ Implementación del Proyecto
- Se desarrolló un **endpoint REST** en `HelloController.java`, que devuelve un mensaje de prueba.
- Se validó su funcionamiento ejecutándolo en `http://localhost:8080/api/hello`.

## 3️⃣ Pruebas Automatizadas
- **Pruebas Unitarias**: Se verificó que el método del controlador devolviera la respuesta esperada.
- **Prueba de Integración**: Se probó la API simulando una petición y validando la respuesta.

## 4️⃣ Ejecución de Pruebas
- Se ejecutaron con el comando `mvn test` en la terminal.
- Se revisaron los resultados y se corrigieron errores menores.

## 5️⃣ Errores Encontrados y Soluciones Aplicadas
- **Error:** `mockMvc` no se inyectaba correctamente en la prueba de integración.
  - **Solución:** Se agregó la anotación `@AutoConfigureMockMvc` en la clase de prueba.
- **Error:** La prueba unitaria fallaba debido a diferencias en el mensaje esperado.
  - **Solución:** Se revisó y ajustó el mensaje esperado en el test.
- **Error:** Dependencias desactualizadas generaban errores al compilar.
  - **Solución:** Se ejecutó `mvn clean install` para actualizar dependencias.

## 6️⃣ Entrega en GitHub
- El código se subió al repositorio en **GitHub**.
