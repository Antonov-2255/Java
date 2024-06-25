import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class P33 {

    public static void main(String[] argv) throws Exception {
        BufferedReader bufRead = new BufferedReader(
                new FileReader("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t4.txt"));
        BufferedWriter bufWrite = new BufferedWriter(
                new FileWriter("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/t5.txt"));
        int i;
        // manipulate the student information from files
        do {
            i = bufRead.read();
            if (i != -1) {
                if (Character.isUpperCase((char) i)) {
                    bufWrite.write(Character.toLowerCase((char) i));
                } else {
                    bufWrite.write((char) i);
                }
            }
        } while (i != -1);
        bufRead.close();
        bufWrite.close();
    }
}