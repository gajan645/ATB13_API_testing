package ex_07_payload_mangament.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class APITesting_Complex_json {

    //{
    //  "fruits": [
    //    {
    //      "name": "Apple",
    //      "color": "#FF0000",
    //      "details": {
    //        "type": "Pome",
    //        "season": "Fall"
    //      },
    //      "nutrients": {
    //        "calories": 52,
    //        "fiber": "2.4g",
    //        "vitaminC": "4.6mg"
    //      }
    //    },
    //  ]

    public static void main(String[] args) {
        Map<String,Object> payload = new LinkedHashMap<>();

        List<LinkedHashMap<String,Object>>fruits = new ArrayList<>();
        LinkedHashMap<String,Object>apple = new LinkedHashMap<>();
        apple.put("name","Apple");
        apple.put("Color","#FF000");


        LinkedHashMap<String,Object>appleDetails = new LinkedHashMap<>();
        appleDetails.put("type","pome");
        appleDetails.put("season","Fall");
        apple.put("details","appleDetails");

        LinkedHashMap<String,Object>applenutrients= new LinkedHashMap<>();
        applenutrients.put("calories",52);
        applenutrients.put("fiber","2.4g");
        applenutrients.put("vitaminC","4.6mg");
        apple.put("nutrients","applenutrients");

        fruits.add(apple);

        //Banana

// Banana
        LinkedHashMap<String, Object> banana = new LinkedHashMap<>();
        banana.put("name", "Banana");
        banana.put("color", "#FFFF00");

        LinkedHashMap<String, String> bananaDetails = new LinkedHashMap<>();
        bananaDetails.put("type", "Berry");
        bananaDetails.put("season", "Year-round");
        banana.put("details", bananaDetails);

        LinkedHashMap<String, Object> bananaNutrients = new LinkedHashMap<>();
        bananaNutrients.put("calories", 89);
        bananaNutrients.put("fiber", "2.6g");
        bananaNutrients.put("potassium", "358mg");
        banana.put("nutrients", bananaNutrients);

        fruits.add(banana);

//        LinkedHashMap<String,Object> orange = new LinkedHashMap<>();
//        LinkedHashMap<String,Object> orangeDetails = new LinkedHashMap<>();
//        LinkedHashMap<String, Object> orangeNutrients = new LinkedHashMap<>();

        payload.put("fruits",fruits);
        System.out.println(payload);


    }



    }



