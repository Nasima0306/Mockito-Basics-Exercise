package Exercise6;

public class DataProcessor {
    DatabaseService database;
    public DataProcessor(DatabaseService database){
        this.database=database;
    }
    public void process(){
        database.connect();
        database.fetchData();
        database.disconnect();
    }

}
