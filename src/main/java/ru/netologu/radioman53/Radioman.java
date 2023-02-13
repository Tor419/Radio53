package ru.netologu.radioman53;

public class Radioman {
    private int currentStation;
    private int minStation = 0;
    private int maxStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int stationsCont;

    public Radioman(int stationsCont) {
        this.maxStation = stationsCont - 1;
    }

    public Radioman() {
        this.maxStation = 9;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation || currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (maxStation != currentStation) {
            currentStation++;
        } else currentStation = minStation;
    }

    public void previousStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else currentStation = maxStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume || currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
