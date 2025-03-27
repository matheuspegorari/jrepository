package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class KitPropostaComercial extends AbstractSankhyaEntity<KitPropostaComercial> {
   public BigDecimal getSeqKit() {
        return this.getVo().asBigDecimal("SEQKIT");
   }

   public void setSeqKit(BigDecimal seqKit) {
        markAsChanged("SEQKIT", seqKit);
   }

   public String getTipKit() {
        return this.getVo().asString("TIPKIT");
   }

   public void setTipKit(String tipKit) {
        markAsChanged("TIPKIT", tipKit);
   }

   public String getVersaoProjeto() {
        return this.getVo().asString("VERSAOPROJETO");
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
   }

   public BigDecimal getCodParcForn() {
        return this.getVo().asBigDecimal("CODPARCFORN");
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
   }

   public String getDescrKit() {
        return this.getVo().asString("DESCRKIT");
   }

   public void setDescrKit(String descrKit) {
        markAsChanged("DESCRKIT", descrKit);
   }

   public BigDecimal getNuProjeto() {
        return this.getVo().asBigDecimal("NUPROJETO");
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
   }

   @Override
   public String getTableName() {
        return "TGIKIT";
   }

   @Override
   public String getEntityName() {
        return "KitPropostaComercial";
   }

   @Override
   public KitPropostaComercial fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
