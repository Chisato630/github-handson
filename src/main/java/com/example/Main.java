package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> carSalesRanking = new ArrayList<>();

        carSalesRanking.add(new Car("TOYOTA" ,1500000));
        carSalesRanking.add(new Car("NISSAN"  ,270000));
        carSalesRanking.add(new Car("HONDA"  ,250000));
        carSalesRanking.add(new Car("MAZDA"  ,140000));
        carSalesRanking.add(new Car("LEXUS",90000));

        //ランキングの付与
        Collections.sort(carSalesRanking, Comparator.comparingInt(Car::getSales).reversed());
        for(int i = 0; i < carSalesRanking.size(); i++){
            carSalesRanking.get(i).setRanking(i + 1);
        }

        //ランキングの表示
        System.out.println("2023年自動車メーカー乗用車販売ランキング");

        int rank = 1;
        for (Car car : carSalesRanking) {
            System.out.println(car);
        }

        //メーカー名を入力
        Scanner scanner = new Scanner(System.in);
        System.out.println("ランキングを確認したい自動車メーカーを半角英字で入力してください");
        String userInput = scanner.nextLine();

        Optional<Car> selectedCar = carSalesRanking.stream()
                .filter(car -> car.getManufacturer().equalsIgnoreCase(userInput))
                .findFirst();
        if(selectedCar.isPresent()) {
            System.out.println(userInput + "のランキング : No." + selectedCar.get().getRanking() );
        }else{
            System.out.println(userInput + "はNo.5以下でした ");
        }
    }
}
