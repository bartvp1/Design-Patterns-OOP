package SingletonPattern;

public class SingleObject {

    private static final SingleObject instance = new SingleObject();
    private String message;

    private SingleObject(){
        message = "singleton test";
    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void setMessage(String s){
        message = s;
    }

    public void showMessage(){
        System.out.println(message);
    }

    }
