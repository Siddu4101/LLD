package solidPrinciples.dependencyInversion.withoutDIP;


public class TestWithoutDIP {
    public static void main(String[] args) {
        Application application = new Application(new PostgresDatabase(), new MongoDatabase(), new CassandraDatabase());
        application.saveToPostgres();
        application.saveToMongo();
        /*Case: need to add one more persistent Cassandra
        * need to modify existing class Application breaks the Open-Close and where ever the usage is present
        * need to inject new dependency of Cassandra
        * */
        application.saveToCassandra();


    }
}
