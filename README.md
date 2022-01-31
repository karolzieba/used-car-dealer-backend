1. Należy pobrać projekt z repozytorium.
2. Należy zainstalować bazę danych PostgreSQL w wersji 14.1.
3. Po zainstalowaniu, należy uruchomić serwer bazy, zalogować się i utworzyć bazę danych o nazwie "usedcardealer" za pomocą polecenia "CREATE DATABASE usedcardealer;".
4. W pliku "src/main/resources/application.properties" należy ustawić nazwę bazy na "postgres" a hasło na zgodne z tym, które ustawiliśmy podczas instalacji bazy.
5. W terminalu naszego IDE wpisujemy polecenie "./mvnw spring-boot:run".
6. W tym momencie aplikacja uruchomi się, możemy sprawdzić jej działanie wpisując w przeglądarkę np. "localhost:8080/api/Car".

W przypadku występujących problemów można spróbować przeładować projekt w Mavenie (pom.xml -> Maven -> Reload Project).