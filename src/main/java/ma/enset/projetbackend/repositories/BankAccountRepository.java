package ma.enset.projetbackend.repositories;

import ma.enset.projetbackend.entites.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
