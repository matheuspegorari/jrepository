package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ManifestoCompPgtoFrete extends AbstractSankhyaEntity<ManifestoCompPgtoFrete> {
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
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqCompgFre() {
        return seqCompgFre;
   }

   public void setSeqCompgFre(BigDecimal seqCompgFre) {
        markAsChanged("SEQCOMPGFRE", seqCompgFre);
        this.seqCompgFre = seqCompgFre;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getSeqPgFre() {
        return seqPgFre;
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
        this.seqPgFre = seqPgFre;
   }

   public String getTpComp() {
        return tpComp;
   }

   public void setTpComp(String tpComp) {
        markAsChanged("TPCOMP", tpComp);
        this.tpComp = tpComp;
   }

   public BigDecimal getVlrComp() {
        return vlrComp;
   }

   public void setVlrComp(BigDecimal vlrComp) {
        markAsChanged("VLRCOMP", vlrComp);
        this.vlrComp = vlrComp;
   }

   public String getIndAltodesemp() {
        return indAltodesemp;
   }

   public void setIndAltodesemp(String indAltodesemp) {
        markAsChanged("INDALTODESEMP", indAltodesemp);
        this.indAltodesemp = indAltodesemp;
   }

   public BigDecimal getVlrAdiant() {
        return vlrAdiant;
   }

   public void setVlrAdiant(BigDecimal vlrAdiant) {
        markAsChanged("VLRADIANT", vlrAdiant);
        this.vlrAdiant = vlrAdiant;
   }

   @Override
   public String getTableName() {
        return "TGFMDFCOMPGFRE";
   }

   @Override
   public String getEntityName() {
        return "ManifestoCompPgtoFrete";
   }

   @Override
   public ManifestoCompPgtoFrete fromVO(DynamicVO vo) {
        this.setVo(vo);
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
