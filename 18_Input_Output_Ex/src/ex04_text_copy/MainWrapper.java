package ex04_text_copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {

  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
  	
  	//파일 객체 선언
  	File dir =new File("C:/storage");
  	File file =new File(dir,"alphabet.txt");
  	StringBuilder sb=new StringBuilder();
  	FileWriter fw=null;
  	
  	
  	try {
  	
  	fw =new FileWriter(file);
  		char[]ch=new char[40];
    	
    	//출력할 데이터
    	char c='A';
    	for(int i=0;i<26;i++ )
    	{			
    		fw.write(ch[i]=c);	
    		c+=1;
    	}
    	
    	System.out.println(file.getPath() + " 파일 생성 완료");
    	
		} catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if(fw != null) {
          fw.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    
    }
  }
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
  	//원본
  	File dir = new File("C:/storage");
  	File src =new File(dir,"alphabet.txt");

  	//복사본
  	File file=new File(dir,"alphabet2.txt");
  	
  //원본 읽어복제할 입력스트림
  	
  	BufferedInputStream bin=null;;
  	
  	//복제본 생성할 출력스트림
  	BufferedOutputStream bout=null;
  	
  	
  	try {
  		bin=new BufferedInputStream(new FileInputStream(src));
  	
  	bout=new BufferedOutputStream(new FileOutputStream(file));
  		
  	
  	//복사할단위
  	byte[]b=new byte[1024];
  	
  	int readbyte=0;
  	
  	while((readbyte=bin.read(b))!=-1)
  	{
  		bout.write(b,0,readbyte);
  	}
  	
  	System.out.println(src.getPath() + " → " + file.getPath());
  	}catch (IOException e) {
  		 e.printStackTrace();
  		 
  	
  	
  	}
  	finally {
			try {
				 if(bout != null) bout.close();
	        if(bin != null) bin.close();
			}catch (IOException e) {
        e.printStackTrace();
      }
		}
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
  }

}