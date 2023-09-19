    package school.mjc.stage0.conditions.task2;
    
    public class GreatestNumberPrinter {
        public void printGreatest(int first, int second) {
            if (first > second) {
                System.out.println("The greatest number is: " + first);
            } else if (second > first) {
                System.out.println("The greatest number is: " + second);
            } else {
                System.out.println("Both numbers are equal: " + first); 
            }
        }
    
        public static void main(String[] args) {
            GreatestNumberPrinter printer = new GreatestNumberPrinter();
            
            int num1 = 12;
            int num2 = 20;
            printer.printGreatest(num1, num2);
        }
    }
