package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class SequenciaLote extends AbstractSankhyaEntity<SequenciaLote> {
   public BigDecimal getSeqConf() {
        return this.getVo().asBigDecimal("SEQCONF");
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public String getIdentificador() {
        return this.getVo().asString("IDENTIFICADOR");
   }

   public void setIdentificador(String identificador) {
        markAsChanged("IDENTIFICADOR", identificador);
   }

   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   @Override
   public String getTableName() {
        return "TGFSLT";
   }

   @Override
   public String getEntityName() {
        return "SequenciaLote";
   }

   @Override
   public SequenciaLote fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
