package exception;

public class User {

    public static void main(String[] args) {
        String file1 = "source.txt";
        String dir1 = "c:\temp";

        FileHandler handler = new FileHandler();

        handler.copyFile(file1, dir1);  // ������ �� �Ȱǰ�?

        /*
        try {
            handler.copyFile(file1, dir1);
        } catch (CopyFailedException e) {
            System.out.println("Copy�� �����߱���!");
            //e.printStackTrace();
        }
        */

        System.out.println("End of main");
    }
}
