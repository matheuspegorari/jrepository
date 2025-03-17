package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class PerguntaQuestionario implements SankhyaEntity<PerguntaQuestionario> {

   private String apelido;
   private BigDecimal codPerg;
   private BigDecimal codQuest;
   private BigDecimal ordem;
   private BigDecimal peso;

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        this.apelido = apelido;
   }

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        this.codPerg = codPerg;
   }

   public BigDecimal getCodQuest() {
        return codQuest;
   }

   public void setCodQuest(BigDecimal codQuest) {
        this.codQuest = codQuest;
   }

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        this.ordem = ordem;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   @Override
   public String getEntityName() {
        return "PerguntaQuestionario";
   }

   @Override
   public PerguntaQuestionario fromVO(DynamicVO vo) {
        this.apelido = vo.asString("APELIDO");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.peso = vo.asBigDecimal("PESO");
        return this;
   }
}
