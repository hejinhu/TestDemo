package com.test;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;

public class PostTest {
    public static void main(String[] args) throws IOException {

        // 实例化浏览器
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        // 实例化post请求
        HttpPost httpPost = new HttpPost("http://www.baidu.com");

        // post的参数
        ArrayList<BasicNameValuePair> parameters = new ArrayList<>();
        parameters.add(new BasicNameValuePair("123", "123"));

        //将参数丢进请求中
        httpPost.setEntity(new UrlEncodedFormEntity(parameters, "UTF-8"));

        // 提交请求
        CloseableHttpResponse response = httpClient.execute(httpPost);

        //获取请求实体
        HttpEntity entity = response.getEntity();

        //转换为String
        String result = EntityUtils.toString(entity,"UTF-8");
//        String content= EntityUtils.toString(entity, "UTF-8");

        //打印返回值
        System.out.println(result);

        //关闭response
        response.close();

        //关闭浏览器
        httpClient.close();
    }
}
