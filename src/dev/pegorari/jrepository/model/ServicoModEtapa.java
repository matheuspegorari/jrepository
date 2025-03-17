package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ServicoModEtapa extends AbstractSankhyaEntity<ServicoModEtapa> {
   private BigDecimal codMetod;
   private BigDecimal codProd;
   private String complementar;
   private BigDecimal numModelo;

   public BigDecimal getCodMetod() {
        return codMetod;
   }

   public void setCodMetod(BigDecimal codMetod) {
        this.codMetod = codMetod;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getComplementar() {
        return complementar;
   }

   public void setComplementar(String complementar) {
        this.complementar = complementar;
   }

   public BigDecimal getNumModelo() {
        return numModelo;
   }

   public void setNumModelo(BigDecimal numModelo) {
        this.numModelo = numModelo;
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
        this.codMetod = vo.asBigDecimal("CODMETOD");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.complementar = vo.asString("COMPLEMENTAR");
        this.numModelo = vo.asBigDecimal("NUMMODELO");
        return this;
   }
}
