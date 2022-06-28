public class Main{

    //The try statement allows you to define a block of code to be tested for 
    //errors while it is being executed.

    //The catch statement allows you to define a block of code to be executed, 
    //if an error occurs in the try block.

    //The finally statement will excute after ran try-catch statements.

    public static void main(String[] args) {
        try {
            int[] nums = {1,2,3};
            int value = nums[10];

            System.out.println(value);
        } catch (Exception e) {
            System.out.println("There is no such index");
        } finally {
            System.out.println("program is finished");
        }
        
    }
}