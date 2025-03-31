package se.distansakademin.names_backup_server.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import se.distansakademin.names_backup_server.models.NamesBackup;
import se.distansakademin.names_backup_server.repositories.NamesBackupRepository;

import java.util.List;

@Service
public class NamesBackupService {

    private final NamesBackupRepository repository;

    public NamesBackupService(NamesBackupRepository repository) {
        this.repository = repository;
    }

    public void add(NamesBackup namesBackup){
        repository.save(namesBackup);
    }

    public List<NamesBackup> getAll(){
        return repository.findAll();
    }
}
