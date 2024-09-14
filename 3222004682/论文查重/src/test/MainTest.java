package test;


import main.File_IO;
import main.Hamming;
import main.SimHash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MainTest {

//	@BeforeEach
//	void setUp() throws Exception {
//		
//	}

	/**
	 * 测试原文件和其他抄袭文件(包括自己）的相似度
	 */
//	@Test
//	void testMain() {
//		String[] str = new String[6];
//		str[0] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
//		str[1] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_add.txt");
//		str[2] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_del.txt");
//		str[3] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_1.txt");
//		str[4] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_10.txt");
//		str[5] = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_15.txt");
//		String ansFile = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\answer.txt";
//		
//		for(int i = 0; i < 6; i++ ) {
//			double similarity = Hamming.getSimilarity(SimHash.getSimHash(str[0]), SimHash.getSimHash(str[i]));
//			File_IO.writeFile(similarity, ansFile);
//			System.out.println(similarity);
//		}
//		//		fail("Not yet implemented");
//	}

	    @Test
	    public void origAndOrigTest(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndOrigTest.txt";
	        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans, ansFileName);
	    }

	    @Test
	    public void origAndAddTest(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_add.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndAddTest.txt";
	        double ans =Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans, ansFileName);
	    }

	    @Test
	    public void origAndDelTest(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_del.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndDelTest.txt";
	        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans, ansFileName);
	    }

	    @Test
	    public void origAndDis1Test(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_1.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndDis1Test.txt";
	        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans, ansFileName);
	    }

	    @Test
	    public void origAndDis10Test(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_10.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndDis10Test.txt";
	        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans, ansFileName);
	    }

	    @Test
	    public void origAndDis15Test(){
	        String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	        String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_dis_15.txt");
	        String ansFileName = "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndDis15Test.txt";
	        double ans = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	        System.out.println("查重率："+ans*100+"%");
	        File_IO.writeFile(ans,ansFileName);
	    }
}
