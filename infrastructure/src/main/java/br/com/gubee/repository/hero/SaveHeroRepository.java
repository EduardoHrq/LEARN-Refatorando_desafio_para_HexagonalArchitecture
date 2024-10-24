package br.com.gubee.repository.hero;

import br.com.gubee.Hero;
import br.com.gubee.repository.powerstats.SavePowerStatsRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.*;
import java.util.UUID;

@Repository
public class SaveHeroRepository {

    private final DataSource dataSource;
    private final SavePowerStatsRepository powerStatsRepository;

    public SaveHeroRepository(DataSource dataSource, SavePowerStatsRepository powerStatsRepository) {
        this.dataSource = dataSource;
        this.powerStatsRepository = powerStatsRepository;
    }

    public Hero save(Hero hero) {
        UUID generatedUUID = null;
        Hero heroSaved = new Hero();
        try (Connection connection = dataSource.getConnection()) {
            generatedUUID = this.powerStatsRepository.save(hero.getPowerStats(), connection);

            String sql = "insert into hero (name, race, enabled, power_stats_id) values (?,?,?,?)";
            PreparedStatement prepare = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepare.setString(1, hero.getName());
            prepare.setString(2, hero.getRace().toString());
            prepare.setBoolean(3, hero.isEnabled());
            prepare.setObject(4, generatedUUID);
            prepare.executeUpdate();

            try (ResultSet rs = prepare.getGeneratedKeys()) {
                if (rs.next()) {
                    generatedUUID = UUID.fromString(rs.getString(1));
                }
            }

            heroSaved = new Hero(generatedUUID, hero.getName(), hero.getRace(), hero.getPowerStats(), hero.isEnabled());

            connection.commit();
            prepare.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return heroSaved;

    }

}
