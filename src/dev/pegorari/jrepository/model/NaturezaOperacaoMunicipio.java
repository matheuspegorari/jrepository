package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class NaturezaOperacaoMunicipio implements SankhyaEntity<NaturezaOperacaoMunicipio> {

   private BigDecimal sequencia;
   private String descrNatOper;
   private String codNatOper;
   private BigDecimal codMunFis;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getDescrNatOper() {
        return descrNatOper;
   }

   public void setDescrNatOper(String descrNatOper) {
        this.descrNatOper = descrNatOper;
   }

   public String getCodNatOper() {
        return codNatOper;
   }

   public void setCodNatOper(String codNatOper) {
        this.codNatOper = codNatOper;
   }

   public BigDecimal getCodMunFis() {
        return codMunFis;
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        this.codMunFis = codMunFis;
   }

   @Override
   public String getEntityName() {
        return "NaturezaOperacaoMunicipio";
   }

   @Override
   public NaturezaOperacaoMunicipio fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.descrNatOper = vo.asString("DESCRNATOPER");
        this.codNatOper = vo.asString("CODNATOPER");
        this.codMunFis = vo.asBigDecimal("CODMUNFIS");
        return this;
   }
}
