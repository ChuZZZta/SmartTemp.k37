package org.example;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Main {
  public static void main(String[] args) {
      while (true){






          mock();
      }
  }

  private List<JSONObject> getSensorJSONs() {
    ResourceBundle rb = ResourceBundle.getBundle("config");
    var urlSensorList = Arrays.asList(rb.getString("temperature").split(","));

    var jsonObjectList = new LinkedList<JSONObject>();

    urlSensorList.forEach(
        url -> {
          JSONObject json = null;
          try {
            json = new JSONObject(IOUtils.toString(new URL(url), StandardCharsets.UTF_8));
          } catch (Exception e) {
            System.out.println("Url {} failed to fetch"); // TODO add url message format
          }
          if (Objects.nonNull(json)) {
            jsonObjectList.add(json);
          }
        });

    return jsonObjectList;
  }

  private static void mock(){
      System.out.println("xd");
      try {
          Thread.sleep(1000);
      }catch(Exception e){}
  }
}
