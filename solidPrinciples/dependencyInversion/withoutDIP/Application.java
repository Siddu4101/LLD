package solidPrinciples.dependencyInversion.withoutDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    private final PostgresDatabase postgresDatabase;
    private final MongoDatabase mongoDatabase;
    private final CassandraDatabase cassandraDatabase;

    /*need to modify the constructor for Dependency injection*/
    public Application(PostgresDatabase postgresDatabase, MongoDatabase mongoDatabase, CassandraDatabase cassandraDatabase) {
        this.postgresDatabase = postgresDatabase;
        this.mongoDatabase = mongoDatabase;
        this.cassandraDatabase = cassandraDatabase;
    }

    public void saveToPostgres(){
        log.info("Saving data to postgres");
        postgresDatabase.save();
    }

    public void saveToMongo(){
        log.info("Saving data to Mongo");
        mongoDatabase.save();
    }

    /*need to modify existing application class*/
    public void saveToCassandra(){
        log.info("Saving data to Casandra");
        cassandraDatabase.save();
    }
}
