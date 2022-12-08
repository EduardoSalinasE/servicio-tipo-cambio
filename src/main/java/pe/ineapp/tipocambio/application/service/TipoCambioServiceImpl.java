package pe.ineapp.tipocambio.application.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.ineapp.tipocambio.model.TipoCambio;
import pe.ineapp.tipocambio.repository.TipoCambioRepository;
import pe.ineapp.tipocambio.response.TipoCambioResponse;

import java.util.List;

@Log4j2
@Service
public class TipoCambioServiceImpl implements TipoCambioService{

    @Autowired
    private TipoCambioRepository tipoCambioRepository;


    @Override
    public TipoCambioResponse getAll(){
        List<TipoCambio> tipoCambioList = tipoCambioRepository.findAll();

        if (tipoCambioList.isEmpty()){
            return TipoCambioResponse.builder()
                    .tipoCambioList(null)
                    .build();
        }

        return TipoCambioResponse.builder()
                .tipoCambioList(tipoCambioList)
                .build();

    }
}
