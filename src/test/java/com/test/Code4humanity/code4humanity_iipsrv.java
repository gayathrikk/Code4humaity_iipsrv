package com.test.Code4humanity;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class code4humanity_iipsrv {
	
	  
	  @Test(priority=1)
	  public void code4humanity_iipsrv()
	  {
	      
	      //Get brain viewer details
	      Response response2 = RestAssured.get("https://code4humanity.humanbrain.in/iipsrv/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/141/NISL/B_141_FB40-SL_15-ST_NISL-SE_43_compressed.jp2&WID=1024&GAM=1.4&MINMAX=1:0,255&MINMAX=2:0,255&MINMAX=3:0,255&JTL=0,0");
	      String url="https://code4humanity.humanbrain.in/iipsrv/fcgi-bin/iipsrv.fcgi?FIF=/data/storageIIT/humanbrain/analytics/141/NISL/B_141_FB40-SL_15-ST_NISL-SE_43_compressed.jp2&WID=1024&GAM=1.4&MINMAX=1:0,255&MINMAX=2:0,255&MINMAX=3:0,255&JTL=0,0";
	      System.out.println("iipsrv URL is : "+url);
	      int statusCode2 = response2.getStatusCode();
	      if (statusCode2 == 200) {
	          System.out.println("API request to the code4humanity iipsrv passed. Status code: " + statusCode2);
	      } else {
	          System.out.println("API request to the code4humanity iipsrv failed. Status code: " + statusCode2);
	      }
	      Assert.assertEquals(statusCode2, 200, "API request to the code4humanity iipsrv failed");
	      
	  }
}
