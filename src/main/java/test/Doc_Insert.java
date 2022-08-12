package test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpHost;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;


import java.io.IOException;

public class Doc_Insert {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );
        IndexRequest request = new IndexRequest();
        request.index("user").id("1001");
        user user=new user();
        user.setName("李四zssxg");
        user.setName("王五");
        user.setAge(16);
        user.setSex("男");

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(user);

        request.source(s, XContentType.JSON);
        IndexResponse indexResponse = client.index(request, RequestOptions.DEFAULT);
        System.out.println(indexResponse);

        client.close();
    }
}
