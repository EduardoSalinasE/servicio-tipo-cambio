package pe.ineapp.tipocambio.response;


import lombok.Data;

@Data
public class ConversionResponse {
    private String result;
    private Object query;
    private Object info;
}
