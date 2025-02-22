class MobileComputing {
 
    //Tiangle
    public static void printTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    // Reverse Triangle
    public static void printReverseTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    //Diamond
    public static void printDiamond(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        int rows = 5;
        
        System.out.println("June Rommel G. Reloj\nBSIT-42M4\n");
 
        printTriangle(rows);
        System.out.println();
        
        printReverseTriangle(rows);
        System.out.println();
        
        printDiamond(rows);
        System.out.println();
    }
}
