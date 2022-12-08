package pe.ineapp.tipocambio.response;

import lombok.Builder;
import lombok.Data;
import pe.ineapp.tipocambio.model.TipoCambio;

import java.util.List;

@Data
@Builder
public class TipoCambioResponse {

    private List<TipoCambio> tipoCambioList;

}
