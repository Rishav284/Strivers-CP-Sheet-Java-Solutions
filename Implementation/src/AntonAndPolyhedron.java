import java.util.Scanner;

public class AntonAndPolyhedron {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long faces=0;
        for(int i=0;i<n;i++){
            String s=in.next();
            switch (s) {
                case "Tetrahedron" -> faces += 4;
                case "Cube" -> faces += 6;
                case "Octahedron" -> faces += 8;
                case "Dodecahedron" -> faces+=12;
                default -> faces+=20;
            }
        }
        System.out.println(faces);
    }
}
