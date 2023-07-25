package ru.netology;
public class Radio {
    private int CurrentStationNumber;

    private int CurrentVolume;

    public void nextStation() {
        if (CurrentStationNumber < 9) {
            CurrentStationNumber= CurrentStationNumber + 1;
        } else {
            CurrentStationNumber = 0;
        }
    }

    public void prevStation() {
        if (CurrentStationNumber > 0) {
            CurrentStationNumber = CurrentStationNumber - 1;
        } else {
            CurrentStationNumber = 9;
        }
    }

    public int getCurrentStationNumber() {
        return CurrentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < 0) {
            return;
        }
        if (currentStationNumber > 9) {
            return;
        }
        CurrentStationNumber = currentStationNumber;
    }

    public int getCurrentVolume() {
        return CurrentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        CurrentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (CurrentVolume < 100) {
            CurrentVolume = CurrentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (CurrentVolume > 0) {
            CurrentVolume = CurrentVolume - 1;
        }
    }
}
