package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ManifestoCompPgtoFrete extends AbstractSankhyaEntity<ManifestoCompPgtoFrete> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqCompgFre() {
        return this.getVo().asBigDecimal("SEQCOMPGFRE");
   }

   public void setSeqCompgFre(BigDecimal seqCompgFre) {
        markAsChanged("SEQCOMPGFRE", seqCompgFre);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getSeqPgFre() {
        return this.getVo().asBigDecimal("SEQPGFRE");
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
   }

   public String getTpComp() {
        return this.getVo().asString("TPCOMP");
   }

   public void setTpComp(String tpComp) {
        markAsChanged("TPCOMP", tpComp);
   }

   public BigDecimal getVlrComp() {
        return this.getVo().asBigDecimal("VLRCOMP");
   }

   public void setVlrComp(BigDecimal vlrComp) {
        markAsChanged("VLRCOMP", vlrComp);
   }

   public String getIndAltodesemp() {
        return this.getVo().asString("INDALTODESEMP");
   }

   public void setIndAltodesemp(String indAltodesemp) {
        markAsChanged("INDALTODESEMP", indAltodesemp);
   }

   public BigDecimal getVlrAdiant() {
        return this.getVo().asBigDecimal("VLRADIANT");
   }

   public void setVlrAdiant(BigDecimal vlrAdiant) {
        markAsChanged("VLRADIANT", vlrAdiant);
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
        return this;
   }
}
