package test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;

import java.io.IOException;

public class Create_Index {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );
        CreateIndexRequest request = new CreateIndexRequest("user");
        CreateIndexResponse response = esClient.indices().create(request, RequestOptions.DEFAULT);
        boolean responseAcknowledged = response.isAcknowledged();
        System.out.println(responseAcknowledged);
        CreateIndexRequest request1 = new CreateIndexRequest("user1");
        CreateIndexResponse response1 = esClient.indices().create(request1, RequestOptions.DEFAULT);
        boolean responseAcknowledged1 = response1.isAcknowledged();
        System.out.println(responseAcknowledged1);
        esClient.close();
    }
}
