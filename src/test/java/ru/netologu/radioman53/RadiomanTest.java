package ru.netologu.radioman53;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadiomanTest {

    Radioman radioman = new Radioman();

    @Test
    void shouldChangeZeroStationTest() {
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldChangeStationTest() {
        radioman.setCurrentStation(5);

        int expected = 5;
        int actual = radioman.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldSetStationUnderMinStationTest() {
        radioman.setCurrentStation(-1);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldSetStationOverMaxStationTest() {
        radioman.setCurrentStation(10);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    void shouldNextStationTest() {
        radioman.setCurrentStation(5);
        radioman.nextStation();
        assertEquals(6, radioman.getCurrentStation());
    }

    @Test
    void shouldOverMaxStationTest() {
        radioman.setCurrentStation(9);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }


    @Test
    void shouldPrevStationTest() {
        radioman.setCurrentStation(5);
        radioman.previousStation();
        assertEquals(4, radioman.getCurrentStation());
    }

    @Test
    void shouldBelowMinStationTest() {
        radioman.setCurrentStation(0);
        radioman.previousStation();
        assertEquals(9, radioman.getCurrentStation());
    }


    @Test
    void shouldChangeZeroVolumeTest() {
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void shouldChangeVolumeTest() {
        radioman.setCurrentVolume(5);
        assertEquals(5, radioman.getCurrentVolume());
    }

    @Test
    void shouldOverMoreMaxVolume() {
        radioman.setCurrentVolume(101);
        radioman.increaseVolume();
        assertEquals(1, radioman.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeTest() {
        radioman.setCurrentVolume(99);
        radioman.increaseVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void shouldOverMaxVolumeTest() {
        radioman.setCurrentVolume(100);
        radioman.increaseVolume();
        assertEquals(100, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeTest() {
        radioman.setCurrentVolume(4);
        radioman.decreaseVolume();
        assertEquals(3, radioman.getCurrentVolume());
    }

    @Test
    void shouldBelowMinVolumeTest() {
        radioman.setCurrentVolume(0);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    void shouldBelowMoreMinVolumeTest() {
        radioman.setCurrentVolume(-1);
        radioman.decreaseVolume();
        assertEquals(0, radioman.getCurrentVolume());
    }

    @Test
    public void shouldSetRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(14);
        assertEquals(14, radioman.getCurrentStation());
    }

    @Test
    public void shouldSetOverFalseRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(20);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void shouldSetUnderFalseRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(-1);
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void shouldSetNextRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(14);
        radioman.nextStation();
        assertEquals(15, radioman.getCurrentStation());
    }

    @Test
    public void shouldSetPrevRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(14);
        radioman.previousStation();
        assertEquals(13, radioman.getCurrentStation());
    }

    @Test
    public void shouldSetNextOverRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(19);
        radioman.nextStation();
        assertEquals(0, radioman.getCurrentStation());
    }

    @Test
    public void shouldBelowMinRadioStationTest() {
        Radioman radioman = new Radioman(20);
        radioman.setCurrentStation(0);
        radioman.previousStation();
        assertEquals(19, radioman.getCurrentStation());
    }

    @Test
    public void stationsContLessSetPrevTest() {
        Radioman radioman = new Radioman(50);
        radioman.setCurrentStation(144);
        radioman.previousStation();
        assertEquals(49, radioman.getCurrentStation());
    }

    @Test
    public void stationsContLessSetNextTest() {
        Radioman radioman = new Radioman(50);
        radioman.setCurrentStation(144);
        radioman.nextStation();
        assertEquals(1, radioman.getCurrentStation());
    }
}

