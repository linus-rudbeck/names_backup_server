package se.distansakademin.names_backup_server.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.distansakademin.names_backup_server.models.NamesBackup;

@Repository
public interface NamesBackupRepository extends JpaRepository<NamesBackup, Long> { }
