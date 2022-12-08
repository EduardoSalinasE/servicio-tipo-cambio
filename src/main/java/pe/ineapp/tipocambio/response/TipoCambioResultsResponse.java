package pe.ineapp.tipocambio.response;

import lombok.Data;

import java.util.List;

@Data
public class TipoCambioResultsResponse {

    private List<TipoCambioDetailsResponse> query;
}
