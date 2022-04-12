package App;

public class User {
	private String name;
    private String login;
    private String password;
    
    public User(String name, String login, String password){
        this.name = name;
        this.login = login;
        this.password = password;
    }
    
    public boolean login(String login, String password){
        if (login == this.login && password == this.password){
            return true;
        } else{
            return false;
        }
    }
}
