package com.howard.test;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileTest {
     
	public static void main(String[] args) throws IOException {
		String path ="D:\\";
		String path2 ="aa";
		System.out.println(path);
		System.out.println(path2);
		//��װ��һ������ 
		File file =new File(path,path2);
		//�����ļ�
	//	file.createNewFile();
		RandomAccessFile raf =new RandomAccessFile(file, "rwd");
		//file.mkdir();
		
		
	}
}
