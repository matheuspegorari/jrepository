package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class OpcaoCampo extends AbstractSankhyaEntity<OpcaoCampo> {
   public BigDecimal getNuCampo() {
        return this.getVo().asBigDecimal("NUCAMPO");
   }

   public void setNuCampo(BigDecimal nuCampo) {
        markAsChanged("NUCAMPO", nuCampo);
   }

   public String getOpcao() {
        return this.getVo().asString("OPCAO");
   }

   public void setOpcao(String opcao) {
        markAsChanged("OPCAO", opcao);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPadrao() {
        return this.getVo().asString("PADRAO");
   }

   public void setPadrao(String padrao) {
        markAsChanged("PADRAO", padrao);
   }

   public String getValor() {
        return this.getVo().asString("VALOR");
   }

   public void setValor(String valor) {
        markAsChanged("VALOR", valor);
   }

   @Override
   public String getTableName() {
        return "TDDOPC";
   }

   @Override
   public String getEntityName() {
        return "OpcaoCampo";
   }

   @Override
   public OpcaoCampo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
