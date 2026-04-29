package solidPrinciples.dependencyInversion.withDIP;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CassandraDatabase implements PersistenceForDatabase{
    @Override
    public void save(){
        log.info("Saved data to Cassandra database");
    }
}
