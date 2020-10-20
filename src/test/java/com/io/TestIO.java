package com.io;

import java.io.File;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class TestIO {
    /* UserCAse2:
    * Write a program to
    * demonstrate File Operations
    * */
    @Test
    public void test() {
//		fail("Not yet implemented");

        /*
         * Creating a File name: pathName
         */
        File file = new File("pathName");
        try {
            if (file.createNewFile()) {
                System.out.println("File is created succssfully.");
            } else {
                System.out.println("File is already exist...");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* Check for file exist */
        String path = file.getPath();
        System.out.println(path);
        Assert.assertEquals("pathName", path);

        /* Delete existing file */
        boolean df = file.delete();
        System.out.println(df + ": Stands for file deleted");
        Assert.assertTrue(df);

        // Creating Directory
        boolean bool = file.mkdir();
        if (bool) {
            System.out.println("Directory created successfully");
        } else {
            System.out.println("Sorry couldn’t create specified directory");
        }
        Assert.assertTrue(bool);

        // List Files, Directories as well as Files with Extension
        String dirPath = "F:/Java_Workspace/FileIO";
        File dir = new File(dirPath);
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The directory is empty");
        } else {
            for (String aFile : files) {
                System.out.println(aFile);
            }
        }

    }

}
