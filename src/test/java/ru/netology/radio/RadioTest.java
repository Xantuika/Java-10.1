package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio radio = new Radio(10, 0);

    @Test
    public void setMinStationTest() {
        radio.setMinStation(0);
        assertEquals(0, radio.getMinStation());
    }

    @Test
    public void setMaxStationTest() {
        radio.setMaxStation(9);
        assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void nextCurrentStationTestNormalStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(3);
        radio.nextCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void nextCurrentStationTestMaxBorderStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.nextCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestNormalStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(6);
        radio.prevCurrentStation();
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationTestMinBorderStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.prevCurrentStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestNormalStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(7);
        radio.remoteCurrentStation(7);
        assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestOverMaxStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationTestUndereMinStation() {
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(4);
        radio.remoteCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void setMaxVolumeTest() {
    radio.setMaxVolume(10);
    assertEquals(10,radio.getMaxVolume());
    }

    @Test
    public void setMinVolumeTest() {
         radio.setMinVolume(0);
    assertEquals(0,radio.getMinVolume());
    }

     @Test
    public void nextCurrentVolumeTestNormalVolume() {
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(2);
        radio.nextCurrentVolume();
        assertEquals(3,radio.getCurrentVolume());
    }

    @Test
    public void nextCurrentVolumeTestMaxBorderVolume() {
    radio.setMaxVolume(10);
    radio.setMinVolume(0);
    radio.setCurrentVolume(10);
    radio.nextCurrentVolume();
    assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestNormalVolume() {
    radio.setMaxVolume(10);
    radio.setMinVolume(0);
    radio.setCurrentVolume(8);
    radio.prevCurrentVolume();
    assertEquals(7,radio.getCurrentVolume());
    }

    @Test
    public void prevCurrentVolumeTestMinBorderVolume() {
    radio.setMaxVolume(10);
    radio.setMinVolume(0);
    radio.setCurrentVolume(0);
    radio.prevCurrentVolume();
    assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentStationTestOverMaxStation() {
    radio.setMaxStation(9);
    radio.setMinStation(0);
    radio.setCurrentStation(8);
    radio.setCurrentStation(56);
    assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void setCurrentStationTestUnderMinStation() {
    radio.setMaxStation(9);
    radio.setMinStation(0);
    radio.setCurrentStation(4);
    radio.setCurrentStation(-1);
    assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void setCurrentVolumeTestOverMaxVolume() {
    radio.setMaxVolume(10);
    radio.setMinVolume(0);
    radio.setCurrentVolume(9);
    radio.setCurrentVolume(35);
    assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeTestUnderMinVolume() {
    radio.setMaxVolume(10);
    radio.setMinVolume(0);
    radio.setCurrentVolume(6);
    radio.setCurrentVolume(-1);
    assertEquals(6, radio.getCurrentVolume());
    }
}

