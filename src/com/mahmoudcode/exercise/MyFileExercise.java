package com.mahmoudcode.exercise;

import java.io.*;
import java.util.Scanner;

public class MyFileExercise {

    private static final String filePath = "C:\\Users\\maham\\AmigosAcademyProjects\\java-beginner-exercise\\src\\data.csv";
    private static final String fileData ="""
    id,first_name,last_name,email,gender
    1,Fanchette,Williamson,fwilliamson0@github.com,F
    2,Aleksandr,Matts,amatts1@webs.com,M
    3,Maurie,Cordero,mcordero2@google.co.jp,M
    4,Donnajean,Crowson,dcrowson3@google.com.hk,F
    5,Ricardo,Gofton,rgofton4@nytimes.com,M
    6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
    7,Marjorie,Blumsom,mblumsom6@joomla.org,F
    8,Lester,Huyghe,lhuyghe7@jugem.jp,M
    9,Merrily,Stangoe,mstangoe8@tiny+.cc,F
    10,Reider,Karel,rkarel9@github.io,M
    11,Dory,Jolliff,djolliffa@wufoo.com,F
    12,Homerus,Averay,haverayb@skyrock.com,M
    13,Alyda,Muglestone,amuglestonec@is.gd,F
    14,Pinchas,Louca,ploucad@google.es,M
    15,Cherin,Eltringham,celtringhame@parallels.com,F
    16,Mufi,Rothert,mrothertf@dropbox.com,F
    17,Jordana,Everex,jeverexg@ucla.edu,F
    18,Belle,Rother,brotherh@auda.org.au,F
    19,Clevie,Sifflett,csiffletti@furl.net,M
    20,Gretchen,Abell,gabellj@1688.com,F
""";


    public static void printExercise(){

        File file = createMyFile(filePath);
//        writeToFile(file);
//        writeToFile(createMyFile(filePath));

        try {

           printFileContents(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    private static File createMyFile(String path){

        try{
            File file = new File(path);

            if(!file.exists()){
                file.createNewFile();
            }

            return file;
        } catch(IOException e){
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }

    private static void writeToFile(File file){

        try {
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.write(fileData);
            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static StringBuilder printFileContents(File file) throws java.io.FileNotFoundException{

            Scanner scanner = new Scanner(file);
            StringBuilder strb = new StringBuilder();

            //Skip header
            scanner.nextLine();

            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

            return strb;
    }


}
