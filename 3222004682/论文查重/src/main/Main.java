package main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		//
		if (args.length != 3) {
			System.out.println("请输入文件路径");
			return;
		}

		//接收文件
//		File origin = new File(args[0]);    //原文文件
//		File copy = new File(args[1]);     //抄袭版论文的文件
//		File answer = new File(args[2]);     //答案文件
		String originPath = args[0];    //原文文件路径
		String copyPath = args[1];     //抄袭版论文的文件路径
		String answerPath = args[2];     //答案文件路径
		
		//分词
		String origin = File_IO.readFile(originPath);
		String copy = File_IO.readFile(copyPath);
		
		//计算相似度
		String simHash_orig = SimHash.getSimHash(origin);
		String simHash_copy = SimHash.getSimHash(copy);
		
		double similarity = Hamming.getSimilarity(simHash_orig, simHash_copy);
		
		//输出答案文件
		File_IO.writeFile(similarity, answerPath);  
		
	}
}
