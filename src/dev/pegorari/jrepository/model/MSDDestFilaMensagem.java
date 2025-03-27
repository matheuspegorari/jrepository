package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class MSDDestFilaMensagem extends AbstractSankhyaEntity<MSDDestFilaMensagem> {
   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TMDFMD";
   }

   @Override
   public String getEntityName() {
        return "MSDDestFilaMensagem";
   }

   @Override
   public MSDDestFilaMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
