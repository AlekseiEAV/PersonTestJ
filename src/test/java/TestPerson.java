import org.junit.Assert;
import org.junit.Test;
public class TestPerson {
    @Test
    public void testPublicTenYear() {
        int age = 10;
        boolean trueFalse;
        boolean result = Person.isTeenager(age);
        if(age < 13 && result == true) {
            trueFalse = false;
        }else{
            trueFalse = true;
        }
        Assert.assertTrue(trueFalse);
    }
    @Test
    public void testPublicFifteenYear(){
        int age = 15;
        boolean trueFalse;
        boolean result = Person.isTeenager(age);
        if(age > 12 && age < 20 && result == true){
            trueFalse = true;
        }else{
            trueFalse = false;
        }
        Assert.assertTrue(trueFalse);
    }
    @Test
    public void testPublicTwentyYear(){
        int age = 20;
        boolean trueFalse;
        boolean result = Person.isTeenager(age);
        if (age > 19 && result == false){
            trueFalse = true;
        }else {
            trueFalse = false;
        }
        Assert.assertTrue(trueFalse);
    }

}
