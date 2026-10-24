
package java_project;


public class Java_project {

   
    public static void main(String[] args) {
        System.out.println("Moez Ragheb Mabruk. ");
        System.out.println(" 3169110.\n");
        
        NumericBox<Integer> box1 = new NumericBox<>(10);
        NumericBox<Double> box2 = new NumericBox<>(7.5);

        System.out.println("Integer value: " + box1.getValue());
        System.out.println("Double value: " + box2.getValue());

        System.out.println("Converted value: " + box2.getDoubleValue());
        
    }
    
}
