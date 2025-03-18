package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class KitPropostaComercial extends AbstractSankhyaEntity<KitPropostaComercial> {
   private BigDecimal seqKit;
   private String tipKit;
   private String versaoProjeto;
   private BigDecimal codParcForn;
   private String descrKit;
   private BigDecimal nuProjeto;

   public BigDecimal getSeqKit() {
        return seqKit;
   }

   public void setSeqKit(BigDecimal seqKit) {
        markAsChanged("SEQKIT", seqKit);
        this.seqKit = seqKit;
   }

   public String getTipKit() {
        return tipKit;
   }

   public void setTipKit(String tipKit) {
        markAsChanged("TIPKIT", tipKit);
        this.tipKit = tipKit;
   }

   public String getVersaoProjeto() {
        return versaoProjeto;
   }

   public void setVersaoProjeto(String versaoProjeto) {
        markAsChanged("VERSAOPROJETO", versaoProjeto);
        this.versaoProjeto = versaoProjeto;
   }

   public BigDecimal getCodParcForn() {
        return codParcForn;
   }

   public void setCodParcForn(BigDecimal codParcForn) {
        markAsChanged("CODPARCFORN", codParcForn);
        this.codParcForn = codParcForn;
   }

   public String getDescrKit() {
        return descrKit;
   }

   public void setDescrKit(String descrKit) {
        markAsChanged("DESCRKIT", descrKit);
        this.descrKit = descrKit;
   }

   public BigDecimal getNuProjeto() {
        return nuProjeto;
   }

   public void setNuProjeto(BigDecimal nuProjeto) {
        markAsChanged("NUPROJETO", nuProjeto);
        this.nuProjeto = nuProjeto;
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
        this.setOriginalVO(vo);
        this.seqKit = vo.asBigDecimal("SEQKIT");
        this.tipKit = vo.asString("TIPKIT");
        this.versaoProjeto = vo.asString("VERSAOPROJETO");
        this.codParcForn = vo.asBigDecimal("CODPARCFORN");
        this.descrKit = vo.asString("DESCRKIT");
        this.nuProjeto = vo.asBigDecimal("NUPROJETO");
        return this;
   }
}
