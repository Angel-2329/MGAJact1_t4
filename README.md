# Actividad 1 Backend

## Portada

* **Materia:** Curso de Verano de Programacion Web
* **Actividad:** Actividad 1 Backend
+ **Maestra:** Adelina Martinez Nieto
* **Alumno:** Angel de Jesus Mendez Garcia

Este es un proyecto construido con Java y Spring Boot. El objetivo principal de esta actividad fue configurar el entorno de trabajo, crear controladores para responder a peticiones web y subir el proyecto terminado a un servidor remoto (VPS) para que pueda ser consultado desde internet.

## Herramientas utilizadas
* Java 21
* Spring Boot
* Visual Studio Code

## Estructura del proyecto
Para evitar problemas con otros proyectos en el mismo servidor, esta aplicacion esta configurada para usar el puerto 2329.

El proyecto cuenta con dos controladores que incluyen las siguientes cuatro rutas:
* `/AJMG_Act1/endpointSaludo` : Devuelve un texto de saludo.
* `/AJMG_Act1/endpointLista` : Devuelve una pequeña lista con datos simulados (nombre, apellido, semestre y edad).
* `/AJMG_Act1/endpointEdad` : Devuelve un simple numero.
* `/AJMG_Act1/endpointDespedida` : Devuelve una despedida.

## Como se programaron los endpoints

Para construir las rutas del proyecto, se crearon archivos de Java conocidos como "Controladores". El proceso de creacion fue el siguiente:

1. **Uso de etiquetas principales:** A cada clase se le agrego la etiqueta `@RestController`. Esto sirve para indicarle a Spring Boot que el archivo se encargara de recibir peticiones de internet y devolver informacion directa, en lugar de paginas web completas.
2. **Definicion de las direcciones:** Para cada accion, se utilizo la etiqueta `@GetMapping`. Ahi se escribio la ruta exacta (por ejemplo, `/endpointSaludo`), lo que permite que el servidor sepa que funcion ejecutar cuando alguien entra a ese enlace especifico.
3. **Generacion de respuestas:** Dentro de las funciones, se programo lo que el servidor debe contestar. Puede ser texto simple, un numero, o incluso estructuras de datos como listas o mapas (HashMap). Spring Boot se encarga de convertir esos datos a un formato legible en la web automaticamente.
4. **Organizacion:** Todo el codigo se dividio en dos archivos controladores diferentes para mantener el orden.

## Como correr el proyecto en una computadora
1. Descargar o clonar este repositorio.
2. Abrir la carpeta principal del proyecto en Visual Studio Code.
3. Abrir la terminal del editor y encender el proyecto con el comando: `.\mvnw spring-boot:run`
4. Abrir un navegador de internet y visitar: `http://localhost:2329/AJMG_Act1/endpointSaludo`

## Resumen del proceso de subida al servidor (VPS)
Para poner este proyecto en linea, se realizo lo siguiente:
1. Se compilo el codigo fuente para generar un archivo ejecutable (.jar).
2. Se envio dicho archivo al servidor remoto a traves de la consola.
3. Dentro del servidor, se creo una carpeta especifica para el proyecto, manteniendo asi el orden y separando los archivos de los de otros compañeros.
4. Finalmente, se encendio la aplicacion en segundo plano usando comandos de Linux, lo que permite que el proyecto siga funcionando en internet de forma continua aunque se cierre la conexion con el servidor.

## Links de mis endpoints
http://68.183.115.226:2329/MGAJ_Act1/endpointSaludo
Devuelve un texto de saludo.

http://68.183.115.226:2329/MGAJ_Act1/endpointLista
Devuelve una pequeña lista con datos simulados (nombre, apellido, semestre y edad).

http://68.183.115.226:2329/MGAJ_Act1/endpointEdad
Devuelve un simple numero.

http://68.183.115.226:2329/MGAJ_Act1/endpointDespedida
Devuelve un texto de despedida.