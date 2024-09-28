package main.java.utils;

import java.io.*;
import java.math.BigDecimal;
import java.io.File;


/**
 * 把题目和答案存入文件的工具类
 */
public class FileUtil {
	File file = new File("1.txt");
    // 生成题目的文件路径
    private static final String exerciseFile = "Exercise.txt";
    // 答案的文件路径
    private static final String answerFile = "Answer.txt";

    /**
     * 生成题目文件
     * @param exercise 题目的数组
     */
    public static void insertExercise(String[] exercise) {
        File file = new File(exerciseFile);
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            for (int i = 1; i < exercise.length; i++) {
                bw.write(i+"."+exercise[i]+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          if (bw != null){
              try {
                  bw.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          if (osw != null){
              try {
                  osw.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          if (fos != null){
              try {
                  fos.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
        }

    }
    
    /**
     * 生成答案文件
     * @param answer 答案的数组
     */
    public static void insertAnswer(String[] answer){
        File file = new File(answerFile);
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            bw = new BufferedWriter(osw);
            for (int i = 1; i < answer.length ; i++) {
                bw.write(i+"."+" "+answer[i]+"\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (osw!=null){
                try {
                    osw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

//    public static void insertAnswer(double[] answer) {
//        File file = new File(answerFile);
//        FileOutputStream fos = null;
//        OutputStreamWriter osw = null;
//        BufferedWriter bw = null;
//        BigDecimal format = null;
//        double result = 0;
//        try{
//            if (!file.exists()){
//                file.createNewFile();
//            }
//            fos = new FileOutputStream(file);
//            osw = new OutputStreamWriter(fos);
//            bw = new BufferedWriter(osw);
//            for (int i = 1; i < answer.length; i++) {
//                // 转化为两位小数
//                format = new BigDecimal(answer[i]);
//                result = format.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
//                bw.write("答案"+i+": "+result+"\n");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            if (bw != null){
//                try {
//                    bw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (osw != null){
//                try {
//                    osw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }

}
