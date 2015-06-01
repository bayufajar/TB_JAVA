
package tb_java;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class menyimpan extends FileFilter {

    private final String extension;
    private final String description;

    public menyimpan(String extension, String description) {
        this.extension = extension;
        this.description = description;
    }

    public boolean accept(File file) {

        if (file.isDirectory()) {
            return true;
        }
        return file.getName().endsWith(extension);
    }

    public String getDescription() {

        return description + String.format(" (*%s)", extension);
    }
}
