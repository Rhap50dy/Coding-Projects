package com.fire;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        RandomBrightnessGenerator brightnessGenerator = new RandomBrightnessGenerator();
        RandomColorGenerator colorGenerator = new RandomColorGenerator();
        counter ++;
        
        while(true) {
            int randomColor = colorGenerator.randomColorNumber();
            int randomBrightness = brightnessGenerator.randomBrightnessNumber();
            
            if (counter == 20) {
                counter = 0;
                if(randomColor == 1) {
                    System.out.println("System.setcolor(255, 0, 0);");
                } else if(randomColor == 2) {
                    System.out.println("System.setcolor(255, 90, 0);");
                } else if(randomColor == 3) {
                    System.out.println("System.setcolor(255, 232, 8);");
                } else {
                    System.out.println("System.setcolor(170, 66, 3);");
                }
            }

            if(randomBrightness == 1) {
                System.out.println("System.setbrightness(255);");                 
            } else {
                System.out.println("System.setbrightness(190)");
            }

            try {
                Thread.sleep(25);
            } catch (InterruptedException exception) {
                break;
            }
        }
    }
}
