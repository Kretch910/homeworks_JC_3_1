package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static StringBuilder log = new StringBuilder();

    public static void creatorDir(String name) {
        File newDir = new File(name);
        if (newDir.mkdir()) {
            log.append("Создана директория " + name);
            log.append("\n");
        }
    }

    public static void creatorFile(String dir, String name) {
        File newFile = new File(dir, name);
        try {
            if (newFile.createNewFile()) {
                log.append("Создан файл " + dir + name);
                log.append("\n");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void saveLog(String nameFileLog) {
        try (FileWriter writer = new FileWriter(nameFileLog, false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void main(String[] args) {

        creatorDir("H://Games");
        creatorDir("H://Games/src");
        creatorDir("H://Games/res");
        creatorDir("H://Games/savegames");
        creatorDir("H://Games/temp");
        creatorDir("H://Games/src/main");
        creatorDir("H://Games/src/test");

        creatorFile("H://Games/src", "Main.java");
        creatorFile("H://Games/src", "Utils.java");

        creatorDir("H://Games/res/drawables");
        creatorDir("H://Games/res/vectors");
        creatorDir("H://Games/res/icons");

        creatorFile("H://Games/temp", "temp.txt");

        saveLog("H://Games/temp/temp.txt");
    }
}
