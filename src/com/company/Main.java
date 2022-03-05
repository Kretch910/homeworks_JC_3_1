package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder log = new StringBuilder();

        File dirSrc = new File("H://Games/src");
        if (dirSrc.mkdir()) {
            log.append("Создана директория H://Games/src");
            log.append("\n");
        }

        File dirRes = new File("H://Games/res");
        if (dirRes.mkdir()) {
            log.append("Создана директория H://Games/res");
            log.append("\n");
        }

        File dirSavegames = new File("H://Games/savegames");
        if (dirSavegames.mkdir()) {
            log.append("Создана директория H://Games/savegames");
            log.append("\n");
        }

        File dirTemp = new File("H://Games/temp");
        if (dirTemp.mkdir()) {
            log.append("Создана директория H://Games/temp");
            log.append("\n");
        }

        File dirMain = new File("H://Games/src/main");
        if (dirMain.mkdir()) {
            log.append("Создана директория H://Games/src/main");
            log.append("\n");
        }

        File dirTest = new File("H://Games/src/test");
        if (dirTest.mkdir()) {
            log.append("Создана директория H://Games/src/test");
            log.append("\n");
        }

        File fileMain = new File(dirMain, "Main.java");
        try {
            if (fileMain.createNewFile()) {
                log.append("Создан файл H://Games/src/main/main.java");
                log.append("\n");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        File fileUtils = new File(dirMain, "Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                log.append("Создан файл H://Games/src/main/Utils.java");
                log.append("\n");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        File dirDrawables = new File("H://Games/res/drawables");
        if (dirDrawables.mkdir()) {
            log.append("Создана директория H://Games/res/drawables");
            log.append("\n");
        }

        File dirVectors = new File("H://Games/res/vectors");
        if (dirVectors.mkdir()) {
            log.append("Создана директория H://Games/res/vectors");
            log.append("\n");
        }

        File dirIcons = new File("H://Games/res/icons");
        if (dirIcons.mkdir()) {
            log.append("Создана директория H://Games/res/icons");
            log.append("\n");
        }

        File fileTemp = new File(dirTemp, "temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                log.append("Создан файл H://Games/temp/temp.txt");
                log.append("\n");
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }

        try (FileWriter writer = new FileWriter(fileTemp, false)) {
            writer.write(log.toString());
            writer.flush();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
