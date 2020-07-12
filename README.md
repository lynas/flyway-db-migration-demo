# flyway with spring boot 

1. Add flyway plugin `id("org.flywaydb.flyway") version "6.5.0"`
2. Add flyway dependency and db connector dependency ( using myslq in this demo)

```
implementation("org.flywaydb:flyway-core")
runtimeOnly("mysql:mysql-connector-java")
```

3. Override flyway task with the database url, username and password

```
flyway {
    url = "jdbc:mysql://localhost:3307/flyway_demo"
    user = "root"
    password = "password"
}
```

4. If working with existing database then run flyway:flywayBaseline gradle task
5. Then create `src/main/resources/db/migration` folder
6. Inside this folder create file name as following

```
<Prefix><Version>__<Description>.sql
```
7. Example file name `V1_0__init_schema.sql`
8. Inside put your database change DDL commands
9. Run flyway:flywayMigrate gradle task to migrate db
10. If working with a new database step 4 is not required