package java8.datetimeapi;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.time.temporal.UnsupportedTemporalTypeException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class DateTimeExamples {

    @Test
    void testInvalidDateCreation(){
        assertThatThrownBy(() -> LocalDate.of(2019, 11, 31))
                .hasCauseInstanceOf(DateTimeException.class);
    }

    @Test
    void testLocatDatePlus(){
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        assertThat(tomorrow).isAfter(LocalDate.parse("2019-08-08"));
    }

    @Test
    void testDayOfWeek(){
        final DayOfWeek now = LocalDate.now().getDayOfWeek();
        assertThat(now).isBetween(DayOfWeek.MONDAY, DayOfWeek.FRIDAY);
    }

    @Test
    void testMinusUnits(){
        final LocalDate minus = LocalDate.now().minus(2, ChronoUnit.DAYS);
        assertThat(minus).isBefore(LocalDate.now());
    }

    @Test
    void testLocalTime(){
        final LocalTime now = LocalTime.now();
        assertThatThrownBy(() -> now.plus(2, ChronoUnit.DAYS))
                .hasMessageContaining("Unsupported unit: Days");
    }

    @Test
    void TestLocalDateTime(){
        final LocalDateTime now = LocalDateTime.now();
        final boolean leapYear = now.toLocalDate().isLeapYear();
        assertThat(leapYear).isFalse();
    }
}
