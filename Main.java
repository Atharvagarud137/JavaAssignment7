public class Main {
   public static void main(String[] args) {
      int x;
      Stack s;

      s = new ArrayStack(6);

      try {
         x = 4;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 7;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 8;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 9;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 12;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 91;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = 19;
         s.push(x);
         System.out.println("push(" + x + ");");
         x = s.pop();
         System.out.println("pop() ---> " + x);
         x = s.pop();
         System.out.println("pop() ---> " + x);
         x = s.pop();
         System.out.println("pop() ---> " + x);
         x = s.pop();
         System.out.println("pop() ---> " + x);
         x = s.pop();
         System.out.println("pop() ---> " + x);
      } catch (StackException e) {
         System.out.println("Error detected: " + e.getMessage());
         System.exit(1);
      }
   }
}
