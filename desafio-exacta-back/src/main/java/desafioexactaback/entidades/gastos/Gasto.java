package desafioexactaback.entidades.gastos;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "GASTOS")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGasto;

    private String nomePessoa;

    private String descricao;

   // private Date dataHora;

    private Double valor;

    //private tags
}
