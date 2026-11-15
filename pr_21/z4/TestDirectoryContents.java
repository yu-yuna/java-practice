package pr_21.z4;

import java.util.List;

public class TestDirectoryContents {

    public static void main(String[] args) {

        String path = ".";

        List<String> contents =
                DirectoryContents.getContents(path);

        System.out.println("Первые 5 элементов:");

        DirectoryContents.printFirstFive(contents);
    }
}