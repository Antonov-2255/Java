import java.io.*;

class P34 {

    public static void main(String args[]) throws IOException {

        DataInputStream dataIS = new DataInputStream(
                new FileInputStream("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t4.txt"));

        DataOutputStream dataOS = new DataOutputStream(
                new FileOutputStream("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t5.txt"));
        // manipulate the student information from files
        String str;
        while ((str = dataIS.readLine()) != null) {
            String upper = str.toUpperCase();
            System.out.println(upper);
            dataOS.writeBytes(upper + "  ,");
        }
        dataIS.close();
        dataOS.close();
    }
}