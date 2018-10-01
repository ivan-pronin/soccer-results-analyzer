import javax.xml.bind.JAXBException;
import java.io.IOException;

public class TestExceptopm2 {

    public static void main(String[] args) {
        try{
            foo();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        foo();
    }
    public static void bar(){
    }
    public static void foo() throws NullPointerException{
    }
}
