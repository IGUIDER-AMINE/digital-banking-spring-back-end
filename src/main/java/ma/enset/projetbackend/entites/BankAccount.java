package ma.enset.projetbackend.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.projetbackend.enums.AccountStatus;

import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    @ManyToOne
    private Customer customer;
    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
    private List<AccountOperation> accountOperations;
}
/*git init
git remote add origin https://github.com/IGUIDER-AMINE/digital-banking-spring-back-end.git
git push -u origin main*/