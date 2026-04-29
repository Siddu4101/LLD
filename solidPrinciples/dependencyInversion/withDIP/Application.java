package solidPrinciples.dependencyInversion.withDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    private final PersistenceForDatabase persistenceForDatabase;

    public Application(PersistenceForDatabase persistenceForDatabase) {
        this.persistenceForDatabase = persistenceForDatabase;
    }

    public void saveToDatabase(){
        log.info("Saving data to database");
        persistenceForDatabase.save();
    }
}
