package main;

import java.io.*;

public class File_IO {
	/**
	 * 读文件
	 * 将文本内容转化为字符串输出
	 * @param filePath
	 * @return
	 */
	public static String readFile(String filePath) {
        String str = "";
        String strLine="";
        // 将文件按行读入str中
        File storefile = new File(filePath);
        FileInputStream fileInputStream = null;
        try {
            //将文件信息读入内存并利用InputStreamReader将字节信息转为字符流
            fileInputStream = new FileInputStream(storefile);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            // 利用BufferedReader创建对象，用readLine方法按行拼接字符串
            while ((strLine = bufferedReader.readLine()) != null) {
                str += strLine;
            }
            // 关闭资源
            inputStreamReader.close();
            bufferedReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
	
	/**
	 * 写文件
	 * @param fileElem
	 * @param filePath
	 */
	public static void writeFile(double fileElem,String filePath){
        String str = Double.toString(fileElem);
        File file = new File(filePath);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(str, 0, (str.length() > 3 ? 4 : str.length()));
            fileWriter.write("\r\n");
            // 关闭资源
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
