package io.github.henriquempereira.interfaces.model;

import io.github.henriquempereira.interfaces.service.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private double dTemperaturaCelsius;
    private double dTemperaturaFahrenheit;

    public double getdTemperaturaCelsius() {
        return dTemperaturaCelsius;
    }

    public void setdTemperaturaCelsius(double dTemperaturaCelsius) {
        this.dTemperaturaCelsius = dTemperaturaCelsius;
    }

    public double getdTemperaturaFahrenheit() {
        return dTemperaturaFahrenheit;
    }

    public void setdTemperaturaFahrenheit(double dTemperaturaFahrenheit) {
        this.dTemperaturaFahrenheit = dTemperaturaFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return ((this.dTemperaturaCelsius * 9/5) + 32);
    }

    @Override
    public double fahrenheitParaCelsius() {
        return ((this.dTemperaturaFahrenheit - 32) * 5/9);
    }
}
