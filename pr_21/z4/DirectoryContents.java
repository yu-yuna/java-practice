package pr_21.z4;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectoryContents {

    public static List<String> getContents(String path) {
        File directory = new File(path);
        List<String> contents = new ArrayList<>();

        File[] files = directory.listFiles();

        if (files == null) {
            return contents;
        }

        Arrays.sort(files);
        
        for (File file : files) {
            contents.add(file.getName());
        }

        return contents;
    }

    public static void printFirstFive(List<String> contents) {
        int count = Math.min(5, contents.size());

        for (int i = 0; i < count; i++) {
            System.out.println(contents.get(i));
        }
    }
}