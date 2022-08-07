package test;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.elasticsearch.client.indices.GetIndexRequest;
import org.elasticsearch.client.indices.GetIndexResponse;

import java.io.IOException;

public class Search_Index {
    public static void main(String[] args) throws IOException {
        RestHighLevelClient esClient = new RestHighLevelClient(
                RestClient.builder(new HttpHost("localhost",9200,"http"))
        );


        GetIndexRequest getIndexRequest = new GetIndexRequest("user");

        GetIndexResponse response = esClient.indices().get(getIndexRequest,RequestOptions.DEFAULT);
        System.out.println(response.getMappings());
        System.out.println(response.getMappings());
        esClient.close();
    }
}
