package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerminaisCarregamento extends AbstractSankhyaEntity<TerminaisCarregamento> {
   public BigDecimal getCodTercar() {
        return this.getVo().asBigDecimal("CODTERCAR");
   }

   public void setCodTercar(BigDecimal codTercar) {
        markAsChanged("CODTERCAR", codTercar);
   }

   public String getCodTermCarreg() {
        return this.getVo().asString("CODTERMCARREG");
   }

   public void setCodTermCarreg(String codTermCarreg) {
        markAsChanged("CODTERMCARREG", codTermCarreg);
   }

   public String getNomeTermCarreg() {
        return this.getVo().asString("NOMETERMCARREG");
   }

   public void setNomeTermCarreg(String nomeTermCarreg) {
        markAsChanged("NOMETERMCARREG", nomeTermCarreg);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   @Override
   public String getTableName() {
        return "TGFTERCAR";
   }

   @Override
   public String getEntityName() {
        return "TerminaisCarregamento";
   }

   @Override
   public TerminaisCarregamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
