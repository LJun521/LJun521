package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.Hamming;
import main.SimHash;
import main.File_IO;

class HammingTest {

	/**
	 * 测试GetHammingDistance正常情况
	 */
	@Test
	void testGetHammingDistance() {
		String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	    String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_add.txt");
	    int distance = Hamming.getHammingDistance(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	    System.out.println("海明距离：" + distance);
	    System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
	}
	
	/**
	 * 测试GetHammingDistance异常情况
	 */
	@Test
	void testGetHammingDistanceFail() {
		String str0 = "1010";
	    String str1 = "1111";
	    System.out.println(Hamming.getHammingDistance(str0, str1));
	}

	/**
	 * 测试GetSimilarity
	 */
	@Test
	void testGetSimilarity() {
		String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	    String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_add.txt");
	    int distance = Hamming.getHammingDistance(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	    double similarity = Hamming.getSimilarity(SimHash.getSimHash(str0), SimHash.getSimHash(str1));
	    System.out.println("str0和str1的海明距离: " + distance);
	    System.out.println("str0和str1的相似度:" + similarity);
	}

}
