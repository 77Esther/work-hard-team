package com.program.util;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
	//声明BASE_URL常量
	public static final String BASE_URL="http://192.168.1.1:8080/WirelessOrder_Server/";
	//通过url获得HttpGet对象
	public static HttpGet getHttpGet(String url){
		//实例化HttpGet
		HttpGet request = new HttpGet(url);
		return request;
	}
	//通过url获得HttpPost
	public static HttpPost getHttpPost(String url){
		//实例化HttpPost
		HttpPost request=new HttpPost(url);
		return request;
	}
	//通过HttpGet 获得 HttpResponse对象
	public static HttpResponse getHttpResponse(HttpGet request) throws ClientProtocolException,IOException{
		//实例化HttpResponse对象
		HttpResponse response= new DefaultHttpClient().execute(request);
		return response;
	}
	//通过HttpPost 获得 HttpResponse对象
	public static HttpResponse getHttpResponse(HttpPost request)throws ClientProtocolException,IOException{
		//实例化HttpResponse对象
		HttpResponse response= new DefaultHttpClient().execute(request);
		return response;
	}
	//通过url发送Post请求，返回请求结果
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
			result = "网络异常！";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "网络异常！";
			return result;
		}
		return null;
	}
	//通过HttpPost发送get请求，返回请求结果
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
			result = "网络异常！";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "网络异常！";
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
			result = "网络异常！";
			return result;
		}catch (IOException e){
			e.printStackTrace();
			result= "网络异常！";
			return result;
		}
		return null;
	}
}
