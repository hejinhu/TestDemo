package test;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost("https://kubaogao.com");


        List<BasicNameValuePair> parameters=new ArrayList<>();

        parameters.add(new BasicNameValuePair("mypassword","2F9B9DE327499891E9DDDA25B5874286947A97117EFC8B2DC6CF6963703EF679"));
        parameters.add(new BasicNameValuePair("phoneNumber2","15902793376"));
        parameters.add(new BasicNameValuePair("sys_requestType","ajax"));


        httpPost.setEntity(new UrlEncodedFormEntity(parameters));

        CloseableHttpResponse response = httpClient.execute(httpPost);

        HttpEntity httpEntity = response.getEntity();

        String result = EntityUtils.toString(httpEntity,"UTF-8");
        System.out.println(result);

        response.close();
        httpClient.close();


    }
}
