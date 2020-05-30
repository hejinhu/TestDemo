package test;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetTest {
    public static void main(String[] args) throws IOException {
        // 创建对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建httpget对象
        HttpGet httpget = new HttpGet("https://baidu.com");

        // 使用httpget发送请求
        CloseableHttpResponse response = httpClient.execute(httpget);

        // 解析响应
        if (response.getStatusLine().getStatusCode() == 200) {
            String content= EntityUtils.toString(response.getEntity(), "UTF-8");
            System.out.println(content);
        }

        //关闭response
        response.close();

        //关闭浏览器
        httpClient.close();
    }
}
