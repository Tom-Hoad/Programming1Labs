package Y1S2.lab1;

import uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.io.ConcatenateJavaFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JavaFileUtil implements ConcatenateJavaFiles {
    public void concatenateJavaFiles(String dirName, String fileName) throws IllegalArgumentException {
            try {
                if (Files.isDirectory(Paths.get(dirName))) {
                    File dir = new File(dirName);
                    File[] files = dir.listFiles();

                    OutputStream out = new FileOutputStream(dirName + "/" + fileName);

                    for (File file : files) {
                        if (file.getName().substring(file.getName().indexOf(".")).equals(".java")) {
                            InputStream input = new FileInputStream(file);

                            int read = input.read();
                            while(read != -1) {
                                out.write(read);
                                read = input.read();
                            }
                            input.close();
                        }
                    }

                    out.close();
                } else {
                    throw new IllegalArgumentException("This is not a directory!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
