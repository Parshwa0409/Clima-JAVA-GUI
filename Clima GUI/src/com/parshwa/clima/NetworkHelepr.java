package com.parshwa.clima;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import org.json.*;

class CityNetworkHelepr
{
    final static String apiEndPoint = "https://api.openweathermap.org/data/2.5/weather";
    final static String apiKey  ="6ce908baa2bb87ee92925abf03a1859f";
    
    public static void main(String[] args) {
        try 
        {
            CityNetworkHelepr.decodeCityData("Koppal");
        } 
        catch (Exception ex) {
        }
    }
    
    
    public static String getCityWeatherData(String cityName) throws Exception
    {
        cityName = cityName.replaceAll(" ", "+");
        String url =apiEndPoint+"?q="+cityName+"&appid="+apiKey+"&units=metric";
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpResponse jsonResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
        //System.out.println(jsonResponse.body());
       
        return jsonResponse.statusCode()==200?jsonResponse.body().toString():"DNF";//data not found
        
    }
    
    public static ClimaData decodeCityData(String cityName) throws Exception
    {
        ClimaData dataFields = new ClimaData();
        
        String strResponse = CityNetworkHelepr.getCityWeatherData(cityName);
        
        //while debugging to know what is the response!!!
        //System.out.println(strResponse);
        
        if(strResponse.equalsIgnoreCase("DNF"))
        {
            // TODO : SHOW MSG INVALID or ERROR OCCURED
            JOptionPane.showMessageDialog(null,"UNABLE TO FETCH DATA !!!\nSome Pausible Causes : \n1) Network Issue\n2)Wrong City Name Entered\n3)Sever Not Available", "E R R O R - Data Fot Found ", JOptionPane.ERROR_MESSAGE);
            return  null;
        }
        else
        {
            JSONObject fullData = new JSONObject(strResponse);
            //get temperature,pressure,humidity
            JSONObject main = fullData.getJSONObject("main");
            double temp = main.getDouble("temp");
            dataFields.temp=temp;
            
            int pressure = main.getInt("pressure");
            dataFields.pressure=pressure;
            
            int humidity =main.getInt("humidity");
            dataFields.humidity=humidity;
            
            //get wind speed
            JSONObject wind =fullData.getJSONObject("wind");
            double speed = wind.getDouble("speed");
            dataFields.speed=speed;
            
            //get weather description
            JSONArray weather = fullData.getJSONArray("weather");
            JSONObject weatherData = weather.getJSONObject(0);
            String description = weatherData.getString("description");
            dataFields.description=description;
            
            //get city name
            String name = fullData.getString("name");
            dataFields.name=name;
            
            //get coordinates
            JSONObject coord = fullData.getJSONObject("coord");
            double lat = coord.getDouble("lat");
            dataFields.lat=lat;
            double lon = coord.getDouble("lon");
            dataFields.lon=lon;
            
            return dataFields;

            //dataFields.display(); 
        }
    }
    
    public void getCurrentData()
    {
        
    }
}

