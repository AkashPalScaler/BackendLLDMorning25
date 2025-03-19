package org.example.DesignPatterns.Strategy;
import org.example.DesignPatterns.Strategy.Strategies.BikePathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.CarPathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.WalkPathCalculatorStrategy;
import org.example.DesignPatterns.Strategy.Strategies.iCalculatePathStrategy;

public class GoogleMap {
    iCalculatePathStrategy icp;
    void findPath(TravelMode travelMode){
        iCalculatePathStrategy icp = PathCalculatorStrategyFactory.getStrategy(travelMode);
        icp.calculatePath();
    }
}
