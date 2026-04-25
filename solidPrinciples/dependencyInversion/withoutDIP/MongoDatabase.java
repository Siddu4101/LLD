package solidPrinciples.dependencyInversion.withoutDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MongoDatabase {
    public void save() {
        log.info("Saved data to Mongo");
    }
}
