package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class TerminaisCarregamento extends AbstractSankhyaEntity<TerminaisCarregamento> {
   private BigDecimal codTercar;
   private String codTermCarreg;
   private String nomeTermCarreg;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;

   public BigDecimal getCodTercar() {
        return codTercar;
   }

   public void setCodTercar(BigDecimal codTercar) {
        markAsChanged("CODTERCAR", codTercar);
        this.codTercar = codTercar;
   }

   public String getCodTermCarreg() {
        return codTermCarreg;
   }

   public void setCodTermCarreg(String codTermCarreg) {
        markAsChanged("CODTERMCARREG", codTermCarreg);
        this.codTermCarreg = codTermCarreg;
   }

   public String getNomeTermCarreg() {
        return nomeTermCarreg;
   }

   public void setNomeTermCarreg(String nomeTermCarreg) {
        markAsChanged("NOMETERMCARREG", nomeTermCarreg);
        this.nomeTermCarreg = nomeTermCarreg;
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
        return "TGFTERCAR";
   }

   @Override
   public String getEntityName() {
        return "TerminaisCarregamento";
   }

   @Override
   public TerminaisCarregamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codTercar = vo.asBigDecimal("CODTERCAR");
        this.codTermCarreg = vo.asString("CODTERMCARREG");
        this.nomeTermCarreg = vo.asString("NOMETERMCARREG");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        return this;
   }
}
