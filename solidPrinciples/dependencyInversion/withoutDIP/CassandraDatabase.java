package solidPrinciples.dependencyInversion.withoutDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CassandraDatabase {
    public void save(){
        log.info("Saved data to Cassandra database");
    }
}
