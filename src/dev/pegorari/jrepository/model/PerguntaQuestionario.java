package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PerguntaQuestionario extends AbstractSankhyaEntity<PerguntaQuestionario> {
   private String apelido;
   private BigDecimal codPerg;
   private BigDecimal codQuest;
   private BigDecimal ordem;
   private BigDecimal peso;

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
        this.apelido = apelido;
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

   public BigDecimal getOrdem() {
        return ordem;
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
        this.ordem = ordem;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
        this.peso = peso;
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
        this.apelido = vo.asString("APELIDO");
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.codQuest = vo.asBigDecimal("CODQUEST");
        this.ordem = vo.asBigDecimal("ORDEM");
        this.peso = vo.asBigDecimal("PESO");
        return this;
   }
}
