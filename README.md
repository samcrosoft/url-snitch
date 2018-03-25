# URL Snitch Project

Follow these simple steps to run this app:

* Update the database connection properties in [database.properties]

* Create two empty schemas in MySQL DB

```
mvn db-migrator:create
```

* Run the application

```
mvn jetty:run
```

* Navigate with browser

    to: [http://localhost:8080/](http://localhost:8080/)
