package ru.netology.radio;

public class Radio {
    private int startRadioStationNumber = 0;
    private int finishRadioStationNumber = 9;
    private int currentRadioStationNumber = startRadioStationNumber;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int size) {
        finishRadioStationNumber = size - 1;
    }

    public Radio() {
    };

    public int getStartRadioStationNumber() {
        return startRadioStationNumber;
    }

    public int getFinishRadioStationNumber() {
        return finishRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newStationNumber) {

        if (newStationNumber > finishRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newStationNumber;
    }

    public int nextStation() {
        currentRadioStationNumber = currentRadioStationNumber + 1;
        if (currentRadioStationNumber > finishRadioStationNumber) {
            return startRadioStationNumber;
        }
        return currentRadioStationNumber;
    }

    public int prevStation() {
        currentRadioStationNumber = currentRadioStationNumber - 1;
        if (currentRadioStationNumber < startRadioStationNumber) {
            return finishRadioStationNumber;
        }
        return currentRadioStationNumber;
    }
    
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public int decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }
}
