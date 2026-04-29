package solidPrinciples.dependencyInversion.withDIP;


public class TestWithDIP {
    public static void main(String[] args) {
        Application postgres = new Application(new PostgresDatabase());
        postgres.saveToDatabase();
        Application mongo = new Application(new MongoDatabase());
        mongo.saveToDatabase();
        /*Here adding new database persistence never made changes to application it only added new class without any modification
        * or without any new dependency injections*/
        Application cassandra =  new Application(new CassandraDatabase());
        cassandra.saveToDatabase();
    }
}
