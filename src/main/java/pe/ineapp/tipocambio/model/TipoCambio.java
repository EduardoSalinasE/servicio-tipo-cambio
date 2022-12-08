package pe.ineapp.tipocambio.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name="TipoCambio")
@Table(
        name = "tbl_tipocambio"
)


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoCambio {


    @Id
    Long id;
    String from;
    String to;
    float tipoCambio;
    float resultado;
}
