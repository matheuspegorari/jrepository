package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class PrevisaoVariaveisAdicionais extends AbstractSankhyaEntity<PrevisaoVariaveisAdicionais> {
   public String getChave() {
        return this.getVo().asString("CHAVE");
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getCodExec() {
        return this.getVo().asBigDecimal("CODEXEC");
   }

   public void setCodExec(BigDecimal codExec) {
        markAsChanged("CODEXEC", codExec);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TSLIVA";
   }

   @Override
   public String getEntityName() {
        return "PrevisaoVariaveisAdicionais";
   }

   @Override
   public PrevisaoVariaveisAdicionais fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
