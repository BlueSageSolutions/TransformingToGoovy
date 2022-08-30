import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public class ListFiles {
  public static void main(String[] args) {
    try {
      DirectoryStream dirStream = new File("/").toPath().newDirectoryStream();

      for (Object path : dirStream) {
        System.out.println(path);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
