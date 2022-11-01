/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predict.something;



import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 *
 * @author ADITYA
 */
public class PredictTemp {


    static  String dataJsonString="";
    static List<String> temp=new ArrayList<>();
    static List<String> speedList=new ArrayList<>();
    static List<String> humidity=new ArrayList<>();
    static List<String> date=new ArrayList<>();
    
public static void main(String args[])
    {
        requestAPI();
    }
    
    public static BundleClass requestAPI()
    {
        
        try{
        URL urlLink=new URL ("http://api.openweathermap.org/data/2.5/forecast/daily?lat=28.7041&lon=77.1025&cnt=10&appid=aabd7edd6ed65a8eb1c5cfd90fbec64d");
            URLConnection yc =urlLink.openConnection();
            BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            {   System.out.println(inputLine);
            dataJsonString+=inputLine;
            }
        in.close();
        return jsonAnalysis(dataJsonString);

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
    private static BundleClass jsonAnalysis(String jsonString)
    {
        try {
                JSONObject jsonObject = new JSONObject(jsonString);

            //List all = new ArrayList();
                JSONArray listArrayData = jsonObject.getJSONArray("list");
 
			for (int i = 0; i < 5; i++) {
//SETTING LIST OBJECT
                JSONObject listData = listArrayData.getJSONObject(i);

//TEMP
                JSONObject tempData = new JSONObject(listData.getString("temp"));

                double temp_min = Double.parseDouble(tempData.getString("min"));
                int min = (int) (temp_min - 273);
                double temp_max = Double.parseDouble(tempData.getString("max"));
                int max = (int) (temp_max - 273);
//DATE

//TRY MMM dd yyyy HH:MM:ss
                String dateData = listData.getString("dt");
                long date1 = Long.parseLong(dateData);
                date1 = date1 * 1000L;
                //long d=1486477092*1000L;
                Date dateType = new Date(date1); // your date
                SimpleDateFormat formatter = new SimpleDateFormat("dd MMM");
                String date2 = formatter.format(dateType);
//                System.out.println("Date"+date2);
//				System.out.println("Temp"+((max+min)/2));
                                date.add(date2);
                                temp.add((max)+"");
//WIND
            double speed = Double.parseDouble(listData.getString("speed"));
            double deg = Double.parseDouble(listData.getString("deg"));
//            System.out.println("Speed"+speed);
            
//HUMIDITY
            int humidityData = listData.optInt("humidity");
//            System.out.println("Humidity"+humidityData);
			//MainActivity.humidityTextView.setText(String.valueOf(humidityData) + "%");
			speedList.add(speed+"");
                        humidity.add(humidityData+"");
                    }
                    BundleClass bundleClass=new BundleClass(temp,speedList,humidity,date);
                        return bundleClass;
		//END OF FOR
       	}//END OF TRY 
		catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


//        try {
//JSONObject jsonObject = new JSONObject(result);
//
//            //List all = new ArrayList();
//            JSONArray listArrayData = jsonObject.getJSONArray("list");
// 
//			for (i = 0; i < 5; i++) {
////SETTING LIST OBJECT
//                JSONObject listData = listArrayData.getJSONObject(i);
//
////TEMP
//                JSONObject tempData = new JSONObject(listData.getString("temp"));
//
//                double temp_min = Double.parseDouble(tempData.getString("min"));
//                int min = (int) (temp_min - 273);
//                double temp_max = Double.parseDouble(tempData.getString("max"));
//                int max = (int) (temp_max - 273);
////DATE
//
////TRY MMM dd yyyy HH:MM:ss
//                String dateData = listData.getString("dt");
//                long date1 = Long.parseLong(dateData);
//                date1 = date1 * 1000L;
//                //long d=1486477092*1000L;
//                Date date = new Date(date1); // your date
//                SimpleDateFormat formatter = new SimpleDateFormat("dd MMM");
//                String date2 = formatter.format(date);
//				
////WIND
//            double speed = Double.parseDouble(listData.getString("speed"));
//            double deg = Double.parseDouble(listData.getString("deg"));
//            this.setDirection(deg, speed);				
//
////HUMIDITY
//            int humidityData = listData.optInt("humidity");
//            
//			//MainActivity.humidityTextView.setText(String.valueOf(humidityData) + "%");
//			
//		}//END OF FOR
//       	}//END OF TRY 
//		catch (Exception e) {
//            e.printStackTrace();
//        }
//	}//END ON POST EXECUTE	
////FUNCTION TO SET DIRECTION OF WIND
//    void setDirection(double deg, double speed) {
//        if (deg > 337.50 && deg <= 22.50) {
//            //MainActivity.windTextView.setText("N at " + speed);
//        } else if (deg > 22.50 && deg <= 67.50) {
//            //MainActivity.windTextView.setText("NE at " + speed);
//        } else if (deg > 67.50 && deg <= 112.50) {
//            //MainActivity.windTextView.setText("E at " + speed);
//        } else if (deg > 112.50 && deg <= 157.50) {
//            //MainActivity.windTextView.setText("SE at " + speed);
//        } else if (deg > 157.50 && deg <= 202.50) {
//            //MainActivity.windTextView.setText("S at " + speed);
//        } else if (deg > 202.50 && deg <= 247.50) {
//            //MainActivity.windTextView.setText("SW at " + speed);
//        } else if (deg > 247.50 && deg <= 292.50) {
//            //MainActivity.windTextView.setText("W at " + speed);
//        } else if (deg > 292.50 && deg <= 337.50) {
//            //MainActivity.windTextView.setText("NW at " + speed);
//        }
//
//    }
//}