import java.io.*;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;

public class LoaderForBook {

       public static String loadBook(String bookName) throws IOException {
           return Files.readString(Paths.get("src/" + bookName + ".txt"));
       }

   }
