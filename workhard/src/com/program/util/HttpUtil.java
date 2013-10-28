package com.program.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
	//����BASE_URL����
	public static final String BASE_URL="http://192.168.1.1:8080/WirelessOrder_Server/";
	//ͨ��url���HttpGet����
	public static HttpGet getHttpGet(String url){
		//ʵ����HttpGet
		HttpGet request = new HttpGet(url);
		return request;
	}
	//ͨ��url���HttpPost
	public static HttpPost getHttpPost(String url){
		//ʵ����HttpPost
		HttpPost request=new HttpPost(url);
		return request;
	}
	//ͨ��HttpGet ��� HttpResponse����
	public static HttpResponse getHttpResponse(HttpGet request) throws ClientProtocolException,IOException{
		//ʵ����HttpResponse����
		HttpResponse response= new DefaultHttpClient().execute(request);
		return response;
	}
	//ͨ��HttpPost ��� HttpResponse����
	public static HttpResponse getHttpResponse(HttpPost request)throws ClientProtocolException,IOException{
		//ʵ����HttpResponse����
		HttpResponse response= new DefaultHttpClient().execute(request);
		return response;
	}
	//ͨ��url����Post���󣬷���������
	public static String queryStringForPost(String url){
		HttpPost request = HttpUtil.getHttpPost(url);
		String result = null;
		try{
			HttpResponse response = HttpUtil.getHttpResponse(request);
			if(response.getStatusLine().getStatusCode()==200){
				result = EntityUtils.toString(response.getEntity());
				return result;
			}
		}catch (ClientProtocolException e){
			e.printStackTrace();
			result = "�����쳣��";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "�����쳣��";
			return result;
		}
		return null;
	}
	//ͨ��HttpPost����get���󣬷���������
	public static String queryStringForGet(String url){
		HttpGet request = HttpUtil.getHttpGet(url);
		String result = null;
		try{
			HttpResponse response = HttpUtil.getHttpResponse(request);
			if(response.getStatusLine().getStatusCode()==200){
				result = EntityUtils.toString(response.getEntity());
				return result;
			}
		}catch (ClientProtocolException e){
			e.printStackTrace();
			result = "�����쳣��";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "�����쳣��";
			return result;
		}
		return null;
	}
	public static String queryStringForPost(HttpPost request){
		String result = null;
		try{
			HttpResponse response = HttpUtil.getHttpResponse(request);
			if(response.getStatusLine().getStatusCode()==200){
				result = EntityUtils.toString(response.getEntity());
				return result;
			}
		}catch (ClientProtocolException e){
			e.printStackTrace();
			result = "�����쳣��";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "�����쳣��";
			return result;
		}
		return null;
	}
}
