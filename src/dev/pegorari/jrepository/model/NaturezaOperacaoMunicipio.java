package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NaturezaOperacaoMunicipio extends AbstractSankhyaEntity<NaturezaOperacaoMunicipio> {
   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getDescrNatOper() {
        return this.getVo().asString("DESCRNATOPER");
   }

   public void setDescrNatOper(String descrNatOper) {
        markAsChanged("DESCRNATOPER", descrNatOper);
   }

   public String getCodNatOper() {
        return this.getVo().asString("CODNATOPER");
   }

   public void setCodNatOper(String codNatOper) {
        markAsChanged("CODNATOPER", codNatOper);
   }

   public BigDecimal getCodMunFis() {
        return this.getVo().asBigDecimal("CODMUNFIS");
   }

   public void setCodMunFis(BigDecimal codMunFis) {
        markAsChanged("CODMUNFIS", codMunFis);
   }

   @Override
   public String getTableName() {
        return "TGFNAS";
   }

   @Override
   public String getEntityName() {
        return "NaturezaOperacaoMunicipio";
   }

   @Override
   public NaturezaOperacaoMunicipio fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
