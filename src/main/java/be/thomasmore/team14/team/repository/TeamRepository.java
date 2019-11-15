package be.thomasmore.team14.team.repository;

import be.thomasmore.team14.team.entity.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface TeamRepository extends MongoRepository<Team, String> {
    Team findTeamById(@Param("id") String id);
    List<Team> findTeamByGameId(@Param("gameid") String gameId);
    long deleteTeamsByGameId(@Param("gameid") String gameeId);
}
