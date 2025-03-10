package org.example.DesignPatterns.Factory;

public class PlatformFactory {
    //Simple/Practical Factory
    static Platform getPlatform(String platformName){
        if(platformName == "Android"){
            return new Android();
        } else if (platformName == "IOS") {
            return new IOS();
        }
        return null;
    }
}
