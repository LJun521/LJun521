package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import main.SimHash;
import main.File_IO;

class SimHashTest {

	/**
	 * 测试GetHash
	 */
	@Test
	void testGetHash() {
		String[] strings = {"你", "好", "GDUT", "我爱编程",  "软件工程"};
	    for (String string : strings) {
	        String stringHash = SimHash.getHash(string);
	        System.out.println(stringHash.length());
	        System.out.println(stringHash);
	    }
	}

	/**
	 * 测试GetSimHash
	 */
	@Test
	void testGetSimHash() {
		String str0 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
	    String str1 = File_IO.readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig_0.8_add.txt");
	    System.out.println(SimHash.getSimHash(str0));
	    System.out.println(SimHash.getSimHash(str1));
	}

}
