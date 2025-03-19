package org.example.DesignPatterns.Strategy;
import org.example.DesignPatterns.Strategy.Strategies.BikePathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.CarPathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.WalkPathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.iCalculatePathStrategy;
public class PathCalculatorStrategyFactory {
    static iCalculatePathStrategy getStrategy(TravelMode travelMode){
        iCalculatePathStrategy icp = null;
        if(travelMode == TravelMode.CAR){
            icp = new CarPathCalculatorStrategy();
        } else if (travelMode == TravelMode.BIKE) {
            icp = new BikePathCalculatorStrategy();
        } else if (travelMode == TravelMode.WALK) {
            icp = new WalkPathCalculatorStrategy();
        } else{
            System.out.println("Invalid Mode");
        }
        return icp;
    }
}
