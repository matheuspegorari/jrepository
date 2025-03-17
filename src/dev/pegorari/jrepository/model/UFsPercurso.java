package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class UFsPercurso extends AbstractSankhyaEntity<UFsPercurso> {
   private BigDecimal seqMdfe;
   private BigDecimal codUf;
   private BigDecimal nuViag;
   private BigDecimal ordem;
   private BigDecimal seqViagem;

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getSeqViagem() {
        return seqViagem;
   }

   public void setSeqViagem(BigDecimal seqViagem) {
        this.seqViagem = seqViagem;
   }

   @Override
   public String getTableName() {
        return "TGFUFP";
   }

   @Override
   public String getEntityName() {
        return "UFsPercurso";
   }

   @Override
   public UFsPercurso fromVO(DynamicVO vo) {
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.codUf = vo.asBigDecimal("CODUF");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.seqViagem = vo.asBigDecimal("SEQVIAGEM");
        return this;
   }
}
