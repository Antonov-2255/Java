import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class prac_31 {
	public static void main(String[] args) {
		FileInputStream instream = null;
		FileOutputStream outstream = null;

		try {
			File infile = new File("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/text1.txt");
			File outfile = new File("C:/Users/ketan/OneDrive/Desktop/MU/Semester-4/Java/Practical/text2.txt");

			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);
			byte[] buffer = new byte[1024];

			int length;
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}
			instream.close();
			outstream.close();
			System.out.println("File Copied Successfully!!");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
