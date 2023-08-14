package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ex02_PublicData_Airplane_Schedule {

  /*
   * 한국공항공사_항공기 운항정보 - 국제선 운항 스케쥴
   * 1. 요청주소 : http://openapi.airport.co.kr/service/rest/FlightScheduleList/getIflightScheduleList
   * 2. 요청변수(Request Parameter)
   *    1) serviceKey      : 필수, 인코딩된 인증키
   *    2) pageNo          : 필수, 1
   *    3) schDate         : 선택, 검색일자(20151005)
   *    4) schDeptCityCode : 선택, 출발도시코드(GMP)
   *    5) schArrvCityCode : 선택, 도착도시코드(HND)
   */
  public static void ex01() {
  }
  
  /*
   * org.w3c.dom.Document : XML문서
   * org.w3c.dom.Node     : 구성요소(Element의 부모)
   * org.w3c.dom.Element  : 구성요소(Node의 자식)
   */
  public static void ex02() { //2번이 젤 중요
    
    try {
      
      // File
      File dir = new File("C:/storage");
      File file = new File(dir, "국제선운항스케쥴.xml");
      
      // Document
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      DocumentBuilder builder = factory.newDocumentBuilder();
      Document document = builder.parse(file);
      
      // root (최상위 요소)
      Element root = document.getDocumentElement();
      System.out.println(root.getNodeName());
      
      
      // root 자식노드들(<header><body>)
      NodeList nodes =root.getChildNodes();
      
      // root 1번째 자식 노
      Node header=nodes.item(0);
      System.out.println(header.getNodeName());
      
      // root 2번째 자식 노드
      Node body = nodes.item(1);
      System.out.println(body.getNodeName());
      
      //body의 자식노드들(<items>,<numOfRows>,<pageNo>,<totalCount>)
      NodeList bodyChild=body.getChildNodes();
      
      //body의 1번째 자식 노드
      Node items =bodyChild.item(0);
      System.out.println(items.getNodeName());
      for(int i=0;i<items.getChildNodes().getLength();i++)
      {
        Node item= items.getChildNodes().item(i);
        NodeList itemChild=item.getChildNodes();
        System.out.println("  "+item.getNodeName()+":");
        for(int j=0;j<itemChild.getLength();j++)
        {
          Node itemChildren=itemChild.item(j);
          System.out.println("    "+itemChildren.getNodeName()+":"+itemChildren.getTextContent());
        }
      }
      
      
      //body의 2번째 자식노드
      Node numOfRows=bodyChild.item(1); //<numOfRows>10</numOfRows>
      System.out.println(numOfRows.getNodeName());//numOfRows
      System.out.println(numOfRows.getTextContent());//10
      
      //body의 3번째 자식노드
      Node pageNo=bodyChild.item(2); //<pageNo>1</pageNo>
      System.out.println(pageNo.getNodeName());//pageNo
      System.out.println(pageNo.getTextContent());//1

      //body의 4번째 자식노드
      Node totalCount=bodyChild.item(3); //<totalCount>4</totalCount>
      System.out.println(totalCount.getNodeName());//totalCount
      System.out.println(totalCount.getTextContent());//4
    } catch (Exception e) {
      e.printStackTrace();
    }

  }
  
  /*
   * org.json.XML   : json 라이브러리에서 지원하는 XML 클래스(XML->JSON)
   */
  public static void ex03()
  {
    
    
    
    
    // File
    File dir = new File("C:/storage");
    File file = new File(dir, "국제선운항스케쥴.xml");
    
    try(BufferedReader reader =new BufferedReader(new FileReader(file))) {
      
     
      // XML
      JSONObject obj=XML.toJSONObject(reader);
      //                                                  
      //<response>                                response: {
      //  <body>                                    body: {
      //    <items>                                   items : {
      //      <item>...</item>                            item: [{},{},{},{}]
      //      <item>...</item>                          
      //      <item>...</item>                            
      //      <item>...</item>                            
      //                                                  
      JSONArray items=obj.getJSONObject("response")
                          .getJSONObject("body")    
                          .getJSONObject("items")
                          .getJSONArray("item");
      
      for(int i=0;i<items.length();i++)
      {
        
        //JSONOject obj2=items.getJSONObject(i);
        //Map<String, Object>item =obj2.toMap()
        Map<String, Object> item=items.getJSONObject(i).toMap();
        
        for(Entry<String, Object>entry:item.entrySet()) {
          System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
        
      }
    }
    
    catch (Exception e) {
      e.printStackTrace();
    
    }finally {
      
      try {
        
      } catch (Exception e) { 
        e.printStackTrace();
      
      }
    }
  }
  
  
  public static void main(String[] args) {
//    ex01();
  //  ex02();
    ex03();
  }

}