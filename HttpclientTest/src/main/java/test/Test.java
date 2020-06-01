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

        HttpPost httpPost = new HttpPost("http://59.49.55.181:8888/sxbpe/system/login!login.action");


        List<BasicNameValuePair> parameters=new ArrayList<>();

        parameters.add(new BasicNameValuePair("userCode","system_tjy"));
        parameters.add(new BasicNameValuePair("userPWD","qw123456!"));
        parameters.add(new BasicNameValuePair("userType","0"));
        parameters.add(new BasicNameValuePair("isRememberUser","yes"));


        httpPost.setEntity(new UrlEncodedFormEntity(parameters));

        CloseableHttpResponse response = httpClient.execute(httpPost);

        HttpEntity httpEntity = response.getEntity();

        String result = EntityUtils.toString(httpEntity,"UTF-8");
        System.out.println(result);

        response.close();
        httpClient.close();


    }
}
