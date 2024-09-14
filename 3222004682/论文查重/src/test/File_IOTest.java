package test;

import main.File_IO;
import static org.junit.jupiter.api.Assertions.*;
import static main.File_IO.*;

import org.junit.jupiter.api.Test;

class File_IOTest {

	/**
	 * 正常读写情况
	 */
	@Test
	void testReadFile() {
		// 路径存在，正常读取
        String str = readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
	}

	@Test
	void testWriteTxt() {
		// 路径存在，正常写入
        double[] elem = {0.1, 0.2, 0.3, 0.4, 0.5};
        for (int i = 0; i < elem.length; i++) {
            writeFile(elem[i], "D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\ansAndOrigTest.txt");
        }
	}

	/**
	 * 异常读情况
	 */
	@Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = readFile("D:\\LJun521\\3222004682\\论文查重\\src\\测试文本\\nullTest.txt");
    }


}
