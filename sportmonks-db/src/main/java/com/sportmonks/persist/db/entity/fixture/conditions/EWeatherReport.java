package com.sportmonks.persist.db.entity.fixture.conditions;

import com.sportmonks.client.core.data.entity.WeatherReport;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "weather_report")
public class EWeatherReport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String code;
    @Column
    private String icon;
    @Column
    private String type;
    @Column
    private String clouds;
    @Column
    private String humidity;
    @Column
    private Double temperature;
    @Column
    private String temperatureUnit;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EWeatherReport() {
    }

    public EWeatherReport(EFixture fixture, WeatherReport weatherReport) {
        this.fixture = fixture;
        this.code = weatherReport.getCode();
        this.icon = weatherReport.getIcon();
        this.type = weatherReport.getType();
        this.clouds = weatherReport.getClouds();
        this.humidity = weatherReport.getHumidity();
        this.temperature = weatherReport.getTemperature().getTemp();
        this.temperatureUnit = weatherReport.getTemperature().getUnit();
    }
}
