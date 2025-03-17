package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class TerminaisDescarregamento implements SankhyaEntity<TerminaisDescarregamento> {

   private BigDecimal codTerDes;
   private String codTermDesc;
   private String nomeTermDesc;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;

   public BigDecimal getCodTerDes() {
        return codTerDes;
   }

   public void setCodTerDes(BigDecimal codTerDes) {
        this.codTerDes = codTerDes;
   }

   public String getCodTermDesc() {
        return codTermDesc;
   }

   public void setCodTermDesc(String codTermDesc) {
        this.codTermDesc = codTermDesc;
   }

   public String getNomeTermDesc() {
        return nomeTermDesc;
   }

   public void setNomeTermDesc(String nomeTermDesc) {
        this.nomeTermDesc = nomeTermDesc;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   @Override
   public String getEntityName() {
        return "TerminaisDescarregamento";
   }

   @Override
   public TerminaisDescarregamento fromVO(DynamicVO vo) {
        this.codTerDes = vo.asBigDecimal("CODTERDES");
        this.codTermDesc = vo.asString("CODTERMDESC");
        this.nomeTermDesc = vo.asString("NOMETERMDESC");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        return this;
   }
}
