package main.java;

import main.java.utils.CorrectUtil;
import main.java.utils.GenerateUtil;



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * 启动类
 */
public class main {

	
	public static void main(String[] args) {
		//n参数控制生成题目的个数,r参数控制题目中数值（自然数、真分数和真分数分母）的范围
		int n,r,over;

		System.out.println("请输入生成题目的个数以及题目中数值的范围");
        n = new Scanner(System.in).nextInt();
        r = new Scanner(System.in).nextInt();
        GenerateUtil.getExercise(n,r);
        File file = new File("MyAnswer.txt");
        try{
            if (!file.exists()){
                file.createNewFile();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("请在MyAnswer.txt中作答，答题完毕请输入1");
        over = new Scanner(System.in).nextInt();
        while (over!=1){
            System.out.println("输入有误，请重新输入");
            over = new Scanner(System.in).nextInt();
        }
        CorrectUtil.checkAnswer();
		
    }
}
