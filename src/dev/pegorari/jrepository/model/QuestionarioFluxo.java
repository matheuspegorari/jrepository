package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class QuestionarioFluxo extends AbstractSankhyaEntity<QuestionarioFluxo> {
   private BigDecimal codFld;
   private BigDecimal codPerg;
   private BigDecimal codQuest;
   private BigDecimal codResp;
   private BigDecimal percentualRespondido;

   public BigDecimal getCodFld() {
        return codFld;
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
        this.codFld = codFld;
   }

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
        this.codPerg = codPerg;
   }

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
        this.codQuest = codQuest;
   }

   public BigDecimal getCodResp() {
        return codResp;
   }

   public void setCodResp(BigDecimal codResp) {
        markAsChanged("CODRESP", codResp);
        this.codResp = codResp;
   }

   public BigDecimal getPercentualRespondido() {
        return percentualRespondido;
   }

   public void setPercentualRespondido(BigDecimal percentualRespondido) {
        markAsChanged("PERCENTUALRESPONDIDO", percentualRespondido);
        this.percentualRespondido = percentualRespondido;
   }

   @Override
   public String getTableName() {
        return "TCSQXF";
   }

   @Override
   public String getEntityName() {
        return "QuestionarioFluxo";
   }

   @Override
   public QuestionarioFluxo fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codFld = vo.asBigDecimal("CODFLD");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.codResp = vo.asBigDecimal("CODRESP");
        this.percentualRespondido = vo.asBigDecimal("PERCENTUALRESPONDIDO");
        return this;
   }
}
