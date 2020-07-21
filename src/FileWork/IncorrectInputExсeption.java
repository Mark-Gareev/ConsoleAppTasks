package FileWork;

public class IncorrectInputExсeption extends Exception {
    IncorrectInputExсeption(String msg)
    {
        super(msg);
    }
    @Override
    public void printStackTrace(){
        super.printStackTrace();
    }
    public String getMessage(){
        return "Invalid command";
    }
}
