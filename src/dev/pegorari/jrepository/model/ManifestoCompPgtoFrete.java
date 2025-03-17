package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ManifestoCompPgtoFrete implements SankhyaEntity<ManifestoCompPgtoFrete> {

   private String descricao;
   private BigDecimal nuViag;
   private BigDecimal seqCompgFre;
   private BigDecimal seqMdfe;
   private BigDecimal seqPgFre;
   private String tpComp;
   private BigDecimal vlrComp;
   private String indAltodesemp;
   private BigDecimal vlrAdiant;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqCompgFre() {
        return seqCompgFre;
   }

   public void setSeqCompgFre(BigDecimal seqCompgFre) {
        this.seqCompgFre = seqCompgFre;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getSeqPgFre() {
        return seqPgFre;
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        this.seqPgFre = seqPgFre;
   }

   public String getTpComp() {
        return tpComp;
   }

   public void setTpComp(String tpComp) {
        this.tpComp = tpComp;
   }

   public BigDecimal getVlrComp() {
        return vlrComp;
   }

   public void setVlrComp(BigDecimal vlrComp) {
        this.vlrComp = vlrComp;
   }

   public String getIndAltodesemp() {
        return indAltodesemp;
   }

   public void setIndAltodesemp(String indAltodesemp) {
        this.indAltodesemp = indAltodesemp;
   }

   public BigDecimal getVlrAdiant() {
        return vlrAdiant;
   }

   public void setVlrAdiant(BigDecimal vlrAdiant) {
        this.vlrAdiant = vlrAdiant;
   }

   @Override
   public String getEntityName() {
        return "ManifestoCompPgtoFrete";
   }

   @Override
   public ManifestoCompPgtoFrete fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqCompgFre = vo.asBigDecimal("SEQCOMPGFRE");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.seqPgFre = vo.asBigDecimal("SEQPGFRE");
        this.tpComp = vo.asString("TPCOMP");
        this.vlrComp = vo.asBigDecimal("VLRCOMP");
        this.indAltodesemp = vo.asString("INDALTODESEMP");
        this.vlrAdiant = vo.asBigDecimal("VLRADIANT");
        return this;
   }
}
