package main.java.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 批改题目的工具类
 */
public class CorrectUtil {

	private static String results[];
    private static double results1[];

    public static void checkAnswer(){
        BufferedReader br = null;
        String line = null;
        // 作答正确与错误的个数
        int i = 1,wrong = 0,correct = 0,t = 0,s = 0;
        int[] correctAnswer;
        int[] wrongAnswer;
        // 标志为哪个算式
        int symbol;
        if (results == null){
            correctAnswer = new int[results1.length];
            wrongAnswer = new int[results1.length];
            symbol = 1;
        } else{
            correctAnswer = new int[results.length];
            wrongAnswer = new int[results.length];
            symbol = 2;
        }
        try {
            br = new BufferedReader(new FileReader("MyAnswer.txt"));
            while ((line=br.readLine())!=null){
                if ((symbol==2&&line.equals(results[i]))||(symbol==1&&line.equals(String.valueOf(results1[i])))){
                    correct++;
                    if (results[i]==null){
                        wrongAnswer[s++] = i;
                    }else {
                    	wrong++;
                        wrongAnswer[s++] = i++;
                    }
                    i++;
                }else {
                	wrong++;
                    wrongAnswer[s++] = i;
                    i++;
                }
            }
            if (symbol==1){
                while((wrong+correct)!=results1.length - 1){
                	wrong++;
                    wrongAnswer[s++] = i++;
                }
            } else {
                while ((wrong + correct) != results.length - 1) {
                	wrong++;
                    wrongAnswer[s++] = i++;
                }
            }
            System.out.println("Correct:"+correct+"(");
            for (int j = 0; j < t ; j++) {
                if (j == t-1){
                    System.out.print(correctAnswer[j]);
                    continue;
                }
                System.out.print(correctAnswer[j]+",");
            }
            System.out.print(")");
            System.out.println();
            System.out.print("Wrong:"+wrong+"(");
            for (int j = 0; j < s; j++) {
                if (j == s-1){
                    System.out.print(wrongAnswer[j]);
                    continue;
                }
                System.out.print(wrongAnswer[j]+",");
            }
            System.out.print(")");
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("错误，文件不存在或者文件为空");
        }
    }

    public static void setResults(String[] results){
        CorrectUtil.results = results;
    }

    public static void setResults(double[] results){
        CorrectUtil.results1 = results;
    }
}
