[![Build Status](https://travis-ci.org/CarolinaCCZ/poolobject.svg?branch=master)](https://travis-ci.org/CarolinaCCZ/poolobject)

[![codecov](https://codecov.io/gh/CarolinaCCZ/poolobject/branch/master/graph/badge.svg)](https://codecov.io/gh/CarolinaCCZ/poolobject)

poolobject
==========

Java code example of  design creational pattern pool object

Example to apply good practise in software developmemnt: test and mesurement.


Enunciado
=========

En la práctica se va simular un pequeño desarrollo de un producto software para realizar mediciones sobre él.


Objetivo
========

Establecer un caso de estudio que sirva para caracterizar y evaluar tanto el producto desarrollado como el proceso seguido.


Preguntas
=========

- ¿Se ha realizado trabajo en equipo?

No, el trabajo lo he realizado de manera individual. GitHub: https://github.com/CarolinaCCZ/poolobject

- ¿Tiene calidad el conjunto de pruebas disponibles?

Las pruebas indican que la clase ReusablePool tiene una covertura del 100% como se puede ver en Codecov. La cobertura total del proyecto es del 74,28% puesto que las clases Client y Reusable están al 50%.

- ¿Cuál es el esfuerzo invertido en realizar la actividad?

Teniendo en cuenta que la herramienta de eclipse la tenía un poco olvidada puesto que hace algunos años que no la utilizo, me ha llevado más tiempo del esperado.
En total he empleado unas 6 horas aproximadamente en tres días.

- ¿Cuál es el número de fallos encontrados en el código?

En eclipse me ha dado un fallo a la hora de hacer compile y test-compile con Ant. El error era el siguiente: "Perhaps JAVA_HOME does not point to the JDK". Lo he solucionado cambiando a dónde apuntaba, estaba apuntado a JRE en vez de a JDK. Ha funcionado correctamente y me ha creado la carpeta report con el javacoco sin problema.

