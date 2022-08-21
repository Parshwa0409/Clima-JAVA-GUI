package com.parshwa.clima;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import org.json.*;


public class LocNetworkHelper 
{
    HttpClient client;
    HttpRequest request;
    String ipAddr;
    Double lat,lon;
    JSONObject weatherDataJSON=null;
    
    public void getIP_Addr()
    {
        JSONObject ipCallJSON=null;
        try 
        {
            String ipCallUrl = "https://api.ipify.org/?format=json";
            client = HttpClient.newBuilder().build();
            request = HttpRequest.newBuilder().GET().uri(URI.create(ipCallUrl)).build();
            HttpResponse ipCallResponse = client.send(request, HttpResponse.BodyHandlers.ofString()); 
            
            if(ipCallResponse.statusCode()==200)
            {
                ipCallJSON = new JSONObject(ipCallResponse.body().toString());
                ipAddr = ipCallJSON.getString("ip");
                //debug : System.out.println("ip : "+ipAddr);
            }
            else
            {
                ipAddr="E404";
            }
        } 
        catch (Exception e) 
        {
            //place error name or cade name to every method to know where the error occured
            System.out.println("ipCallMethodError");
            System.out.println(e.getMessage());
        }
    }
    
    public void trackIP_Addr()
    {
        JSONObject ipTrackedJSON=null;
        String loc=null;
        if(!((this.ipAddr).equalsIgnoreCase("E404")))
        {
            try 
            {
                String ipTrackUrl = "https://ipinfo.io/"+this.ipAddr+"/geo";
                client = HttpClient.newBuilder().build();
                request = HttpRequest.newBuilder().GET().uri(URI.create(ipTrackUrl)).build();
                HttpResponse ipTrackedResponse = client.send(request, HttpResponse.BodyHandlers.ofString()); 
            
                if(ipTrackedResponse.statusCode()==200)
                {
                    ipTrackedJSON = new JSONObject(ipTrackedResponse.body().toString());
                    loc = ipTrackedJSON.getString("loc");
                    String [] locSplit = loc.split(",");
                    lat = Double.valueOf(locSplit[0]);
                    lon = Double.valueOf(locSplit[1]);
                    //debug : System.out.println("Latitude : "+lat+"\nLongitude : "+lon);
                }
                else
                {
                    lon = lat = 0.0d;
                }
            } 
            catch (Exception e) 
            {
                System.out.println("ipTrackMethodError");
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void getLocationWeatherData()
    {
        
        boolean ipAddrFound = !((this.ipAddr).equalsIgnoreCase("E404"));
        boolean locFound = !(lat.equals(0.0) && lon.equals(0.0));
        if(ipAddrFound && locFound)
        {
            try 
            {
                String weatherUrl = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid=6ce908baa2bb87ee92925abf03a1859f";
                client = HttpClient.newBuilder().build();
                request = HttpRequest.newBuilder().GET().uri(URI.create(weatherUrl)).build();
                HttpResponse weatherResponse = client.send(request, HttpResponse.BodyHandlers.ofString()); 
            
                if(weatherResponse.statusCode()==200)
                {
                    weatherDataJSON = new JSONObject(weatherResponse.body().toString());
                    //debug : System.out.println("Weather Data : "+weatherResponse.body().toString());
                }
                else
                {
                    weatherDataJSON = null;
                }
            } 
            catch (Exception e) 
            {
                System.out.println("GetWeatherDataMethodError");
                System.out.println(e.getMessage());
            }
        }
    }
    
    
    public ClimaData decodeData()
    {
        
        ClimaData dataFields = new ClimaData();
        try 
        {
            if(weatherDataJSON != null)
            {
                
                JSONObject fullData = this.weatherDataJSON;
                JSONObject main = fullData.getJSONObject("main");
                
                double temp = main.getDouble("temp");
                dataFields.temp=temp;
            
                int pressure = main.getInt("pressure");
                dataFields.pressure=pressure;
            
                int humidity =main.getInt("humidity");
                dataFields.humidity=humidity;
                
                JSONObject wind =fullData.getJSONObject("wind");
                double speed = wind.getDouble("speed");
                dataFields.speed=speed;
                
                JSONArray weather = fullData.getJSONArray("weather");
                JSONObject weatherData = weather.getJSONObject(0);
                String description = weatherData.getString("description");
                dataFields.description=description;
                
                String name = fullData.getString("name");
                dataFields.name=name;
                
                JSONObject coord = fullData.getJSONObject("coord");
                double lat = coord.getDouble("lat");
                dataFields.lat=lat;
                double lon = coord.getDouble("lon");
                dataFields.lon=lon;
                
                //debug : dataFields.display();
            }
            else
            {
            JOptionPane.showMessageDialog(null,"UNABLE TO FETCH DATA !!!\nSome Pausible Causes : \n1) Network Issue\n2)Sever Not Available", "E R R O R - Data Fot Found ", JOptionPane.ERROR_MESSAGE);
            dataFields = null;
            }
        } 
        catch (Exception e) 
        {
            System.out.println("DecodelMethodError");
            System.out.println(e.getMessage());
        }
       return dataFields;
    }
    
    
    public static void main(String[] args) 
    {
        LocNetworkHelper t = new LocNetworkHelper();
        t.getIP_Addr();
        t.trackIP_Addr();
        t.getLocationWeatherData();
        ClimaData dd = new ClimaData();
        dd = t.decodeData();
        dd.display();
    }
    
}