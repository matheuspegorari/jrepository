package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoQuestionario extends AbstractSankhyaEntity<InformacaoQuestionario> {
   public BigDecimal getCodQuest() {
        return this.getVo().asBigDecimal("CODQUEST");
   }

   public void setCodQuest(BigDecimal codQuest) {
        markAsChanged("CODQUEST", codQuest);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTexto() {
        return this.getVo().asString("TEXTO");
   }

   public void setTexto(String texto) {
        markAsChanged("TEXTO", texto);
   }

   @Override
   public String getTableName() {
        return "TPQINF";
   }

   @Override
   public String getEntityName() {
        return "InformacaoQuestionario";
   }

   @Override
   public InformacaoQuestionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
