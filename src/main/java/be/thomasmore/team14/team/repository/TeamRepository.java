package be.thomasmore.team14.team.repository;

import be.thomasmore.team14.team.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
