package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerguntaQuestionario extends AbstractSankhyaEntity<PerguntaQuestionario> {
   public String getApelido() {
        return this.getVo().asString("APELIDO");
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
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

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   @Override
   public String getTableName() {
        return "TPQPEQ";
   }

   @Override
   public String getEntityName() {
        return "PerguntaQuestionario";
   }

   @Override
   public PerguntaQuestionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
