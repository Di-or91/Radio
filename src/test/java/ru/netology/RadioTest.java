package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void ShouldSetNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(4);
        int expected = 4;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNextNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(7);
        radio.nextStation();
        int expected = 8;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldNextNumberStationAfterMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNumberBelowStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-5);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldPrevNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(7);
        radio.prevStation();
        int expected = 6;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldPrevBeforeMinNumberStation() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(10);
        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setСurrentVolume(35);
        radio.increaseVolume();
        int expected = 36;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio radio = new Radio();
        radio.setСurrentVolume(35);
        radio.reductionVolume();
        int expected = 34;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetToMaxVol() {
        Radio radio = new Radio();
        radio.setСurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVol() {
        Radio radio = new Radio();
        radio.setСurrentVolume(0);
        radio.reductionVolume();
        int expected = 0;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setСurrentVolume(101);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setСurrentVolume(-1);

        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getСurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
