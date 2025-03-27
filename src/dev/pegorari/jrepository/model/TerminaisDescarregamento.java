package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerminaisDescarregamento extends AbstractSankhyaEntity<TerminaisDescarregamento> {
   public BigDecimal getCodTerdes() {
        return this.getVo().asBigDecimal("CODTERDES");
   }

   public void setCodTerdes(BigDecimal codTerdes) {
        markAsChanged("CODTERDES", codTerdes);
   }

   public String getCodTermdesc() {
        return this.getVo().asString("CODTERMDESC");
   }

   public void setCodTermdesc(String codTermdesc) {
        markAsChanged("CODTERMDESC", codTermdesc);
   }

   public String getNomeTermdesc() {
        return this.getVo().asString("NOMETERMDESC");
   }

   public void setNomeTermdesc(String nomeTermdesc) {
        markAsChanged("NOMETERMDESC", nomeTermdesc);
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
        return "TGFTERDESC";
   }

   @Override
   public String getEntityName() {
        return "TerminaisDescarregamento";
   }

   @Override
   public TerminaisDescarregamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
