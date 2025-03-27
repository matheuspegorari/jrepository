package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class QuestionarioFluxo extends AbstractSankhyaEntity<QuestionarioFluxo> {
   public BigDecimal getCodFld() {
        return this.getVo().asBigDecimal("CODFLD");
   }

   public void setCodFld(BigDecimal codFld) {
        markAsChanged("CODFLD", codFld);
   }

   public BigDecimal getCodPerg() {
        return this.getVo().asBigDecimal("CODPERG");
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
   }

   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodResp() {
        return this.getVo().asBigDecimal("CODRESP");
   }

   public void setCodResp(BigDecimal codResp) {
        markAsChanged("CODRESP", codResp);
   }

   public BigDecimal getPercentualRespondido() {
        return this.getVo().asBigDecimal("PERCENTUALRESPONDIDO");
   }

   public void setPercentualRespondido(BigDecimal percentualRespondido) {
        markAsChanged("PERCENTUALRESPONDIDO", percentualRespondido);
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
        return this;
   }
}
