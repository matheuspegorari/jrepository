package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServicoModEtapa extends AbstractSankhyaEntity<ServicoModEtapa> {
   public BigDecimal getCodMetod() {
        return this.getVo().asBigDecimal("CODMETOD");
   }

   public void setCodMetod(BigDecimal codMetod) {
        markAsChanged("CODMETOD", codMetod);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getComplementar() {
        return this.getVo().asString("COMPLEMENTAR");
   }

   public void setComplementar(String complementar) {
        markAsChanged("COMPLEMENTAR", complementar);
   }

   public BigDecimal getNumModelo() {
        return this.getVo().asBigDecimal("NUMMODELO");
   }

   public void setNumModelo(BigDecimal numModelo) {
        markAsChanged("NUMMODELO", numModelo);
   }

   @Override
   public String getTableName() {
        return "TCSMSA";
   }

   @Override
   public String getEntityName() {
        return "ServicoModEtapa";
   }

   @Override
   public ServicoModEtapa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
