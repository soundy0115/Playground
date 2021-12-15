public class MyClass {
    public static void main(String args[]) {
        int treeHeight = 10;
        int stemHeight = 3;
        
        for(int i = 1; i <= treeHeight; i++){
            for(int k = 1; k <= treeHeight-i; k++){
                System.out.print(" ");                
            }
            for(int j = 1; i >= j; j++){
                System.out.print("☆");                
            }
            System.out.println();
        }
        
        for(int i = 0; i <= stemHeight; i++){
            for(int j = 1; j <= treeHeight-1; j++){
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
}
