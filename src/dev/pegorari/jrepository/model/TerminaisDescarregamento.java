package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerminaisDescarregamento extends AbstractSankhyaEntity<TerminaisDescarregamento> {
   private BigDecimal codTerdes;
   private String codTermdesc;
   private String nomeTermdesc;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;

   public BigDecimal getCodTerdes() {
        return codTerdes;
   }

   public void setCodTerdes(BigDecimal codTerdes) {
        markAsChanged("CODTERDES", codTerdes);
        this.codTerdes = codTerdes;
   }

   public String getCodTermdesc() {
        return codTermdesc;
   }

   public void setCodTermdesc(String codTermdesc) {
        markAsChanged("CODTERMDESC", codTermdesc);
        this.codTermdesc = codTermdesc;
   }

   public String getNomeTermdesc() {
        return nomeTermdesc;
   }

   public void setNomeTermdesc(String nomeTermdesc) {
        markAsChanged("NOMETERMDESC", nomeTermdesc);
        this.nomeTermdesc = nomeTermdesc;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
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
        this.setOriginalVO(vo);
        this.codTerdes = vo.asBigDecimal("CODTERDES");
        this.codTermdesc = vo.asString("CODTERMDESC");
        this.nomeTermdesc = vo.asString("NOMETERMDESC");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        return this;
   }
}
