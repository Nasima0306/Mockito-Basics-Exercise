package Exercise4;

public class UserManager {
    LoggerService logger;
    public UserManager(LoggerService logger){
        this.logger=logger;
    }
    public void addUser(){
        logger.log("User Added");
    }
}
