package pl.wsb.fitnesstracker.event;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "event")
@Getter
@NoArgsConstructor()
@ToString
public class Event {
    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "start_time")
    private LocalDateTime start_time;

    @Column(name = "end_time")
    private LocalDateTime end_time;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;
}
