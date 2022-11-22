import java.util.*;
public class RunAnimal
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bird bd = new Bird();
        Cat ct = new Cat();
        Dog dg = new Dog();
        
        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String runimal = sc.nextLine();
        
        if(runimal.equalsIgnoreCase("B")){
            bd.eat();
            bd.sleep();
            bd.makeSound();
        }
        if(runimal.equalsIgnoreCase("C")){
            ct.eat();
            ct.sleep();
            ct.makeSound();
        }
        if(runimal.equalsIgnoreCase("D")){
            dg.eat();
            dg.sleep();
            dg.makeSound();
        }
        else if(runimal.isEmpty()){
            System.out.println("Wrong Input!");
        }
        
	}
}
