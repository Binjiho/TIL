package exception;

public class User {

    public static void main(String[] args) {
        String file1 = "source.txt";
        String dir1 = "c:\temp";

        FileHandler handler = new FileHandler();

        handler.copyFile(file1, dir1);  // 수행이 잘 된건가?

        /*
        try {
            handler.copyFile(file1, dir1);
        } catch (CopyFailedException e) {
            System.out.println("Copy에 실패했구나!");
            //e.printStackTrace();
        }
        */

        System.out.println("End of main");
    }
}
