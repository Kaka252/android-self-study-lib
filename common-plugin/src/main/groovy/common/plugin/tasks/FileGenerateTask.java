package common.plugin.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author: ZhouYou
 * Date: 2018/4/8.
 */
public class FileGenerateTask extends DefaultTask {

    public String dir;
    public String fileName;

    @TaskAction
    public void generate() {
        File file = new File(dir, fileName);
        if (!file.exists()) {
            try {
                String string = "abc";
                FileOutputStream fos = new FileOutputStream(file);
                fos.write(string.getBytes());
                fos.flush();
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
