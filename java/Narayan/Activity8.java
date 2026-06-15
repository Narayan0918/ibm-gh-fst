package ibm.fst;

class CustomException extends Exception{
    private String message;

    public CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage(){
        return message;
    }

}


public class Activity8 {
    public static void main(String[] args) {
        try {
            Activity8.exceptionTest("Before error");
            Activity8.exceptionTest(null);
            Activity8.exceptionTest("This is an error message");
        } catch (CustomException e) {
            System.out.println("Catch block: "+ e.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException{
        if(str != null){
            System.out.println(str);
        }else{
            throw new CustomException("Error: Value of string is null");
        }
    }

}
