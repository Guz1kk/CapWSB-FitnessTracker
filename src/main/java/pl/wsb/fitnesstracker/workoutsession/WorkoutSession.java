package pl.wsb.fitnesstracker.workoutsession;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import pl.wsb.fitnesstracker.training.api.Training;

// TODO: Define the Event entity with appropriate fields and annotations
@Entity
@Table(name = "workout_session")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class WorkoutSession {

    @Id
    private int id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "training_id", nullable = false, unique = true)
    private Training training;

    private String timestamp;
    private double startLatitude;
    private double startLongitude;
    private double endLatitude;
    private double endLongitude;
    private double altitude;


}
