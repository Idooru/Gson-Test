import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new Gson();

        // Json Key, value 추가
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", "Idooru");
        jsonObject.addProperty("email", "shere1765@gmail.com");

        System.out.println(jsonObject);

        // JsonObject를 Json 문자열로 변환
        String jsonStr = gson.toJson(jsonObject);

        System.out.println(jsonStr);
    }
}

// 출처 : https://hianna.tistory.com/629
