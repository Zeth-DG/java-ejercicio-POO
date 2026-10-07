# 📚 Programación Orientada a Objetos - Fundamentos (Java)

Este repositorio contiene la solución al ejercicio práctico **"Exploring the School System Project"**, enfocado en los fundamentos de la Programación Orientada a Objetos (POO) utilizando **Java** de Generation Global: 
https://github.com/generation-org/JAVA/tree/master/Object%20Oriented%20Programming%20-%20Fundamentals

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java
* **IDE recomendado:** IntelliJ IDEA

---

## 📋 Descripción del Proyecto

El proyecto simula un sistema escolar básico mediante dos clases principales (`Student` y `Course`), aplicando conceptos fundamentales de POO como encapsulamiento, constructores, sobrecarga de métodos y manejo de colecciones.

### 1. Clase `Student` (Estudiante)

Representa a un estudiante dentro del sistema escolar.

* **Atributos:**
* `firstName` (Nombre)
* `lastName` (Apellido)
* `registration` (Matrícula)
* `grade` (Calificación)
* `year` (Año / Grado actual)


* **Métodos principales:**
* `printFullName()`: Imprime el nombre completo del estudiante.
* `isApproved()`: Retorna `true` si la calificación es mayor o igual a 60.
* `changeYearIfApproved()`: Avanza al estudiante al siguiente año (`year + 1`) y muestra un mensaje si fue aprobado.


* **Constructores:** Sobrecargado con al menos tres variantes para inicializar el objeto de distintas formas.

### 2. Clase `Course` (Curso)

Representa una materia o curso escolar que gestiona una lista de estudiantes.

* **Atributos:**
* `courseName` (Nombre del curso)
* `professorName` (Nombre del profesor)
* `year` (Año del curso)
* `students` (Colección de estudiantes inscritos)


* **Métodos principales:**
* `enroll(Student student)`: Inscribe a un estudiante en el curso.
* `enroll(Student[] students)`: **(Sobrecarga de métodos)** Inscribe un arreglo completo de estudiantes.
* `unEnroll(Student student)`: Elimina a un estudiante del curso tras verificar su existencia.
* `countStudents()`: Cuenta el número total de estudiantes inscritos.
* `bestGrade()`: Retorna la calificación más alta del curso.



---

## 🚀 Retos y Características Adicionales Implementadas

Además de los requerimientos básicos, se implementaron soluciones para los siguientes retos:

* **Promedio del curso:** Función que calcula la calificación promedio de todos los estudiantes inscritos.
* **Ranking de estudiantes:** Función que genera un listado ordenado con los estudiantes y sus respectivas calificaciones.
* **Comparativa con el promedio:** Función que evalúa de forma individual si cada estudiante se encuentra por encima o por debajo del promedio general del curso.

---

*Desarrollado como parte del aprendizaje de los fundamentos de Programación Orientada a Objetos en Java como parte del Bootcamp de generation CH72.*
