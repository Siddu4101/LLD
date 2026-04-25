package solidPrinciples.dependencyInversion.withDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoDatabase implements PersistenceForDatabase{
    @Override
    public void save() {
        log.info("Saved data to Mongo");
    }
}
