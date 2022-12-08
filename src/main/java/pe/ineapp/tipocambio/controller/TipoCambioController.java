package pe.ineapp.tipocambio.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import pe.ineapp.tipocambio.application.service.TipoCambioService;
import pe.ineapp.tipocambio.response.ConversionResponse;
import pe.ineapp.tipocambio.response.TipoCambioResultsResponse;


import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping({"/ap1/v1"})
public class TipoCambioController {

    @Autowired
    private TipoCambioService tipoCambioService;

    @Autowired
    private RestTemplate restTemplate;

    private static String url="https://api.exchangerate.host/convert?from={1}&to={2}";
    private static String url2="https://api.exchangerate.host/convert?from={1}&to={2}&amount={3}";

    @GetMapping
    @RequestMapping("/tipo-cambio")
    public List<Object> getAll(@RequestParam String Moneda1, @RequestParam String Moneda2) {

        TipoCambioResultsResponse response = restTemplate.getForObject(url, TipoCambioResultsResponse.class,Moneda1,Moneda2);

        return Arrays.asList(response);
    }

    @GetMapping
    @RequestMapping("/valor-cambio")
    public List<Object> getAll(@RequestParam String Moneda1, @RequestParam String Moneda2, @RequestParam String Monto){

        ConversionResponse response = restTemplate.getForObject(url2, ConversionResponse.class, Moneda1, Moneda2, Monto);

        return Arrays.asList(response);
    }
}
