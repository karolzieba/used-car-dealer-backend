[PL] Projekt został wykonany jako projekt studencki w ramach przedmiotu "Podstawy Inżynierii Programowania" w styczniu 2022 roku. Jest to back - end aplikacji do zarządzania komisem samochodowym. Został on napisany w języku Java przy użyciu frameworka Spring Boot. Wykorzystano tutaj również Hibernate'a i PostgreSQL jako bazę danych.

Jak uruchomić projekt:

1. Należy utworzyć bazę danych, na przykład za pomocą polecenia "CREATE DATABASE usedcardealer;" w naszym DBMS.
2. W pliku "src/main/resources/application.properties" należy skonfigurować połączenie z naszą bazą danych, uzupełniając trzy pierwsze pola.
3. W terminalu naszego IDE wpisujemy polecenie "./mvnw spring-boot:run" lub "mvnw spring-boot:run".
4. W tym momencie aplikacja uruchomi się, możemy sprawdzić jej działanie wpisując w przeglądarkę np. "localhost:8080/api/Car".

W przypadku występujących problemów można spróbować przeładować projekt w Mavenie (pom.xml -> Maven -> Reload Project).

[ENG] The project was done as a student project at "Fundamentals of Programming Engineering" subject at January 2022. This is a back - end of the application for managing a used car dealer company. The program was written in Java language using the Spring Boot framework. It also uses Hibernate and PostgreSQL as a database.

How to run the project:

1. You have to create database, for example by using "CREATE DATABASE usedcardealer;" command in our DBMS.
2. In "src/main/resources/application.properties" file, configure connection with database by completing three first fields.
3. In IDE terminal type command "./mvnw spring-boot:run" or "mvnw spring-boot:run".
4. At this moment application will run, we can check if it works by typing for example "localhost:8080/api/Car" in browser.

In the case of problems, we can try reload project in Maven (pom.xml -> Maven -> Reload Project).

