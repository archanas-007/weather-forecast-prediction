/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package predict.something;

import java.util.List;

/**
 *
 * @author ADITYA
 */
public class BundleClass {
    public List<String> temp, speed, humidity,date;

    public BundleClass(List<String> temp, List<String> speed, List<String> humidity, List<String> date )
    {
        this.temp=temp;
        this.speed=speed;
        this.humidity=humidity;
        this.date=date;
    }
    
    public List getTemp()
    {
        return temp;
    }
    
    public List getSpeed()
    {
        return speed;
    }
    public List getHumidity()
    {
        return humidity;
    }
    public List getDate()
    {
        return date;
    }
    
}
