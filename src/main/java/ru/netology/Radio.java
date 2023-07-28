package ru.netology;
public class Radio {
    private int currentStationNumber;

    private int currentVolume;

    public void nextStation() {
        if (currentStationNumber < 9) {
            currentStationNumber= currentStationNumber + 1;
        } else {
            currentStationNumber = 0;
        }
    }

    public void prevStation() {
        if (currentStationNumber > 0) {
            currentStationNumber = currentStationNumber - 1;
        } else {
            currentStationNumber = 9;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int newCurrentStationNumber) {
        if (newCurrentStationNumber < 0) {
            return;
        }
        if (newCurrentStationNumber > 9) {
            return;
        }
        currentStationNumber = newCurrentStationNumber;
    }

    public int getСurrentVolume() {
        return currentVolume;
    }

    public void setСurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume= newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
