package br.com.gubee.repository.powerstats;

import br.com.gubee.PowerStats;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.UUID;

@Repository
public class SavePowerStatsRepository {

    public UUID save(PowerStats powerStats, Connection connection) throws SQLException {
        String sql = null;
        UUID generatedUUID = null;
        PreparedStatement prepare = null;
        try {
            connection.setAutoCommit(false);
            sql = "insert into power_stats (strength, agility, dexterity, intelligence) values (?,?,?,?)";
            prepare = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepare.setShort(1, powerStats.getStrength());
            prepare.setShort(2, powerStats.getAgility());
            prepare.setShort(3, powerStats.getDexterity());
            prepare.setShort(4, powerStats.getIntelligence());
            prepare.executeUpdate();
            try (ResultSet rs = prepare.getGeneratedKeys()) {
                if (rs.next()) {
                    generatedUUID = UUID.fromString(rs.getString(1));
                }
            }
        } catch (SQLException e) {
            connection.rollback();
            throw new RuntimeException(e);
        }

        return generatedUUID;
    }
}
