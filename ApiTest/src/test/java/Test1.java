import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Test1 {

    @Test
    public void getClients(){
        // gets all client list
        RestAssured.when().get("http://generator.swagger.io/api/gen/clients").then().statusCode(200);
    }
    @Test
    public void getClientsByLanguage(){
        // gets clients for specific language
        RestAssured.when().get("http://generator.swagger.io/api/gen/clients/csharp").then().statusCode(200);
        RestAssured.when().get("http://generator.swagger.io/api/gen/clients/nonExisting").then().statusCode(400);
    }
    @Test
    public void postClient(){
        // sends basic json and create Client for given language
        // should generate 400 error code when empty data is sent
        String postData= "{\n" +
                "  \"options\":  {},\n" +
                "  \"swaggerUrl\": \"https://petstore.swagger.io/v2/swagger.json\"\n" +
                "}";
        RestAssured.given().contentType(ContentType.JSON).body(postData).post("https://generator.swagger.io/api/gen/clients/csharp")
                        .then().statusCode(200);
        String errPostData= "{}";
        RestAssured.given().contentType(ContentType.JSON).body(errPostData).post("https://generator.swagger.io/api/gen/clients/csharp")
                .then().statusCode(400);
    }

    private String getFileId(){
        // gets generated code for client creation
        String postData= "{\n" +
                "  \"options\":  {},\n" +
                "  \"swaggerUrl\": \"https://petstore.swagger.io/v2/swagger.json\"\n" +
                "}";
        RestAssured.baseURI= "https://generator.swagger.io/api/gen/clients/csharp";
        RequestSpecification httpRequest=RestAssured.given();
        Response response = httpRequest.contentType(ContentType.JSON).body(postData).post("https://generator.swagger.io/api/gen/clients/csharp");
        ResponseBody body = response.getBody();
        String bodyStr = body.asString();
        ObjectMapper mapper = new ObjectMapper();
        try{
            PostResponse flightList = mapper.readValue(bodyStr, PostResponse.class);
            return flightList.code;
        }
        catch (Exception e){
            throw new RuntimeException();
        }

    }
    @Test
    public void getDownloadFileId(){
        // gets a download link for a client, the client code is taken from the post method
        RestAssured.when().get("http://generator.swagger.io/api/gen/download/"+getFileId()).then().statusCode(200);
        RestAssured.when().get("http://generator.swagger.io/api/gen/download/nonExisting").then().statusCode(500);
    }

}
