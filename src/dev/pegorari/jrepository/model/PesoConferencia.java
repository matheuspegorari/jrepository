package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PesoConferencia extends AbstractSankhyaEntity<PesoConferencia> {
   public BigDecimal getCodPcon() {
        return this.getVo().asBigDecimal("CODPCON");
   }

   public void setCodPcon(BigDecimal codPcon) {
        markAsChanged("CODPCON", codPcon);
   }

   public BigDecimal getNuConf() {
        return this.getVo().asBigDecimal("NUCONF");
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getPesoLiquido() {
        return this.getVo().asBigDecimal("PESOLIQUIDO");
   }

   public void setPesoLiquido(BigDecimal pesoLiquido) {
        markAsChanged("PESOLIQUIDO", pesoLiquido);
   }

   public BigDecimal getSeqConf() {
        return this.getVo().asBigDecimal("SEQCONF");
   }

   public void setSeqConf(BigDecimal seqConf) {
        markAsChanged("SEQCONF", seqConf);
   }

   @Override
   public String getTableName() {
        return "TGFPCON";
   }

   @Override
   public String getEntityName() {
        return "PesoConferencia";
   }

   @Override
   public PesoConferencia fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
